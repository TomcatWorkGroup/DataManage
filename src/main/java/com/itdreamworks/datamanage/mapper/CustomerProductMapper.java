package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.CustomerProduct;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerProductMapper {
    @Select("select * from CustomerProduct")
    @ResultType(CustomerProduct.class)
    List<CustomerProduct> findAll();

    @Select("select * from CustomerProduct where id=#{id}")
    CustomerProduct findOneById(@Param("id") int id);

    @Update("update CustomerProduct set CustomerId=#{customerId},DeviceId=#{deviceId},EnterpriseProductId=#{enterpriseProductId},ProductName=#{productName},Status=#{status} where Id = #{id}")
    int modifyCustomerProduct(CustomerProduct CustomerProduct);

    @Update("update CustomerProduct set Status=#{status} where Id=#{id}")
    int changeCustomerProductStatus(CustomerProduct CustomerProduct);

    @Update("update CustomerProduct set CategoryId=0 where CustomerId=#{customerId} and CategoryId=#{oldCategoryId}")
    int deleteCustomerProductCategory(@Param("customerId") int customerId, @Param("oldCategoryId") int oldCategoryId);

    @Insert("insert into CustomerProduct (CustomerId,DeviceId,EnterpriseProductId,ProductName,Status) values (#{customerId},#{deviceId},#{enterpriseProductId},#{productName},#{status})")
    int addCustomerProduct(CustomerProduct CustomerProduct);

}

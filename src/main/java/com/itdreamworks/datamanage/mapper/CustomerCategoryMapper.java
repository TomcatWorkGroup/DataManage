package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.CustomerCategory;
import com.itdreamworks.datamanage.entity.CustomerProduct;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerCategoryMapper {

    @Select("select * from CustomerCategory where CustomerId=#{customerId}")
    List<CustomerCategory> findByCustomerId(@Param("customerId") int customerId);

    @Select("select * from CustomerCategory where CustomerId=#{customerId} and LocalId=#{localId}")
    CustomerCategory findOneByLocal(@Param("customerId") int customerId,
                             @Param("localId") String localId);

    @Select("select * from CustomerCategory where Id=#{id}")
    CustomerCategory findOneById(@Param("id") int id);


    @Update("update CustomerCategory set CategoryName=#{categoryName} where CustomerId = #{customerId} and LocalId = #{localId}")
    int modifyCustomerCategory(CustomerCategory customerCategory);

    @Insert("insert into CustomerCategory (CustomerId,LocalId,CategoryName) values (#{customerId},#{localId},#{categoryName})")
    int addCustomerCategory(CustomerCategory customerCategory);

    @Delete("delete from CustomerCategory where CustomerId = #{customerId} and LocalId = #{localId}")
    int deleteCustomerCategory(@Param("customerId") int customerId,@Param("localId") String localId);

}

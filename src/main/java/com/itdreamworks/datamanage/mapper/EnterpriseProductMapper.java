package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.db.EnterpriseProduct;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EnterpriseProductMapper {
    @Select("select * from EnterpriseProduct")
    @ResultType(EnterpriseProduct.class)
    List<EnterpriseProduct> findAll();

    @Select("select * from EnterpriseProduct where id=#{id}")
    EnterpriseProduct findOneById(@Param("id") int id);

    @Update("update EnterpriseProduct set EnterpriseId=#{enterpriseId},ClientId=#{clientId},ProductName=#{productName},Status=#{status} where Id = #{id}")
    int modifyEnterpriseProduct(EnterpriseProduct EnterpriseProduct);

    @Update("update EnterpriseProduct set Status=#{status} where Id=#{id}")
    int changeEnterpriseProductStatus(EnterpriseProduct EnterpriseProduct);

    @Insert("insert into EnterpriseProduct (EnterpriseId,DeviceId,ProductName,Status) values (#{enterpriseId},#{deviceId},#{productName},#{status})")
    int addEnterpriseProduct(EnterpriseProduct EnterpriseProduct);

}

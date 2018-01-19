package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.CustomerSaleRecord;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerSaleRecordMapper {
    @Select("select * from Customer_Sale_Record")
    @ResultType(CustomerSaleRecord.class)
    List<CustomerSaleRecord> findAll();

    @Select("select * from Customer_Sale_Record where id = #{id}")
    CustomerSaleRecord findOneById(@Param("id") int id);

    @Update("update Customer_Sale_Record set CustomerProductId=#{customerProductId},CustomerId=#{customerId},EndUserId=#{endUserId},SaleDatetime=#{saleDatetime} where Id = #{id}")
    int modifyCustomerSaleRecord(CustomerSaleRecord customerSaleRecord);



    @Insert("insert into Customer_Sale_Record (CustomerProductId,CustomerId,EndUserId,SaleDatetime) values (#{customerProductId},#{customerId},#{endUserId},#{saleDatetime})")
    int addCustomerSaleRecord(CustomerSaleRecord customerSaleRecord);

}

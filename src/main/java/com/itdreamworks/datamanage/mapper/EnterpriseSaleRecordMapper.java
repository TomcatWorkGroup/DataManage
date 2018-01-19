package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.EnterpriseSaleRecord;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EnterpriseSaleRecordMapper {
    @Select("select * from Enterprise_Sale_Record")
    @ResultType(EnterpriseSaleRecord.class)
    List<EnterpriseSaleRecord> findAll();

    @Select("select * from Enterprise_Sale_Record where id=#{id}")
    EnterpriseSaleRecord findOneById(@Param("id") int id);

    @Update("update Enterprise_Sale_Record set EnterpriseProductId=#{enterpriseProductId},EnterpriseId=#{enterpriseId},CustomerId=#{customerId},EndUserId=#{endUserId},SaleDatetime=#{saleDatetime} where Id = #{id}")
    int modifyEnterpriseSaleRecord(EnterpriseSaleRecord EnterpriseSaleRecord);


    @Insert("insert into Enterprise_Sale_Record (EnterpriseProductId,EnterpriseId,CustomerId,EndUserId,SaleDatetime) values (#{enterpriseProductId},#{enterpriseId},#{customerId},#{endUserId},#{saleDatetime})")
    int addEnterpriseSaleRecord(EnterpriseSaleRecord EnterpriseSaleRecord);

}

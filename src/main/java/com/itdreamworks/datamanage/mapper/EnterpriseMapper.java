package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Enterprise;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EnterpriseMapper {
    @Select("select * from Enterprise")
    @ResultType(Enterprise.class)
    List<Enterprise> findAll();

    @Select("select * from Enterprise where id=#{id}")
    Enterprise findOneById(@Param("id") int id);

    @Update("update Enterprise set EnterpriseName=#{enterpriseName},Status=#{status} where Id = #{id}")
    int modifyEnterprise(Enterprise enterprise);

    @Update("update Enterprise set Status=#{status} where Id=#{id}")
    int changeEnterpriseStatus(Enterprise enterprise);

    @Insert("insert into Enterprise (EnterpriseName,Status) values (#{enterpriseName},#{status})")
    int addEnterprise(Enterprise enterprise);

}

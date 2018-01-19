package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.EndUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EndUserMapper {
    @Select("select * from EndUser")
    @ResultType(EndUser.class)
    List<EndUser> findAll();

    @Select("select * from EndUser where id=#{id}")
    EndUser findOneById(@Param("id") int id);

    @Update("update EndUser set EnterpriseId=#{enterpriseId},CustomerId=#{customerId},EndUserName=#{endUserName},Status=#{status} where Id = #{id}")
    int modifyEndUser(EndUser EndUser);

    @Update("update EndUser set Status=#{status} where Id=#{id}")
    int changeEndUserStatus(EndUser EndUser);

    @Insert("insert into EndUser (EnterpriseId,CustomerId,EndUserName,Status) values (#{enterpriseId},#{customerId},#{endUserName},#{status})")
    int addEndUser(EndUser EndUser);
}
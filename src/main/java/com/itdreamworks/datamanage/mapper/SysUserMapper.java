package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.SysUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysUserMapper {
    @Select("select * from SysUser")
    @ResultType(SysUser.class)
    List<SysUser> findAll();

    @Select("select * from SysUser where id=#{id}")
    SysUser findOneById(@Param("id") int id);

    @Select("select * from SysUser where loginId=#{loginId} or mobile=#{loginId} or email=#{loginId}")
    SysUser findOneByLoginId(@Param("loginId") String loginId);

    @Update("update SysUser set LoginId=#{loginId},Password=#{password},Mobile=#{mobile},Email=#{email},WeiXin=#{weiXin},QQ=#{qQ},RealName=#{realName},Status=#{status},LastLoginDatetime=#{lastLoginDatetime} where Id = #{id}")
    int modifySysUser(SysUser SysUser);

    @Update("update SysUser set Status=#{status} where Id=#{id}")
    int changeSysUserStatus(SysUser SysUser);

    @Insert("insert into SysUser (LoginId,Password,Mobile,Email,WeiXin,QQ,RealName,Status,LastLoginDatetime) values (#{loginId},#{password},#{mobile},#{email},#{weiXin},#{qQ},#{realName},#{status},#{lastLoginDatetime})")
    int addSysUser(SysUser SysUser);

}

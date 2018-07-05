package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.db.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeMapper {
    @Select("select * from Employee")
    @ResultType(Employee.class)
    List<Employee> findAll();

    @Select("select * from Employee where OrgType = #{orgType} and OrgId = #{orgId}")
    @ResultType(Employee.class)
    List<Employee> findEmployeesByOrg(@Param("orgType") int orgType, @Param("orgId") int orgId);

    @Select("select * from Employee where id=#{id}")
    Employee findOneById(@Param("id") int id);

    @Select("select * from Employee where mobile=#{loginId} or email=#{loginId}")
    Employee findOneByLoginId(@Param("loginId") String loginId);

    @Update("update Employee set OrgType=#{orgType},OrgId=#{orgId},Password=#{password},Mobile=#{mobile},Email=#{email},WeiXin=#{weiXin},QQ=#{qQ},RealName=#{realName},Status=#{status},LastLoginDatetime=#{lastLoginDatetime},Mark=#{mark} where Id = #{id}")
    int modifyEmployee(Employee Employee);

    @Update("update Employee set Password=#{password} where Mobile=#{loginId} or Email=#{loginId}")
    int changeEmployeePassword(@Param("loginId") String loginId, @Param("password") String password);

    @Update("update Employee set Status=#{status} where Id=#{id}")
    int changeEmployeeStatus(Employee Employee);

    @Insert("insert into Employee (OrgType,OrgId,Password,Mobile,Email,WeiXin,QQ,RealName,Status,LastLoginDatetime,Mark) values (#{orgType},#{orgId},#{password},#{mobile},#{email},#{weiXin},#{qQ},#{realName},#{status},#{lastLoginDatetime},#{mark})")
    int addEmployee(Employee Employee);

}
package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeMapper {
    @Select("select * from Employee")
    @ResultType(Employee.class)
    List<Employee> findAll();

    @Select("select * from Employee where id=#{id}")
    Employee findOneById(@Param("id") int id);

    @Update("update Employee set OrgType=#{orgType},OrgId=#{orgId},Password=#{password},Mobile=#{mobile},Email=#{email},WeiXin=#{weiXin},QQ=#{qQ},RealName=#{realName},Status=#{status},LastLoginDatetime=#{lastLoginDatetime},Mark=#{mark} where Id = #{id}")
    int modifyEmployee(Employee Employee);

    @Update("update Employee set Status=#{status} where Id=#{id}")
    int changeEmployeeStatus(Employee Employee);

    @Insert("insert into Employee (OrgType,OrgId,Password,Mobile,Email,WeiXin,QQ,RealName,Status,LastLoginDatetime,Mark) values (#{orgType},#{orgId},#{password},#{mobile},#{email},#{weiXin},#{qQ},#{realName},#{status},#{lastLoginDatetime},#{mark})")
    int addEmployee(Employee Employee);

}
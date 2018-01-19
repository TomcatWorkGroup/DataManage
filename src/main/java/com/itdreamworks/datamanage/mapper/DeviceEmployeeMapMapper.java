package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.DeviceEmployeeMap;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeviceEmployeeMapMapper {
    @Select("select * from Device_Employee_Map")
    @ResultType(DeviceEmployeeMap.class)
    List<DeviceEmployeeMap> findAll();

    @Select("select * from Device_Employee_Map where id=#{id}")
    DeviceEmployeeMap findOneById(@Param("id") int id);

    @Update("update Device_Employee_Map set EmployeeId=#{employeeId},DeviceId=#{deviceId},DeviceCode=#{deviceCode},NickName=#{nickName} where Id = #{id}")
    int modifyDeviceEmployeeMap(DeviceEmployeeMap DeviceEmployeeMap);

    @Insert("insert into Device_Employee_Map (EmployeeId,DeviceId,DeviceCode,NickName) values (#{employeeId},#{deviceId},#{deviceCode},#{nickName})")
    int addDeviceEmployeeMap(DeviceEmployeeMap DeviceEmployeeMap);

}
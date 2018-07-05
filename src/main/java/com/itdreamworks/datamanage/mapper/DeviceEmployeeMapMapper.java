package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.db.DeviceEmployeeMap;
import com.itdreamworks.datamanage.entity.db.DeviceEmployeeMapView;
import com.itdreamworks.datamanage.entity.db.DeviceEmployeeMapViewForDevice;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeviceEmployeeMapMapper {

    @Select("select count(*) from " + DeviceEmployeeMap.TABLE_NAME + " where " + DeviceEmployeeMap.COLUMN_DEVICE_ID + "= #{deviceId} and " + DeviceEmployeeMap.COLUMN_EMPLOYEE_ID + " = #{employeeId}")
    int checkMap(DeviceEmployeeMap map);

    @Select("select * from " + DeviceEmployeeMapView.TABLE_NAME + " where " + DeviceEmployeeMapView.COLUMN_DEVICE_ID + "=#{deviceId}")
    @ResultType(DeviceEmployeeMapView.class)
    List<DeviceEmployeeMapView> findByDevice(@Param("deviceId") int deviceId);

    @Select("select * from " + DeviceEmployeeMapView.TABLE_NAME + " where " + DeviceEmployeeMapView.COLUMN_EMPLOYEE_ID + "=#{employeeId}")
    @ResultType(DeviceEmployeeMapView.class)
    List<DeviceEmployeeMapView> findByEmployee(@Param("employeeId") int employeeId);


    @Select("select * from " + DeviceEmployeeMapView.TABLE_NAME + " where " + DeviceEmployeeMapView.COLUMN_EMPLOYEE_ID + "=#{employeeId}")
    @ResultType(DeviceEmployeeMapViewForDevice.class)
    List<DeviceEmployeeMapViewForDevice> findEmployeeDevices(@Param("employeeId") int employeeId);

    @Delete("delete from Device_Employee_Map where EmployeeId=#{employeeId} and DeviceId =#{deviceId}")
    int deleteDeviceEmployeeMap(DeviceEmployeeMap DeviceEmployeeMap);

//    @Update("update " + DeviceEmployeeMap.TABLE_NAME + " set EmployeeId=#{employeeId},DeviceId=#{deviceId} where Id = #{id}")
//    int modifyDeviceEmployeeMap(DeviceEmployeeMap DeviceEmployeeMap);

    @Insert("insert into Device_Employee_Map (EmployeeId,DeviceId) values (#{employeeId},#{deviceId})")
    int addDeviceEmployeeMap(DeviceEmployeeMap DeviceEmployeeMap);

}
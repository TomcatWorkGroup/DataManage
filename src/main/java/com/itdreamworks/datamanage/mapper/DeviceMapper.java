package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Device;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeviceMapper {
    @Select("select * from Device")
    @ResultType(Device.class)
    List<Device> findAll();

    @Select("select * from Device where Status=#{status}")
    @ResultType(Device.class)
    List<Device> findAllByStatus(@Param("status") int status);

    @Select("select * from Device where DeviceNo=#{deviceNo} and Status=1")
    @ResultType(Device.class)
    Device find(@Param("deviceNo") String deviceNo);

    @Select("select * from Device where deviceSuffix=#{deviceSuffix} and Status=1")
    @ResultType(Device.class)
    Device findBySuffix(@Param("deviceSuffix") String deviceSuffix);

    @Select("select * from Device where EnterpriseId=#{enterpriseid} and ManufacturerId=#{manufacturerid}")
    @ResultType(Device.class)
    List<Device> search(@Param("enterpriseid") int status,@Param("manufacturerid") int manufacturerid);

    @Select("select * from Device where id=#{id}")
    Device findOneById(@Param("id") int id);

    @Update("update Device set DeviceNo=#{deviceNo},Status=#{status},RunStatus=#{runStatus},NickName=#{nickName} where Id = #{id}")
    int modifyDevice(Device Device);

    @Update("update Device set Status=#{status} where Id=#{id}")
    int changeDeviceStatus(Device Device);

    @Insert("insert into Device (EnterpriseId,DeviceNo,ManufacturerId,Status,RunStatus,ImportDatetime,NickName) values (#{enterpriseId},#{deviceNo},#{manufacturerId},#{status},#{runStatus},#{importDatetime},#{nickName})")
    int addDevice(Device Device);

}

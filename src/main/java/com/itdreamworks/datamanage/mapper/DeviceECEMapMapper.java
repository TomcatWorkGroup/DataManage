package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.DeviceECEMap;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeviceECEMapMapper {
    @Select("select * from Device_Enterprise_Customer_EndUser_Map")
    @ResultType(DeviceECEMap.class)
    List<DeviceECEMap> findAll();

    @Select("select * from Device_Enterprise_Customer_EndUser_Map where id=#{id}")
    DeviceECEMap findOneById(@Param("id") int id);

    @Update("update Device_Enterprise_Customer_EndUser_Map set DeviceId=#{deviceId},EnterpriseId=#{enterpriseId},CustomId=#{customId},EndUserId=#{endUserId} where Id = #{id}")
    int modifyDeviceECEMap(DeviceECEMap DeviceECEMap);



    @Insert("insert into Device_Enterprise_Customer_EndUser_Map (DeviceId,EnterpriseId,CustomId,EndUserId) values (#{deviceId},#{enterpriseId},#{customId},#{endUserId})")
    int addDeviceECEMap(DeviceECEMap DeviceECEMap);

}

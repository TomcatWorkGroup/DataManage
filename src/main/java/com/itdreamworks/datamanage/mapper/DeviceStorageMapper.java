package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.DeviceStorage;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeviceStorageMapper {
    @Select("select * from DeviceStorage")
    @ResultType(DeviceStorage.class)
    List<DeviceStorage> findAll();

    @Select("select * from DeviceStorage where id=#{id}")
    DeviceStorage findOneById(@Param("id") int id);

    @Update("update DeviceStorage set DeviceNo=#{deviceNo},NickName=#{nickName},Power=#{power},Media=#{media} where Id = #{id}")
    int modifyDeviceStorage(DeviceStorage DeviceStorage);

    @Insert("insert into DeviceStorage (DeviceNo,NickName,Power,Media) values (#{deviceNo},#{nickName},#{power},#{media})")
    int addDeviceStorage(DeviceStorage DeviceStorage);

}

package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Device;
import com.itdreamworks.datamanage.entity.Token_Dist;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeviceMapper {
    @Select("select * from Device")
    @ResultType(Device.class)
    List<Device> findAll();

    @Select("select DeviceSuffix from Device")
    @ResultType(Device.class)
    List<String> test();

    //获取企业类型suffix
    @Select("select deviceSuffix from Device where SUBSTRING(DeviceSuffix,1,2)=#{code}")
    List<String> findDeviceSuffixByEnterId(String code);
    //获取客户类型的控制器suffix
    @Select("select deviceSuffix from Device where SUBSTRING(DeviceSuffix,1,5)=#{code}")
    List<String> findDeviceSuffixByCusId(String code);
    //根据token获取编号
    @Select("select * from Token_Dict where token=#{token}")
    Token_Dist findCodeByToken(String token);

    @Select("select * from Device where Status=#{status}")
    @ResultType(Device.class)
    List<Device> findAllByStatus(@Param("status") int status);

    @Select("select * from Device where DevicePrefix=1 and Status=#{status}")
    @ResultType(Device.class)
    List<Device> findAllCTLByStatus(@Param("status") int status);

    @Select("select * from Device where DevicePrefix=2 and Status=#{status}")
    @ResultType(Device.class)
    List<Device> findAllPLCByStatus(@Param("status") int status);

    @Select("select * from Device where DeviceNo=#{deviceNo} and Status=1")
    @ResultType(Device.class)
    Device find(@Param("deviceNo") String deviceNo);

    @Select("select * from Device where DeviceNo=#{deviceNo} and Status=1")
    @ResultType(Device.class)
    Device findByDeviceNo(@Param("deviceNo") String deviceNo);

    @Select("select * from Device where DeviceSuffix=#{deviceSuffix} and Status=1")
    @ResultType(Device.class)
    Device findBySuffix(@Param("deviceSuffix") String deviceSuffix);

    @Select("select * from Device where EnterpriseId=#{enterpriseid} and ManufacturerId=#{manufacturerid}")
    @ResultType(Device.class)
    List<Device> search(@Param("enterpriseid") int status, @Param("manufacturerid") int manufacturerid);

    @Select("select * from Device where id=#{id}")
    Device findOneById(@Param("id") int id);

    @Update("update Device set DeviceNo=#{deviceNo},Status=#{status},RunStatus=#{runStatus},NickName=#{nickName} where Id = #{id}")
    int modifyDevice(Device Device);

    @Update("update Device set Status=#{status} where Id=#{id}")
    int changeDeviceStatus(Device Device);

    @Insert("insert into Device (EnterpriseId,DeviceNo,ManufacturerId,Status,RunStatus,ImportDatetime,NickName) values (#{enterpriseId},#{deviceNo},#{manufacturerId},#{status},#{runStatus},#{importDatetime},#{nickName})")
    int addDevice(Device Device);

}

package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Manufacturer;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ManufacturerMapper {
    @Select("select * from Manufacturer")
    @ResultType(Manufacturer.class)
    List<Manufacturer> findAll();

    @Select("select * from Manufacturer where id=#{id}")
    Manufacturer findOneById(@Param("id") int id);

    @Update("update Manufacturer set ManufacturerName=#{manufacturerName},ManufacturerCode=#{manufacturerCode} where Id = #{id}")
    int modifyManufacturer(Manufacturer Manufacturer);



    @Insert("insert into Manufacturer (ManufacturerName,ManufacturerCode) values (#{manufacturerName},#{manufacturerCode})")
    int addManufacturer(Manufacturer Manufacturer);

}

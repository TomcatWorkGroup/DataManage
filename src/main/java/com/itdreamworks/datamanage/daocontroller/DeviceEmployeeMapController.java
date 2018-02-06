package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.DeviceEmployeeMap;
import com.itdreamworks.datamanage.entity.DeviceEmployeeMapView;
import com.itdreamworks.datamanage.mapper.DeviceEmployeeMapMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/dem")
public class DeviceEmployeeMapController {
    @Autowired
    DeviceEmployeeMapMapper mapper;


    @PostMapping(value = "/create")
    public boolean create(DeviceEmployeeMap deviceEmployeeMap) {
        if(mapper.checkMap(deviceEmployeeMap)>0){
            return true;
        }else{
            return mapper.addDeviceEmployeeMap(deviceEmployeeMap) > 0;
        }
    }
    @PostMapping(value = "/get/device")
    public List<DeviceEmployeeMapView> getDeviceEmployeeMapViewByDevice(@RequestParam(name = "deviceId") int deviceId){
        return mapper.findByDevice(deviceId);
    }

    @PostMapping(value = "/get/employee")
    public List<DeviceEmployeeMapView> getDeviceEmployeeMapViewByEmployee(@RequestParam(name = "employeeId") int employeeId){
        return mapper.findByEmployee(employeeId);
    }

    @PostMapping(value = "/delete")
    public boolean deleteDeviceEmployeeMap(DeviceEmployeeMap map){
        return mapper.deleteDeviceEmployeeMap(map) > 0;
    }
}

package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.DeviceEmployeeMap;
import com.itdreamworks.datamanage.mapper.DeviceEmployeeMapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceEmployeeMapController {
    @Autowired
    DeviceEmployeeMapMapper mapper;

    @GetMapping(value = "/deviceEmployeeMap/list")
    public List<DeviceEmployeeMap> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/deviceEmployeeMap/create")
    public boolean create(DeviceEmployeeMap deviceEmployeeMap) {
        return mapper.addDeviceEmployeeMap(deviceEmployeeMap) > 0;
    }

    @PostMapping(value = "/deviceEmployeeMap/modify")
    public boolean modifyDeviceEmployeeMap(DeviceEmployeeMap deviceEmployeeMap) {
        return mapper.modifyDeviceEmployeeMap(deviceEmployeeMap) > 0;
    }
}

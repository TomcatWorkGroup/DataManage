package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.DeviceECEMap;
import com.itdreamworks.datamanage.mapper.DeviceECEMapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceECEMapController {
    @Autowired
    DeviceECEMapMapper mapper;

    @GetMapping(value = "/deviceecemap/list")
    public List<DeviceECEMap> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/deviceecemap/create")
    public boolean create(DeviceECEMap deviceecemap) {
        return mapper.addDeviceECEMap(deviceecemap) > 0;
    }

    @PostMapping(value = "/deviceecemap/modify")
    public boolean modifyDeviceECEMap(DeviceECEMap deviceecemap) {
        return mapper.modifyDeviceECEMap(deviceecemap) > 0;
    }

}

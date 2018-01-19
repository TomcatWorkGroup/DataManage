package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.Device;
import com.itdreamworks.datamanage.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceController {
    @Autowired
    DeviceMapper mapper;

    @GetMapping(value = "/device/list")
    public List<Device> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/device/create")
    public boolean create(Device device) {
        return mapper.addDevice(device) > 0;
    }

    @PostMapping(value = "/device/modify")
    public boolean modifyDevice(Device device) {
        return mapper.modifyDevice(device) > 0;
    }

    @PostMapping(value = "/device/change")
    public boolean modifyDeviceStatus(Device device) {
        return mapper.changeDeviceStatus(device) > 0;
    }
}

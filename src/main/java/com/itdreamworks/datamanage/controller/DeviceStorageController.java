package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.DeviceStorage;
import com.itdreamworks.datamanage.mapper.DeviceStorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceStorageController {
    @Autowired
    DeviceStorageMapper mapper;

    @GetMapping(value = "/deviceStorage/list")
    public List<DeviceStorage> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/deviceStorage/create")
    public boolean create(DeviceStorage deviceStorage) {
        return mapper.addDeviceStorage(deviceStorage) > 0;
    }

    @PostMapping(value = "/deviceStorage/modify")
    public boolean modifyDeviceStorage(DeviceStorage deviceStorage) {
        return mapper.modifyDeviceStorage(deviceStorage) > 0;
    }
}
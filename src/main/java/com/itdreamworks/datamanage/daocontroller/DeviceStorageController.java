package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.DeviceStorage;
import com.itdreamworks.datamanage.mapper.DeviceStorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/devicestorage")
public class DeviceStorageController {
    @Autowired
    DeviceStorageMapper mapper;

    @GetMapping(value = "/list")
    public List<DeviceStorage> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/create")
    public boolean create(DeviceStorage deviceStorage) {
        return mapper.addDeviceStorage(deviceStorage) > 0;
    }

    @PostMapping(value = "/modify")
    public boolean modifyDeviceStorage(DeviceStorage deviceStorage) {
        return mapper.modifyDeviceStorage(deviceStorage) > 0;
    }
}
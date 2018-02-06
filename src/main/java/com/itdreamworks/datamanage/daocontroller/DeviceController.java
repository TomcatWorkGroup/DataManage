package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.Device;
import com.itdreamworks.datamanage.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/device")
public class DeviceController {
    @Autowired
    DeviceMapper mapper;

    @GetMapping(value = "/list")
    public List<Device> getAll() {
        return mapper.findAll();
    }

    @GetMapping(value = "/sell")
    public List<Device> getSell() {
        return mapper.findAllByStatus(Device.STATUS_SELL);
    }

    @PostMapping(value = "/search")
    public List<Device> search(@RequestParam("enterpriseId") int enterpriseId,@RequestParam("manufacturerId") int manufacturerId) {
        return mapper.search(enterpriseId,manufacturerId);
    }

    @PostMapping(value = "/create")
    public boolean create(Device device) {
        device.setImportDatetime(new Date());
        return mapper.addDevice(device) > 0;
    }

    @PostMapping(value = "/modify")
    public boolean modifyDevice(Device device) {
        return mapper.modifyDevice(device) > 0;
    }

    @PostMapping(value = "/change")
    public boolean modifyDeviceStatus(Device device) {
        return mapper.changeDeviceStatus(device) > 0;
    }
}

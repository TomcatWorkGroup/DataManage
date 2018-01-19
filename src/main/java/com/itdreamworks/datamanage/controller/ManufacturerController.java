package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.Manufacturer;
import com.itdreamworks.datamanage.mapper.ManufacturerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManufacturerController {
    @Autowired
    ManufacturerMapper mapper;

    @GetMapping(value = "/manufacturer/list")
    public List<Manufacturer> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/manufacturer/create")
    public boolean create(Manufacturer manufacturer) {
        return mapper.addManufacturer(manufacturer) > 0;
    }

    @PostMapping(value = "/manufacturer/modify")
    public boolean modifyManufacturer(Manufacturer manufacturer) {
        return mapper.modifyManufacturer(manufacturer) > 0;
    }

}

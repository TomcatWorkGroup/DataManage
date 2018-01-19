package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.Enterprise;
import com.itdreamworks.datamanage.mapper.EnterpriseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnterpriseController {
    @Autowired
    EnterpriseMapper mapper;

    @GetMapping(value = "/enterprise/list")
    public List<Enterprise> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/enterprise/create")
    public boolean create(Enterprise enterprise) {
        return mapper.addEnterprise(enterprise) > 0;
    }

    @PostMapping(value = "/enterprise/modify")
    public boolean modifyEnterprise(Enterprise enterprise) {
        return mapper.modifyEnterprise(enterprise) > 0;
    }

    @PostMapping(value = "/enterprise/change")
    public boolean modifyEnterpriseStatus(Enterprise enterprise) {
        return mapper.changeEnterpriseStatus(enterprise) > 0;
    }
}

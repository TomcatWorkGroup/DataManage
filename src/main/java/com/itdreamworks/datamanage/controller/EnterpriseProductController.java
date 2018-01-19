package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.EnterpriseProduct;
import com.itdreamworks.datamanage.mapper.EnterpriseProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnterpriseProductController {
    @Autowired
    EnterpriseProductMapper mapper;

    @GetMapping(value = "/enterpriseProduct/list")
    public List<EnterpriseProduct> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/enterpriseProduct/create")
    public boolean create(EnterpriseProduct enterpriseProduct) {
        return mapper.addEnterpriseProduct(enterpriseProduct) > 0;
    }

    @PostMapping(value = "/enterpriseProduct/modify")
    public boolean modifyEnterpriseProduct(EnterpriseProduct enterpriseProduct) {
        return mapper.modifyEnterpriseProduct(enterpriseProduct) > 0;
    }

    @PostMapping(value = "/enterpriseProduct/change")
    public boolean modifyEnterpriseProductStatus(EnterpriseProduct enterpriseProduct) {
        return mapper.changeEnterpriseProductStatus(enterpriseProduct) > 0;
    }
}

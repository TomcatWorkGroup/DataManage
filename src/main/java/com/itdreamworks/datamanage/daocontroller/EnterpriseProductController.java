package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.db.EnterpriseProduct;
import com.itdreamworks.datamanage.mapper.EnterpriseProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/eproduct")
public class EnterpriseProductController {
    @Autowired
    EnterpriseProductMapper mapper;

    @GetMapping(value = "/list")
    public List<EnterpriseProduct> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/create")
    public boolean create(EnterpriseProduct enterpriseProduct) {
        return mapper.addEnterpriseProduct(enterpriseProduct) > 0;
    }

    @PostMapping(value = "/modify")
    public boolean modifyEnterpriseProduct(EnterpriseProduct enterpriseProduct) {
        return mapper.modifyEnterpriseProduct(enterpriseProduct) > 0;
    }

    @PostMapping(value = "/change")
    public boolean modifyEnterpriseProductStatus(EnterpriseProduct enterpriseProduct) {
        return mapper.changeEnterpriseProductStatus(enterpriseProduct) > 0;
    }
}

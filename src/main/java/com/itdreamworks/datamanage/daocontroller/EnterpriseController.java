package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.db.Enterprise;
import com.itdreamworks.datamanage.mapper.EnterpriseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/enterprise")
public class EnterpriseController {
    @Autowired
    EnterpriseMapper mapper;

    @GetMapping(value = "/list")
    public List<Enterprise> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/status")
    public List<Enterprise> getEnterprisesByStatus(@RequestParam(name = "status", defaultValue = "-1") int status) {
        return mapper.findEnterprisesByStatus(status);
    }

    @PostMapping(value = "/create")
    public boolean create(Enterprise enterprise) {
        return mapper.addEnterprise(enterprise) > 0;
    }

    @PostMapping(value = "/modify")
    public boolean modifyEnterprise(Enterprise enterprise) {
        return mapper.modifyEnterprise(enterprise) > 0;
    }

    @PostMapping(value = "/change")
    public boolean modifyEnterpriseStatus(Enterprise enterprise) {
        return mapper.changeEnterpriseStatus(enterprise) > 0;
    }
}

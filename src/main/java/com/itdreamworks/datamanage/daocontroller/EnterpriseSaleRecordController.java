package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.EnterpriseSaleRecord;
import com.itdreamworks.datamanage.mapper.EnterpriseSaleRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnterpriseSaleRecordController {
    @Autowired
    EnterpriseSaleRecordMapper mapper;

    @GetMapping(value = "/enterpriseSaleRecord/list")
    public List<EnterpriseSaleRecord> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/enterpriseSaleRecord/create")
    public boolean create(EnterpriseSaleRecord enterpriseSaleRecord) {
        return mapper.addEnterpriseSaleRecord(enterpriseSaleRecord) > 0;
    }

    @PostMapping(value = "/enterpriseSaleRecord/modify")
    public boolean modifyEnterpriseSaleRecord(EnterpriseSaleRecord enterpriseSaleRecord) {
        return mapper.modifyEnterpriseSaleRecord(enterpriseSaleRecord) > 0;
    }
}

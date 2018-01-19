package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.CustomerSaleRecord;
import com.itdreamworks.datamanage.mapper.CustomerSaleRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerSaleRecordController {
    @Autowired
    CustomerSaleRecordMapper mapper;

    @GetMapping(value = "/customerSaleRecord/list")
    public List<CustomerSaleRecord> getAll(){
        return  mapper.findAll();
    }
    @PostMapping(value="/customerSaleRecord/create")
    public  boolean create(CustomerSaleRecord customerSaleRecord){
        return mapper.addCustomerSaleRecord(customerSaleRecord)>0;
    }
    @PostMapping(value = "/customerSaleRecord/modify")
    public  boolean modifyCustomerSaleRecord(CustomerSaleRecord customerSaleRecord){
        return  mapper.modifyCustomerSaleRecord(customerSaleRecord)>0;
    }

    
}

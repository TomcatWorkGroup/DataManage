package com.itdreamworks.datamanage.controller;


import com.itdreamworks.datamanage.entity.Customer;
import com.itdreamworks.datamanage.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerMapper mapper;

    @GetMapping(value = "/customer/list")
    public List<Customer> getAll() {
        return mapper.findAll();
    }

        @PostMapping(value = "/customer/create")
        public boolean create(Customer customer) {
            return mapper.addCustomer(customer) > 0;
        }


    @PostMapping(value = "/customer/modify")
    public boolean modifyCustomer(Customer customer) {
        return mapper.modifyCustomer(customer) > 0;
    }

    @PostMapping(value = "/customer/change")
    public boolean modifyCustomerStatus(Customer customer) {
        return mapper.changeCustomerStatus(customer) > 0;
    }
}

package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.CustomerProduct;
import com.itdreamworks.datamanage.mapper.CustomerProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerProductController {
    @Autowired
    CustomerProductMapper mapper;

    @GetMapping(value = "/customerProduct/list")
    public List<CustomerProduct> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/customerProduct/create")
    public boolean create(CustomerProduct customerProduct) {
        return mapper.addCustomerProduct(customerProduct) > 0;
    }

    @PostMapping(value = "/customerProduct/modify")
    public boolean modifyCustomerProduct(CustomerProduct customerProduct) {
        return mapper.modifyCustomerProduct(customerProduct) > 0;
    }

    @PostMapping(value = "/customerProduct/change")
    public boolean modifyCustomerProductStatus(CustomerProduct customerProduct) {
        return mapper.changeCustomerProductStatus(customerProduct) > 0;
    }
}

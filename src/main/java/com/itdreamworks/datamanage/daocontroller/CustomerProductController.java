package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.db.CustomerProduct;
import com.itdreamworks.datamanage.mapper.CustomerProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cproduct")
public class CustomerProductController {
    @Autowired
    CustomerProductMapper mapper;

    @GetMapping(value = "/list")
    public List<CustomerProduct> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/create")
    public boolean create(CustomerProduct customerProduct) {
        return mapper.addCustomerProduct(customerProduct) > 0;
    }

    @PostMapping(value = "/modify")
    public boolean modifyCustomerProduct(CustomerProduct customerProduct) {
        return mapper.modifyCustomerProduct(customerProduct) > 0;
    }

    @PostMapping(value = "/change")
    public boolean modifyCustomerProductStatus(CustomerProduct customerProduct) {
        return mapper.changeCustomerProductStatus(customerProduct) > 0;
    }
}

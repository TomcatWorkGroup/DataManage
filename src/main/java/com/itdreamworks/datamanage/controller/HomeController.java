package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.Company;
import com.itdreamworks.datamanage.entity.Customer;
import com.itdreamworks.datamanage.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    CompanyMapper mapper;

    @GetMapping(value = "/home/list")
    public List<Company> getAllCompany() {
        List<Company> list = mapper.findAll();
        return list;
    }

    @PostMapping(value = "/home/create")
    public boolean create(Company company) {
        return mapper.addCompany(company) > 0;
    }


    @PostMapping(value = "/home/modify")
    public boolean modifyCompany(Company company) {
        return mapper.modifyCompany(company) > 0;
    }

    @PostMapping(value = "/home/change")
    public boolean modifyCompanyStatus(Company company) {
        return mapper.changeCompanyStatus(company) > 0;
    }
}

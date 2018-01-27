package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.Company;
import com.itdreamworks.datamanage.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    CompanyMapper mapper;

    @GetMapping(value = "/list")
    public List<Company> getAllCompany() {
        return mapper.findAll();
    }

    @PostMapping(value = "/create")
    public boolean create(Company company) {
        return mapper.addCompany(company) > 0;
    }


    @PostMapping(value = "/modify")
    public boolean modifyCompany(Company company) {
        return mapper.modifyCompany(company) > 0;
    }

    @PostMapping(value = "/change")
    public boolean modifyCompanyStatus(Company company) {
        return mapper.changeCompanyStatus(company) > 0;
    }
}

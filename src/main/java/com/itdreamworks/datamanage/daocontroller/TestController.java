package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.service.CustomerCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    CustomerCategoryService service;
    @RequestMapping(method = RequestMethod.GET,value = "delete")
    public void test(){
        service.delete(12,"11");
    }
}

package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.EndUser;
import com.itdreamworks.datamanage.mapper.EndUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EndUserController {
    @Autowired
    EndUserMapper mapper;

    @GetMapping(value = "/enduser/list")
    public List<EndUser> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "enduser/create")
    public boolean create(EndUser enduser) {
        return mapper.addEndUser(enduser) > 0;
    }

    @PostMapping(value = "/enduser/modify")
    public boolean modifyEndUser(EndUser enduser) {
        return mapper.modifyEndUser(enduser) > 0;
    }

    @PostMapping(value = "/enduser/change")
    public boolean modifyEndUserStatus(EndUser enduser) {
        return mapper.changeEndUserStatus(enduser) > 0;
    }
}

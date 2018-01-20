
package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.SysUser;
import com.itdreamworks.datamanage.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sysusr")
public class SysUserController {
    @Autowired
    SysUserMapper mapper;

    @GetMapping(value = "/list")
    public List<SysUser> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/create")
    public boolean create(SysUser sysUser) {
        return mapper.addSysUser(sysUser) > 0;
    }

    @PostMapping(value = "/modify")
    public boolean modifySysUser(SysUser sysUser) {
        return mapper.modifySysUser(sysUser) > 0;
    }

    @PostMapping(value = "/change")
    public boolean modifySysUserStatus(SysUser sysUser) {
        return mapper.changeSysUserStatus(sysUser) > 0;
    }
}

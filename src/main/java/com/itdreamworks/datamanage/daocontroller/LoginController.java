package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.db.Employee;
import com.itdreamworks.datamanage.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 临时用来做身份认证
 * 将来所有身份认证功能均转移至身份认证与授权节点
 */
@RestController
@RequestMapping(value = "/account")
public class LoginController {
    @Autowired
    EmployeeMapper mapper;

    @PostMapping(value = "/signin")
    public String signIn(@RequestParam(name = "loginid") String loginId, @RequestParam(name = "password") String password) {
        Employee user = mapper.findOneByLoginId(loginId);
        if (null == user)
            return "{\"code\":0,\"msg\":\"用户名或密码错误！\"}";
        if (user.getPassword().equals(password)) {
            if (Employee.STATUS_ENABLE == user.getStatus()) {
                return String.format("{\"code\":1,\"token\":\"\",\"user\":{\"name\":\"%s\"}}", user.getRealName());
            } else {
                return "{\"code\":0,\"msg\":\"您的用户账号已经被禁用，请联系系统管理人员！\"}";
            }
        } else {
            return "{\"code\":0,\"msg\":\"用户名或密码错误！\"}";
        }
    }
}

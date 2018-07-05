package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.db.DeviceEmployeeMapViewForDevice;
import com.itdreamworks.datamanage.entity.db.Employee;
import com.itdreamworks.datamanage.mapper.DeviceEmployeeMapMapper;
import com.itdreamworks.datamanage.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeMapper mapper;
    @Autowired
    private DeviceEmployeeMapMapper demDao;

    @GetMapping(value = "/list")
    public List<Employee> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/create")
    public String create(Employee employee) {
        try {
            Employee checkEmployee = mapper.findOneByLoginId(employee.getMobile());
            if (null != checkEmployee) {
                return "{\"code\":0,\"msg\":\"该手机号码用户已存在。\"}";
            } else {
                employee.setStatus(Employee.STATUS_ENABLE);
                if (mapper.addEmployee(employee) > 0) {
                    return "{\"code\":1,\"msg\":\"用户创建成功。\"}";
                } else {
                    return "{\"code\":0,\"msg\":\"操作失败。\"}";
                }
            }
        } catch (Exception ex) {
            return String.format("{\"code\":0,\"msg\":\"%s\"}", ex.getMessage());
        }
    }

    @PostMapping(value = "/search")
    public List<Employee> search(@RequestParam(name = "orgType") int orgType, @RequestParam(name = "orgId") int orgId) {
        return mapper.findEmployeesByOrg(orgType, orgId);
    }

    @PostMapping(value = "/find")
    public Employee findEmployee(String loginId) {
        return mapper.findOneByLoginId(loginId);
    }

    @PostMapping(value = "/devices")
    public List<DeviceEmployeeMapViewForDevice> getManageDevices(@RequestParam("employeeId") int employeeId) {
        return demDao.findEmployeeDevices(employeeId);
    }

    @PostMapping(value = "/modify")
    public boolean modifyEmployee(Employee employee) {
        return mapper.modifyEmployee(employee) > 0;
    }

    @PostMapping(value = "/change")
    public boolean modifyEmployeeStatus(Employee employee) {
        return mapper.changeEmployeeStatus(employee) > 0;
    }

    @PostMapping(value = "/changePassword")
    public boolean changeEmployeePassword(String loginId, String password) {
        return mapper.changeEmployeePassword(loginId, password) > 0;
    }

}

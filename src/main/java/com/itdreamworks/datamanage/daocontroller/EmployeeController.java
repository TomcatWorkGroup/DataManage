package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.DeviceEmployeeMapViewForDevice;
import com.itdreamworks.datamanage.entity.Employee;
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
    public boolean create(Employee employee) {
        return mapper.addEmployee(employee) > 0;
    }

    @PostMapping(value = "/search")
    public List<Employee> search(@RequestParam(name = "orgType") int orgType,@RequestParam(name = "orgId") int orgId) {
        return mapper.findEmployeesByOrg(orgType,orgId);
    }

    @PostMapping(value = "/find")
    public Employee findEmployee(String loginId){
        return  mapper.findOneByLoginId(loginId);
    }
    @PostMapping(value = "/devices")
    public List<DeviceEmployeeMapViewForDevice> getManageDevices(@RequestParam("employeeId") int employeeId){
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
}

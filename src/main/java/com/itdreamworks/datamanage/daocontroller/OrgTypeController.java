package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.web.Result;
import com.itdreamworks.datamanage.mapper.OrgTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 组织类型管理接口
 */
@RestController
@RequestMapping(value = "/org")
public class OrgTypeController {
    @Autowired
    OrgTypeMapper orgTypeMapper;

    /**
     * 获取组织类型列表
     * @return
     */
    @GetMapping("/list")
    public Result getList() {
        try {
            return Result.getSuccessResult(orgTypeMapper.getDeviceTypeList());
        } catch (Exception ex) {
            return Result.getFailResult(ex.getMessage());
        }
    }

    /**
     * 修改组织类型信息，只能修改类型名称
     * @param orgType
     * @param orgTypeName
     * @return
     */
    @PostMapping("/modify")
    public Result modify(int orgType, String orgTypeName) {
        try {
            orgTypeMapper.modifyOrgType(orgType, orgTypeName);
            return Result.getSuccessResult();
        } catch (Exception ex) {
            return Result.getFailResult(ex.getMessage());
        }
    }

    /**
     * 创建组织类型
     * @param orgType
     * @param orgTypeName
     * @return
     */
    @PostMapping("/create")
    public Result create(int orgType, String orgTypeName) {
        try {
            if (0 < orgTypeMapper.checkOrgType(orgType)) {
                return Result.getSuccessResult();
            }
            orgTypeMapper.addOrgType(orgType, orgTypeName);
            return Result.getSuccessResult();
        } catch (Exception ex) {
            return Result.getFailResult(ex.getMessage());
        }
    }


}

package com.itdreamworks.datamanage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Device implements Serializable {
    public static final int STATUS_SELL = 1;
    public static final int STATUS_READY = 0;

    private int id,enterpriseId,manufacturerId,status,runStatus;
    private String deviceNo,nickName;
    /**
     * 设备前10位编码
     */
    private String devicePrefix;
    /**
     * 设备后10位编码
     */
    private String deviceSuffix;
    /**
     * 设备类型 如：CTL_NJZJ_IPK2 PLC_BKSE_DRY
     */
    private String deviceType;

    public String getDevicePrefix() {
        return devicePrefix;
    }

    public void setDevicePrefix(String devicePrefix) {
        this.devicePrefix = devicePrefix;
    }

    public String getDeviceSuffix() {
        return deviceSuffix;
    }

    public void setDeviceSuffix(String deviceSuffix) {
        this.deviceSuffix = deviceSuffix;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date importDatetime;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public int getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(int runStatus) {
        this.runStatus = runStatus;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceno) {
        this.deviceNo = deviceno;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getImportDatetime() {
        return importDatetime;
    }

    public void setImportDatetime(Date importDatetime) {
        this.importDatetime = importDatetime;
    }

}

package com.itdreamworks.datamanage.entity;

import java.io.Serializable;

public class DeviceEmployeeMapViewForDevice implements Serializable {
    public static final String TABLE_NAME="Device_Employee_Map_View";
    public static final String COLUMN_DEVICE_ID="DeviceId";
    public static final String COLUMN_EMPLOYEE_ID="EmployeeId";

    private int deviceId;
    private String deviceNo;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    private String nickName;


    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }
}

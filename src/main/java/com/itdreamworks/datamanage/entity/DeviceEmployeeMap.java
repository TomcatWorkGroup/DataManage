package com.itdreamworks.datamanage.entity;

import java.io.Serializable;

public class DeviceEmployeeMap implements Serializable {
    public static final String TABLE_NAME="Device_Employee_Map";
    public static final String COLUMN_DEVICE_ID="DeviceId";
    public static final String COLUMN_EMPLOYEE_ID="EmployeeId";

    private int id,employeeId,deviceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }
}

package com.itdreamworks.datamanage.entity;

import java.io.Serializable;

public class Manufacturer implements Serializable {
    private int id;
    private String manufacturerCode,manufacturerName;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}

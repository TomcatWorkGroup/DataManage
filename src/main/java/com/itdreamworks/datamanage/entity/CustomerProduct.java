package com.itdreamworks.datamanage.entity;

import java.io.Serializable;

public class CustomerProduct implements Serializable {
    private  int id,customerId,deviceId,enterpriseProductId,status;
    private String productName;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getEnterpriseProductId() {
        return enterpriseProductId;
    }

    public void setEnterpriseProductId(int enterpriseProductId) {
        this.enterpriseProductId = enterpriseProductId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

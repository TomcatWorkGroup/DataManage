package com.itdreamworks.datamanage.entity;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id,enterpriserId,status;
    private String customerName;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getEnterpriserId() {
        return enterpriserId;
    }

    public void setEnterpriserId(int enterpriserId) {
        this.enterpriserId = enterpriserId;
    }
}

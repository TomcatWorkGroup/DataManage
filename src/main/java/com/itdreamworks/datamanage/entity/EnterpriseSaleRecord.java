package com.itdreamworks.datamanage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseSaleRecord implements Serializable {
    private int id,enterpriseProductId,enterpriseId,customerId,endUserId;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date saleDatetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnterpriseProductId() {
        return enterpriseProductId;
    }

    public void setEnterpriseProductId(int enterpriseProductId) {
        this.enterpriseProductId = enterpriseProductId;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getEndUserId() {
        return endUserId;
    }

    public void setEndUserId(int endUserId) {
        this.endUserId = endUserId;
    }

    public Date getSaleDatetime() {
        return saleDatetime;
    }

    public void setSaleDatetime(Date saleDatetime) {
        this.saleDatetime = saleDatetime;
    }
}

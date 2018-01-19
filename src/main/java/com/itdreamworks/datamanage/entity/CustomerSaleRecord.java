package com.itdreamworks.datamanage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class CustomerSaleRecord implements Serializable {
    private int id,customerProductId,customerId,endUserId;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date saleDatetime;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public int getCustomerProductId() {
        return customerProductId;
    }

    public void setCustomerProductId(int customerProductId) {
        this.customerProductId = customerProductId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getEndUserId() {
        return customerProductId;
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

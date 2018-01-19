package com.itdreamworks.datamanage.entity;

import java.io.Serializable;

public class DeviceECEMap  implements Serializable {
    private int id,deviceId,enterpriseId,customId,endUserId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public int getCustomId() {
        return customId;
    }

    public void setCustomId(int customId) {
        this.customId = customId;
    }

    public int getEndUserId() {
        return endUserId;
    }

    public void setEndUserId(int endUserId) {
        this.endUserId = endUserId;
    }
}

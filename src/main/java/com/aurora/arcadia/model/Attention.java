package com.aurora.arcadia.model;

import java.util.Date;

public class Attention {
    private Integer attId;

    private Integer attUserId;

    private Integer attBeUserId;

    private Date attTime;

    public Integer getAttId() {
        return attId;
    }

    public void setAttId(Integer attId) {
        this.attId = attId;
    }

    public Integer getAttUserId() {
        return attUserId;
    }

    public void setAttUserId(Integer attUserId) {
        this.attUserId = attUserId;
    }

    public Integer getAttBeUserId() {
        return attBeUserId;
    }

    public void setAttBeUserId(Integer attBeUserId) {
        this.attBeUserId = attBeUserId;
    }

    public Date getAttTime() {
        return attTime;
    }

    public void setAttTime(Date attTime) {
        this.attTime = attTime;
    }
}
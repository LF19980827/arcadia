package com.aurora.arcadia.model;

import java.util.Date;

public class Lost {
    private Integer lostId;

    private String lostTitle;

    private String lostIntro;

    private Integer lostSign;

    private Integer lostUserId;

    private Date lostTime;

    public Integer getLostId() {
        return lostId;
    }

    public void setLostId(Integer lostId) {
        this.lostId = lostId;
    }

    public String getLostTitle() {
        return lostTitle;
    }

    public void setLostTitle(String lostTitle) {
        this.lostTitle = lostTitle == null ? null : lostTitle.trim();
    }

    public String getLostIntro() {
        return lostIntro;
    }

    public void setLostIntro(String lostIntro) {
        this.lostIntro = lostIntro == null ? null : lostIntro.trim();
    }

    public Integer getLostSign() {
        return lostSign;
    }

    public void setLostSign(Integer lostSign) {
        this.lostSign = lostSign;
    }

    public Integer getLostUserId() {
        return lostUserId;
    }

    public void setLostUserId(Integer lostUserId) {
        this.lostUserId = lostUserId;
    }

    public Date getLostTime() {
        return lostTime;
    }

    public void setLostTime(Date lostTime) {
        this.lostTime = lostTime;
    }
}
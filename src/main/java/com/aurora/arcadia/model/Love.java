package com.aurora.arcadia.model;

import java.util.Date;

public class Love {
    private Integer loveId;

    private Integer loveUserId;

    private String loveIntro;

    private Integer loveSign;

    private Boolean loveUserStatus;

    private Date loveTime;

    private String loveUser;

    public Integer getLoveId() {
        return loveId;
    }

    public void setLoveId(Integer loveId) {
        this.loveId = loveId;
    }

    public Integer getLoveUserId() {
        return loveUserId;
    }

    public void setLoveUserId(Integer loveUserId) {
        this.loveUserId = loveUserId;
    }

    public String getLoveIntro() {
        return loveIntro;
    }

    public void setLoveIntro(String loveIntro) {
        this.loveIntro = loveIntro == null ? null : loveIntro.trim();
    }

    public Integer getLoveSign() {
        return loveSign;
    }

    public void setLoveSign(Integer loveSign) {
        this.loveSign = loveSign;
    }

    public Boolean getLoveUserStatus() {
        return loveUserStatus;
    }

    public void setLoveUserStatus(Boolean loveUserStatus) {
        this.loveUserStatus = loveUserStatus;
    }

    public Date getLoveTime() {
        return loveTime;
    }

    public void setLoveTime(Date loveTime) {
        this.loveTime = loveTime;
    }

    public String getLoveUser() {
        return loveUser;
    }

    public void setLoveUser(String loveUser) {
        this.loveUser = loveUser;
    }
}
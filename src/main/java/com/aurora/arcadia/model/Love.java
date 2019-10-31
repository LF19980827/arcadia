package com.aurora.arcadia.model;

/*表白墙信息*/
public class Love {
    private Integer loveId;

    private Integer loveUserId;

    private String loveIntro;

    private Integer loveSign;

    private Boolean loveUserStatus;

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
}
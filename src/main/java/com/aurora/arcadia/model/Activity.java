package com.aurora.arcadia.model;

import java.util.Date;

public class Activity {
    private Integer activityId;

    private String activityName;

    private Date activityTime;

    private Integer activityClubId;

    private String activityIntro;

    private Integer activitySign;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public Date getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(Date activityTime) {
        this.activityTime = activityTime;
    }

    public Integer getActivityClubId() {
        return activityClubId;
    }

    public void setActivityClubId(Integer activityClubId) {
        this.activityClubId = activityClubId;
    }

    public String getActivityIntro() {
        return activityIntro;
    }

    public void setActivityIntro(String activityIntro) {
        this.activityIntro = activityIntro == null ? null : activityIntro.trim();
    }

    public Integer getActivitySign() {
        return activitySign;
    }

    public void setActivitySign(Integer activitySign) {
        this.activitySign = activitySign;
    }
}
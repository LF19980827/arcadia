package com.aurora.arcadia.model;

public class Club {
    private Integer clubId;

    private String clubName;

    private String clubKind;

    private String clubIntro;

    private Integer clubManager;

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName == null ? null : clubName.trim();
    }

    public String getClubKind() {
        return clubKind;
    }

    public void setClubKind(String clubKind) {
        this.clubKind = clubKind == null ? null : clubKind.trim();
    }

    public String getClubIntro() {
        return clubIntro;
    }

    public void setClubIntro(String clubIntro) {
        this.clubIntro = clubIntro == null ? null : clubIntro.trim();
    }

    public Integer getClubManager() {
        return clubManager;
    }

    public void setClubManager(Integer clubManager) {
        this.clubManager = clubManager;
    }
}
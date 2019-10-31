package com.aurora.arcadia.model;

import java.util.Date;

/**
 * 信息
 */
public class UserMessage {
    private Integer userId;

    private String uName;

    private String uGender;

    private Date uBirth;

    private String uAddress;

    private String uCareer;

    private String uIntro;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender == null ? null : uGender.trim();
    }

    public Date getuBirth() {
        return uBirth;
    }

    public void setuBirth(Date uBirth) {
        this.uBirth = uBirth;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public String getuCareer() {
        return uCareer;
    }

    public void setuCareer(String uCareer) {
        this.uCareer = uCareer == null ? null : uCareer.trim();
    }

    public String getuIntro() {
        return uIntro;
    }

    public void setuIntro(String uIntro) {
        this.uIntro = uIntro == null ? null : uIntro.trim();
    }
}
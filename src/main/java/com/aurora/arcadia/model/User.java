package com.aurora.arcadia.model;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userMobile;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(Integer userId, String userName, String userPassword, String userMobile) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userMobile = userMobile;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }
}
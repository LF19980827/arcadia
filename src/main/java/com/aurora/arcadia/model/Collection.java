package com.aurora.arcadia.model;

import java.util.Date;

public class Collection {
    private Integer colId;

    private Integer colUserId;

    private Date colTime;

    private Integer colPost;

    private Date colPostTime;

    private String colTitle;

    public Integer getColId() {
        return colId;
    }

    public void setColId(Integer colId) {
        this.colId = colId;
    }

    public Integer getColUserId() {
        return colUserId;
    }

    public void setColUserId(Integer colUserId) {
        this.colUserId = colUserId;
    }

    public Date getColTime() {
        return colTime;
    }

    public void setColTime(Date colTime) {
        this.colTime = colTime;
    }

    public Integer getColPost() {
        return colPost;
    }

    public void setColPost(Integer colPost) {
        this.colPost = colPost;
    }

    public Date getColPostTime() {
        return colPostTime;
    }

    public void setColPostTime(Date colPostTime) {
        this.colPostTime = colPostTime;
    }

    public String getColTitle() {
        return colTitle;
    }

    public void setColTitle(String colTitle) {
        this.colTitle = colTitle == null ? null : colTitle.trim();
    }
}
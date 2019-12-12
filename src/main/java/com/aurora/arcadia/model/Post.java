package com.aurora.arcadia.model;

import java.util.Date;

public class Post {
    private Integer postId;

    private Integer postKind;

    private Integer postUserId;

    private String postTitle;

    private String postIntro;

    private Date postTime;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getPostKind() {
        return postKind;
    }

    public void setPostKind(Integer postKind) {
        this.postKind = postKind;
    }

    public Integer getPostUserId() {
        return postUserId;
    }

    public void setPostUserId(Integer postUserId) {
        this.postUserId = postUserId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public String getPostIntro() {
        return postIntro;
    }

    public void setPostIntro(String postIntro) {
        this.postIntro = postIntro == null ? null : postIntro.trim();
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }
}
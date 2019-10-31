package com.aurora.arcadia.model;

/**
 * 帖子信息
 */
public class Post {
    private Integer postId;

    private Integer postKind;

    private Integer postUserId;

    private String postTitle;

    private String postIntro;

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
}
package com.aurora.arcadia.model;

import java.util.Date;

/**
 * 论坛帖子实体
 */
public class Post {
    /**
     * 帖子的id
     */
    private Integer postId;

    /**
     * 帖子标签
     * 暂时不适用,闲置
     */
    private Integer postKind;

    /**
     * 发帖者的uid
     */
    private Integer postUserId;

    /**
     * 帖子标题
     */
    private String postTitle;

    /**
     * 帖子内容
     */
    private String postIntro;

    /**
     * 发布时间
     */
    private Date postTime;

    /**
     * 帖子访问量
     */
    private Integer postPageView;

    public Integer getPostPageView() {
        return postPageView;
    }

    public void setPostPageView(Integer postPageView) {
        this.postPageView = postPageView;
    }

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
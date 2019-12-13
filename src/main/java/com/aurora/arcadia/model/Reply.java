package com.aurora.arcadia.model;

import java.util.Date;

public class Reply {
    /**
     * 回复记录id
     */
    private Integer replyId;

    /**
     * 回复的帖子id
     */
    private Integer replyPostId;

    /**
     * 回复时间
     */
    private Date replyTime;

    /**
     * 回复的内容
     */
    private String replyIntro;

    /**
     * 回复者的uid
     */
    private Integer replyUserId;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(Integer replyPostId) {
        this.replyPostId = replyPostId;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyIntro() {
        return replyIntro;
    }

    public void setReplyIntro(String replyIntro) {
        this.replyIntro = replyIntro == null ? null : replyIntro.trim();
    }

    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }
}
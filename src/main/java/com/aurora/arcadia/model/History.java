package com.aurora.arcadia.model;

import java.util.Date;

public class History {
    private Integer historyId;

    private Integer historyUserId;

    private Integer historyKind;

    private Integer historyKindId;

    private String historyTitle;

    private String historyBody;

    private Date historyTime;

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getHistoryUserId() {
        return historyUserId;
    }

    public void setHistoryUserId(Integer historyUserId) {
        this.historyUserId = historyUserId;
    }

    public Integer getHistoryKind() {
        return historyKind;
    }

    public void setHistoryKind(Integer historyKind) {
        this.historyKind = historyKind;
    }

    public Integer getHistoryKindId() {
        return historyKindId;
    }

    public void setHistoryKindId(Integer historyKindId) {
        this.historyKindId = historyKindId;
    }

    public String getHistoryTitle() {
        return historyTitle;
    }

    public void setHistoryTitle(String historyTitle) {
        this.historyTitle = historyTitle == null ? null : historyTitle.trim();
    }

    public String getHistoryBody() {
        return historyBody;
    }

    public void setHistoryBody(String historyBody) {
        this.historyBody = historyBody == null ? null : historyBody.trim();
    }

    public Date getHistoryTime() {
        return historyTime;
    }

    public void setHistoryTime(Date historyTime) {
        this.historyTime = historyTime;
    }
}
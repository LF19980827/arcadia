package com.aurora.arcadia.model;

import java.util.Date;

/*历史发布*/
public class History {
    private Integer historyId;

    private Date historyTime;

    private Integer historyKind;

    private Integer historyRecord;

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Date getHistoryTime() {
        return historyTime;
    }

    public void setHistoryTime(Date historyTime) {
        this.historyTime = historyTime;
    }

    public Integer getHistoryKind() {
        return historyKind;
    }

    public void setHistoryKind(Integer historyKind) {
        this.historyKind = historyKind;
    }

    public Integer getHistoryRecord() {
        return historyRecord;
    }

    public void setHistoryRecord(Integer historyRecord) {
        this.historyRecord = historyRecord;
    }
}
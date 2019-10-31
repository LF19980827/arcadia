package com.aurora.arcadia.model;

/**
 * 系统通知信息
 */
public class Message {
    private Integer msgId;

    private Integer msgUser;

    private String msgBody;

    private Integer msgSign;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getMsgUser() {
        return msgUser;
    }

    public void setMsgUser(Integer msgUser) {
        this.msgUser = msgUser;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody == null ? null : msgBody.trim();
    }

    public Integer getMsgSign() {
        return msgSign;
    }

    public void setMsgSign(Integer msgSign) {
        this.msgSign = msgSign;
    }
}
package com.aurora.arcadia.service;

import com.aurora.arcadia.model.Message;

import java.util.List;

/**
 * @author LFuser
 * @create 2019-12-13-下午 4:11
 */
public interface MessageService {

    /**
     * 查询所有系统通知
     *
     * @param userId
     * @return
     */
    List<Message> getMessageAll(Integer userId);

    /**
     * 增加一条系统通知
     *
     * @param message
     * @return
     */
    boolean insertMessage(Message message);

    /**
     * 删除一条系统通知
     *
     * @param msgId
     * @return
     */
    boolean delMessage(Integer msgId);
}

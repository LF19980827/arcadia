package com.aurora.arcadia.service;

import com.aurora.arcadia.model.Collection;
import com.aurora.arcadia.model.UserMessage;

import java.util.List;

/**
 * @author LFuser
 * @create 2019-12-11-下午 6:20
 */
public interface UserMessageService {

    /**
     * 根据用户ID查询用户资料
     * @param userId
     * @return
     */
    UserMessage getUserMessageById(Integer userId);

    /**
     * 修改用户资料
     * @param userMessage
     * @return
     */
    boolean updateUserMessage(UserMessage userMessage);

    /**
     * 分页查询用户收藏
     * @param userId
     * @return
     */
    List<Collection> getCollectionAll(Integer userId);
}

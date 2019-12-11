package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.UserMessageMapper;
import com.aurora.arcadia.model.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LFuser
 * @create 2019-12-11-下午 6:21
 */
@Service
public class UserMessageServiceImpl implements UserMessageService {

    @Autowired
    private UserMessageMapper userMessageMapper;

    @Override
    public UserMessage getUserMessageById(Integer userId) {
        UserMessage userMessage;
        try {
            userMessage = userMessageMapper.selectByPrimaryKey(userId);
        } catch (Exception e) {
            return null;
        }
        return userMessage;
    }

    @Override
    public boolean updateUserMessage(UserMessage userMessage) {
        try {
            userMessageMapper.updateByPrimaryKeySelective(userMessage);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

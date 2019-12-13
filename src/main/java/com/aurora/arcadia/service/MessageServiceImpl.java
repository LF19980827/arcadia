package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.MessageMapper;
import com.aurora.arcadia.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LFuser
 * @create 2019-12-13-下午 4:11
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;


    @Override
    public List<Message> getMessageAll(Integer userId) {
        List<Message> messages;
        try {
            messages = messageMapper.selectByUserId(userId);
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public boolean insertMessage(Message message) {
        try {
            int i = messageMapper.insertSelective(message);
            if (i == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public boolean delMessage(Integer msgId) {
        try {
            int i = messageMapper.deleteByPrimaryKey(msgId);
            if (i == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}

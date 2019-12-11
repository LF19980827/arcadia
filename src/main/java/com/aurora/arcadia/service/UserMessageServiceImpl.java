package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.CollectionMapper;
import com.aurora.arcadia.mapper.PostMapper;
import com.aurora.arcadia.mapper.UserMessageMapper;
import com.aurora.arcadia.model.Collection;
import com.aurora.arcadia.model.Post;
import com.aurora.arcadia.model.UserMessage;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author LFuser
 * @create 2019-12-11-下午 6:21
 */
@Service
public class UserMessageServiceImpl implements UserMessageService {

    @Autowired
    private UserMessageMapper userMessageMapper;
    @Autowired
    private CollectionMapper collectionMapper;

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

    @Override
    public List<Collection> getCollectionAll(Integer userId) {

        List<Collection> collections;
        try {
            collections = collectionMapper.selectByUserId(userId);
        }catch (Exception e){
            return  null;
        }
        return collections;
    }
}

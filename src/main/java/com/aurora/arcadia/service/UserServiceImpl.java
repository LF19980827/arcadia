package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.UserMapper;
import com.aurora.arcadia.mapper.UserMessageMapper;
import com.aurora.arcadia.model.User;
import com.aurora.arcadia.model.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LFuser
 * @create 2019-10-31-上午 9:27
 */
@Service
public class UserServiceImpl implements UserService  {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserMessageMapper userMessageMapper;

    @Override
    public Integer getUser(String username, String password) {
        User user = new User(username,password);
        try {
            user = userMapper.selectByLogin(user);
            return user.getUserId();
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public UserMessage getUserMessageById(Integer userId) {
        return userMessageMapper.selectByPrimaryKey(userId);
    }

    @Override
    public Integer getUserByName(String username) {
        User user = new User(username);
        try {
            user = userMapper.selectByName(user);
            return user.getUserId();
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public boolean InsertUser(String username, String password, String telephone) {
       try {
           UserMessage userMessage=new UserMessage();
           userMessageMapper.insert(userMessage);

           userMapper.insert(new User(userMessage.getUserId(),username,password,telephone));
       }catch (Exception e){
           return false;
       }
        return true;
    }

    @Override
    public boolean UpdateUserByTelephone(String telephone, String password) {
        if (userMapper.updateByTelephone(new User(null,null,password,telephone))){
            return true;
        }
        return false;
    }

    @Override
    public boolean UpdateUserById(Integer userId, String password) {
        try {
            userMapper.updateByPrimaryKeySelective(new User(userId,null,password,null));
            return true;
        }catch (Exception e){
            return false;
        }
    }

}

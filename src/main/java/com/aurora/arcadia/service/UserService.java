package com.aurora.arcadia.service;

import com.aurora.arcadia.model.UserMessage;

/**
 * @author LFuser
 * @create 2019-10-31-上午 9:27
 */
public interface UserService {

    /**
     * 根据用户名密码匹配用户
     *
     * @param username
     * @param password
     * @return
     */
    Integer getUser(String username, String password);


    /**
     * 根据用户名查询用户ID
     *
     * @param username
     * @return
     */
    Integer getUserByName(String username);

    /**
     * 增加新用户
     *
     * @param username
     * @param password
     * @param telephone
     */
    boolean InsertUser(String username, String password, String telephone);

    /**
     * 根据电话号更改密码
     *
     * @param telephone
     * @param password
     * @return
     */
    boolean UpdateUserByTelephone(String telephone, String password);

    /**
     * 根据用户ID修改用户密码
     *
     * @param userId
     * @param newpassword
     * @return
     */
    boolean UpdateUserById(Integer userId, String newpassword);
}

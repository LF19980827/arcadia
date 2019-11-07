package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    /**
     * 根据用户名密码查询ID
     * @param record
     * @return
     */
    User selectByLogin(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据用户名查询ID
     * @param user
     * @return
     */
    User selectByName(User user);

    /**
     * 根据电话修改密码
     * @param user
     * @return
     */
    boolean updateByTelephone(User user);
}
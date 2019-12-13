package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Love;
import com.aurora.arcadia.model.User;
import com.aurora.arcadia.model.UserMessage;

import java.util.Collection;
import java.util.List;

public interface LoveMapper {
    int deleteByPrimaryKey(Integer loveId);

    int insert(Love record);

    int insertSelective(Love record);

    Love selectByPrimaryKey(Integer loveId);

    int updateByPrimaryKeySelective(Love record);

    int updateByPrimaryKey(Love record);

    /**
     * 根据用户ID查询用户在表白墙的所有信息
     * @param userId
     * @return
     */
    Love getLoveById(Integer userId);

    /**
     * 查询表白墙中所有用户的id
     * @return
     */
    List<Integer> getAllLoveUserId();

    /**
     * 存储用户及相关信息到表白墙
     * @param love
     * @return
     */
    boolean saveLove(Love love);

}
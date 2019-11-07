package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.UserMessage;

public interface UserMessageMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    UserMessage selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}
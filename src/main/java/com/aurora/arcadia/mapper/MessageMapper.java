package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Message;

import java.util.List;

public interface MessageMapper {
    /**
     * 根据主键删除一条系统通知
     *
     * @param msgId
     * @return
     */
    int deleteByPrimaryKey(Integer msgId);

    /**
     * 增加一条系统通知
     *
     * @param record
     * @return
     */
    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer msgId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    /**
     * 根据用户ID查询系统通知
     *
     * @param msgUser
     * @return
     */
    List<Message> selectByUserId(Integer msgUser);
}
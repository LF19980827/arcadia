package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.History;

import java.util.List;

public interface HistoryMapper {
    /**
     * 删除一条活动轨迹
     * @param historyId
     * @return
     */
    int deleteByPrimaryKey(Integer historyId);

    /**
     * 增加一条活动轨迹
     * @param record
     * @return
     */
    int insertSelective(History record);

    History selectByPrimaryKey(Integer historyId);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);


    /**
     * 根据用户ID查询用户活动轨迹
     * @param historyUserId
     * @return
     */
    List<History> selectByHistoryUserId(Integer historyUserId);
}
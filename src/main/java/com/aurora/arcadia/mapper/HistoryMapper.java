package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.History;

public interface HistoryMapper {
    int deleteByPrimaryKey(Integer historyId);

    int insert(History record);

    int insertSelective(History record);

    History selectByPrimaryKey(Integer historyId);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);
}
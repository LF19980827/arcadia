package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Lost;

public interface LostMapper {
    int deleteByPrimaryKey(Integer lostId);

    int insert(Lost record);

    int insertSelective(Lost record);

    Lost selectByPrimaryKey(Integer lostId);

    int updateByPrimaryKeySelective(Lost record);

    int updateByPrimaryKey(Lost record);
}
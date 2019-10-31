package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Love;

public interface LoveMapper {
    int deleteByPrimaryKey(Integer loveId);

    int insert(Love record);

    int insertSelective(Love record);

    Love selectByPrimaryKey(Integer loveId);

    int updateByPrimaryKeySelective(Love record);

    int updateByPrimaryKey(Love record);
}
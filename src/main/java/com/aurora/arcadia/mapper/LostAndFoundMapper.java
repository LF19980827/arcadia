package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.LostAndFound;

public interface LostAndFoundMapper {
    int deleteByPrimaryKey(Integer lostId);

    int insert(LostAndFound record);

    int insertSelective(LostAndFound record);

    LostAndFound selectByPrimaryKey(Integer lostId);

    int updateByPrimaryKeySelective(LostAndFound record);

    int updateByPrimaryKey(LostAndFound record);
}
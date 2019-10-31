package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Club;

public interface ClubMapper {
    int deleteByPrimaryKey(Integer clubId);

    int insert(Club record);

    int insertSelective(Club record);

    Club selectByPrimaryKey(Integer clubId);

    int updateByPrimaryKeySelective(Club record);

    int updateByPrimaryKey(Club record);
}
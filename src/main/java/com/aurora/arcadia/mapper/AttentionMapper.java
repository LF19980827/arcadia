package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Attention;

public interface AttentionMapper {
    int deleteByPrimaryKey(Integer attId);

    int insert(Attention record);

    int insertSelective(Attention record);

    Attention selectByPrimaryKey(Integer attId);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}
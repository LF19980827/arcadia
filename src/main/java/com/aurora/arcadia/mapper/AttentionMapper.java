package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Attention;

import java.util.List;

public interface AttentionMapper {
    int deleteByPrimaryKey(Integer attId);

    int insert(Attention record);

    int insertSelective(Attention record);

    Attention selectByPrimaryKey(Integer attId);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);

    /**
     * 根据用户查询关注信息
     * @return
     */
    List<Attention> selectByAttUserId(Integer attUserId);
}
package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Attention;

import java.util.List;

public interface AttentionMapper {
    int deleteByPrimaryKey(Integer attId);

    int insertSelective(Attention record);

    Attention selectByPrimaryKey(Integer attId);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);

    /**
     * 根据用户查询关注信息
     * @return
     */
    List<Attention> selectByAttUserId(Integer attUserId);

    /**
     * 根据用户查询粉丝信息
     * @param attBeUserId
     * @return
     */
    List<Attention> selectByAttBeUserId(Integer attBeUserId);
}
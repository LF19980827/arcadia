package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Collection;

import java.util.List;

public interface CollectionMapper {
    int deleteByPrimaryKey(Integer colId);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(Integer colId);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);

    /**
     * 根据用户ID查询所有收藏
     * @param colUserId
     * @return
     */
    List<Collection> selectByUserId(Integer colUserId);

}
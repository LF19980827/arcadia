package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Collection;

import java.util.List;

public interface CollectionMapper {
    int deleteByPrimaryKey(Integer colId);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(Integer colId);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);

    List<Collection>  selectByUserId(Integer colUserId);

}
package com.aurora.arcadia.service;

import com.aurora.arcadia.model.Collection;

import java.util.List;

/**
 * @author LFuser
 * @create 2019-12-12-上午 9:25
 */
public interface CollectionService {


    /**
     * 分页查询用户收藏
     *
     * @param userId
     * @return
     */
    List<Collection> getCollectionAll(Integer userId);

    /**
     * 根据记录ID删除收藏
     *
     * @param colId
     * @return
     */
    boolean delCollectionById(Integer colId);

    /**
     * 增加收藏信息
     *
     * @param collection
     * @return
     */
    boolean insertCollection(Collection collection);
}

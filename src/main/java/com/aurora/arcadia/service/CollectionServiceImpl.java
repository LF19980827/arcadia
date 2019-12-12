package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.CollectionMapper;
import com.aurora.arcadia.model.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LFuser
 * @create 2019-12-12-上午 9:25
 */
@Service
public class CollectionServiceImpl implements CollectionService {

    @Autowired
    private CollectionMapper collectionMapper;

    @Override
    public List<Collection> getCollectionAll(Integer userId) {
        List<Collection> collections;
        try {
            collections = collectionMapper.selectByUserId(userId);
        } catch (Exception e) {
            return null;
        }
        return collections;
    }

    @Override
    public boolean delCollectionById(Integer colId) {
        try {
            int i = collectionMapper.deleteByPrimaryKey(colId);
            if (i == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean insertCollection(Collection collection) {
        try {
            int i = collectionMapper.insertSelective(collection);
            if (i == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}

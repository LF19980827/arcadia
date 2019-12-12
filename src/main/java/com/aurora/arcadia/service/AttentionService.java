package com.aurora.arcadia.service;

import com.aurora.arcadia.model.Attention;

import java.util.List;

/**
 * @author LFuser
 * @create 2019-12-12-下午 4:13
 */
public interface AttentionService {

    /**
     * 分页查询关注信息
     * @param userId
     * @return
     */
    List<Attention> getAttentionAll(Integer userId);
}

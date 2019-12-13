package com.aurora.arcadia.service;

import com.aurora.arcadia.model.History;

import java.util.List;

/**
 * @author LFuser
 * @create 2019-12-13-下午 4:48
 */
public interface HistoryService {
    /**
     * 根据用户ID查询历史活动轨迹
     * @param userId
     * @return
     */
    List<History> getHistoryAll(Integer userId);

    /**
     * 根据ID删除活动轨迹记录
     * @param historyId
     * @return
     */
    boolean delHistory(Integer historyId);

    /**
     * 增加一条活动轨迹
     * @param history
     * @return
     */
    boolean insertHistory(History history);
}

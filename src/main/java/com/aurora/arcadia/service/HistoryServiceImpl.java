package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.HistoryMapper;
import com.aurora.arcadia.model.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LFuser
 * @create 2019-12-13-下午 4:48
 */
@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private HistoryMapper historyMapper;

    @Override
    public List<History> getHistoryAll(Integer userId) {
        List<History> histories;
        try {
            histories = historyMapper.selectByHistoryUserId(userId);
        }catch (Exception e){
            return null;
        }
        return histories;
    }

    @Override
    public boolean delHistory(Integer historyId) {
        try {
            int i  = historyMapper.deleteByPrimaryKey(historyId);
            if (i==1){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean insertHistory(History history) {
        try {
            int i  = historyMapper.insertSelective(history);
            if (i==1){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }
}

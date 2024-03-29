package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.AttentionMapper;
import com.aurora.arcadia.model.Attention;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LFuser
 * @create 2019-12-12-下午 4:12
 */
@Service
public class AttentionServiceImpl implements AttentionService {

    @Autowired
    private AttentionMapper attentionMapper;

    @Override
    public List<Attention> getAttentionAll(Integer userId) {
        List<Attention> attentions;
        try {
            attentions = attentionMapper.selectByAttUserId(userId);
        } catch (Exception e) {
            return null;
        }
        return attentions;
    }

    @Override
    public List<Attention> getBeAttentionAll(Integer userId) {
        List<Attention> attentions;
        try {
            attentions = attentionMapper.selectByAttBeUserId(userId);
        } catch (Exception e) {
            return null;
        }
        return attentions;
    }

    @Override
    public boolean insertAttention(Attention attention) {
        try {
            int i = attentionMapper.insertSelective(attention);
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
    public boolean delAttention(Integer attId) {
        try {
            int i = attentionMapper.deleteByPrimaryKey(attId);
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

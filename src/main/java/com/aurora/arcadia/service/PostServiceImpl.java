package com.aurora.arcadia.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * ClassName:PostServiceImpl
 * Package:com.aurora.arcadia.service
 * <p>
 * Description:
 * 帖子相关业务逻辑层的实现类
 *
 * @author: Benjamin
 * @date: 19-12-12 下午9:36
 */
@Service
public class PostServiceImpl implements PostService {
    @Override
    public boolean submitNewPost(Map<String, Object> paraMap) {
        return false;
    }
}

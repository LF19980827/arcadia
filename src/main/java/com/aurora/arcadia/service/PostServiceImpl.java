package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.PostMapper;
import com.aurora.arcadia.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    @Autowired
    private PostMapper postMapper;

    @Override
    public boolean submitNewPost(Map<String, Object> paraMap) {
        Post newPost = new Post();
        newPost.setPostIntro((String) paraMap.get("postIntro"));
        newPost.setPostTitle((String) paraMap.get("postTitle"));
        newPost.setPostUserId((Integer) paraMap.get("postUserId"));
        newPost.setPostTime((Date) paraMap.get("postTime"));

        return postMapper.insertSelective(newPost) > 0;
    }
}

package com.aurora.arcadia.service;

import java.util.Map;

/**
 * ClassName:PostService
 * Package:com.aurora.arcadia.service
 * <p>
 * Description:
 * 帖子相关业务逻辑层的接口
 *
 * @author: Benjamin
 * @date: 19-12-12 下午9:35
 */
public interface PostService {
    /**
     * 发布新帖子
     * @param paraMap 所需参数,包含帖子标题,帖子内容,贴主uid和时间
     * @return 是否发布成功
     */
    boolean submitNewPost(Map<String, Object> paraMap);
}

package com.aurora.arcadia.service;

import java.util.Map;

/**
 * ClassName:ReplyService
 * Package:com.aurora.arcadia.service
 * <p>
 * Description:
 *
 * @author: Benjamin
 * @date: 19-12-13 下午12:30
 */
public interface ReplyService {
    /**
     * 提交回复
     * @param paraMap replyPostId:帖子id, replyIntro:回复内容, replyUserId:回复者的id, replyTime:回复时间
     * @return 是否回复成功
     */
    boolean replyPost(Map<String, Object> paraMap);
}

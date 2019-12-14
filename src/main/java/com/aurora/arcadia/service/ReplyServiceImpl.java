package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.ReplyMapper;
import com.aurora.arcadia.model.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * ClassName:ReplyServiceImpl
 * Package:com.aurora.arcadia.service
 * <p>
 * Description:
 *
 * @author: Benjamin
 * @date: 19-12-13 下午12:31
 */
@Service
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public boolean replyPost(Map<String, Object> paraMap) {
        Reply reply = new Reply();
        reply.setReplyPostId((Integer) paraMap.get("replyPostId"));
        reply.setReplyIntro((String) paraMap.get("replyIntro"));
        reply.setReplyUserId((Integer) paraMap.get("replyUserID"));
        reply.setReplyTime((Date) paraMap.get("replyTime"));

        return replyMapper.insertSelective(reply) > 0;
    }
}

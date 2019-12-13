package com.aurora.arcadia.controller;

import com.aurora.arcadia.service.ReplyService;
import com.aurora.arcadia.vo.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:ReplyController
 * Package:com.aurora.arcadia.controller
 * <p>
 * Description:
 * 帖子回复的controller
 *
 * @author: Benjamin
 * @date: 19-12-13 下午12:29
 */
@Controller
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    private Logger logger = LogManager.getLogger(ReplyController.class);

    /**
     * 帖子回复
     *
     * @param replyPostId 回复的帖子的id
     * @param replyIntro  回复的内容
     * @param replyUserID 回复者的id,非必需,方便测试
     * @return JSON格式的结果
     */
    @ResponseBody
    @RequestMapping(value = "/replyPost")
    public Map<String, Object> replyPost(@RequestParam(value = "replyPostId", required = true) Integer replyPostId,
                                         @RequestParam(value = "replyIntro", required = true) String replyIntro,
                                         @RequestParam(value = "replyUserID", required = false) String replyUserID,
                                         HttpServletRequest request) {
        Map<String, Object> rtnMap = new HashMap<>();
        Map<String, Object> paraMap = new HashMap<>();

        //生成其他的参数
        if (replyUserID == null) {
            replyUserID = (String) request.getAttribute(Constants.SESSION_USERID);
        }
        Date replyTime = new Date();

        paraMap.put("replyPostId", replyPostId);
        paraMap.put("replyIntro", replyIntro);
        paraMap.put("replyUserID", replyUserID);
        paraMap.put("replyTime", replyTime);

        //调用service,根据结果进行返回
        if (!replyService.replyPost(paraMap)){
            rtnMap.put(Constants.CODE, Constants.ERROE);
            rtnMap.put(Constants.ERROR_MESSAGE, "服务器繁忙,请稍后重新提交!");

            logger.warn("replyPost:{replyUserID = " + replyUserID + ", replyIntro + " + replyIntro + "}");
            return rtnMap;
        }

        rtnMap.put(Constants.CODE, Constants.SUCCESS);
        logger.info("replyPost:{replyUserID = " + replyUserID + ", replyIntro + " + replyIntro + "}");

        return rtnMap;
    }
}

package com.aurora.arcadia.controller;

import com.aurora.arcadia.service.PostService;
import com.aurora.arcadia.vo.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:PostController
 * Package:com.aurora.arcadia.controller
 * <p>
 * Description:
 *
 * @author: Benjamin
 * @date: 19-12-12 下午9:18
 */
@Controller
public class PostController {
    @Autowired
    private PostService postService;

    private Logger logger = LogManager.getLogger(PostController.class);

    /**
     * 发布新的帖子
     * @param postTitle
     * @param postIntro
     * @param request
     * @return
     */
    @ResponseBody
    public Map<String, Object> submitNewPost(@RequestParam(value = "postTitle", required = true)String postTitle,
                                             @RequestParam(value = "postIntro", required = true)String postIntro,
                                             HttpServletRequest request){
        Map<String, Object> rtnMap = new HashMap<>();
        Map<String, Object> paraMap = new HashMap<>();

        // 从session中获取user信息,并生成当前时间信息
        int postUserId = (int) request.getAttribute(Constants.SESSION_USERID);
        Date postTime = new Date();

        //封装数据到map中传入下一层
        paraMap.put("postTitle", postTitle);
        paraMap.put("postIntro", postIntro);
        paraMap.put("postUserId", postUserId);
        paraMap.put("postTime", postTime);

        //调用业务逻辑,根据返回值进行响应
        //并生成日志
        if (!postService.submitNewPost(paraMap)){
            rtnMap.put(Constants.CODE, Constants.ERROE);
            rtnMap.put(Constants.ERROR_MESSAGE, "服务器繁忙,请稍后重新发布!");

            logger.warn("submitNewPost:{postTitle = " + postTitle + "}");
        }
        rtnMap.put(Constants.CODE, Constants.SUCCESS);

        logger.info("submitNewPost:{uid = " + postUserId + ", postTitle = " + postTitle + "}");

        return rtnMap;
    }
}

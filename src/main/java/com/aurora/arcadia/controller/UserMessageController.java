package com.aurora.arcadia.controller;

import com.aurora.arcadia.model.UserMessage;
import com.aurora.arcadia.service.UserMessageService;
import com.aurora.arcadia.vo.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LFuser
 * @create 2019-10-31-上午 9:29
 */
@RestController
@RequestMapping("userMessage")
public class UserMessageController {

    @Autowired
    private UserMessageService userMessageService;

    /**
     * 获取个人资料
     * @param session
     * @return
     */
    @GetMapping(value = "/getMessage")
    public Map<String, Object> getUserMessage(HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");

        if (userId == null){
            map.put(Constants.CODE,Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE,"未登录，请先登陆");
        }else {
            UserMessage userMessage = userMessageService.getUserMessageById(userId);
            map.put(Constants.CODE,Constants.SUCCESS);
            map.put(Constants.DATA,userMessage);
        }
        return map;
    }

    /**
     * 修改个人资料
     * @param userMessage
     * @return
     */
    @PostMapping(value = "/updateMessage")
    public Map<String, Object> updateUserMessage(UserMessage userMessage){
        Map<String, Object> map = new HashMap<>();
        if (userMessageService.updateUserMessage(userMessage)){
            map.put(Constants.CODE,Constants.SUCCESS);
        }else {
            map.put(Constants.CODE,Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE,"修改失败");
        }

        return map;
    }

    public Map<String, Object> showMyCollection(){}

}

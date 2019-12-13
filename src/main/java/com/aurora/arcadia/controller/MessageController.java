package com.aurora.arcadia.controller;

import com.aurora.arcadia.model.Message;
import com.aurora.arcadia.service.MessageService;
import com.aurora.arcadia.vo.Constants;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LFuser
 * @create 2019-12-13-下午 4:08
 */
@RestController
@RequestMapping("message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    /**
     * 展示用户的系统通知信息（按时间降序）
     *
     * @param page
     * @param session
     * @return
     */
    @PostMapping(value = "/showMessages")
    public Map<String, Object> showMyMessages(@RequestParam(value = "page", required = true) Integer page, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");
        if (userId != null) {
            PageHelper.startPage(page, 10);
            List<Message> messages = messageService.getMessageAll(userId);
            PageInfo<Message> pageInfo = new PageInfo<>(messages);
        } else {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "登陆已失效");
        }
        return map;
    }

    /**
     * 添加一条系统通知
     *
     * @param message
     * @return
     */
    @PostMapping(value = "/insertMessage")
    public Map<String, Object> insertMessage(Message message) {
        Map<String, Object> map = new HashMap<>();
        if (messageService.insertMessage(message)) {
            map.put(Constants.CODE, Constants.SUCCESS);
        } else {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "增加失败");
        }
        return map;
    }

    /**
     * 删除一条系统通知
     *
     * @param msgId
     * @param session
     * @return
     */
    @PostMapping(value = "/delMessage")
    public Map<String, Object> delMyMessage(@RequestParam(value = "msgId", required = true) Integer msgId, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");

        if (userId != null) {
            if (messageService.delMessage(msgId)) {
                map.put(Constants.CODE, Constants.SUCCESS);
            } else {
                map.put(Constants.CODE, Constants.ERROE);
                map.put(Constants.ERROR_MESSAGE, "删除失败");
            }
        } else {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "登陆已失效");
        }

        return map;
    }
}

package com.aurora.arcadia.controller;

import com.aurora.arcadia.model.Collection;
import com.aurora.arcadia.model.Post;
import com.aurora.arcadia.model.UserMessage;
import com.aurora.arcadia.service.UserMessageService;
import com.aurora.arcadia.vo.Constants;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
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
     *
     * @param session
     * @return
     */
    @GetMapping(value = "/getMessage")
    public Map<String, Object> getUserMessage(HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");

        if (userId == null) {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "未登录，请先登陆");
        } else {
            UserMessage userMessage = userMessageService.getUserMessageById(userId);
            map.put(Constants.CODE, Constants.SUCCESS);
            map.put(Constants.DATA, userMessage);
        }
        return map;
    }

    /**
     * 修改个人资料
     *
     * @param userMessage
     * @return
     */
    @PostMapping(value = "/updateMessage")
    public Map<String, Object> updateUserMessage(UserMessage userMessage) {
        Map<String, Object> map = new HashMap<>();
        if (userMessageService.updateUserMessage(userMessage)) {
            map.put(Constants.CODE, Constants.SUCCESS);
        } else {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "修改失败");
        }

        return map;
    }

    /**
     * 展示用户收藏信息
     * @param page
     * @param session
     * @return
     */
    @PostMapping(value = "/showCollections")
    public Map<String, Object> showMyCollections(@RequestParam(value = "page", required = true) Integer page, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");
        if (userId!=null){
            //page页数, rows一页显示的条数
            PageHelper.startPage(page, 10);
            //startPage后面的这个查询就是分页查询
            List<Collection> colloetions = userMessageService.getCollectionAll(userId);
            //使用PageInfo包装查询结果
            PageInfo<Collection> pageInfo = new PageInfo<>(colloetions);
            map.put(Constants.CODE,Constants.SUCCESS);
            map.put(Constants.DATA,pageInfo);
        }else {
            map.put(Constants.CODE,Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE,"登陆已失效");
        }

        return map;
    }

    /**
     * 根据收藏ID删除收藏
     * @param colId
     * @param session
     * @return
     */
    @PostMapping(value = "/delCollection")
    public Map<String, Object> delMyCollection(@RequestParam(value = "colId", required = true) Integer colId, HttpSession session){
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");

        if(userId!=null){
            if (userMessageService.delCollectionById(colId)){
                map.put(Constants.CODE,Constants.SUCCESS);
            }else {
                map.put(Constants.CODE,Constants.ERROE);
                map.put(Constants.ERROR_MESSAGE,"删除失败");
            }
        }else {
            map.put(Constants.CODE,Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE,"登陆已失效");
        }

        return map;
    }

    /**
     * 根据收藏，进入帖子
     * @param postId
     * @return
     */
    @PostMapping(value = "/getCollection")
    public Map<String,Object> getMyCollection(@RequestParam(value = "colPost") Integer postId){
        Map<String, Object> map = new HashMap<>();
        //按id查询帖子
        return map;
    }



}

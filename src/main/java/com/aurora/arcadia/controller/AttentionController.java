package com.aurora.arcadia.controller;

import com.aurora.arcadia.model.Attention;
import com.aurora.arcadia.service.AttentionService;
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
 * @create 2019-12-12-下午 4:04
 */
@RestController
@RequestMapping("attention")
public class AttentionController {


    @Autowired
    private AttentionService attentionService;

    /**
     * 展示用户关注信息
     * @param page
     * @param session
     * @return
     */
    @PostMapping("/showAttentions")
    public Map<String, Object> showAttentions(@RequestParam(value = "page", required = true) Integer page, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");
        if (userId != null) {
            PageHelper.startPage(page, 10);
            List<Attention> attentions = attentionService.getAttentionAll(userId);
            PageInfo<Attention> pageInfo = new PageInfo<>(attentions);
            map.put(Constants.CODE, Constants.SUCCESS);
            map.put(Constants.DATA, pageInfo);
        } else {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "登陆已失效");
        }

        return map;
    }
}

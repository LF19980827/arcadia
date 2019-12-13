package com.aurora.arcadia.controller;

import com.aurora.arcadia.model.History;
import com.aurora.arcadia.service.HistoryService;
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
 * @create 2019-12-13-下午 4:46
 */
@RestController
@RequestMapping("history")
public class HistoryController {
    @Autowired
    private HistoryService historyService;

    /**
     * 展示用户活动轨迹（时间降序）
     * @param page
     * @param session
     * @return
     */
    @PostMapping(value = "/showHistories")
    public Map<String, Object> showMyHistories(@RequestParam(value = "page", required = true) Integer page, HttpSession session){
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");
        if (userId!=null){
            PageHelper.startPage(page,10);
            List<History> histories = historyService.getHistoryAll(userId);
            PageInfo<History> pageInfo = new PageInfo<>(histories);
            map.put(Constants.CODE, Constants.SUCCESS);
            map.put(Constants.DATA, pageInfo);
        }else {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "登陆已失效");
        }
        return map;
    }

    /**
     * 删除一条活动轨迹
     * @param historyId
     * @param session
     * @return
     */
    @PostMapping(value = "/delHistory")
    public Map<String, Object> delHistory(@RequestParam(value = "historyId", required = true) Integer historyId, HttpSession session){
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");
        if (userId != null) {
            if (historyService.delHistory(historyId)) {
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

package com.aurora.arcadia.controller;

import com.aurora.arcadia.model.Collection;
import com.aurora.arcadia.service.CollectionService;
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
 * @create 2019-12-12-上午 9:23
 */
@RestController
@RequestMapping("collection")
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    /**
     * 展示用户收藏信息(按收藏时间降序)
     *
     * @param page
     * @param session
     * @return
     */
    @PostMapping(value = "/showCollections")
    public Map<String, Object> showMyCollections(@RequestParam(value = "page", required = true) Integer page, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");
        if (userId != null) {
            //page页数, rows一页显示的条数
            PageHelper.startPage(page, 10);
            //startPage后面的这个查询就是分页查询
            List<Collection> colloetions = collectionService.getCollectionAll(userId);
            //使用PageInfo包装查询结果
            PageInfo<Collection> pageInfo = new PageInfo<>(colloetions);
            map.put(Constants.CODE, Constants.SUCCESS);
            map.put(Constants.DATA, pageInfo);
        } else {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "登陆已失效");
        }
        return map;
    }

    /**
     * 根据收藏ID删除收藏
     *
     * @param colId
     * @param session
     * @return
     */
    @PostMapping(value = "/delCollection")
    public Map<String, Object> delMyCollection(@RequestParam(value = "colId", required = true) Integer colId, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");

        if (userId != null) {
            if (collectionService.delCollectionById(colId)) {
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

    /**
     * 根据收藏，进入帖子
     *
     * @param postId
     * @return
     */
    @PostMapping(value = "/getCollection")
    public Map<String, Object> getMyCollection(@RequestParam(value = "colPost") Integer postId) {
        Map<String, Object> map = new HashMap<>();
        //按id查询帖子
        return map;
    }

    /**
     * 添加收藏信息
     *
     * @param collection
     * @return
     */
    @PostMapping(value = "/insertCollection")
    public Map<String, Object> insertMyCollection(Collection collection, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        Integer userId = (Integer) session.getAttribute("sessionUserId");
        if (userId == null) {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "登陆已失效");
        } else if (userId != collection.getColUserId()) {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "传输信息出错");
        } else {
            if (collectionService.insertCollection(collection)) {
                map.put(Constants.CODE, Constants.SUCCESS);
            } else {
                map.put(Constants.CODE, Constants.ERROE);
                map.put(Constants.ERROR_MESSAGE, "增加失败");
            }
        }
        return map;
    }
}

package com.aurora.arcadia.controller;

import com.aurora.arcadia.service.UserService;
import com.aurora.arcadia.vo.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LFuser
 * @create 2019-11-06-上午 8:39
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    private Logger logger = LogManager.getLogger(UserController.class);


    @PostMapping(value = "/login")
    public Map<String, Object> login(@RequestParam(value = "username", required = true) String username,
                                     @RequestParam(value = "password", required = true) String password,
                                     HttpSession session) {

        System.out.println(username);
        System.out.println(password);

        Map<String, Object> map = new HashMap<>();
        Map<String, Object> data = new HashMap<>();

        Integer userId;

        if (username.length() != 11 && password.length() <= 20 && password.length() >= 6) {
            //校验失败
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "用户名密码格式错误");
            return map;
        }

        userId = userService.getUser(username, password);
        if (null == userId) {
            //登陆失败
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "用户名密码错误");
            return map;
        }

        //登陆成功
        map.put(Constants.CODE, Constants.SUCCESS);
        data.put("userMessage", userService.getUserMessageById(userId));
        map.put(Constants.DATA, data);
        session.setAttribute(Constants.SESSION_USER, username);
        return map;
    }

    @PostMapping(value = "/register")
    public Map<String, Object> register(@RequestParam(value = "username", required = true) String username,
                           @RequestParam(value = "password", required = true) String password,
                           @RequestParam(value = "telephone", required = true) String telephone) {
        Map<String, Object> map = new HashMap<>();


        if (telephone.length() != 11 && password.length() <= 20 && password.length() >= 6) {
            //校验失败
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "格式错误");
            return map;
        }

        Integer userId = userService.getUserByName(username);
        if (userId != null) {
            //注册失败
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "用户名重复");
            return map;
        }

        if (userService.InsertUser(username, password, telephone)) {
            map.put(Constants.CODE, Constants.SUCCESS);
        } else {
            map.put(Constants.CODE, Constants.ERROE);
            map.put(Constants.ERROR_MESSAGE, "添加异常");
        }
        return map;

    }
}

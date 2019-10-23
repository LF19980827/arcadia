package com.aurora.arcadia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author LFuser
 * @create 2019-10-23-下午 4:58
 */


@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String ,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username)){
            //登陆成功
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            //登陆失败
            map.put("msg","用户名密码错误");
            return "login";
        }
    }

}
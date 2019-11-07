package com.aurora.arcadia.controller;

import com.aurora.arcadia.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;


/**
 * @author LFuser
 * @create 2019-10-31-上午 9:29
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    private Logger logger = LogManager.getLogger(UserController.class);




}

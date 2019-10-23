package com.aurora.arcadia.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("indexPage")
    public String indexPage(){
        return "indexPage";
    }
}


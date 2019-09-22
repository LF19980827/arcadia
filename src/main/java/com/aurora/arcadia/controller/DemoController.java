package com.aurora.arcadia.controller;


@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("indexPage")
    public String indexPage(){
        return "indexPage";
    }
}

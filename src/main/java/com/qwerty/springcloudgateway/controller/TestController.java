package com.qwerty.springcloudgateway.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("fallback")
    public String test(){
        return "this is fallback";
    }
}

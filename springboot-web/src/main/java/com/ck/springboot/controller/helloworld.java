package com.ck.springboot.controller;


import com.ck.springboot.exception.UserNotExist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
public class helloworld {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam String user){
        if(user.equals("aaa")){
            throw new UserNotExist();
        }
        return "hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好！<h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
}

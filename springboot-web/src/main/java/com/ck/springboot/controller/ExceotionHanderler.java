package com.ck.springboot.controller;

import com.ck.springboot.exception.UserNotExist;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceotionHanderler {

//    @ResponseBody
//    @ExceptionHandler(UserNotExist.class)
//    public Map<String, Object> handleException(Exception e){
//        Map<String,Object> map=new HashMap<>();
//        map.put("code", "user.notexist");
//        map.put("message", e.getMessage());
//        return map;
//    }
    @ExceptionHandler(UserNotExist.class)
    public String handleException(Exception e, HttpServletRequest request){
        request.setAttribute("javax.servlet.error.status_code",500);
        Map<String,Object> map=new HashMap<>();
        map.put("code", "user.notexist");
        map.put("message", "出错啦天啊！");
        request.setAttribute("ext", map);
        return "forward:/error";
    }
}

package com.ck.springboot.component;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class myerrorAttriutes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        Map<String,Object> map=super.getErrorAttributes(webRequest, options);
//        map.put("message","chucuolalaa!");
        Map<String,Object> ext=(Map<String,Object>) webRequest.getAttribute("ext", 0);
        map.put("ext", ext);
        return map;
    }
}

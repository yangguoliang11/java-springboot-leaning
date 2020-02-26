package com.guoliang.springboot.utils;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class MyExpection {

    @ExceptionHandler(value = Exception.class)
    public Object handelExpection(HttpServletRequest request, HttpServletResponse response,Exception e) throws Exception{
        e.printStackTrace();
        Map<String,Object> res = new HashMap<>();
        //res.put("Expection",res);
        res.put("Message",e.getMessage());
        res.put("url",request.getRequestURL());
        return res;
    }
}

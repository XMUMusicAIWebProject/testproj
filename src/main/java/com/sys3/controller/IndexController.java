package com.sys3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String say(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        return "index";
    }
}

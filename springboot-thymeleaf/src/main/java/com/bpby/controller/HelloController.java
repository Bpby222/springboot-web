package com.bpby.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @GetMapping("index")
    public ModelAndView  userList(){
        return new ModelAndView("header");
    }

    @GetMapping("test")
    public String  hello(){
        return "header";  //返回 header 字符串
    }

}

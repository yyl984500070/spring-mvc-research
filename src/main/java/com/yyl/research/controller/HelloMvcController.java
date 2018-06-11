package com.yyl.research.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/6/4 0004.
 */
@Controller
@RequestMapping("/demo")
public class HelloMvcController {
    @RequestMapping("/mvc")
    public String helloMvc(){
        System.out.println("进入helloMvc方法");
        return "demo";
    }
}

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by suneee on 2018/11/12.
 */
@Controller
@RequestMapping("/mvc")
public class IndexController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}

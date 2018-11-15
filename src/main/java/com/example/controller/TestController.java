package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by suneee on 2018/11/14.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/param")
    public String param(@RequestParam(value = "id") Integer id,
                        @RequestParam(value = "name") String name){
        System.out.println(id + " " + name);
        return "/hello";
    }
}

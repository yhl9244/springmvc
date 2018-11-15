package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by suneee on 2018/11/14.
 */
@Controller
@RequestMapping("/integrate")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String saveUser(@RequestBody @ModelAttribute User u){
        System.out.println(u);
        userService.save();
        return "hello";
    }
}

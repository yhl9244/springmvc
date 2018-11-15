package com.example.controller;

import com.example.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by suneee on 2018/11/14.
 */
@Controller
@RequestMapping("/json")
public class JsonController {

    @ResponseBody
    @RequestMapping("/user")
    public Person get(){
        Person u = new Person();
        u.setAge(10);
        u.setName("jayjay");
        return u;
    }
}

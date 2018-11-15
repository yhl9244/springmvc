package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by suneee on 2018/11/14.
 */
@Controller
@RequestMapping("/form")
public class FormController {

    @RequestMapping(value="/add",method= RequestMethod.POST)
    public String add(@Valid User u, BindingResult br){
        if(br.getErrorCount()>0){
            return "addUser";
        }
        return "showUser";
    }

    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String add(Map<String,Object> map){
        map.put("user",new User());
        return "addUser";
    }

    @RequestMapping(value="/locale",method=RequestMethod.GET)
    public String locale(){
        return "locale";
    }
}

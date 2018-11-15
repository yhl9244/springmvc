package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by suneee on 2018/11/14.
 * 处理局部异常
 */
@Controller
public class ExceptionController {

    @RequestMapping("/error")
    public String error() {
        int a = 5 / 0;
        return "hello";
    }

    /*@ExceptionHandler
    public ModelAndView exceptionHandler(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", e);
        System.out.println("in testExceptionHandler");
        return mv;
    }*/
}

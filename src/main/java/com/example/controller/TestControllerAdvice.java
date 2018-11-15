package com.example.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by suneee on 2018/11/14.
 * 处理全局异常（所有Controller）
 */
@ControllerAdvice
public class TestControllerAdvice {

    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", e);
        System.out.println("in testExceptionHandler");
        return mv;
    }
}

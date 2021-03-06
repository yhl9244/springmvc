package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by suneee on 2018/11/13.
 */
@Configuration
@ComponentScan(basePackages = {"com.example"},
excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {EnableWebMvc.class, Controller.class, ControllerAdvice.class})})
public class ApplicationContextXml {
}

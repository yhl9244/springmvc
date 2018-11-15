package com.example.controller;

import com.example.entity.Person;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by suneee on 2018/11/13.
 */
@Controller
@RequestMapping("/mvc")
public class IndexController {

    @RequestMapping("/hello")
    public String hello(String name, Integer age) {
        //System.out.println(name + " " + age);
        return "hello";
    }

    @RequestMapping("/login")
    public String login(Person person) {
        System.out.println(person.getName() + " " + person.getAge());
        return "hello";
    }

    @RequestMapping("/date")
    public String date(Date date) {
        System.out.println(date);
        return "hello";
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
                true));
    }

    @RequestMapping("/show")
    public String show(Map<String, Object> map) {
        Person person = new Person();
        map.put("person", person);
        person.setName("yhl");
        person.setAge(10);
        return "hello";
    }

    @RequestMapping("/getPerson")
    public void getPerson(String name,PrintWriter pw){
        pw.write("hello,"+name);
    }
    @RequestMapping("/name")
    public String sayHello(){
        return "name";
    }
    // redirect
    @RequestMapping("/redirect")
    public String redirect() {
        return "redirect:hello";
    }

    // 文件上传
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request) throws IOException {
        MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)request;
        MultipartFile file = mreq.getFile("file");
        String fileName = file.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        FileOutputStream fos = new FileOutputStream(request.getSession().getServletContext().getRealPath("/")+
                "upload/"+sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.')));
        fos.write(file.getBytes());
        fos.flush();
        fos.close();

        return "success";


    }
}

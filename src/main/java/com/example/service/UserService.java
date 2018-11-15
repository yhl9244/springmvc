package com.example.service;

import org.springframework.stereotype.Service;

/**
 * Created by suneee on 2018/11/14.
 */
@Service
public class UserService {

    public UserService(){
        System.out.println("UserService Constructor...\n\n\n\n\n\n");
    }

    public void save(){
        System.out.println("save");
    }
}

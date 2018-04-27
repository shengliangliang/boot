package com.king.boot.controller;

import com.king.boot.model.Test;
import com.king.boot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public String home(){
        Test test = new Test();
        test.setId(1);
        test.setName("sll");
        testService.insert(test);
        return "hello world!";
    }
}

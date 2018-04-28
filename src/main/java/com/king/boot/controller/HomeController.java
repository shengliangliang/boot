package com.king.boot.controller;

import com.king.boot.config.SysConfig;
import com.king.boot.model.Test;
import com.king.boot.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);


    @Autowired
    private TestService testService;

    @Autowired
    private SysConfig sysConfig;


    @RequestMapping("/")
    public String home(){
        Test test = new Test();
        test.setId(1);
        test.setName("sll");
        testService.insert(test);


        logger.info("hahah:"+sysConfig.getServerId());

        return "hello world!";
    }
}

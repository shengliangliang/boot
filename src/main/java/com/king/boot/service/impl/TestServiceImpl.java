package com.king.boot.service.impl;

import com.king.boot.mapper.TestMapper;
import com.king.boot.model.Test;
import com.king.boot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public List<Test> findAllUser() {

        return null;
    }

    @Override
    public void insert(Test test) {
        testMapper.insert(test);
    }
}

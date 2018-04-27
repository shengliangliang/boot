package com.king.boot.service;

import com.king.boot.model.Test;

import java.util.List;

public interface TestService {

    List<Test> findAllUser();
    void insert(Test test);
}

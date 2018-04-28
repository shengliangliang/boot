package com.king.boot.mapper;

import com.king.boot.model.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}
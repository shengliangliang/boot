package com.king.boot.mapper;

import com.king.boot.model.Test;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}
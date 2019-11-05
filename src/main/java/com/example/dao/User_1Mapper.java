package com.example.dao;

import com.common.db.datasource.DataSource;
import com.example.vo.User_1;

public interface User_1Mapper {
    int deleteByPrimaryKey(String userId);

    int insert(User_1 record);

    int insertSelective(User_1 record);
    
    @DataSource("slave")
    User_1 selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User_1 record);

    int updateByPrimaryKey(User_1 record);
}
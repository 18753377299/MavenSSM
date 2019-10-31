package com.example.dao;

import com.example.vo.LeaveBasic;

public interface LeaveBasicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LeaveBasic record);

    int insertSelective(LeaveBasic record);

    LeaveBasic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeaveBasic record);

    int updateByPrimaryKey(LeaveBasic record);
}
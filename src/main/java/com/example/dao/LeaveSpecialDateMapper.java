package com.example.dao;

import com.example.vo.LeaveSpecialDate;

public interface LeaveSpecialDateMapper {
    int deleteByPrimaryKey(String id);

    int insert(LeaveSpecialDate record);

    int insertSelective(LeaveSpecialDate record);

    LeaveSpecialDate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LeaveSpecialDate record);

    int updateByPrimaryKey(LeaveSpecialDate record);
}
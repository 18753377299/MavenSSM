package com.example.dao;

import com.example.vo.LeaveTravel;

public interface LeaveTravelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LeaveTravel record);

    int insertSelective(LeaveTravel record);

    LeaveTravel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeaveTravel record);

    int updateByPrimaryKey(LeaveTravel record);
}
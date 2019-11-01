package com.example.dao;

import com.example.vo.LeaveMain;

public interface LeaveMainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LeaveMain record);

    int insertSelective(LeaveMain record);

    LeaveMain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeaveMain record);

    int updateByPrimaryKeyWithBLOBs(LeaveMain record);

    int updateByPrimaryKey(LeaveMain record);
    
}
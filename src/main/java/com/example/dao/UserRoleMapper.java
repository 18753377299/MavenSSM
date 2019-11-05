package com.example.dao;

import com.example.vo.UserRole;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    int deleteByPrimaryKey(@Param("userCode") String userCode, @Param("leverCode") String leverCode);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(@Param("userCode") String userCode, @Param("leverCode") String leverCode);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}
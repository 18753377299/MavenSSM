package com.dao;

import com.vo.Emp;

public interface EmpDao {
	
	Emp getEMpById(Integer id);
	
	// 增加Emp信息
	void insertEmpInfo(Emp emp);
}

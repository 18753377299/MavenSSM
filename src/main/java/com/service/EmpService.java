package com.service;

import com.vo.Emp;

public interface EmpService {
	public Emp getEMpById(Integer id);
	public void insertEmpInfo(Emp emp);
	
	public void testJdbcTemplate();
	
}

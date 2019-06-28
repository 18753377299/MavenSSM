package com.service;

import com.vo.Emp;

public interface EmpService {
	public Emp getEMpById(Integer id);
	/*查找名称*/
	public String  getEmpNameById(Integer id);
	
	public void insertEmpInfo(Emp emp);
	
	public void testJdbcTemplate();
	
}

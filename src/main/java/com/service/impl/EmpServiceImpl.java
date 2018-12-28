package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmpDao;
import com.service.EmpService;
import com.vo.Emp;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpDao empDao;
	
	public Emp getEMpById(Integer id){
		return empDao.getEMpById(id);
	}
	public void insertEmpInfo(Emp emp){
		empDao.insertEmpInfo(emp);
	}
	
}

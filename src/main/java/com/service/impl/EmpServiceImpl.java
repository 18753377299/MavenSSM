package com.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.dao.EmpDao;
import com.service.EmpService;
import com.vo.Emp;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpDao empDao;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Cacheable(value="common",key="#id")
	public Emp getEMpById(Integer id){
		return empDao.getEMpById(id);
	}
	public void insertEmpInfo(Emp emp){
		empDao.insertEmpInfo(emp);
	}
	
	public void testJdbcTemplate(){
		String sql ="select dname from dept";
		List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);
		for(Map<String,Object> map:mapList){
			String  dname= map.get("dname")+"";
			System.out.println("=============="+dname);
		}
	}
	
	
}

package com.risktest.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.risktest.dao.EmpDao;
import com.risktest.service.EmpService;
import com.vo.Emp;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpDao empDao;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public static final Logger logger = LoggerFactory.getLogger(EmpServiceImpl.class);
	
	
	@Cacheable(value="common",key="#id")
	public Emp getEMpById(Integer id){
		System.out.println("===========getEMpById=======");
		try {
//			int a = 1/0;
		} catch (Exception e) {
			logger.error("getEMpById异常：" + e.getMessage(), e);
			e.printStackTrace();
		}
		return empDao.getEMpById(id);
	}
	/*@CacheEvict是用来标注在需要清除缓存元素的方法或类上的*/
	@CacheEvict(value="common",key="'id_'+#id")
	public String getEmpNameById(Integer id){
		System.out.println("===========getEmpNameById=======");
		return empDao.getEmpNameById(id);
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

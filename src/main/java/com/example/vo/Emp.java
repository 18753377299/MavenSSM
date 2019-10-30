package com.example.vo;

import java.io.Serializable;

public class Emp implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer empId;
	private String empName;
	private String  empAge;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAge() {
		return empAge;
	}
	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}
	
	
}

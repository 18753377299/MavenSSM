package com.common.jwt;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年3月26日 下午2:05:18
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class JWTSubject {
	
	private String userCode;
	private String password;

	public JWTSubject(String userCode) {
		super();
		this.userCode = userCode;
	}
	
	public JWTSubject(String userCode,String password) {
		super();
		this.userCode = userCode;
		this.password = password;
	}

	public JWTSubject() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

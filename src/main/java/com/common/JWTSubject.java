package com.common;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年3月26日 下午2:05:18
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class JWTSubject {
	
	private String username;

	public JWTSubject(String username) {
		super();
		this.username = username;
	}

	public JWTSubject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

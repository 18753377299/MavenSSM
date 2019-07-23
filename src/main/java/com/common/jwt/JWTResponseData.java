package com.common.jwt;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年3月26日 上午10:58:11
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class JWTResponseData {
	
	private Integer code;// 返回码，类似HTTP响应码。如：200成功，500服务器错误，404资源不存在等。
	
	private Object data;// 业务数据
	
	private String msg;// 返回描述
	
	private String token;// 身份标识， JWT生成的令牌。

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}

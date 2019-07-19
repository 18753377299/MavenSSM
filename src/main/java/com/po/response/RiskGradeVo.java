package com.po.response;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午3:19:03
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Data
public class RiskGradeVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private BigDecimal  score;
	
}

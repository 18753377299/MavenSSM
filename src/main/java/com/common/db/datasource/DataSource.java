package com.common.db.datasource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年9月9日 下午5:03:27
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSource {
    String value();
}

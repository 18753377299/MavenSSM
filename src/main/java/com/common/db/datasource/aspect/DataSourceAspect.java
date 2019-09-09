package com.common.db.datasource.aspect;


import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import com.common.db.datasource.DataSource;
import com.common.db.datasource.holder.DynamicDataSourceHolder;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年9月9日 下午4:41:06
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class DataSourceAspect {

    public void before(JoinPoint point)
    {
        Object target = point.getTarget();
        String method = point.getSignature().getName();

        Class<?>[] classz = target.getClass().getInterfaces();

        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())
                .getMethod().getParameterTypes();
        try {
            Method m = classz[0].getMethod(method, parameterTypes);
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource data = m.getAnnotation(DataSource.class);
                DynamicDataSourceHolder.putDataSource(data.value());
                System.out.println(data.value());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
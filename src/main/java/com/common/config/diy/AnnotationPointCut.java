package com.common.config.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationPointCut {

	
	@Before("execution(* com.example.func.risktest.service.impl.EmpServiceImpl.*(..))")
	public  void before() {
		System.out.println("============>>before");
	}
	
	
}

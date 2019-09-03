package com.iobjectjava.javamain.com;

import com.supermap.data.Workspace;
	/**
 * @author  ���� E-mail: 
 * @date ����ʱ�䣺2019��1��16�� ����5:49:30
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */

public class JavaTest {
	public static void main(String[] args) {
		System.out.println("before-success11!");
		
		long start = System.currentTimeMillis();
		new Workspace();
		long end = System.currentTimeMillis();
		System.out.println("success-workspace!=" + (end - start));
	}
}

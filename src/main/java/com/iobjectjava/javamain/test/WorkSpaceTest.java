package com.iobjectjava.javamain.test;

import com.supermap.data.Workspace;
	/**
 * @author  ���� E-mail: 
 * @date ����ʱ�䣺2019��1��16�� ����5:49:30
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */

public class WorkSpaceTest {
	public static void main(String[] args) {
		System.out.println("before-success11!");
		
		long start = System.currentTimeMillis();
		Workspace workspace =new Workspace();
		//打开一个图形化窗口
//		workspace.aboutBox();
		long end = System.currentTimeMillis();
		System.out.println("success-workspace!=" + (end - start));
	}
}

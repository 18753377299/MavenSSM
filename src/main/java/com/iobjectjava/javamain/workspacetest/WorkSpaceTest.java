<<<<<<< HEAD:src/main/java/com/iobjectjava/javamain/workspacetest/WorkSpaceTest.java
package com.iobjectjava.javamain.workspacetest;
=======
package com.iobjectjava.javamain.com;
>>>>>>> 821f61fa5b9d7e6ab21a71a9faa4aabdeae3ecaa:src/main/java/com/iobjectjava/javamain/com/JavaTest.java

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

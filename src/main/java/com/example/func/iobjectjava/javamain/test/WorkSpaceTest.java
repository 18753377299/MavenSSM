package com.iobjectjava.javamain.test;

import com.supermap.data.Workspace;

public class WorkSpaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startDate = System.currentTimeMillis();
		new Workspace();
		System.out.println("====totalDate======="+(System.currentTimeMillis()-startDate));
	}

}

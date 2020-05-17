package javaPractice.simple.listFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//初始化list数据
public class InitList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*通过数组转换为list信息*/
		String [] strArray = {"1","2","3"};
		List<String> strList = new ArrayList<String>();
		strList = Arrays.asList(strArray);
		System.out.println(strList);
		
		
		
		
	}

}

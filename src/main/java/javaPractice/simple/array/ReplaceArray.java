package javaPractice.simple.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javassist.expr.NewArray;

import org.apache.commons.lang3.StringUtils;

public class ReplaceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String [] sorArray = {"001","008","009"};
			String sorArrayStr="";
			String newArray = "001,008,009";
			String result= "";
			sorArrayStr = StringUtils.join(sorArray,",");
			List<String> newList =new ArrayList<String>(Arrays.asList(sorArray));
			if(newList.contains("008")){
				result = newArray.replace("008", "006");
				result = newArray.replace("009", "007");
				sorArrayStr.replaceAll("008", "006");
				newList.remove("008");
				newList.add("006");
			}
			System.out.println(result);
			System.out.println(sorArrayStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

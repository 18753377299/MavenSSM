package javaPractice.simple.listFile;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2017年12月11日 下午4:08:40
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class ListTest {
   public static void main(String[]args){
	   List books=new ArrayList();
	   books.add("aaa");
	   books.add("bbbb");
	   books.add("ccccc");
	   JSONObject audienceAll = new JSONObject();
	   JSONArray baseform = new JSONArray();
	   for(Object str: books){
		   baseform.add(str) ;
	   }
	   audienceAll.put("vtreeDelList", baseform);
	   
	   System.out.println(audienceAll.toString());
	   System.out.println(StringUtils.join(books,"\",\""));
	   System.out.println(books);
	   books.remove(new A());
	   System.out.println(books);
	   books.remove(new A());
	   System.out.println(books);
	   
	   List<String> list =new ArrayList<String>();
	   try {
		   for(String temp:list){
			   System.out.println("aaaa"+temp);
		   }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	   
   }
}
class A{
	public boolean equals(Object object){
		return true;
	}
}

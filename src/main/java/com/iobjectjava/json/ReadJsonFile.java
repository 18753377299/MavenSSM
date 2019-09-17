package com.iobjectjava.json;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;

import com.generator.Generator;


	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年9月17日 下午2:50:27
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class ReadJsonFile {
	public static void main(String []args) throws IOException{
		
			 ClassPathResource resource = new ClassPathResource("menu2.json");
			 File filePath = resource.getFile();
			 JSONArray btnArray = null;
	        //读取文件
	        String input = FileUtils.readFileToString(filePath, "UTF-8");
	        input = input.substring(input.toString().indexOf("{"));
	        char [] str = input.toString().trim().toCharArray();
	        System.out.println("============"+str.length);
	        for (int i = 0; i < str.length; i++) {
	            System.out.print(str[i] + ",");
	        }
	        //将读取的数据转换为JSONObject
	        JSONObject jsonObject1 = JSONObject.fromObject("{'aaa':'123'}");
	        JSONObject jsonObject = JSONObject.fromObject(input);
//	        if (jsonObject != null) {
//	            //取出按钮权限的数据
//	            btnArray = jsonObject.getJSONArray("btnList");
//	        }
//	        Iterator<Object> num = btnArray.iterator();
//	        //遍历JSONArray，转换格式。按按钮集合按模块（name）放入map中
//	        while (num.hasNext()) {
//	            JSONObject btn = (JSONObject) num.next();
//	            System.out.println(btn.get("name"));
////	            btnMap.put((String) btn.get("name"), 
////	            		JSONArray.toList((JSONArray) btn.get("children"),
////	            				new MenuVo(), new JsonConfig()));
//	        }

	        
		  String path = ReadJsonFile.class.getResource("/").getPath();
	      InputStream is = Generator.class.getResourceAsStream("/menu.json");
	}
}

package com.iobjectjava.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年9月17日 下午5:03:41
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class ReadJson { 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String filePath = "E:\\wugang\\data\\weiboyi\\wechat.txt";
		ClassPathResource resource = new ClassPathResource("menu1.json");
		File file = resource.getFile();
		
		String filePath  = file.getAbsolutePath();
		String filePath2 = file.getPath();
        String txtStr = reader(filePath);
        if (txtStr != null) {
            process(txtStr);
        } else {
            System.out.println("Read the content is empty!");
        }
        System.out.println("--- end ---");
	}
	
    public static String reader(String filePath) {
    	
    	StringBuffer sb = new StringBuffer();
        try {
            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
    				sb.append(lineTxt);
    			}
//                String lineTxt = bufferedReader.readLine();
//                while (lineTxt != null) {
//                    return lineTxt;
//                }
            }
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            System.out.println("Cannot find the file specified!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading file content!");
            e.printStackTrace();
        }
        return sb.toString();
    }
    private static void process(String txtStr) {
        JSONObject json = JSONObject.fromObject(txtStr);
        JSONArray datas = json.getJSONObject("data").getJSONArray("rows");
        
//        List<Map<String, Object>> list = new ArrayList<>();
//        for (int i = 0; i < datas.length(); i++) {
//            Map<String, Object> map = new HashMap<>();
//            JSONObject obj = datas.getJSONObject(i).getJSONObject("cells");
//            String name = obj.getString("weibo_name");
//            String code = obj.getString("weibo_id");
//            String url = BASE_URL + obj.getString("url");
//
//            map.put("name", name);
//            map.put("code", code);
//            map.put("url", url);
//            list.add(map);
//        }
//        if (!list.isEmpty()) {
////            insert(list);
//        }
    }

}

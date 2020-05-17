package javaPractice.simple.json;


import com.alibaba.fastjson.JSON;
import com.example.vo.User;

public class JsonTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  json = "{\"userCode\":null,\"passWord\":\"123\",\"age\": 10}";
		User user =  JSON.parseObject(json,User.class);
		System.out.println(user);
	}

}

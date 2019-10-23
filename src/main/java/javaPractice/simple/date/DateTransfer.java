package javaPractice.simple.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年9月6日 下午2:30:47
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class DateTransfer {

	public static void main(String[] args) {
		try {
			String tfbhDate ="20190812000000";
			String tfbhDate2 ="20190912000000";
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
			// 资料时间
			Date dataTime= sdf.parse(tfbhDate);
			Date dataTime2= sdf.parse(tfbhDate2);
			System.out.println(dataTime);
			System.out.println(dataTime2.getTime()-dataTime.getTime());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}

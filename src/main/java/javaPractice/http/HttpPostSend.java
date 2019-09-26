package javaPractice.http;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;

import com.po.response.AjaxResult;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年9月19日 下午3:11:41
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class HttpPostSend {

	
	/**
	 * @功能：获取气象局栅格数据,success: 看看是不是因为内网的原因，家中的网络能够成功的调用这个接口，并能够获取到信息，数据格式和之前商定的不太统一，需要确认一下
	 * @param 
	 * @return void
	 * @author liqiankun
	 * @时间：20190919
	 * @修改记录：
	 */	
	public static  void main(String[]args) {
		AjaxResult ajaxResult =new AjaxResult();
//		String url = "http://60.205.166.252/renbaofile/FileProvider/downloadFileByJson";
//		String param = "secretuid=433f3dd6-d9eb-11e9-9637-00163e30bfa0&secretkey=YYUTAKPEV6Y4F3P8NQZD3CWF5J&Content-type=application/text";
//		String responseJson =this.doGet(url, param);
		
		String url = "http://60.205.166.252/renbaofile/FileProvider/downloadFileByJson?secretuid=433f3dd6-d9eb-11e9-9637-00163e30bfa0&secretkey=YYUTAKPEV6Y4F3P8NQZD3CWF5J&Content-type=application/text";
		/*json文件能够成功*/
//		String jsonString = "{'pattern': 'name','type': 'fst','files': [{'file_name': 'Z_NWGD_C_BABJ_P_RFFC_SCMOC-ER24_201909250800.json'}]}";
		/*asc文件，也能够成功，需要将asc文件内容直接输出到一个asc文件中，获取直接生成栅格数据*/
		String jsonString = "{'pattern': 'name','type': 'fst','files': [{'file_name': 'Z_NWGD_C_BABJ_P_RFFC_SCMOC-ER24_201909270800.asc'}]}";

		//		?clearingFlag=1
//		String url = "http://11.205.243.35:8022/riskcontrol/riskmap/testHttpPost";
//		String jsonString = "{'returnCode': '1111','returnMessage': 'success'}";

		String responseJson =doHttpPost(jsonString, url);
		System.out.println("success");
		
	}
	/**
     * 发送Http post请求
     * 
     * @param xmlInfo
     *            json转化成的字符串
     * @param URL
     *            请求url
     * @return 返回信息
     */
    public static String doHttpPost(String xmlInfo, String URL) {
        System.out.println("发起的数据:" + xmlInfo);
        byte[] xmlData = xmlInfo.getBytes();
        InputStream instr = null;
        java.io.ByteArrayOutputStream out = null;
        String jwtToken = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ7XCJ1c2VyTmFtZVwiOlwi6aOO5o6n5YWo5Zu9XCIsXCJyaXNrQ29kZVwiOm51bGwsXCJjb21Db2RlXCI6XCIwMDAwMDAwMFwiLFwidXNlckNvZGVcIjpcIkEwMDAwMTE1MzNcIixcInJpc2tDb21Db2RlXCI6bnVsbCxcImNsYXNzQ29kZVwiOm51bGwsXCJlbWFpbFwiOm51bGwsXCJ2ZXJzaW9uXCI6XCJ2MS4wLjEuMFwiLFwiY29tQ05hbWVcIjpcIuaAu-WFrOWPuFwiLFwic2Vzc2lvbklEXCI6bnVsbCxcImxvZ2luQ29tQ29kZVwiOm51bGwsXCJncm91cFVzZXJDb2RlXCI6bnVsbCxcInRhc2tDb2RlTGlzdFwiOltcInJpc2tjb250cm9sXCIsXCJyaXNraW5zXCIsXCJyaXNraW5zXCIsXCJyaXNrc2FsZVwiLFwicmlza3NldFwiLFwicmlza2luc19pbnB1dFwiLFwicmlza2luc19xdWVyeVwiLFwicmlza2luc19xdWVyeVwiLFwicmlza3NhbGVfZXhhbWluZVwiLFwicmlza3NhbGVfY29sbGVjdFwiLFwicmlza3NldF9jbGVhckNhY2hlXCIsXCJyaXNrc2V0X3Jpc2tEbmF0dXJhbFwiLFwicmlza3NldF9yaXNrRG5hdHVyYWxcIixcInJpc2tJbmZvXCIsXCJyaXNraW5zX3NldFwiLFwicmlza2luc191bmRcIixcInJpc2tpbnNleHBfc2V0XCIsXCJyaXNraW5zX3VuZGZpclwiLFwicmlza2luc191bmRzZWNcIixcInJpc2tjaGVja19pbnB1dEFuZFF1ZXJ5XCIsXCJyaXNrY2hlY2tfZGlzdHJpYnV0ZVwiLFwicmlza2luc19zY29yZVwiXSxcInBvc3RMaXN0XCI6W1wicmlza2luc191bmRzZWMt6aOO5o6n5oql5ZGK5LqM57qn5a6h5qC45bKXXCIsXCJyaXNraW5zX3NldC3po47mjqfkv6Hmga_nu7TmiqTlspdcIixcInJpc2tpbnNfdW5kZmlyLemjjuaOp-aKpeWRiuS4gOe6p-WuoeaguOWyl1wiLFwicmlza2luc19pbnB1dC3po47mjqfmiqXlkYrlvZXlhaXlspdcIixcInJpc2tpbnMt6aOO5o6n57uT5p6c5p-l6K-i5bKXXCIsXCJyaXNraW5zZXhwX3NldC3po47mjqfkuJPlrrbnu7TmiqTlspdcIixcInJpc2tjaGVja19pbnB1dEFuZFF1ZXJ5LemjjuaOp-W3oeajgOWyl1wiLFwicmlza3NhbGVfY29sbGVjdC3nhafniYfmoaPmoYjph4fpm4blspdcIixcInJpc2tpbnNfdW5kLemjjuaOp-S_oeaBr-WuoeaguOWyl1wiLFwicmlza3NldC3po47mjqfnrqHnkIblspdcIixcInJpc2tjaGVja19kaXN0cmlidXRlLemjjuaOp-W3oeajgOa0vuWPkeWyl1wiLFwicmlza2luc19xdWVyeS3po47mjqfmiqXlkYrmn6Xor6LlspdcIixcInJpc2tzYWxlX2V4YW1pbmUt54Wn54mH5qGj5qGI5a6h5qC45bKXXCIsXCJyaXNraW5mby3po47mjqfkv6Hmga_lspdcIl0sXCJpc1BDXCI6dHJ1ZSxcImlzT3V0ZXJTeXN0ZW1cIjpmYWxzZX0iLCJleHAiOjE1NjkwMjQ3MjB9.Bv9-bblmn4tRe96lkAMgF8MLk3wBjARleueYZwO18XD70gegAbhC_blcwoW2s-UB8P-zO8M7tFzSBkj_IwCl6g";
        try {
            URL url = new URL(URL);
            //设置代理
//            Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress("127.0.0.1"/*proxy addr*/,8080/*proxy port*/));
//            HttpURLConnection urlCon = (HttpURLConnection) url.openConnection(proxy);

            URLConnection urlCon = url.openConnection();
            urlCon.setDoOutput(true);
            urlCon.setDoInput(true);
            urlCon.setUseCaches(false);
            // 测试本地环境post请求
//            urlCon.setRequestProperty("Content-type", "application/json");
//            urlCon.setRequestProperty("jwtToken", jwtToken);
            
            urlCon.setRequestProperty("Content-type", "application/text");
            urlCon.setRequestProperty("secretuid", "433f3dd6-d9eb-11e9-9637-00163e30bfa0");
            urlCon.setRequestProperty("secretkey", "YYUTAKPEV6Y4F3P8NQZD3CWF5J");
//            urlCon.setRequestProperty("charset", "utf-8");
//            urlCon.setRequestProperty("Content-length",String.valueOf(xmlData.length));
//            System.out.println(String.valueOf(xmlData.length));
            DataOutputStream printout = new DataOutputStream(urlCon.getOutputStream());
            printout.write(xmlData);
            printout.flush();
            printout.close();
            instr = urlCon.getInputStream();
            byte[] bis = IOUtils.toByteArray(instr);
            String ResponseString = new String(bis, "UTF-8");
            if ((ResponseString == null) || ("".equals(ResponseString.trim()))) {
                System.out.println("返回空");
            }
            System.out.println("返回数据为:" + ResponseString);
            return ResponseString;

        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        } finally {
            try {
                out.close();
                instr.close();

            } catch (Exception ex) {
                return "0";
            }
        }
    }
	
	/**
     * 执行一个带参数的HTTP GET请求，返回请求响应的JSON字符串
     *
     * @param url 请求的URL地址
     * @return 返回请求响应的JSON字符串
     */
//    public static String doGet(String url, String param) {
//        HttpClient client = new HttpClient(new HttpClientParams(),new SimpleHttpConnectionManager(true));
//        GetMethod method = new GetMethod(url + "?" + param);
//        method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler());
//        method.setRequestHeader("secretuid", "433f3dd6-d9eb-11e9-9637-00163e30bfa0");
//        method.setRequestHeader("secretkey","YYUTAKPEV6Y4F3P8NQZD3CWF5J");
//        try {
//            client.executeMethod(method);
//            if (method.getStatusCode() == HttpStatus.SC_OK) {
//                return StreamUtils.copyToString(method.getResponseBodyAsStream(), Charset.forName("utf-8"));
//            }
//        } catch (IOException e) {
//        	e.printStackTrace();
////        	LOGGER.info("执行HTTP Get请求" + url + "时，发生异常！",e);
//        	throw new RuntimeException("执行HTTP Get请求" + url + "时，发生异常！",e);
//        } finally {
//            method.releaseConnection();
//        }
//        return "";
//    }
}

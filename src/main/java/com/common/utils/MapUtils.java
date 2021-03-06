package com.common.utils;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import com.common.utils.map.MapGeometryUtils;
import com.common.utils.map.MapReflectUtils;
import com.example.func.map.vo.typhoonRequest.TyphoonLatestInfo;
import com.example.func.map.vo.typhoonRequest.TyphoonPath;
import com.example.po.response.AjaxResult;
import com.supermap.data.BlockSizeOption;
import com.supermap.data.CursorType;
import com.supermap.data.DatasetGrid;
import com.supermap.data.DatasetGridInfo;
import com.supermap.data.DatasetVector;
import com.supermap.data.Datasets;
import com.supermap.data.Datasource;
import com.supermap.data.DatasourceConnectionInfo;
import com.supermap.data.EncodeType;
import com.supermap.data.EngineType;
import com.supermap.data.FieldInfo;
import com.supermap.data.FieldInfos;
import com.supermap.data.FieldType;
import com.supermap.data.GeoCircle;
import com.supermap.data.GeoRegion;
import com.supermap.data.Geometrist;
import com.supermap.data.Geometry;
import com.supermap.data.Maps;
import com.supermap.data.PixelFormat;
import com.supermap.data.Point2D;
import com.supermap.data.PrjCoordSys;
import com.supermap.data.PrjCoordSysType;
import com.supermap.data.Recordset;
import com.supermap.data.Workspace;
import com.supermap.data.WorkspaceConnectionInfo;
import com.supermap.data.WorkspaceType;
import com.supermap.data.WorkspaceVersion;
import com.supermap.data.conversion.DataImport;
import com.supermap.data.conversion.IgnoreMode;
import com.supermap.data.conversion.ImportResult;
import com.supermap.data.conversion.ImportSetting;
import com.supermap.data.conversion.ImportSettingGRD;
import com.supermap.mapping.Layer;
import com.supermap.mapping.ThemeGridRange;
import com.supermap.mapping.ThemeGridRangeItem;
import com.supermap.ui.Action;
import com.supermap.ui.MapControl;

/**
 * @功能：iobjectjava 操作小工具，连接oracle库
 * @param 
 * @return 
 * @author liqiankun
 * @时间：20190515
 * @修改记录：
 */

@SuppressWarnings("unused")
public class MapUtils {
	/*九、工具类中屏蔽构造函数*/
	/*工具类是一堆静态字段和函数的集合，其不应该被实例化；
	但是，Java 为每个没有明确定义构造函数的类添加了一个隐式公有构造函数，
	为了避免不必要的实例化，应该显式定义私有构造函数来屏蔽这个隐式公有构造函数。*/
	public MapUtils() {}
	
	//连接参数获取
    private static final String iobjectJavaServer,iobjectJavaDatabase,iobjectJavaUser,iobjectJavaPassword;
    // 连接postgreSQL数据源的参数
    private static final String iobjectJavaServerPostgre,iobjectJavaDatabasePostgre,iobjectJavaUserPostgre,iobjectJavaPasswordPostgre;

   
	static {
    	/*获取连接iobjectjava的数据信息*/
		ResourceBundle filePath = ResourceBundle.getBundle("config.map", Locale.getDefault());
		 // 定义数据源连接信息，假设以下所有数据源设置都存在
		iobjectJavaServer = filePath.getString("iobjectJavaServer");
		iobjectJavaDatabase = filePath.getString("iobjectJavaDatabase");
		iobjectJavaUser = filePath.getString("iobjectJavaUser");
		iobjectJavaPassword = filePath.getString("iobjectJavaPassword");
		
//		iobjectJavaServer = "10.10.68.248:1521/orcl";
//		iobjectJavaDatabase = "riskcontrol_freeze";
//		iobjectJavaUser = "riskcontrol_freeze";
//		iobjectJavaPassword = "Picc_2019risk";
		// postgreSQL
		iobjectJavaServerPostgre="localhost:5432/platform_devdb";
		iobjectJavaDatabasePostgre= "platform_devdb";
		iobjectJavaUserPostgre="postgres";
		iobjectJavaPasswordPostgre = "123456";
    }
    
	/**连接数据源*/
	public static Datasource connectDataSource(Workspace workspace,DatasourceConnectionInfo datasourceconnection){
		
		   datasourceconnection.setEngineType(EngineType.ORACLEPLUS);
	       datasourceconnection.setServer(iobjectJavaServer);
	       datasourceconnection.setDatabase(iobjectJavaDatabase);
	       datasourceconnection.setUser(iobjectJavaUser); // riskcontrol_freeze
	       datasourceconnection.setPassword(iobjectJavaPassword);
//	       datasourceconnection.setPassword(EncryptSecretInfo.decodeSecretInfo(iobjectJavaPassword));
		   datasourceconnection.setAlias("ORACLE");
	      // 打开数据源
	      Datasource datasource = workspace.getDatasources().open(datasourceconnection);
	      
	      if (datasource == null) {
	          System.out.println("ORACLE打开数据源失败");
	          return null;
	      } else {
	         System.out.println("ORACLE数据源打开成功！");
	         return datasource;
	      }
	}
	/**连接Postgre数据源*/
	public static Datasource connectPostgresDataSource(Workspace workspace,DatasourceConnectionInfo dataCon){
		
		  dataCon.setEngineType(EngineType.POSTGRESQL);
		  dataCon.setServer(iobjectJavaServerPostgre);
		  dataCon.setDatabase(iobjectJavaDatabasePostgre);
		  dataCon.setUser(iobjectJavaUserPostgre); // riskcontrol_freeze
		  dataCon.setPassword(iobjectJavaPasswordPostgre);
		  dataCon.setAlias("POSTGRESQL");
	      // 打开数据源
	      Datasource datasource = workspace.getDatasources().open(dataCon);
	      
	      if (datasource == null) {
	          System.out.println("POSTGRESQL打开数据源失败");
	          return null;
	      } else {
	         System.out.println("POSTGRESQL数据源打开成功！");
	         return datasource;
	      }
	}
	
	
	
	
  
    /**查询标的信息*/
    public static void queryCorporePInfo(Object SMID,Object POINTX_2000,Object  POINTY_2000){
		Connection connect = null;
//        Statement statement = null;
        PreparedStatement preState = null;
        ResultSet resultSet = null;
		try {
//           Class.forName("oracle.jdbc.OracleDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
           
           connect = DriverManager.getConnection("jdbc:oracle:thin:@10.10.68.248:1521:orcl", "riskcontrol", "riskcontrol");           

          
           System.out.println(connect);  
           
//         statement = connect.createStatement();
          
           String sql = "select * from RISKMAP_MAIN where SMID = ?";
//           PreparedStatement preState = connect.prepareStatement("select  * from tb1_dept where id = ?");
           preState = connect.prepareStatement(sql);
           preState.setInt(1, Integer.parseInt(SMID.toString()));
           
//           resultSet = statement.executeQuery("select  * from RISKINFO_CLAIM where SERIALNO ='26'");
//           resultSet = statement.executeQuery("select * from SMDTV_45 where SMID=3");
           	
           resultSet = preState.executeQuery();        
           while (resultSet.next()){
//        	   byte[] SMGEOMETRY = null;
               Integer  SMID1 = resultSet.getInt("SMID");
               Integer SMKEY = resultSet.getInt("SMKEY");
               BigDecimal SMSDRIW = new BigDecimal(resultSet.getString("SMSDRIW"));
               BigDecimal SMSDRIN = new BigDecimal(resultSet.getString("SMSDRIN"));
               BigDecimal SMSDRIE = new BigDecimal(resultSet.getString("SMSDRIE"));
               BigDecimal SMSDRIS = new BigDecimal(resultSet.getString("SMSDRIS"));
               BigDecimal SMGRANULE = new BigDecimal(resultSet.getString("SMGRANULE"));
               byte[] SMGEOMETRY =resultSet.getBytes("SMGEOMETRY");
               Integer  SMUSERID = resultSet.getInt("SMUSERID");
               Integer  SMLIBTILEID = resultSet.getInt("SMLIBTILEID");
               BigDecimal SMAREA = new BigDecimal(resultSet.getString("SMAREA"));
               BigDecimal SMPERIMETER = new BigDecimal(resultSet.getString("SMPERIMETER"));
               
               String  ADMINCODE = resultSet.getString("ADMINCODE");
               String  KIND = resultSet.getString("KIND");
               String  NAME = resultSet.getString("NAME");
               String  PY = resultSet.getString("PY");
               String  CITYADCODE = resultSet.getString("CITYADCODE");
               String  PROADCODE = resultSet.getString("PROADCODE");
               BigDecimal CENTERX = new BigDecimal(resultSet.getString("CENTERX"));
               BigDecimal CENTERY = new BigDecimal(resultSet.getString("CENTERY"));
               BigDecimal LEVELFLAG = new BigDecimal(resultSet.getString("LEVELFLAG"));
               
               String  PROVINCENAME = resultSet.getString("PROVINCENAME");
               String  CITYNAME = resultSet.getString("CITYNAME");
               System.out.println(SMID+"   "+SMKEY+"   "+SMSDRIW); 
               
           }
       } catch (Exception e) {
           e.printStackTrace();
       }finally {
               try {
                   if (resultSet!=null) resultSet.close();
                   if (preState!=null) preState.close();
                   if (connect!=null) connect.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
       }
	}
    
    /*将list数据组织成map数据，根据TM进行组织*/
    public static Map<String,List<Object>>  getObjectjMap(List<Object> list){
    	Map<String,List<Object>> map = new HashMap<String, List<Object>>();
    	if(list!=null&&list.size()>0){
    		for(Object object: list){
    			/*获取编号信息*/
    			List<Object> wzTFYbljList = new ArrayList<Object>();
    			String tm = MapReflectUtils.getMethod(list.get(0),"tm").toString();
    			if(map.containsKey(tm)){
    				map.get(tm).add(object);
    			}else{
    				wzTFYbljList.add(object);
    				map.put(tm, wzTFYbljList);
    			}
    		}
    	}
    	return map;
    }
    
    /**
	 * @功能：iobjectjava 关闭地图资源
	 * @param 
	 * @return void
	 * @author liqiankun
	 * @时间：20190524
	 * @修改记录：
	 */
    public static void closeMapResource(Recordset recordset_10,Recordset recordset_7,DatasetVector datasetVector_new,
    		DatasetVector datasetVector_address,DatasetVector datasetVector_10,DatasetVector datasetVector_7,  
    		Datasource datasource,DatasourceConnectionInfo datasourceconnection,Workspace workspace){
    		
    	  	if(recordset_10!=null){
		    	recordset_10.close();
		    	recordset_10.dispose();
			}
	        if(recordset_7!=null){
	        	recordset_7.close();
	        	recordset_7.dispose();
			}
	        if(datasetVector_new!=null){
				datasetVector_new.close();
			}
	        if(datasetVector_address!=null){
	        	datasetVector_address.close();
			}
	        
	        if(datasetVector_10!=null){
	        	datasetVector_10.close();
			}
			if(datasetVector_7!=null){
				datasetVector_7.close();
			}
		    if(datasource!=null){
				datasource.close();
			}
		    if(datasourceconnection!=null){
				datasourceconnection.dispose();
			}
			if(workspace!=null){
				// 关闭工作空间
				workspace.close();
				// 释放该对象所占用的资源
				workspace.dispose();
			}
    } 
    /**
	 * @功能：对密码进行解密的算法
	 * @param 十六进制转中文字符串
	 * @return void
	 * @author liqiankun
	 * @时间：20190524
	 * @修改记录：
	 */
    public static String decodeSecretInfo(String str) {
        if ( str == null ) {
            return "转换失败";
        }
        byte[] s = pack(str); //十六进制转byte数组
        String gbk;
        try {
            gbk = new String(s, "gbk"); //byte数组转中文字符串
        } catch ( UnsupportedEncodingException ignored ) {
            gbk = "转换失败";
        }
        return gbk;
    }
    /**
     * 十六进制转byte数组，模拟php中pack
     */
    public static byte[] pack(String str) {
        int nibbleshift = 4;
        int position = 0;
        int len = str.length() / 2 + str.length() % 2;
        byte[] output = new byte[len];
        for (char v : str.toCharArray()) {
            byte n = (byte) v;
            if (n >= '0' && n <= '9') {
                n -= '0';
            } else if (n >= 'A' && n <= 'F') {
                n -= ('A' - 10);
            } else if (n >= 'a' && n <= 'f') {
                n -= ('a' - 10);
            } else {
                continue;
            }
            output[position] |= (n << nibbleshift);
            if (nibbleshift == 0) {
                position++;
            }
            nibbleshift = (nibbleshift + 4) & 7;
        }
        return output;
    }
    
	
    
   
    /**
	 * 设置是否显示栅格分段专题图
	 */
	public void setThemeRange(boolean value) {
		MapControl m_mapControl =  new MapControl();
		Workspace m_workspace = new Workspace();
		// 打开工作空间和地图
//		WorkspaceConnectionInfo info = new WorkspaceConnectionInfo(
//				"F:/A_supermap/superMap_file/MapFile/db/dataLayer.smwu");
		WorkspaceConnectionInfo info = new WorkspaceConnectionInfo(
				"F:/A_supermap/superMap_file/MapFile/Interpolation/Interpolation.smwu");
		info.setType(WorkspaceType.SMWU);
		m_workspace.open(info);
		Datasource m_datasource = m_workspace.getDatasources().get(0);
		DatasetGrid m_datasetGrid = (DatasetGrid) m_datasource.getDatasets().get("Temp5000");

		//调整m_mapControl的状态
		m_mapControl.setAction(Action.PAN);
		m_mapControl.getMap().getLayers().add(m_datasetGrid, true);
		m_mapControl.setWaitCursorEnabled(false);
		
		Layer m_layerThemeGridRange ;	
		
		try {
//			if (m_layerThemeGridRange == null) {
				//构造栅格分段专题图对象
				ThemeGridRange themeGridRange = new ThemeGridRange();

				//初始化栅格分段专题图子项并设置各自的属性
				ThemeGridRangeItem item0 = new ThemeGridRangeItem();
				item0.setStart(-9999);
				item0.setEnd(m_datasetGrid.getMinValue());
				item0.setColor(Color.CYAN);
				item0.setVisible(true);

				ThemeGridRangeItem item1 = new ThemeGridRangeItem();
				item1.setStart(m_datasetGrid.getMinValue());
				item1.setEnd(5.3);
				item1.setColor(Color.GREEN);
				item1.setVisible(true);

				ThemeGridRangeItem item2 = new ThemeGridRangeItem();
				item2.setStart(5.3);
				item2.setEnd(15.7);
				item2.setColor(Color.BLUE);
				item2.setVisible(true);

				ThemeGridRangeItem item3 = new ThemeGridRangeItem();
				item3.setStart(15.7);
				item3.setEnd(26.0);
				item3.setColor(Color.RED);
				item3.setVisible(true);

				ThemeGridRangeItem item4 = new ThemeGridRangeItem();
				item4.setStart(26.0);
				item4.setEnd(Double.MAX_VALUE);
				item4.setColor(Color.GRAY);
				item4.setVisible(true);


				//将栅格分段专题图子项依次添加到栅格分段专题图
				themeGridRange.addToHead(item0);
				themeGridRange.addToTail(item1);
				themeGridRange.addToTail(item2);
				themeGridRange.addToTail(item3);
				themeGridRange.addToTail(item4);
				//添加栅格分段专题图
				m_layerThemeGridRange = m_mapControl.getMap().getLayers().add(
						m_datasetGrid, themeGridRange, true);
				//设置图层是否可显示，刷新地图
				m_layerThemeGridRange.setVisible(value);
				m_mapControl.getMap().refresh();
				
				Maps maps =m_workspace.getMaps();
				maps.add("aaa",m_mapControl.getMap().toXML());
				// 保存工作空间
				m_workspace.save();
				
//			}

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	 /**
   	 * @功能：比较两个日期的大小,如果资料时间小于 Year ， Mon，Day 则为false
   	 * 为true的时候为实时路径，为false的时候为预报路径
   	 * @param 
   	 * @return boolean
   	 * @author liqiankun
   	 * @时间：20190903
   	 * @修改记录：
   	 */
    public static boolean compareDateSize(TyphoonPath typhoonPath){
    	boolean flag = false;
    	try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
			Calendar calendar = Calendar.getInstance();
			calendar.set(Integer.valueOf(typhoonPath.getYear()), Integer.valueOf(typhoonPath.getMon()),
					Integer.valueOf(typhoonPath.getDay()), Integer.valueOf(typhoonPath.getHour()), 
					Integer.valueOf(typhoonPath.getMin()));
			
			Date date =  calendar.getTime();
			// 资料时间
			Date dataTime= sdf.parse(typhoonPath.getDatetime());
			if(dataTime.getTime()-date.getTime()>0){
				flag = false;
			}else {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return flag;
    }
    /**
   	 * @功能：将string字符串，转换为时间格式
   	 * @param 
   	 * @return Date
   	 * @author liqiankun
   	 * @时间：20190903
   	 * @修改记录：
   	 */
    public static Date getTyphoonDate(TyphoonPath typhoonPath,String flag){
    	Date date = null;
    	try {
			if("YB".equals(flag)){
				Calendar calendar = Calendar.getInstance();
				calendar.set(Integer.valueOf(typhoonPath.getYear()), Integer.valueOf(typhoonPath.getMon())-1,
						Integer.valueOf(typhoonPath.getDay()), Integer.valueOf(typhoonPath.getHour())+
						Integer.valueOf(typhoonPath.getValidtime()), 
						Integer.valueOf(typhoonPath.getMin()),0);
				date =  calendar.getTime();
			}else if("SH".equals(flag)){
//				SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				// 资料时间
				date= sdf.parse(typhoonPath.getDatetime());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
		return date;
    }
    /**
   	 * @功能：将较早发生的台风作为基本信息的台风开始时间
   	 * @param 
   	 * @return TyphoonLatestInfo
   	 * @author liqiankun
   	 * @时间：20190903
   	 * @修改记录：
   	 */
    public static TyphoonLatestInfo  compareObjectDateSize(TyphoonPath typhoonPath,TyphoonLatestInfo typhoonLatestInfo){
    	try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			// 基本信息的发生时间
			Date date =  typhoonLatestInfo.getTfDate();
			// 资料时间
			Date dataTime= sdf.parse(typhoonPath.getDatetime());
			if(dataTime.getTime()-date.getTime()<0){
				typhoonLatestInfo.setTfDate(dataTime);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return typhoonLatestInfo;
    }
    
    /**
	 * @功能：执行一个带参数的HTTP GET请求，返回请求响应的JSON字符串
	 * @author liqiankun
	 * @param  url 请求的URL地址
	 * @return  返回请求响应的JSON字符串
	 * @throws Exception
	 * @时间：20190927
	 * @修改记录:
	 */
    public static String getTyphoonDataByGet(String url)  {
   	 StringBuffer sb = new StringBuffer();
   	 BufferedReader bufferReader = null;
       try {
		  URL realUrl = new URL(url);
			// 设置代理请求
          Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress("Proxy.piccnet.com.cn",3128));
          HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection(proxy);
			// 打开和URL之间的连接
//			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
//			connection.setRequestProperty("accept", "*/*");
//			connection.setRequestProperty("connection", "Keep-Alive");
//			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			// 建立实际的连接
			connection.connect();
			// 定义 BufferedReader输入流来读取URL的响应
			bufferReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = bufferReader.readLine()) != null) {
			    sb.append(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
           try {
        	   if(bufferReader!=null){
        		   bufferReader.close();
        	   }
           } catch (Exception ex) {
               return "0";
           }
       }
       return sb.toString();
   }
    
    /**
     * 发送Http post请求
     * 
     * @param xmlInfo
     *            json转化成的字符串
     * @param URL ：请求url
     * @return 返回信息
     */
    public static String getRainDataByHttpPost(String xmlInfo, String URL) {
        System.out.println("发起的数据:" + xmlInfo);
        byte[] xmlData = xmlInfo.getBytes();
        InputStream instr = null;
        ByteArrayOutputStream out = null;
        try {
            URL url = new URL(URL);
            //设置代理
            Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress("Proxy.piccnet.com.cn",3128));
            HttpURLConnection urlCon = (HttpURLConnection) url.openConnection(proxy);

//            URLConnection urlCon = url.openConnection();
         // 发送POST请求必须设置如下两行
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
    /*生成文件到ftp服务器中*/
//    public static AjaxResult generateFileToFtp(String dataString){
//    	AjaxResult ajaxResult =new AjaxResult();
//    	OutputStream output =null;
//		FTPUtil ftp = new FTPUtil();
//		// 存储到公共上传目录下
//		//输出Excel文件
//		try {
//			ResourceBundle bundle = ResourceBundle.getBundle("config.savePath",
//					Locale.getDefault());
//    		output =ftp.uploadFile("downloadSuperMap/mapGridData.asc");
//			ajaxResult.setData("/downloadSuperMap/mapGridData.asc");
////			wkb.write(output);
//			output.write(dataString.getBytes());
//			output.flush();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//            if (output != null) {
//                try {
//                	output.close();
//                } catch (Exception e2) {
//                	e2.printStackTrace();
//                }
//                
//            }
//            if(ftp!=null) {
//	            try {
//					ftp.close();
//				} catch (IOException e) {
////					LOGGER.info("关闭ftp异常：" + e.getMessage() ,e);
//					e.printStackTrace();
//				}
//            }
//		}
//      return ajaxResult;	
//    }
    /**
	 * @功能：生成asc文件
	 * @param 
	 * @return void
	 * @author liqiankun
	 * @时间：20191010
	 * @修改记录：
	 */	
 	public static void generateAscFile(String restring,String filePath){
 		try {
// 			String filePath="E:\\2.asc";
 			FileOutputStream fos = new FileOutputStream(filePath);
 			fos.write(restring.getBytes());
 			fos.close();
 			System.out.println("success");
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 	}
 	 /**
 		 * @功能：以行为单位读取文件，常用于读面向行的格式化文件 
 		 * @param 
 		 * @return void
 		 * @author liqiankun
 		 * @时间：20191010
 		 * @修改记录：
 		 */	
    public static String readFileByLines(String fileName) { 
    	StringBuffer stringBuffer = new StringBuffer();
    	
        File file = new File(fileName);  
        BufferedReader reader = null;  
        try {  
            System.out.println("以行为单位读取文件内容，一次读一整行：");  
            reader = new BufferedReader(new FileReader(file));  
            String tempString = null;  
            int line = 1;  
            // 一次读入一行，直到读入null为文件结束  
            while ((tempString = reader.readLine()) != null) {  
                // 显示行号  
//                System.out.println("line " + line + ": " + tempString);  
                stringBuffer.append(tempString+"\n");
                line++;  
            }  
            System.out.println(stringBuffer.toString()); 
            reader.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if (reader != null) {  
                try {  
                    reader.close();  
                } catch (IOException e1) {  
                }  
            }  
        }  
        return stringBuffer.toString();
    }  
    /**
	 * @功能：设置是否显示栅格分段专题图，直接使用map操作，
	 * 可以在linux无界面环境操作，MapControl 进行有界面操作。
	 * @param 
	 * @return void
	 * @author liqiankun
	 * @时间：20191010
	 * @修改记录：
	 */	
	public static void setThemeRangeByDataPng(String filePath) {
		Workspace workspace = new Workspace();
		// 定义数据源连接信息，假设以下所有数据源设置都存在
	    DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
		Datasource datasource = MapUtils.connectDataSource(workspace,datasourceconnection);
		
		try {
			DataImport dataImport =new DataImport();
//			String filePath ="C:/Users/Administrator/Desktop/aaaa.png";
//			String filePath ="C:/Users/Administrator/Desktop/surf.asc";
//			String filePath ="http://10.10.2.241:5001/riskcontrol_file/downloadSuperMap/mapGridData.asc";
			
//			ImportSettingPNG importSettingPNG =new ImportSettingPNG(filePath,m_datasource);
//			importSettingPNG.setImportingAsGrid(true);
			
			ImportSettingGRD importSettingGRD =new ImportSettingGRD(filePath,datasource);
//			importSettingGRD.setImportingAsGrid(true);
			//设置是否自动建立影像金字塔
			importSettingGRD.setPyramidBuilt(true);
			//设置 GRD 文件的忽略颜色值的模式,IGNORENONE 不忽略颜色值
			importSettingGRD.setIgnoreMode(IgnoreMode.IGNORENONE);
			
			PrjCoordSys prjCoordSys = new PrjCoordSys();
			  //地理经纬坐标
			prjCoordSys.setType(PrjCoordSysType.PCS_EARTH_LONGITUDE_LATITUDE );
			importSettingGRD.setTargetPrjCoordSys(prjCoordSys);
			
			System.out.println("======data======="+dataImport.getImportSettings().getCount());
			dataImport.getImportSettings().add(importSettingGRD);
			System.out.println("======data======="+dataImport.getImportSettings().getCount());
			ImportResult importResult =dataImport.run();
			ImportSetting []  sets = importResult.getFailedSettings();
			System.out.println("===data===failCount======="+sets.length);
			 // 关闭地图资源
		    MapUtils.closeMapResource(datasource,datasourceconnection,workspace);
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	 /**
		 * @功能：判断字符串是否为空，或者为‘999999’
		 * @param 
		 * @return void
		 * @author liqiankun
		 * @时间：20191010
		 * @修改记录：
		 */	
	public static String judgeValueIsZero(String value){
		String result = "0";
		if(StringUtils.isBlank(value)){
			return result;
		}
		if("999999".equals(value.trim())){
			return result;
		}
		return value;
	}
	 /**
		 * @功能：iobjectjava 关闭地图记录集资源
		 * @param 
		 * @return void
		 * @author liqiankun
		 * @时间：20190524
		 * @修改记录：
		 */
	    public static void closeMapRecordResource(Recordset recordset_10,Recordset recordset_7,
	    		Recordset recordset_12,Recordset recordset){
	    		
	    	  	if(recordset_10!=null){
			    	recordset_10.close();
			    	recordset_10.dispose();
				}
		        if(recordset_7!=null){
		        	recordset_7.close();
		        	recordset_7.dispose();
				}
		        if(recordset_12!=null){
		        	recordset_12.close();
		        	recordset_12.dispose();
				}
		        if(recordset!=null){
		        	recordset.close();
		        	recordset.dispose();
				}
	    }
	    /**
		 * @功能：iobjectjava 关闭Vector地图资源
		 * @param 
		 * @return void
		 * @author liqiankun
		 * @时间：20190524
		 * @修改记录：
		 */
	    public static void closeMapResource(DatasetVector datasetVector_new,DatasetVector datasetVector_address,
	    		DatasetVector datasetVector_10,DatasetVector datasetVector_7,
	    		DatasetVector datasetVector_12, DatasetVector datasetVector){
	    		
		        if(datasetVector_new!=null){
					datasetVector_new.close();
				}
		        if(datasetVector_address!=null){
		        	datasetVector_address.close();
				}
		        if(datasetVector_10!=null){
		        	datasetVector_10.close();
				}
				if(datasetVector_7!=null){
					datasetVector_7.close();
				}
				if(datasetVector_12!=null){
					datasetVector_12.close();
				}
				if(datasetVector!=null){
					datasetVector.close();
				}
	    } 
	    /**
		 * @功能：iobjectjava 关闭打开数据源资源
		 * @param 
		 * @return void
		 * @author liqiankun
		 * @时间：20190524
		 * @修改记录：
		 */
	    public static void closeMapResource(  Datasource datasource,
	    		DatasourceConnectionInfo datasourceconnection,Workspace workspace){
			    if(datasource!=null){
					datasource.close();
				}
			    if(datasourceconnection!=null){
					datasourceconnection.dispose();
				}
				if(workspace!=null){
					// 关闭工作空间
					workspace.close();
					// 释放该对象所占用的资源
					workspace.dispose();
				}
	    } 
	    /**
		 * @功能：iobjectjava 关闭地图资源
		 * @param 
		 * @return void
		 * @author liqiankun
		 * @时间：20190524
		 * @修改记录：
		 */
	    public static void closeMapResource(Recordset recordset_10,Recordset recordset_7,Recordset recordset_12,DatasetVector datasetVector_new,
	    		DatasetVector datasetVector_address,DatasetVector datasetVector_10,DatasetVector datasetVector_7,  
	    		Datasource datasource,DatasourceConnectionInfo datasourceconnection,Workspace workspace){
	    		
	    	  	if(recordset_10!=null){
			    	recordset_10.close();
			    	recordset_10.dispose();
				}
		        if(recordset_7!=null){
		        	recordset_7.close();
		        	recordset_7.dispose();
				}
		        if(datasetVector_new!=null){
					datasetVector_new.close();
				}
		        if(datasetVector_address!=null){
		        	datasetVector_address.close();
				}
		        
		        if(datasetVector_10!=null){
		        	datasetVector_10.close();
				}
				if(datasetVector_7!=null){
					datasetVector_7.close();
				}
			    if(datasource!=null){
					datasource.close();
				}
			    if(datasourceconnection!=null){
					datasourceconnection.dispose();
				}
				if(workspace!=null){
					// 关闭工作空间
					workspace.close();
					// 释放该对象所占用的资源
					workspace.dispose();
				}
	    } 
	  //获取数据集对应数据库中的表名
		public static String getDataSetTableName(String dataSetName){
			Workspace workspace = new Workspace();
			// 定义数据源连接信息，假设以下所有数据源设置都存在
		    DatasourceConnectionInfo dsconnection = new  DatasourceConnectionInfo();
			//进行数据源的连接
			Datasource datasource =MapUtils.connectDataSource(workspace,dsconnection);
			DatasetVector datasetVector = (DatasetVector)datasource.getDatasets().get(dataSetName);
			String tableName = datasetVector.getTableName();
			MapUtils.closeMapResource(null,null,null,null,null,null,datasetVector,datasource,dsconnection,workspace);
			return tableName;
		}
	
}

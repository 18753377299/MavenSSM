//package com.picc.riskctrl.typhoonearlywarning.service.spring;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.math.BigDecimal;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.Timestamp;
//import java.text.MessageFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Locale;
//import java.util.Map;
//import java.util.ResourceBundle;
//
//import org.apache.commons.lang.StringUtils;
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFFont;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Font;
//import org.apache.poi.ss.usermodel.HorizontalAlignment;
//import org.apache.poi.ss.util.CellRangeAddress;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//
//import com.picc.riskctrl.common.RiskControlConst;
//import com.picc.riskctrl.common.mail.RiskControlMailSender;
//import com.picc.riskctrl.common.schema.RiskMapInsured;
//import com.picc.riskctrl.common.schema.RiskMapMain;
//import com.picc.riskctrl.common.schema.RiskWarningPush;
//import com.picc.riskctrl.common.schema.WzCorporeLs;
//import com.picc.riskctrl.common.schema.WzCorporeLsId;
//import com.picc.riskctrl.common.schema.WzTFYblj;
//import com.picc.riskctrl.common.util.FTPUtil;
//import com.picc.riskctrl.common.util.MapUtils;
//import com.picc.riskctrl.map.service.facade.MapWarnService;
//import com.picc.riskctrl.map.vo.RiskMapAddressField;
//import com.picc.riskctrl.map.vo.WzTFYbljVo;
//import com.picc.riskctrl.map.vo.response.TfWordRespVo;
//import com.picc.riskctrl.typhoonearlywarning.model.TyphoonHistoryPath;
//import com.picc.riskctrl.typhoonearlywarning.model.TyphoonLatestInfo;
//import com.picc.riskctrl.typhoonearlywarning.service.facade.TyphoonEarlyWarningService;
//import com.picc.riskctrl.typhoonearlywarning.vo.RiskWarningPushVo;
//import com.picc.riskctrl.typhoonearlywarning.vo.TyphoonEarlyWarningPolicyInfo;
//import com.picc.riskctrl.typhoonearlywarning.vo.TyphoonHistoryPathVo;
//import com.picc.riskctrl.typhoonearlywarning.vo.TyphoonLatestInfoVo;
//import com.sinosoft.dmsdriver.model.PrpDcompany;
//import com.sinosoft.dmsdriver.service.common.DictPage;
//import com.sinosoft.dmsdriver.service.server.PageService;
//import com.sinosoft.dmsdriver.util.SystemCode;
//import com.supermap.data.CursorType;
//import com.supermap.data.DatasetVector;
//import com.supermap.data.Datasource;
//import com.supermap.data.DatasourceConnectionInfo;
//import com.supermap.data.GeoRegion;
//import com.supermap.data.Geometry;
//import com.supermap.data.LinkItem;
//import com.supermap.data.LinkItems;
//import com.supermap.data.QueryParameter;
//import com.supermap.data.Recordset;
//import com.supermap.data.SpatialQueryMode;
//import com.supermap.data.Workspace;
//
//import ins.framework.cache.CacheManager;
//import ins.framework.cache.CacheService;
//import ins.framework.dao.database.DatabaseDao;
//import ins.framework.dao.database.support.QueryRule;
//import ins.framework.lang.Datas;
//import ins.framework.rpc.annotation.Rpc;
//import ins.framework.web.AjaxResult;
//
//@Rpc
//@Service(value = "TyphoonEarlyWarningService")
//public class TyphoonEarlyWarningServiceSpringImpl implements TyphoonEarlyWarningService {
//
//	@Autowired
//	private DatabaseDao databaseDao;
//	
//	@Autowired
//	private JdbcTemplate slaveJdbcTemplate;
//
//	@Autowired
//	private MapWarnService mapWarnService;
//	@Autowired
//	RiskControlMailSender riskControlMailSender;
//
//	public static final Logger LOGGER = LoggerFactory.getLogger("RISKCONTROLLOG");
//
//	private static final CacheService cacheManager = CacheManager.getInstance(SystemCode.DMS);
//	// 点数据集名称
//	private static final String riskmap_address_point="RISKMAP_ADDRESS_POINT";
//	// 面数据集名称
//	private static final String dataSet_new="TF_New";
//	/*邮件内容组织*/
//	private static  String  emailContent ="",serverName="";
//	static {
//		ResourceBundle filePath = ResourceBundle.getBundle("config.map", Locale.getDefault());
//		 // 定义数据源连接信息，假设以下所有数据源设置都存在
//		emailContent = filePath.getString("emailContent");
//		serverName =filePath.getString("serverName"); 
//	}
//	
//	
//	/**
//	 * @author 周东旭
//	 * @功能 获取归宿机构翻译
//	 */
//	public String queryComCodeCName(String comCode) {
//		String comCodeCName = "";
//
//		String key = cacheManager.generateCacheKey("upperqueryComCodeCName", comCode);
//
//		Object object = cacheManager.getCache(key);
//
//		if (object == null) {
//			DictPage dictPage = this.getSubCompany(comCode, 1, 10);
//			List<PrpDcompany> list = dictPage.getData();
//			if (list.size() == 1) {
//				for (PrpDcompany prpDcompany : list) {
//					comCodeCName = prpDcompany.getComShortName();
//				}
//			} else {
//				comCodeCName = comCode;
//			}
//			cacheManager.putCache(key, comCodeCName);
//		} else {
//			comCodeCName = (String) object;
//		}
//
//		return comCodeCName;
//	}
//
//	/**
//	 * 添加原因： 获取某机构代码的所有下级机构代码
//	 */
//	public DictPage getSubCompany(String comCode, int pageNo, int pageSize) {
//		String key = cacheManager.generateCacheKey("getAllSubCompany", comCode, pageNo, pageSize);
//		Object object = cacheManager.getCache(key);
//		DictPage page = null;
//		if (object == null) {
//			try {
//				// prpDcompanys =
//				// DictAPIService.getAllSubCompany(SvrCodeConst.prpins, comCode);
//				// RLIUBIN2013061702 数据字典用户系统接口整合 新增queryType参数，用于逻辑判断，查什么样的数据
//				// String queryType
//				// 1.UPPER 查该机构的直接上级机构
//				// 2.SUB 查该机构的直接下级机构
//				// 3.ALLSUB 查该机构的所有下级机构
//				// 4. 传空字符 查该机构本身数据
//				page = PageService.getCompanys(RiskControlConst.SYSTEMCODE, comCode, "", "", "", "", pageNo,
//						pageSize);
//			} catch (Exception e) {
//				LOGGER.info("数据字典接口异常：" + e.getMessage(), e);
//				e.printStackTrace();
//				// 无该机构代码
//				page.setPageCount(0L);
//				page.setTotalRecordCount(0L);
//				throw new RuntimeException("数据字典接口异常:" + e);
//			}
//			cacheManager.putCache(key, page);
//		} else {
//			page = (DictPage) object;
//		}
//		return page;
//	}
//
//	/**
//	 * @功能 进行预警推送
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> *
//	 * @throws Exception @日期： 2019-05-31
//	 * @修改
//	 */
//	public void  handleWarnPushInfo(){
//		 try {
//			/* 查询当前台风编号，可能包含多条*/
//			 List<TyphoonLatestInfoVo> typhoonLatestInfoVos =  this.queryLatestTyphoon(); 
//			 /*存储台风编号和相应的comcode对应的标的信息*/
//			 Map<Map<String, String>,  List<TyphoonEarlyWarningPolicyInfo>>  mapTF= new HashMap<Map<String,String>, List<TyphoonEarlyWarningPolicyInfo>>();
//			 List<RiskWarningPushVo>  riskWarningPushList = new ArrayList<RiskWarningPushVo>();
//			 if(typhoonLatestInfoVos!=null&&typhoonLatestInfoVos.size()>0){
//				 for(TyphoonLatestInfoVo typhoonLatestInfoVo:typhoonLatestInfoVos){
//					 // 查询阈值信息
//					 List<RiskWarningPushVo> riskWarningPushVoList =  this.queryTyphoonEarlyWarningInfo(typhoonLatestInfoVo);
//					 
//					 if(riskWarningPushVoList!=null&&riskWarningPushVoList.size()>0){
//						 // 查询出最新时间信息
//						 TyphoonHistoryPathVo typhoonHistoryPathVo = this.queryTyphoonHistoryPath(typhoonLatestInfoVo);
//						 // 查询出最新时间点的台风预警信息集合
//						 List<WzTFYbljVo> wzTFYbljVoList =this.queryTyphoonEarlyWarningPath(typhoonHistoryPathVo);
//						 // 对阈值进行循环
//						 for(RiskWarningPushVo riskWarningPushVo:riskWarningPushVoList){
//							 // 查询出通过预警半径和中心点的所有的标的信息点
//							 Map<String, List<WzCorporeLs>> map = this.queryTyphoonEarlyWarningPathItems(wzTFYbljVoList,riskWarningPushVo);
//							 //组织的标的清单
//							 List<TyphoonEarlyWarningPolicyInfo> policyInfoList =this.gatherTyphoonWarnCorporeItem(map,riskWarningPushVo);
//							 // 作为联合主键的map值 
//							 Map< String, String> keyMap = new HashMap<String, String>();
//							 if(policyInfoList!=null&&policyInfoList.size()>0){
//								 keyMap.put(riskWarningPushVo.getTFBH(), riskWarningPushVo.getComCode());
//								 mapTF.put(keyMap, policyInfoList);
//								//整理预警推送阈值集合
//								 riskWarningPushList.add(riskWarningPushVo);
//							 }
//							 
//						 }
//						 
//					 }
//					 
//				 }
//			 }
//			 //生成word文档
//			 Map<Map<String, String>, String> mapWord = this.makeMapWarnWord(mapTF,riskWarningPushList);
//			 // 发送邮件
//			 AjaxResult ajaxResult = this.organizeEmailInfo(mapWord,riskWarningPushList);
//			 // 处理完之后，将三个表进行标志位更新
//			 if(ajaxResult.getStatus()==1){
//				 this.updateTfTableFlag();
//			 }
//		 	 
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		 System.out.println("===success==");
//	}
//	/**
//	 * @功能 word文档路径和信息组织
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> *
//	 * @throws Exception @日期： 2019-05-31
//	 * @修改
//	 */
//	public Map<Map<String, String>, String> makeMapWarnWord(Map<Map<String, String>,  List<TyphoonEarlyWarningPolicyInfo>>  mapTF,
//			List<RiskWarningPushVo>  riskWarningPushList){
//		Map<Map<String, String>, String> mapWord = new HashMap<Map<String, String>, String>();
//		try {
////			String path = this.getClass().getResource("/").getPath();
////			//模板路径
////			StringBuffer basePath = new StringBuffer();
////			basePath.append(path);
////			basePath.append("com/picc/riskctrl/typhoonearlywarning/template");
////			String  sourceWordPath = "F:/riskcontrol/riskcontrol_file/downloadFile/eee.docx";
//			
//			if(riskWarningPushList!=null&&riskWarningPushList.size()>0){
//				for(RiskWarningPushVo riskWarningPushVo:riskWarningPushList){
//					Map<String, String> map =new HashMap<String,String>();
//					map.put(riskWarningPushVo.getTFBH(), riskWarningPushVo.getComCode());
//					List<TyphoonEarlyWarningPolicyInfo>  policyInfoList =mapTF.get(map);
//					if(policyInfoList!=null&&policyInfoList.size()>0){
//						/*调用的模板的路径*/
////						basePath.append("/mapwarnPush.docx");
////						String  sourceWordPath = basePath.toString();
//						//生成的word文档的名称
//						String comCode = "",tfbh="";
//						if(StringUtils.isNotBlank(riskWarningPushVo.getComCode())){
//							comCode =riskWarningPushVo.getComCode().trim();
//						}
//						if(StringUtils.isNotBlank(riskWarningPushVo.getTFBH())){
//							tfbh=riskWarningPushVo.getTFBH().trim();
//						}
////						String outWordPath ="/downloadFile/mapwarnPush_"+comCode+"_"+tfbh+".docx";
//						String outExcelPath ="/downloadExcel/mapwarnPush_"+comCode+"_"+tfbh+".xls";
////						String outWordName =riskWarningPushVo.getTFBH()+riskWarningPushVo.getComCode()+".docx";
////						AjaxResult ajaxResult = this.generateWord(sourceWordPath,outWordPath,policyInfoList);
//						AjaxResult ajaxResult = this.generateExcel(outExcelPath,policyInfoList);
//						if(ajaxResult.getStatus()==1){
//							// 组织返回路径
//							mapWord.put(map, outExcelPath);
//						}
//					}
//					
//				}
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return mapWord;
//	}
//	/**
//	 * @功能 生成excel文件
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> *
//	 * @throws Exception @日期： 2019-06-03
//	 * @修改
//	 */
//	public AjaxResult generateExcel(String outExcelPath,List<TyphoonEarlyWarningPolicyInfo>  policyInfoList){
////	public AjaxResult generateExcel(String outExcelPath){
//		System.out.println("========generate excel start==============");
//		AjaxResult ajaxResult  =new AjaxResult();
//		
//		HSSFWorkbook wkb = new HSSFWorkbook();
//		//建立新的sheet对象（excel的表单）
//		HSSFSheet sheet=wkb.createSheet("导出清单信息统计表");
//		//在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
//		HSSFRow row1=sheet.createRow(0);
//		// 设置行高
//		row1.setHeightInPoints(25);
//		//创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
//		HSSFCell cell=row1.createCell(0);
//		//设置居中
//		HSSFCellStyle style = wkb.createCellStyle();
//		//替换poi版本3.1.1为3.16，修改调用居中为HorizontalAlignment.CENTER add by wangwenjie 2019/7/22
//		style.setAlignment(HorizontalAlignment.CENTER);
////	    style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
//	    // 设置字体
//        HSSFFont font = wkb.createFont();
//        //设置字体大小
//        font.setFontHeightInPoints((short)11);
//		//字体加粗
//		//替换poi版本3.1.1为3.16，修改调用加粗为font.setBold(true) add by wangwenjie 2019/7/22
//		font.setBold(true);
////      font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
//        //在样式用应用设置的字体;  
//         style.setFont(font);
//		//设置单元格内容
//		cell.setCellValue("预警推送导出清单信息表");
//		cell.setCellStyle(style);
//		//创建单元格并设置单元格内容
//		// 设置导出模板的字体颜色
//		HSSFCellStyle styleColor = wkb.createCellStyle();
//		// 设置字体
//        HSSFFont fontColor = wkb.createFont();
//		//替换poi版本3.1.1为3.16，Font.COLOR_RED add by wangwenjie 2019/7/22
//		fontColor.setColor(Font.COLOR_RED);
////        fontColor.setColor(HSSFColor.RED.index);
//        styleColor.setFont(fontColor);
//		//合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
//		sheet.addMergedRegion(new CellRangeAddress(0,0,0,11));
//		//设置第二行
//		HSSFRow row12=sheet.createRow(1);
//		// 设置行高
//		row12.setHeightInPoints(25);
//		//创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
//		HSSFCell cell12=row12.createCell(0);
//		cell12.setCellValue("温馨提示：1、红色标题为必录项 2.被保险人类型取值为个人、团体");
//		cell12.setCellStyle(styleColor);
//		sheet.addMergedRegion(new CellRangeAddress(1,1,0,11));
//		
//		String [] tableHeader ={"地球坐标系经度","地球坐标系纬度","火星坐标系经度","火星坐标系纬度","保险财产地址","投保单号","保单号","归属机构","产品代码","被保险人姓名/企业名称","被保险人代码","被保险人类型"};
//		//在sheet里创建第三行
//		HSSFRow row2=sheet.createRow(2);
//		for(int i=0;i<tableHeader.length;i++){
//			HSSFCell cell0=row2.createCell(i);
//			cell0.setCellValue(tableHeader[i]);
//			if(i==0||i==1||i==2||i==3||i==5||i==6||i==7||i==8){
//				cell0.setCellStyle(styleColor);
//			}
////			cell0.setCellStyle(styleColor);
//			if(i==4||i==9){
//				sheet.setColumnWidth(cell0.getColumnIndex(), 256 * 60);
//			}else {
//				sheet.setColumnWidth(cell0.getColumnIndex(), 256 * 20);
//			}
//		}
//		
//		int j=0;
//		for(TyphoonEarlyWarningPolicyInfo policyInfo:policyInfoList){
////			System.out.println(mapMainVoList.get(i)[0]+":"+mapMainVoList.get(i)[1]);
//			HSSFRow row=sheet.createRow(j + 3);
////			row.createCell(0).setCellValue(policyInfo.getTyphoonSerialNo());
//			row.createCell(0).setCellValue(policyInfo.getPointx_2000()+"");
//			row.createCell(1).setCellValue(policyInfo.getPointy_2000()+"");
//			row.createCell(2).setCellValue(policyInfo.getPointx_02()+"");
//			row.createCell(3).setCellValue(policyInfo.getPointy_02()+"");  
//			row.createCell(4).setCellValue(policyInfo.getAddressName());
//			row.createCell(5).setCellValue(policyInfo.getProposalNo());
//			row.createCell(6).setCellValue(policyInfo.getPolicyNo());
//			row.createCell(7).setCellValue(policyInfo.getComCode());
//			row.createCell(8).setCellValue(policyInfo.getRiskCode());
//			
//			row.createCell(9).setCellValue(policyInfo.getInsuredName());
//			row.createCell(10).setCellValue(policyInfo.getInsuredCode());
////			row.createCell(11).setCellValue(policyInfo.getInsuredType());
//			String  insuredName =""; 
//			if("1".equals(policyInfo.getInsuredType())){
//				insuredName = "个人";
//			}else if("2".equals(policyInfo.getInsuredType())){
//				insuredName = "团体";
//			}
//			row.createCell(11).setCellValue(insuredName);
//			j++;
//		}
//		OutputStream output =null;
//		FTPUtil ftp = new FTPUtil();
////		 存储到公共上传目录下
////		输出Excel文件
//		try {
//    		output =ftp.uploadFile(outExcelPath);
//			ajaxResult.setData(outExcelPath);
//			wkb.write(output);
//			output.flush();
//			ajaxResult.setStatus(1);
//			ajaxResult.setStatusText("生成excel标的清单成功");
//		} catch (Exception e) {
//			e.printStackTrace();
//			ajaxResult.setStatus(2);
//			ajaxResult.setStatusText("生成excel标的清单失败");
//		}finally {
//            if (output != null) {
//                try {
//                	output.close();
//                } catch (Exception e2) {
//                	LOGGER.error(e2.getMessage(), e2);
//                }
//            }
//            if(ftp!=null) {
//	            try {
//					ftp.close();
//				} catch (IOException e) {
//					LOGGER.info("关闭ftp异常：" + e.getMessage() ,e);
//				}
//            }
//		}
//		System.out.println("========generate excel end==============");
//		return ajaxResult;
//	} 
//	/**
//	 * @功能 生成word文档
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> *
//	 * @throws Exception @日期： 2019-05-31
//	 * @修改
//	 */
////	public AjaxResult generateWord(String  sourceWordPath,String outWordPath,
////				List<TyphoonEarlyWarningPolicyInfo>  policyInfoList){
////		AjaxResult ajaxResult =new AjaxResult();
////		FTPUtil ftp = new FTPUtil();
////		Map<String, Object> map =new HashMap<String, Object>();
//////		String sourceFile = "F:/riskcontrol/riskcontrol_file/eee.docx";
//////		String destFile="F:/riskcontrol/riskcontrol_file/out_template.docx";
////		try {
////			// 组织表头信息
////			String [] tableHeader ={"台风编号","标的经度","标的纬度","地址","险种","标的总保额","标的理赔次数"};
////			TextRenderData  [] textRenderData  = new TextRenderData[tableHeader.length];
////			List<RowRenderData> rowRenderDataList=new ArrayList<RowRenderData>();
////			for(int i=0;i<tableHeader.length;i++){
////				// 设置 表头样式
////				TextRenderData data = new TextRenderData("FF8C00", tableHeader[i]);
////				textRenderData[i] = data;
////			}
////			// 生成文档头
////			RowRenderData header = RowRenderData.build(textRenderData);
////			for(TyphoonEarlyWarningPolicyInfo policyInfo:policyInfoList){
////				// 组织list数据
////				String [] data =  new String [tableHeader.length];
////				data[0] = policyInfo.getTyphoonSerialNo();
////				data[1] =policyInfo.getPointx_2000()+"";
////				data[2] = policyInfo.getPointy_2000()+"";
////				data[3] = policyInfo.getAddressName();
////				data[4] = policyInfo.getRiskCode();
////				data[5] = policyInfo.getSumAmount()+"";
////				data[6] = policyInfo.getOccurNumber()+"";
////				RowRenderData row = RowRenderData.build(data);
////				rowRenderDataList.add(row);
////			}
////			 
////			MiniTableRenderData miniTableRenderData = new MiniTableRenderData(header, rowRenderDataList);
////			map.put("title", "标题");
////			map.put("table", miniTableRenderData);
////			//核心API采用了极简设计，只需要一行代码
////			XWPFTemplate template = XWPFTemplate.compile(sourceWordPath).render(map);
//////			FileOutputStream out = new FileOutputStream(outWordPath);
////			OutputStream out = ftp.uploadFile(outWordPath);
////			template.write(out);
////			out.flush();
////			out.close();
////			template.close();
////			ftp.close();
////			ajaxResult.setStatus(1);
////			ajaxResult.setStatusText("生成word文档成功！");
////		} catch (Exception e) {
////			e.printStackTrace();
////			ajaxResult.setStatus(2);
////			ajaxResult.setStatusText("生成word失败！");
////		}
////		return  ajaxResult;
////	}
//	/**
//	 * @功能 组织发送邮件的信息
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> 
//	 * @throws Exception 
//	 * @日期： 2019-05-31
//	 * @修改
//	 */
//	public AjaxResult organizeEmailInfo(Map<Map<String, String>, String> mapWord,List<RiskWarningPushVo> riskWarningPushList){
//		 AjaxResult ajaxResult =new AjaxResult();
//		 System.out.println("========send Email start==============");
//		 if(riskWarningPushList!=null&&riskWarningPushList.size()>0){
//			 for(RiskWarningPushVo riskWarningPushVo:riskWarningPushList){
//				 String   toMail ="",subject="",content="";
//				 String [] filepaths=new String[1];
//				 // 组织key值信息
//				 Map<String, String> map = new HashMap<String, String>();
//				 map.put(riskWarningPushVo.getTFBH(), riskWarningPushVo.getComCode());
//				 String targetpath = mapWord.get(map);
//				 if(targetpath!=null){
//					try {
//				 		 toMail =riskWarningPushVo.getEmail();
//				 		 // 组织发送邮件的文本信息  (接口)
//						 content= this.establishContentInfo(riskWarningPushVo);
//						 subject = "台风预警推送详情";
//						 filepaths[0] = serverName+targetpath;
//						 // 进行邮件发送
//						 riskControlMailSender.sendMailContainsAnnex(toMail, subject, content, filepaths);
//						 ajaxResult.setStatus(1);
//						 ajaxResult.setStatusText("邮件发送成功！");
//					} catch (Exception e) {
//						e.printStackTrace();
//						 ajaxResult.setStatus(2);
//						 ajaxResult.setStatusText("邮件发送失败！");
//					}
//					 
//				 }
//			 }
//		 }
//		 System.out.println("========send Email end==============");
//		//邮箱地址： liqiankun@pt.picc.com.cn,
////		String   toMail ="1733856225@qq.com",subject="小小标题",content="内容是啥呢";
//////		String [] filepaths={"F:/riskcontrol/riskcontrol_file/downloadFile/mapwarnPush_450000_201822.docx"};
////		String [] filepaths={"http://10.10.2.241:5001/downloadFile/mapwarnPush_450000_201822.docx"};
////		
////		riskControlMailSender.sendMailContainsAnnex(toMail, subject, content, filepaths);
//		 
//		return ajaxResult;
//	}
//	/**
//	 * @功能 组织邮件内容信息
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> 
//	 * @throws Exception 
//	 * @日期： 20190603
//	 * @修改
//	 */
//	public  String establishContentInfo(RiskWarningPushVo riskWarningPushVo){
//		 // 定义数据源连接信息，假设以下所有数据源设置都存在
//		String tfm ="",jd="",wd="",zxqy="",zxfs="",content="";
//		Date tfDate = new Date();
//		//查询出台风编号信息
//		TyphoonLatestInfoVo typhoonLatestInfoVo = this.querySingleTyphoon(riskWarningPushVo.getTFBH());
//		if(typhoonLatestInfoVo!=null){
//			tfm = typhoonLatestInfoVo.getTfm();
//			tfDate = typhoonLatestInfoVo.getTfDate();
//			SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 ");
//			String dateFormat =format.format(tfDate);
//			TyphoonHistoryPathVo typhoonHistoryPathVo= this.queryTyphoonHistoryPath(typhoonLatestInfoVo);
//			TfWordRespVo  tfWordRespVo =  this.queryTFYJInfo(typhoonHistoryPathVo);
//			// 持续时间
//			Integer hour = ((Long)((tfWordRespVo.getRqsj().getTime()-typhoonHistoryPathVo.getRqsj().getTime())/3600/1000)).intValue();
//			jd = typhoonHistoryPathVo.getJd();
//			wd=  typhoonHistoryPathVo.getWd();
//			zxfs = tfWordRespVo.getZxfs();
//			zxqy = tfWordRespVo.getZxqy();
//			content = MessageFormat.format(emailContent, tfm, dateFormat,hour,jd,wd,zxfs,zxqy);
//			System.out.println(content);
//		}
//		return content;
//	}
//	/**
//	 * @功能 组织邮件内容信息
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> 
//	 * @throws ParseException 
//	 * @throws Exception 
//	 * @日期： 20190603
//	 * @修改
//	 */
//	public  TfWordRespVo queryTFYJInfo(TyphoonHistoryPathVo typhoonHistoryPathVo) {
//		TfWordRespVo tfWordRespVo =new TfWordRespVo();
//		Connection conn = null;
//		PreparedStatement stat = null;
//		ResultSet rs = null;
//		String zxqy="",zxfs="",rqsjYJ="";
//		if(typhoonHistoryPathVo!=null){
//			Date rqsj = typhoonHistoryPathVo.getRqsj();
//			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			String rqsjFormat =format.format(rqsj);
//			String sql = "select min(ZXQY+0) as ZXQY ,max(ZXFS+0) as ZXFS, max(RQSJ) as RQSJ from WZ_TFYBLJ  where TFBH= '"+typhoonHistoryPathVo.getTfbh()
//					+"' and YBSJ = to_date('"+rqsjFormat+"','yyyy-mm-dd hh24:mi:ss') and TM='中国'";
//			try {
//				conn = slaveJdbcTemplate.getDataSource().getConnection();
//				stat = conn.prepareStatement(sql);
//				rs = stat.executeQuery();
//				for(;rs.next();) {
//					zxqy = rs.getString(1);
//					zxfs = rs.getString(2);
//					rqsjYJ= rs.getString(3);
//				}
//				tfWordRespVo.setZxqy(zxqy);
//				tfWordRespVo.setZxfs(zxfs);
//				tfWordRespVo.setRqsj(format.parse(rqsjYJ));
//			} catch (Exception e) {
//				LOGGER.info("查询异常：" + e.getMessage() ,e);
//				e.printStackTrace();
//				throw new RuntimeException("查询异常:"+e);
//			}finally {
//				releaseResources(stat, conn, rs);
//			}
//		}
//		
//		return tfWordRespVo;
//	}
//	
//	/**
//	 * @功能 查询当前台风编号，可能包含多条
//	 * 查询出为经过处理的 台风编号
//	 * @author 陈磊
//	 * @return List<RiskWarningPushVo> * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public List<TyphoonLatestInfoVo> queryLatestTyphoon() {
//		List<TyphoonLatestInfoVo> typhoonLatestInfoVos = new ArrayList<TyphoonLatestInfoVo>(0);
//		QueryRule queryRule = QueryRule.getInstance();
//		try {
//			queryRule.addEqual("isActive", "1");
//			// 该条件是未经过处理的台风编号
//			String sql = "substr(ISUSE,0,1) ='1'";
//			queryRule.addSql(sql);
//			List<TyphoonLatestInfo> typhoonLatestInfos = databaseDao.findAll(TyphoonLatestInfo.class, queryRule);
//			if (typhoonLatestInfos != null && typhoonLatestInfos.size() > 0) {
//				for (TyphoonLatestInfo typhoonLatestInfo : typhoonLatestInfos) {
//					TyphoonLatestInfoVo typhoonLatestInfoVo = new TyphoonLatestInfoVo();
//					Datas.copySimpleObjectToTargetFromSource(typhoonLatestInfoVo, typhoonLatestInfo);
//					typhoonLatestInfoVos.add(typhoonLatestInfoVo);
//				}
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return typhoonLatestInfoVos;
//	}
//	
//	/**
//	 * @功能 查询当前台风编号的信息
//	 * 查询出为经过处理的 台风编号
//	 * @author liqiankun
//	 * @throws Exception @日期： 20190603
//	 * @修改
//	 */
//	public TyphoonLatestInfoVo querySingleTyphoon(String tfbh) {
//		TyphoonLatestInfoVo typhoonLatestInfoVo  = new TyphoonLatestInfoVo();
//		
//		QueryRule queryRule = QueryRule.getInstance();
//		try {
//			if(StringUtils.isNotBlank(tfbh)){
//				queryRule.addEqual("tfbh", tfbh.trim());
//			}
//			TyphoonLatestInfo  typhoonLatestInfo = databaseDao.findUnique(TyphoonLatestInfo.class, queryRule);
//			if(typhoonLatestInfo!=null){
//				Datas.copySimpleObjectToTargetFromSource(typhoonLatestInfoVo, typhoonLatestInfo);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return typhoonLatestInfoVo;
//	}
//	/**
//	 * @功能 查询台风预警阈值信息,可能包含多条
//	 * @author 陈磊
//	 * @param typhoonLatestInfoVo 当前台风信息
//	 * @return RiskWarningPushVo * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public List<RiskWarningPushVo> queryTyphoonEarlyWarningInfo(TyphoonLatestInfoVo typhoonLatestInfoVo) {
//		List<RiskWarningPushVo> riskWarningPushVoList = new ArrayList<RiskWarningPushVo>();
//		try {
//			if (typhoonLatestInfoVo != null && StringUtils.isNotBlank(typhoonLatestInfoVo.getTfbh())) {
//				QueryRule queryRule = QueryRule.getInstance();
//				queryRule.addEqual("TFBH", typhoonLatestInfoVo.getTfbh());
////			// 该条件是未经过处理的台风编号
////			String sql = "substr(ISUSE,0,1) ='1'";
////			queryRule.addSql(sql);
//				List<RiskWarningPush> riskWarningPushs = databaseDao.findAll(RiskWarningPush.class, queryRule);
//				if (riskWarningPushs != null && riskWarningPushs.size() > 0) {
//					for (RiskWarningPush riskWarningPush : riskWarningPushs) {
//						RiskWarningPushVo riskWarningPushVo = new RiskWarningPushVo();
//						Datas.copySimpleObjectToTargetFromSource(riskWarningPushVo, riskWarningPush);
//						riskWarningPushVoList.add(riskWarningPushVo);
//					}
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return riskWarningPushVoList;
//	}
//
//	/**
//	 * @功能 查询当前台风历史路径最新时间
//	 * @author 陈磊
//	 * @return TyphoonHistoryPathVo * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public TyphoonHistoryPathVo queryTyphoonHistoryPath(TyphoonLatestInfoVo typhoonLatestInfoVo) {
//		TyphoonHistoryPathVo typhoonHistoryPathVo = new TyphoonHistoryPathVo();
//		try {
//			if (typhoonLatestInfoVo != null && StringUtils.isNotBlank(typhoonLatestInfoVo.getTfbh())) {
//				List<TyphoonHistoryPath> typhoonHistoryPaths = new ArrayList<TyphoonHistoryPath>(0);
//				QueryRule queryRule = QueryRule.getInstance();
//				queryRule.addEqual("tfbh", typhoonLatestInfoVo.getTfbh().trim());
//				queryRule.addDescOrder("rqsj");
//				// 该条件是未经过处理的台风编号
//				String sql = "substr(ISUSE,0,1) ='1'";
//				queryRule.addSql(sql);
//				typhoonHistoryPaths = databaseDao.findTop(TyphoonHistoryPath.class, queryRule, 1);
//				if (typhoonHistoryPaths != null && typhoonHistoryPaths.size() == 1 && typhoonHistoryPaths.get(0) != null) {
//					Datas.copySimpleObjectToTargetFromSource(typhoonHistoryPathVo, typhoonHistoryPaths.get(0));
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return typhoonHistoryPathVo;
//	}
//
//	/**
//	 * @功能 查询当前台风预警路径信息
//	 * @author 陈磊
//	 * @return TyphoonLatestInfoVo * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public List<WzTFYbljVo> queryTyphoonEarlyWarningPath(TyphoonHistoryPathVo typhoonHistoryPathVo) {
//		List<WzTFYbljVo> voList = new ArrayList<WzTFYbljVo>(0);
//		List<WzTFYblj> list = new ArrayList<WzTFYblj>(0);
//		try {
//			if (typhoonHistoryPathVo != null) {
//				QueryRule queryRule = QueryRule.getInstance();
//				queryRule.addEqual("id.tfbh", typhoonHistoryPathVo.getTfbh().trim());
//				queryRule.addEqual("id.ybsj", typhoonHistoryPathVo.getRqsj());
//				queryRule.addEqual("id.tm", "中国");
//				queryRule.addDescOrder("id.ybsj");
//				// 该条件是未经过处理的台风编号
//				String sql = "substr(ISUSE,0,1) ='1'";
//				queryRule.addSql(sql);
//				list = databaseDao.findAll(WzTFYblj.class, queryRule);
//				for (WzTFYblj tfyblj : list) {
//					if (tfyblj != null) {
//						WzTFYbljVo vo = new WzTFYbljVo();
//						Datas.copySimpleObjectToTargetFromSource(vo, tfyblj);
//						voList.add(vo);
//					}
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return voList;
//	}
//
//	/**
//	 * @功能 根据台风预报路径及预警条件获取受影响标的信息，可能包含多条
//	 * @author 陈磊
//	 * @param                   List<WzTFYbljVo> 台风预报路径
//	 * @param RiskWarningPushVo 台风预警阈值
//	 * @return List<RiskMapAddress> 预报受影响标的信息 * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public Map<String, List<WzCorporeLs>> queryTyphoonEarlyWarningPathItems(List<WzTFYbljVo> tfybljVoList,
//			RiskWarningPushVo riskWarningPushVo) {
//		Map<String, List<WzCorporeLs>> map = new HashMap<String, List<WzCorporeLs>>();
//		try {
//			if (tfybljVoList != null&&tfybljVoList.size()>0&& riskWarningPushVo != null) {
//				/* 调用 李乾坤 接口返回受影响标的信息 */
//				map = this.generateMapByObjectJava(tfybljVoList, riskWarningPushVo.getRadius().toString(),
//						riskWarningPushVo.getComCode());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return map;
//	}
//
//	/**
//	 * @功能 根据受影响标的信息查询保单信息·
//	 * @author 陈磊
//	 * @param List<WzCorporeLs> 台风预报路径受灾标的
//	 * @return List<RiskMapMain> 预报受影响标的的保单信息 *
//	 * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public List<RiskMapMain> queryTyphoonEarlyWarningPloicy(List<WzCorporeLs> wzCorporeLsList) {
//		List<RiskMapMain> riskMapMainList = new ArrayList<RiskMapMain>(0);
//		// 需要判断标的的数量是否超过1000，oracle超过1000查询会出现问题
//		// 查询的是没有終保的单子
//		for (WzCorporeLs wzCorporeLs : wzCorporeLsList) {
//			List<RiskMapMain> riskMapMainListTemp = new ArrayList<RiskMapMain>(0);
//			QueryRule queryRule = QueryRule.getInstance();
//			queryRule.addEqual("ADDRESSID", wzCorporeLs.getId().getMid());
//			riskMapMainListTemp = databaseDao.findAll(RiskMapMain.class, queryRule);
//			if (riskMapMainListTemp != null && riskMapMainListTemp.size() > 0) {
//				riskMapMainList.addAll(riskMapMainListTemp);
//			}
//		}
//		return riskMapMainList;
//	}
//
//	/**
//	 * @功能 根据保单信息汇总数据·
//	 * @author 陈磊
//	 * @param riskWarningPushVo 台风预警阈值
//	 * @param  List<RiskMapMainVo> 台风预报路径受灾标的
//	 * @return List<TyphoonEarlyWarningPolicyInfo> 预警各险种保单信息汇总 * @throws
//	 *         Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public Map<String, Map<String,TyphoonEarlyWarningPolicyInfo>> gatherTyphoonEarlyWarningPloicy(
//			RiskWarningPushVo riskWarningPushVo, List<RiskMapMain> riskMapMainList) {
//		Map<String,TyphoonEarlyWarningPolicyInfo> riskCodeTyphoonEarlyWarningPolicyInfoMap = new HashMap<String,TyphoonEarlyWarningPolicyInfo>();
//		Map<String, Map<String,TyphoonEarlyWarningPolicyInfo>> comRiskCodeSumMap = new HashMap<>();
//		try {
//			String comCode = riskWarningPushVo.getComCode();
//			for (RiskMapMain riskMapMain : riskMapMainList) {
//				String riskCode = riskMapMain.getRiskCode();
//				if (riskCodeTyphoonEarlyWarningPolicyInfoMap.containsKey(riskCode)) {
//					BigDecimal sumAmount = BigDecimal.ZERO;
//					sumAmount = sumAmount.add(riskCodeTyphoonEarlyWarningPolicyInfoMap.get(riskCode).getSumAmount().add(riskMapMain.getSumAmount()));
//					riskCodeTyphoonEarlyWarningPolicyInfoMap.get(riskCode).setSumAmount(sumAmount);
//				} else {
//					TyphoonEarlyWarningPolicyInfo typhoonEarlyWarningPolicyInfo = new TyphoonEarlyWarningPolicyInfo();
//					typhoonEarlyWarningPolicyInfo.setComCode(riskWarningPushVo.getComCode());
//					typhoonEarlyWarningPolicyInfo.setTyphoonSerialNo(riskWarningPushVo.getTFBH());
//					typhoonEarlyWarningPolicyInfo.setRedius(riskWarningPushVo.getRadius());
//					typhoonEarlyWarningPolicyInfo.setRiskCode(riskCode);
//					typhoonEarlyWarningPolicyInfo.setSumAmount(riskMapMain.getSumAmount());
//					riskCodeTyphoonEarlyWarningPolicyInfoMap.put(riskCode,typhoonEarlyWarningPolicyInfo);
//				}
//			}
//			comRiskCodeSumMap.put(comCode, riskCodeTyphoonEarlyWarningPolicyInfoMap);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return comRiskCodeSumMap;
//	}
//	/**
//	 * @功能 根据标的点和阈值信息组织需要推送的影响标的清单
//	 * @author liqiankun
//	 * @param RiskMapMain 
//	 * @return long 
//	 *  Exception @日期： 2019-05-31
//	 * @修改
//	 */
//	public  List<TyphoonEarlyWarningPolicyInfo> gatherTyphoonWarnCorporeItem( Map<String, List<WzCorporeLs>> map ,
//							RiskWarningPushVo riskWarningPushVo){
////		 Map<String,List<TyphoonEarlyWarningPolicyInfo>> mapInfo =new HashMap<String, List<TyphoonEarlyWarningPolicyInfo>>();
//		 List<TyphoonEarlyWarningPolicyInfo>  policyInfoList = new ArrayList<TyphoonEarlyWarningPolicyInfo>();
//		 //获取该机构下的标的信息 
//		 try {
//			 // 标的点信息
//			List<WzCorporeLs> wzCorporeLsList = map.get(riskWarningPushVo.getComCode());
//			
//			 for(WzCorporeLs wzCorporeLs :wzCorporeLsList){
//				 List<TyphoonEarlyWarningPolicyInfo> policyInfos = this.queryRiskMapMain(wzCorporeLs,riskWarningPushVo);
//				 if(policyInfos!=null&&policyInfos.size()>0){
//					 policyInfoList.addAll(policyInfos); 
//				 }
//			 }
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return policyInfoList;
//	}
//	/**
//	 * @功能 根据标的清单统计所有的保单以及关联的信息
//	 * @author liqiankun
//	 * @param RiskMapMain 
//	 * @return long 
//	 *  Exception @日期： 20190610
//	 * @修改
//	 */
//	public TyphoonEarlyWarningPolicyInfo queryRiskMapMainAndInsured(WzCorporeLs wzCorporeLs,
//			RiskWarningPushVo riskWarningPushVo){
//		TyphoonEarlyWarningPolicyInfo typhoonEarlyWarningPolicyInfo =null;
//		try {
//			QueryRule queryRule = QueryRule.getInstance();
//			// 获取当前时间
//			Timestamp date = new Timestamp(System.currentTimeMillis());
//			SimpleDateFormat dateformatter=new SimpleDateFormat("yyyy-MM-dd");
//			SimpleDateFormat hourformatter=new SimpleDateFormat("HH");
//			String nowdate = dateformatter.format(date);
//			Integer nowtime = Integer.parseInt(hourformatter.format(date));
//			// 尚未終保的单子
//	    	String sqlQuery =" (endDate>to_date('" +nowdate+ "','yyyy-MM-dd HH:mi:ss')"
//				+ " or (endDate=to_date('" +nowdate+ "','yyyy-MM-dd HH:mi:ss') and endHour >=" +nowtime+ "))";
//			
//			String sql =" and (endDate>to_date('" +nowdate+ "','yyyy-MM-dd HH:mi:ss')"
//					+ " or (endDate=to_date('" +nowdate+ "','yyyy-MM-dd HH:mi:ss') and endHour >=" +nowtime+ "))";
//			
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		return typhoonEarlyWarningPolicyInfo;
//		
//	}
//	
//	/**
//	 * @功能 根据标的清单统计所有的保单
//	 * @author liqiankun
//	 * @param RiskMapMain 
//	 * @return long 
//	 *  Exception @日期： 2019-05-31
//	 * @修改
//	 */
//	public List<TyphoonEarlyWarningPolicyInfo> queryRiskMapMain(WzCorporeLs wzCorporeLs,
//			RiskWarningPushVo riskWarningPushVo){
////		TyphoonEarlyWarningPolicyInfo typhoonEarlyWarningPolicyInfo =null;
//		List<TyphoonEarlyWarningPolicyInfo> policyInfos = new ArrayList<TyphoonEarlyWarningPolicyInfo>();
//		try {
//			/*阈值设定 :保额、理赔次数*/
//			BigDecimal sumAmount = riskWarningPushVo.getForehead();
//			Integer occurrences  = riskWarningPushVo.getOccurrences();
//			
//			QueryRule queryRule = QueryRule.getInstance();
//			List<RiskMapMain> riskMapMainListTemp = new ArrayList<RiskMapMain>();
//			String mid = wzCorporeLs.getId().getMid()+"";
//			// 获取当前时间
//			Timestamp date = new Timestamp(System.currentTimeMillis());
//			SimpleDateFormat dateformatter=new SimpleDateFormat("yyyy-MM-dd");
//			SimpleDateFormat hourformatter=new SimpleDateFormat("HH");
//			String nowdate = dateformatter.format(date);
//			Integer nowtime = Integer.parseInt(hourformatter.format(date));
//			// 尚未終保的单子
//	    	String sqlQuery =" (endDate>to_date('" +nowdate+ "','yyyy-MM-dd HH:mi:ss')"
//				+ " or (endDate=to_date('" +nowdate+ "','yyyy-MM-dd HH:mi:ss') and endHour >=" +nowtime+ "))";
//			
//			String sql =" and (endDate>to_date('" +nowdate+ "','yyyy-MM-dd HH:mi:ss')"
//					+ " or (endDate=to_date('" +nowdate+ "','yyyy-MM-dd HH:mi:ss') and endHour >=" +nowtime+ "))";
//			String sqlRule="select * from  RISKMAP_MAIN where  1=1 ";
//			/**编号*/
//			if(StringUtils.isNotBlank(mid)){
//				queryRule.addEqual("id.addressID", Integer.parseInt(mid));
//				sqlRule= sqlRule+" and ADDRESSID="+Integer.parseInt(mid);
//			}
//			/**险种 */
//			if(StringUtils.isNotBlank(riskWarningPushVo.getRiskCode())){
//				queryRule.addEqual("riskCode", riskWarningPushVo.getRiskCode());
//				sqlRule=sqlRule+ " and riskCode='"+riskWarningPushVo.getRiskCode()+"'";
//			}
//			sqlRule =sqlRule +sql;
//			queryRule.addSql(sqlQuery);
//			/*获取该标的下的所有的符合条件的单子*/
////			riskMapMainListTemp =this.slaveJdbcTemplate.query(sqlRule, new Object[]{}, new BeanPropertyRowMapper<RiskMapMain>(RiskMapMain.class));
//			riskMapMainListTemp = databaseDao.findAll(RiskMapMain.class, queryRule);
//			//
////			TyphoonEarlyWarningPolicyInfo policyInfo = this.countPolicyInfo(riskMapMainListTemp);
//			// 统计单个保单的信息
//			List<TyphoonEarlyWarningPolicyInfo> policyInfoList = this.countSinglePolicyInfo(riskMapMainListTemp);
//			if(policyInfoList!=null&&policyInfoList.size()>0){
//				for(TyphoonEarlyWarningPolicyInfo policyInfo:policyInfoList){
//					if(policyInfo!=null&&policyInfo.getSumAmount()!=null&&policyInfo.getOccurNumber()!=null&&
//							policyInfo.getSumAmount().compareTo(sumAmount)>0&&policyInfo.getOccurNumber()>occurrences){
//						TyphoonEarlyWarningPolicyInfo typhoonEarlyWarningPolicyInfo =null;
//						List<RiskMapInsured> riskMapInsuredList = policyInfo.getRiskMapInsuredList();
//						if(riskMapInsuredList!=null&&riskMapInsuredList.size()>0){
//							for(RiskMapInsured riskMapInsured:riskMapInsuredList){
//								typhoonEarlyWarningPolicyInfo = new TyphoonEarlyWarningPolicyInfo();
////								typhoonEarlyWarningPolicyInfo.setTyphoonSerialNo(wzCorporeLs.getId().getTfbh());
//								typhoonEarlyWarningPolicyInfo.setTyphoonSerialNo(riskWarningPushVo.getTFBH());
//								typhoonEarlyWarningPolicyInfo.setPointx_02(wzCorporeLs.getPointx_02());
//								typhoonEarlyWarningPolicyInfo.setPointy_02(wzCorporeLs.getPointy_02());
//								typhoonEarlyWarningPolicyInfo.setPointx_2000(wzCorporeLs.getPointx_2000());
//								typhoonEarlyWarningPolicyInfo.setPointy_2000(wzCorporeLs.getPointy_2000());
//								typhoonEarlyWarningPolicyInfo.setAddressName(wzCorporeLs.getAddressName());
//								typhoonEarlyWarningPolicyInfo.setProposalNo(policyInfo.getProposalNo());
//								typhoonEarlyWarningPolicyInfo.setPolicyNo(policyInfo.getPolicyNo());
//								typhoonEarlyWarningPolicyInfo.setComCode(policyInfo.getComCode());
//								typhoonEarlyWarningPolicyInfo.setRiskCode(policyInfo.getRiskCode());
//								typhoonEarlyWarningPolicyInfo.setSumAmount(policyInfo.getSumAmount());
//								typhoonEarlyWarningPolicyInfo.setOccurNumber(policyInfo.getOccurNumber());
//								
//								typhoonEarlyWarningPolicyInfo.setInsuredName(riskMapInsured.getInsuredName());
//								typhoonEarlyWarningPolicyInfo.setInsuredCode(riskMapInsured.getInsuredCode());
//								typhoonEarlyWarningPolicyInfo.setInsuredType(riskMapInsured.getInsuredType());
//								
//								policyInfos.add(typhoonEarlyWarningPolicyInfo);
//							}
//						}
//						
//					}
//				}
//			}
//			
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		} catch (DataAccessException e) {
//			e.printStackTrace();
//		}
//		return policyInfos;
//	}
//	/**
//	 * @功能 统计保单信息包含总保额和理赔次数,单个保单
//	 * @author liqiankun
//	 * @param List<RiskMapMain> 
//	 * @return TyphoonEarlyWarningPolicyInfo 
//	 *  Exception @日期： 2019-05-31
//	 * @修改
//	 */
//	public List<TyphoonEarlyWarningPolicyInfo> countSinglePolicyInfo(List<RiskMapMain> riskMapMainList){
//		List<TyphoonEarlyWarningPolicyInfo> policyInfoList=new ArrayList<TyphoonEarlyWarningPolicyInfo>();
//		
//		try {
//			if(riskMapMainList!=null&&riskMapMainList.size()>0){
//				for(RiskMapMain riskMapMain:riskMapMainList){
//					System.out.println("======"+riskMapMain.getSumAmount());
//					
//					BigDecimal sumAmount = BigDecimal.ZERO;
//					long occurNumber = 0;
//					
//					TyphoonEarlyWarningPolicyInfo typhoonEarlyWarningPolicyInfo = null;
//					if(riskMapMain.getSumAmount()!=null&&StringUtils.isNotBlank(riskMapMain.getSumAmount()+"")){
//						sumAmount =sumAmount.add(riskMapMain.getSumAmount());
//					}else {
//						sumAmount =sumAmount.add(new BigDecimal("0"));
//					}
//					/*查询出理赔出现次数*/
//					long count = this.getPrplclaimCount(riskMapMain);
//					occurNumber+=count;
//					
//					typhoonEarlyWarningPolicyInfo = new TyphoonEarlyWarningPolicyInfo();
//					typhoonEarlyWarningPolicyInfo.setSumAmount(sumAmount);
//					typhoonEarlyWarningPolicyInfo.setOccurNumber(((Long)occurNumber).intValue());
//					typhoonEarlyWarningPolicyInfo.setProposalNo(riskMapMain.getId().getProposalNo());
//					typhoonEarlyWarningPolicyInfo.setPolicyNo(riskMapMain.getPolicyNo());
//					typhoonEarlyWarningPolicyInfo.setComCode(riskMapMain.getComCode());
//					typhoonEarlyWarningPolicyInfo.setRiskCode(riskMapMain.getRiskCode());
//					
//					List<RiskMapInsured>  riskMapInsuredList= this.queryRiskMapInsuredList(riskMapMain);
//					if(riskMapInsuredList!=null&&riskMapInsuredList.size()>0){
//						typhoonEarlyWarningPolicyInfo.setRiskMapInsuredList(riskMapInsuredList);
//					}
//					policyInfoList.add(typhoonEarlyWarningPolicyInfo);
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return policyInfoList;
//	}
//	/**
//	 * @功能 查询对应保单的RiskMapInsured 表中信息
//	 * @author liqiankun
//	 * @param String
//	 * @return List<RiskMapInsured> 
//	 *  Exception @日期： 20190610
//	 * @修改
//	 */
//	public List<RiskMapInsured> queryRiskMapInsuredList(RiskMapMain riskMapMain){
//		List<RiskMapInsured> riskMapInsuredList = new ArrayList<RiskMapInsured>();
//		QueryRule  queryRule =QueryRule.getInstance();
//		if(riskMapMain!=null&&riskMapMain.getId()!=null){
//			String  proposalNo = riskMapMain.getId().getProposalNo();
//			Integer addressID = riskMapMain.getId().getAddressID();
//			if(StringUtils.isNotBlank(proposalNo)&&addressID!=null){
//				queryRule.addEqual("id.proposalNo", proposalNo);
//				queryRule.addEqual("id.addressID", addressID);
//				riskMapInsuredList = databaseDao.findAll(RiskMapInsured.class, queryRule);
//			}
//		}
//		
//		return  riskMapInsuredList;
//	}
//	/**
//	 * @功能 统计保单信息包含总保额和理赔次数
//	 * @author liqiankun
//	 * @param List<RiskMapMain> 
//	 * @return TyphoonEarlyWarningPolicyInfo 
//	 *  Exception @日期： 2019-05-31
//	 * @修改
//	 */
//	public TyphoonEarlyWarningPolicyInfo countPolicyInfo(List<RiskMapMain> riskMapMainList){
//		TyphoonEarlyWarningPolicyInfo typhoonEarlyWarningPolicyInfo = null;
//		try {
//			if(riskMapMainList!=null&&riskMapMainList.size()>0){
//				BigDecimal sumAmount = BigDecimal.ZERO;
//				long occurNumber = 0;
//				for(RiskMapMain riskMapMain:riskMapMainList){
//					System.out.println("======"+riskMapMain.getSumAmount());
//					if(riskMapMain.getSumAmount()!=null&&StringUtils.isNotBlank(riskMapMain.getSumAmount()+"")){
//						sumAmount =sumAmount.add(riskMapMain.getSumAmount());
//					}else {
//						sumAmount =sumAmount.add(new BigDecimal("0"));
//					}
//					/*查询出理赔出现次数*/
//					long count = this.getPrplclaimCount(riskMapMain);
//					occurNumber+=count;
//				}
//				typhoonEarlyWarningPolicyInfo = new TyphoonEarlyWarningPolicyInfo();
//				typhoonEarlyWarningPolicyInfo.setSumAmount(sumAmount);
//				typhoonEarlyWarningPolicyInfo.setOccurNumber(((Long)occurNumber).intValue());
//				
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return typhoonEarlyWarningPolicyInfo;
//	}
//	
//	/**
//	 * @功能 根据保单信息查询出理赔出现次数
//	 * @author liqiankun
//	 * @param RiskMapMain 
//	 * @return long 
//	 *  Exception @日期： 2019-05-31
//	 * @修改
//	 */
//	public  long  getPrplclaimCount(RiskMapMain riskMapMain){
//		long totalCount = 0L;
//		Connection conn = null;
//		PreparedStatement stat = null;
//		ResultSet rs = null;
//		String  policyNo = riskMapMain.getPolicyNo();
//		if(StringUtils.isNotBlank(policyNo)){
//			String sql =" select count(*) from PRPLCLAIM where POLICYNO=?";
//			try {
//				conn = slaveJdbcTemplate.getDataSource().getConnection();
//				stat = conn.prepareStatement(sql);
//				stat.setString(1, policyNo);
//				rs = stat.executeQuery();
//				for(;rs.next();) {
//					totalCount = rs.getLong(1);
//				}
//			} catch (SQLException e) {
//				LOGGER.info("查询异常：" + e.getMessage() ,e);
//				e.printStackTrace();
//				throw new RuntimeException("查询异常:"+e);
//			}finally {
//				releaseResources(stat, conn, rs);
//			}
//		}
//		
//		return totalCount;
//	}
//	/**
//	 * @功能 将表中的标志位进行更新
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> * 
//	 * @throws Exception 
//	 * @日期： 2019-05-31
//	 * @修改
//	 */
//	public void updateTfTableFlag(){
//		// 更新信息
//		try {
//			String update_TFLSLJ ="update WZ_TFLSLJ set ISUSE=replace(ISUSE,substr(ISUSE,0,1),'2')  where substr(ISUSE,0,1) ='1'";
//			String update_TFBH ="update WZ_TFBH set ISUSE=replace(ISUSE,substr(ISUSE,0,1),'2')  where substr(ISUSE,0,1) ='1'";
//			String update_TFYJLJ ="update WZ_TFYBLJ set ISUSE=replace(ISUSE,substr(ISUSE,0,1),'2')  where substr(ISUSE,0,1) ='1'";
//			// 执行完之后，修改表中标志位
//			this.slaveJdbcTemplate.update(update_TFLSLJ);
//			this.slaveJdbcTemplate.update(update_TFYJLJ);
//			this.slaveJdbcTemplate.update(update_TFBH);
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	/**
//	 * @功能：iobjectjava 预警推送信息组织
//	 * @param 
//	 * @return map
//	 * @author liqiankun
//	 * @时间：20190523
//	 * @修改记录：
//	 */
//	public Map<String , List<WzCorporeLs>> generateMapByObjectJava(List<WzTFYbljVo> wzTFYbljList,String radius,String comCode){
//		 Map<String , List<WzCorporeLs>> map = new HashMap<String, List<WzCorporeLs>>();
//		 /*获取编号信息*/
//		 if(wzTFYbljList!=null&&wzTFYbljList.size()>0){
//			 String tfbh =wzTFYbljList.get(0).getTfbh();
//			 Workspace workspace = new Workspace();
//			 // 定义数据源连接信息，假设以下所有数据源设置都存在
//		     DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
//			 //进行数据源的连接
//			 Datasource datasource =MapUtils.connectDataSource(workspace,datasourceconnection);
//			 
//			 if(datasource!=null){
//					// 新建一个面数据集，用于存储新的整合的面数据信息
//					WzTFYbljVo wzTFYblj =new WzTFYbljVo();
//					DatasetVector datasetVector_new = MapUtils.createDataSet(dataSet_new,datasource,wzTFYblj);
//					// 点矢量集
//					DatasetVector datasetVector_address = (DatasetVector)datasource.getDatasets().get("RISKMAP_ADDRESS");
//					// 新增的数据集
//					Recordset recordset_new = datasetVector_new.getRecordset(false, CursorType.DYNAMIC);
//					
//					List<Object> objList = (List)(Object)wzTFYbljList;
//					 /*需要整合面数据的集合*/
//					List<Geometry> geoList = MapUtils.getGeometryList(objList,radius,"YJ");
//					
//					// 创建新的点数据集
//					RiskMapAddressField riskMapAddressField =new RiskMapAddressField();
//					DatasetVector riskmap_address_new = MapUtils.createDataSet(riskmap_address_point,datasource,riskMapAddressField);
//					/*查询省市面积的过滤条件*/
//					String filter = "";
//					String cityCode = comCode.substring(0, 4)+"00";
//					String proCode = comCode.substring(0, 2)+"0000";
//					Map<String,Object> mapNew =  new HashMap<String, Object>();
//					/*对geometry中list数据进行融合,并添加到新的数据集中*/
//					MapUtils.unionGeometryList(geoList,recordset_new,mapNew);
//					// 获取需要插入标的表中的省市县的信息集合
//					if(datasetVector_new.getRecordCount()>0){
//						List<WzCorporeLs> wzCorporeLsList = new ArrayList<WzCorporeLs>();
//						if("2102,3302,3502,3702,4403".indexOf(comCode.substring(0, 4)) > -1){
//							//直接去市的数据，这是计划单联市的面数据
//							filter = "CITYADCODE ='"+cityCode+"'";
//							DatasetVector datasetVector_p = (DatasetVector)datasource.getDatasets().get("china_city");
//							map = getMapWzCorporeLs(datasourceconnection,riskmap_address_new,datasetVector_address,datasetVector_p,datasetVector_new,tfbh,comCode,filter);
//							if(datasetVector_p!=null){
//								datasetVector_p.close();
//							}
//						}else if("21,33,35,37,44".indexOf(comCode.substring(0, 2)) > -1){
//							if("21".equals(comCode.substring(0, 2))){
//								cityCode = "210200";
//							}else if("33".equals(comCode.substring(0, 2))){
//								cityCode = "330200";
//							}else if("35".equals(comCode.substring(0, 2))){
//								cityCode = "350200";
//							}else if("37".equals(comCode.substring(0, 2))){
//								cityCode = "370200";
//							}else if("44".equals(comCode.substring(0, 2))){
//								cityCode = "440300";
//							}
//							// 去除计划单联市的面数据的省数据，查的是市的那个面
//							filter = "CITYADCODE !='"+cityCode+"' and PROADCODE='"+proCode+"'";
//							//直接查询出省的面数据信息
//							DatasetVector datasetVector_p = (DatasetVector)datasource.getDatasets().get("china_city");
//							map = getMapWzCorporeLs(datasourceconnection,riskmap_address_new,datasetVector_address,datasetVector_p,datasetVector_new,tfbh,comCode,filter);
//							if(datasetVector_p!=null){
//								datasetVector_p.close();
//							}
//						}else {
//							filter = "AdminCode ='"+proCode+"'";
//							//直接查询出省的面数据信息
//							DatasetVector datasetVector_p = (DatasetVector)datasource.getDatasets().get("china_province");
//							map = getMapWzCorporeLs(datasourceconnection,riskmap_address_new,datasetVector_address,datasetVector_p,datasetVector_new,tfbh,comCode,filter);
//							if(datasetVector_p!=null){
//								datasetVector_p.close();
//							}
//						}
//												 
//					}
//					// 关闭资源
//				    MapUtils.closeMapResource(recordset_new,null,datasetVector_new,null,datasetVector_address,riskmap_address_new,
//				    		datasource,datasourceconnection,workspace);
//			       
//					
//			}
//			 
//
//		 }
//		 		
//		 return map;
//	}
//	/**
//	 * @功能：iobjectjava 通过预警的面数据分省整合成map信息
//	 * @param RiskMapInsuredModify
//	 * @return AjaxResult
//	 * @author liqiankun
//	 * @时间：20190523
//	 * @修改记录：
//	 */
//	public Map<String ,List<WzCorporeLs>>  getMapWzCorporeLs(DatasourceConnectionInfo datasourceconnection,DatasetVector riskmap_address_new,DatasetVector datasetVector_address,
//			DatasetVector datasetVector,DatasetVector datasetVector_new,String tfbh,String comCode,String filter){
//		Map<String,List<WzCorporeLs>>  map = new HashMap<String, List<WzCorporeLs>>();
//		
//		QueryParameter parameter_p = new QueryParameter();
//		parameter_p.setSpatialQueryObject(datasetVector_new);
//		parameter_p.setSpatialQueryMode(SpatialQueryMode.INTERSECT);
//		parameter_p.setAttributeFilter(filter);
//		//查询省市面信息和新增的面数据相交的信息
//		Recordset queryRecordset = datasetVector.query(parameter_p);
//		System.out.println("======查出的省份的个数======:"+queryRecordset.getRecordCount());
//		//通过点数据集和新增面数据集的交集的有效的点的个数
//		parameter_p.setAttributeFilter("VALIDSTATUS=1");
//		Recordset queryRecordset_address_intersect = datasetVector_address.query(parameter_p);
//		//清除矢量数据集中的所有记录,清空成功之后，添加新的查询出来的记录
//		boolean riskmapFlag =riskmap_address_new.truncate();
//		boolean appendFlag  =false;
//		if(riskmapFlag){
//			appendFlag = riskmap_address_new.append(queryRecordset_address_intersect);
//		}
//		System.out.println("======查出的相交的标的的个数======:"+queryRecordset_address_intersect.getRecordCount());
//		
//		List<WzCorporeLs> wzCorporeLsList=new ArrayList<WzCorporeLs>();
//		// 省份或者市进行循环
//		while (!queryRecordset.isEOF()){
//			String adminCode = "";
//			if("2102,3302,3502,3702,4403".indexOf(comCode.substring(0, 4)) > -1){
//				adminCode = queryRecordset.getString("CITYADCODE");
//			}else if("21,33,35,37,44".indexOf(comCode.substring(0, 2)) > -1) {
//				adminCode = queryRecordset.getString("CITYADCODE");
//			}else {
//				adminCode = queryRecordset.getString("AdminCode");
//			}
//			String  cityName = queryRecordset.getString("Name");
//			
//			GeoRegion geoRegion=(GeoRegion)queryRecordset.getGeometry();
//			QueryParameter parameterP_address = new QueryParameter();
//			parameterP_address.setSpatialQueryObject(geoRegion);
//			parameterP_address.setAttributeFilter("VALIDSTATUS=1");
//			parameterP_address.setSpatialQueryMode(SpatialQueryMode.INTERSECT);
//			// 进行关联查询，过滤掉无效的标的点
//			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
//		    String tfdate = sdf.format(new Date());
//		    String filterWarn = " RISKMAP_MAIN.ENDDATE>to_date('" +tfdate+ "','yyyy-MM-dd hh24:mi:ss')";
//			LinkItem linkItem = new LinkItem();
//	        linkItem.setConnectionInfo(datasourceconnection);
//	        linkItem.setForeignKeys(new String[] {"ADDRESSID"});//主数据集的外键
//	        linkItem.setPrimaryKeys(new String[] {"ADDRESSID"});//关联数据集的主键
//	        linkItem.setForeignTable("RISKMAP_MAIN");//关联数据集
//	        linkItem.setLinkFields(new String[] {"RISKMAP_MAIN.ADDRESSID","RISKMAP_MAIN.PROPOSALNO","RISKMAP_MAIN.ENDDATE"});//关联数据集的字段
////				        linkItem.setLinkFilter("SMID < 10");//关联数据集的过滤条件 
//	        linkItem.setLinkFilter(filterWarn);
//	        linkItem.setName("connect");
////				        System.out.println("关联信息为：" + linkItem.toString());
//	        // 构造一个 LinkItems 对象并将 linkItem 添加到其中
//	        LinkItems linkItems = new LinkItems();
//	        linkItems.add(linkItem);
//	        parameterP_address.setLinkItems(linkItems);
//
//			Recordset queryRecordset_address = riskmap_address_new.query(parameterP_address);
//			System.out.println(adminCode+"=====省的标的个数======="+queryRecordset_address.getRecordCount());
//			
//			while (!queryRecordset_address.isEOF()){
//				String  proposalNo = queryRecordset_address.getFieldValue("PROPOSALNO")+"";
//				// 用于判断单子是否有效（是否已经終保）StringUtils.isNotBlank(proposalNo)
//				if(StringUtils.isNotBlank(proposalNo)&&!"null".equals(proposalNo.trim())){
//					Integer  smid = Integer.parseInt(queryRecordset_address.getFieldValue("ADDRESSID")+"");
//					String addressName = queryRecordset_address.getFieldValue("ADDRESSNAME")+"";
//					BigDecimal pointx_2000 = new BigDecimal(queryRecordset_address.getString("POINTX_2000"));
//					BigDecimal pointy_2000 = new BigDecimal(queryRecordset_address.getString("POINTY_2000"));
//					BigDecimal pointx_02 = new BigDecimal(queryRecordset_address.getString("POINTX_02"));
//					BigDecimal pointy_02 = new BigDecimal(queryRecordset_address.getString("POINTY_02"));
//					
//					WzCorporeLs wzCorporeLs =new WzCorporeLs();
//					WzCorporeLsId  wzCorporeLsId = new WzCorporeLsId();
//					wzCorporeLsId.setTfbh(tfbh);
//					wzCorporeLsId.setMid(smid);
//					wzCorporeLs.setId(wzCorporeLsId);
//					
//					wzCorporeLs.setCityCode(adminCode);
//					wzCorporeLs.setAddressName(addressName);
//					wzCorporeLs.setCityName(cityName);
//					
//					wzCorporeLs.setPointx_2000(pointx_2000);
//					wzCorporeLs.setPointy_2000(pointy_2000);
//					wzCorporeLs.setPointx_02(pointx_02);
//					wzCorporeLs.setPointy_02(pointy_02);
//					
//					wzCorporeLsList.add(wzCorporeLs);
//				}
//				
//				queryRecordset_address.moveNext();
//			}
//			queryRecordset.moveNext();
//		}
//		map.put(comCode, wzCorporeLsList);
//		System.out.println(comCode+"=====标的总数为======="+wzCorporeLsList.size());
//		return map;
//	}
//	/**
//	 * 释放数据库资源，包括数据库连接和PrepareStatement对象*/
//	
//	private void releaseResources(Statement stat, Connection conn, ResultSet rs) {
//		try {
//			if(rs!=null){
//			rs.close();
//			}
//		} catch (SQLException e) {
//			LOGGER.info("关闭异常：" + e.getMessage() ,e);
//			throw new RuntimeException("关闭异常:"+e);
//		}
//		try {
//			if (stat != null) {
//				stat.close();
//			}
//		} catch (SQLException e) {
//			LOGGER.info("关闭异常：" + e.getMessage() ,e);
//			throw new RuntimeException("关闭异常:"+e);
//		}
//		try {
//			if (conn != null) {
//				conn.close();
//			}
//		} catch (SQLException e) {
//			LOGGER.info("关闭异常：" + e.getMessage() ,e);
//			throw new RuntimeException("关闭异常:"+e);
//		}
//	}
//
//	
//	
//}

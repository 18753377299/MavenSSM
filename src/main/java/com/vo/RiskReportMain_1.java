package com.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
* @author  作者 E-mail:   liqiankun
* @date 创建时间：2019年7月16日 上午9:42:48
* @version 1.0 
* @parameter 
* @since  风控报告主表
* @return  */
@Data
public class RiskReportMain_1 implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** 风险档案编号
	 *  清分为null
	 * */
	private String riskFileNo;
	/** 险类代码 */
	private String classCode;
	/** 产品代码 */
	private String riskCode;
	/** 险类代码 */
	private String classCName;
	/** 产品代码 */
	private String riskCName;
	/** 归属机构 */
	private String comCode;
	/** 归属机构中文 */
	private String comCodeCName;
	/** 存货比例   decimal(5,2) 如存货比例为50.12%，则传50.12 * */
	private BigDecimal stockRate;
	/** 风控报告模板 
	 	001:专职版
	 	002:兼职版
	 	004:机器损失险
	 	005:营业中断险 
	 	006: 火灾风险排查专业版
	 	007： 火灾风险排查简化版
	 	* */
	private String riskModel;
	/** 被保险人类型
	 	1  个人
	 	2  团体
	 	*  */
	private String insuredType;
	/** 被保险人代码 */
	private String insuredCode;
	/** 被保险人姓名/企业名称 */
	private String insuredName;
	/** 保险财产地址(省) */
	private String addressProvince;
	/** 保险财产地址(省)代码 */
	private String addressProvinceCode;
	/** 保险财产地址(市) */
	private String addressCity;
	/** 保险财产地址(市)代码 */
	private String addressCityCode;
	/** 保险财产地址(区或县) */
	private String addressCounty;
	/** 保险财产地址(区或县)代码 */
	private String addressCountyCode;
	/** 省市县组合地址 */
	private String address;
	/** 保险财产地址(详细) */
	private String addressDetail;
	/** 邮政编码 */
	private String postCode;
	/** 国民经济行业代码 */
	private String businessSource;
	/** 国民经济行业代码 */
	private String businessSourceCName;
	/** 行业类型代码 */
	private String businessClass;
	/** 被保险人/企业性质 
	  	1 行政事业单位及人民团体  
	  	2 国有企业  
	  	3 民营企业  
	  	4 外商投资企业（除台资）
	  	5 台资企业 */
	private String unitNature;
	/** 以往承保情况 
	 	1 客户首次投保
	 	2 续保
	 	3 由其他公司转保*/
	private String underwriteStatus;
	/** 操作人员代码 */
	private String operatorCode;
	/** 操作人员中文 */
	private String operator;
	/** 操作人员集团统一工号 */
	private String operatorCodeUni;
	/** 三年内历史赔付损失记录
	 	1 有                             
	 	0 无*/
	private String historyLoseFlag;
	/** 总保险金额 */
	private BigDecimal sumAmount;
	/** 提交核保时间 
	 * 清分为null*/
	private Date undwrtSubmitDate;
	/** 核保标志 
	 *  清分传0
	 * */
	private String underwriteFlag;
	/** 核保通过时间 
	 * 清分为null*/
	private Date underwriteDate;
	/** 核保人员代码 
	 * 清分为null*/
	private String underwriteCode;
	/** 核保人员姓名 
	 * 清分为null*/
	private String underwriteName;
	/** 查勘机构 */
	private String explorecomCode;
	/** 查勘机构中文 */
	private String explorecomCodeCName;
	/** 查勘人 */
	private String explorer;
	/** 查勘人中文 */
	private String explorerCName;
	/** 查勘人集团统一工号 */
	private String explorerUni;
	/** 查勘日期 */
	private Date exploreDate;
	/** 制作日期 */
	private Date madeDate;
	/** 查勘类别 
	    1 初勘
		2 复勘*/
	private String exploreType;
	/** 初勘风控报告编号 */
	private String lastRiskFileNo;
	/** 投保附加险情况
	    A 扩展盗窃、抢劫责任  
	    B 扩展供应中断责任 
	    C 扩展露天堆放责任*/
	private String addRisk;
	/** 信息补充 */
	private String explain;
	/** 单次事故可能最大损失 */
	private BigDecimal onceAccidentLosest;
	/** 危险单位数量 */
	private Integer riskUnitNumber;
	/** 危险单位划分说明 */
	private String riskUnitExplain;
	/** 损失率 */
	private BigDecimal loseRate;
	/** 突出风险 
	 * 清分为null*/
	private String highlightRisk;
	/** 综合得分 
	 * 清分为null*/
	private BigDecimal score;
	/*** 现场评估补充说明 *or***风险隐患说明*/
	private String supplementAppraisal;
	/** 风控建议 
	 * 清分为null*/
	private String riskSuggest;
	/** 其他意见 */
	private String othSuggest;
	/** 补充说明 * or **防灾防损建议*/
	private String addMessage;
	/** 照片编号 */
	private String archivesNo;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;
	/** 请求端标志 0-web 1-Android 2-IOS */
	private String mobileFlag;
	/** 所使用的权重表id 
	 * 清分为null*/
	private Integer utiWeightId;
	/** 所使用的流程实例id 
	 * 清分为null*/
	private String executionId;
	private String pointx_2000;
	private String pointy_2000;
	private String pointx_02;
	private String pointy_02;
	private String repulsesugggest;
	/**风险评估等级*/
	private String valuation;
	/** 保单号 */
	private String policyNo;
	/** 投保单号 */
	private String proposalNo;
//	/** 风控地址信息 */
//	private List<RiskReportAddress> riskReportAddressList = new ArrayList<RiskReportAddress>(0);
//	/**风控机器损失险风险评估*/
//	private List<RiskReportMachine> riskReportMachineList = new ArrayList<RiskReportMachine>(0);
//	/**风控营业中断险风险评估*/
//	private List<RiskReportCloBusiness> riskReportCloBusinessList = new ArrayList<RiskReportCloBusiness>(0);
//	/** 风控历史损失 */
//	private List<RiskReportClaim> riskReportClaimList = new ArrayList<RiskReportClaim>(0);
//	/** 风控建筑 */
//	private List<RiskReportConstruct> riskReportConstructList = new ArrayList<RiskReportConstruct>(0);
//	/** 风控占用性质 */
//	private List<RiskReportOccupation> riskReportOccupationList = new ArrayList<RiskReportOccupation>(0);
//	/** 风控保护措施 */
//	private List<RiskReportProtection> riskReportProtectionList = new ArrayList<RiskReportProtection>(0);
//	/** 风控环境 */
//	private List<RiskReportEnvironment> riskReportEnvironmentList = new ArrayList<RiskReportEnvironment>(0);
//	/** 风控附加扩展盗窃、抢劫责任 */
//	private List<RiskReportTheft> riskReportTheftList = new ArrayList<RiskReportTheft>(0);
//	/** 风控附加扩展供应中断责任 */
//	private List<RiskReportInterrupt> riskReportInterruptList = new ArrayList<RiskReportInterrupt>(0);
//	/** 风控风险值 */
//	private List<RiskReportAssess> riskReportAssessList = new ArrayList<RiskReportAssess>(0);
//	/** 风控建筑详细信息 */
//	private List<RiskReportConstructInfo> riskReportConstructInfoList = new ArrayList<RiskReportConstructInfo>(0);
//	/** 风控附加扩展露天堆放 */
//	private List<RiskReportAirStorage> riskReportAirStorageList = new ArrayList<RiskReportAirStorage>(0);
//	/** 影像资料 */
//	private List<RiskReportPicture> riskReportPictureList = new ArrayList<RiskReportPicture>(0);
	/**风控火灾风险排查*/
	private List<RiskReportFireDanger_1> riskReportFireDangerList = new ArrayList<RiskReportFireDanger_1>(0);
	
	
	
	
}

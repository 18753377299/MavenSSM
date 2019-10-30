//package com.picc.riskctrl.typhoonearlywarning.service.facade;
//
//import java.util.List;
//import java.util.Map;
//
//import com.picc.riskctrl.common.schema.RiskMapInsured;
//import com.picc.riskctrl.common.schema.RiskMapMain;
//import com.picc.riskctrl.common.schema.WzCorporeLs;
//import com.picc.riskctrl.common.schema.vo.RiskMapMainVo;
//import com.picc.riskctrl.map.vo.WzTFYbljVo;
//import com.picc.riskctrl.typhoonearlywarning.vo.RiskWarningPushVo;
//import com.picc.riskctrl.typhoonearlywarning.vo.TFYBLJVo;
//import com.picc.riskctrl.typhoonearlywarning.vo.TyphoonEarlyWarningPolicyInfo;
//import com.picc.riskctrl.typhoonearlywarning.vo.TyphoonHistoryPathVo;
//import com.picc.riskctrl.typhoonearlywarning.vo.TyphoonLatestInfoVo;
//
//import ins.framework.rpc.annotation.Rpc;
//import ins.framework.web.AjaxResult;
//
//@Rpc
//public interface TyphoonEarlyWarningService {
//
//	/**
//	 * 根据机构代码查询代码名称
//	 */
//	public String queryComCodeCName(String comCode);
//
//	/**
//	 * @功能 查询台风预警阈值信息,可能包含多条
//	 * @author 陈磊
//	 * @return RiskWarningPushVo * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public List<RiskWarningPushVo> queryTyphoonEarlyWarningInfo(TyphoonLatestInfoVo typhoonLatestInfoVo);
//
//	/**
//	 * @功能 查询当前台风编号
//	 * @author 陈磊
//	 * @return TyphoonLatestInfoVo * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public List<TyphoonLatestInfoVo> queryLatestTyphoon();
//
//	/**
//	 * @功能 查询当前台风历史路径最新信息更新时间
//	 * @author 陈磊
//	 * @return TyphoonHistoryPathVo * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public TyphoonHistoryPathVo queryTyphoonHistoryPath(TyphoonLatestInfoVo typhoonLatestInfoVo);
//
//	/**
//	 * @功能 查询当前台风预警路径信息
//	 * @author 陈磊
//	 * @return TyphoonLatestInfoVo * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public List<WzTFYbljVo> queryTyphoonEarlyWarningPath(TyphoonHistoryPathVo typhoonHistoryPathVo);
//
//	/**
//	 * @功能 根据台风预报路径及预警条件获取受影响标的信息，可能包含多条
//	 * @author 陈磊
//	 * @param                   List<WzTFYbljVo> 台风预报路径
//	 * @param RiskWarningPushVo 台风预警阈值
//	 * @return List<RiskMapAddress> 预报受影响标的信息 * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//
//	public Map<String, List<WzCorporeLs>> queryTyphoonEarlyWarningPathItems(List<WzTFYbljVo> tfybljVoList,
//			RiskWarningPushVo riskWarningPushVo);
//
//	/**
//	 * @功能 根据受影响标的信息汇总保单信息
//	 * @author 陈磊
//	 * @param List<WzCorporeLs> 台风预报路径受灾标的
//	 * @return List<RiskMapMain> 预报受影响标的的保单信息 * @throws Exception @日期： 2019-05-23
//	 * @修改
//	 */
//	public List<RiskMapMain> queryTyphoonEarlyWarningPloicy(List<WzCorporeLs> wzCorporeLsList);
//
//	/**
//	 * @功能 根据保单信息汇总数据·
//	 * @author 陈磊
//	 * @param riskWarningPushVo  台风预警阈值
//	 * @param         List<RiskMapMainVo> 台风预报路径受灾标的
//	 * @return List<TyphoonEarlyWarningPolicyInfo> 预警各险种保单信息汇总 * @throws
//	 *         Exception @日期： 2019-05-23
//	 * @修改
//	 */
//
//	public Map<String, Map<String, TyphoonEarlyWarningPolicyInfo>> gatherTyphoonEarlyWarningPloicy(RiskWarningPushVo riskWarningPushVo,
//			List<RiskMapMain> riskMapMainList);
//	/**
//	 * @功能 进行预警推送
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> *
//	 * @throws Exception @日期： 2019-05-31
//	 * @修改
//	 */
//	public void  handleWarnPushInfo();
//	/**
//	 * @功能 组织发送邮件的信息
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> 
//	 * @throws Exception 
//	 * @日期： 2019-05-31
//	 * @修改
//	 */
//	public AjaxResult organizeEmailInfo(Map<Map<String, String>, String> mapWord,List<RiskWarningPushVo> riskWarningPushList);
//	
////	public AjaxResult generateExcel(String outExcelPath);
//	/**
//	 * @功能 生成excel文件
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> *
//	 * @throws Exception @日期： 2019-06-03
//	 * @修改
//	 */
//	public AjaxResult generateExcel(String outExcelPath,List<TyphoonEarlyWarningPolicyInfo>  policyInfoList);
//	/**
//	 * @功能 组织邮件内容信息
//	 * @author liqiankun
//	 * @return List<RiskWarningPushVo> 
//	 * @throws Exception 
//	 * @日期： 20190603
//	 * @修改
//	 */
//	public  String establishContentInfo(RiskWarningPushVo riskWarningPushVo);
//	/**
//	 * @功能 查询对应保单的RiskMapInsured 表中信息
//	 * @author liqiankun
//	 * @param String
//	 * @return List<RiskMapInsured> 
//	 *  Exception @日期： 20190610
//	 * @修改
//	 */
//	public List<RiskMapInsured> queryRiskMapInsuredList(RiskMapMain riskMapMain);
//	
//}

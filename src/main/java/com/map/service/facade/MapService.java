/*package com.picc.riskctrl.map.service.facade;

import ins.framework.dao.database.support.Page;
import ins.framework.rpc.annotation.Rpc;
import ins.framework.web.AjaxResult;
import ins.platform.common.vo.Code;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.picc.riskctrl.common.model.UserInfo;
import com.picc.riskctrl.common.schema.RiskMapAddress;
import com.picc.riskctrl.common.schema.RiskMapAddressModify;
import com.picc.riskctrl.common.schema.RiskMapDisaster;
import com.picc.riskctrl.common.schema.RiskMapFloodAddress;
import com.picc.riskctrl.common.schema.RiskMapGFormManager;
import com.picc.riskctrl.common.schema.RiskMapInsured;
import com.picc.riskctrl.common.schema.RiskMapItemkind;
import com.picc.riskctrl.common.schema.RiskMapMain;
import com.picc.riskctrl.common.schema.RiskMapQFormManager;
import com.picc.riskctrl.common.schema.RiskMapTyphoonBlack;
import com.picc.riskctrl.common.schema.RiskWarningPush;
import com.picc.riskctrl.common.schema.vo.RiskMapMainVo;
import com.picc.riskctrl.common.vo.ExchRateVo;
import com.picc.riskctrl.common.vo.PrplClaimVo;
import com.picc.riskctrl.map.vo.request.LongAndLatitude;
import com.picc.riskctrl.map.vo.request.MapBound;
import com.picc.riskctrl.map.vo.request.MapQuery;
import com.picc.riskctrl.map.vo.request.MapRequestInfoVo;
import com.picc.riskctrl.map.vo.request.RiskMapFloodUpdateVo;
import com.picc.riskctrl.map.vo.request.WZ_tfbh;
import com.picc.riskctrl.map.vo.request.WZ_tfbhVo;
import com.picc.riskctrl.map.vo.response.CurrentDistrict;
import com.picc.riskctrl.map.vo.response.HttpResponseAddressReset;
import com.picc.riskctrl.map.vo.response.MapMainByAddrVo;
import com.picc.riskctrl.map.vo.response.MapQueryResponse;
import com.picc.riskctrl.map.vo.response.Province;
import com.picc.riskctrl.map.vo.response.WZ_tfbhResponse;
@Rpc
public interface MapService {
	*//**归属地查询*//*
	public  LongAndLatitude queryComeCode(String attribute);
	*//**查询地图中心点位置 *//*
	public List<RiskMapDisaster> queryDataByPageAnaly(MapRequestInfoVo mapRequestInfoVo) throws Exception;
	*//**数据库查询 *//*
	public List<RiskMapDisaster> queryDataForDb(MapRequestInfoVo mapRequestInfoVo);
	*//**API查询 *//*
	public List<RiskMapDisaster> queryDataForApi (MapRequestInfoVo mapRequestInfoVo)throws Exception;
	*//**根据关键字API查询 *//*
	public List<RiskMapDisaster> queryKeyWordForApi (MapRequestInfoVo mapRequestInfoVo) throws Exception;
	*//**综合查询 *//*
	public List<RiskMapDisaster> queryTotalData(MapRequestInfoVo mapRequestInfoVo);
	
	public List<RiskMapDisaster>  queryInfoByBound(MapBound mapBound);
	*//**搜索位置
	 * @throws IOException **//*
	public MapQueryResponse queryDetailAddress(MapQuery mapQuery) throws IOException;
	
	*//** 根据AddressId获取主表main信息*//*
	public List<RiskMapMain> queryMainByAddressId(List<Integer> ids,String sumAmount,String proposalNo,String MapCode,String nowdate,String powerSQL,String sumPay);
	*//** 根据AddressId和ProposalNo 获取主表main信息*//*
	public RiskMapMain queryMainByAddAndProNo(int addressId, String proposalNo);
	*//** 根据AddressId和proposalNo获取Insured表信息*//*
	public List<RiskMapInsured> queryInsuredByAddressId(int addressId, String proposalNo);
	*//** 根据AddressId和proposalNo获取Itemkind表信息*//*
	public List<RiskMapItemkind> queryItemkindByAddressId(int addressId, String proposalNo);
	*//**根据addressid SMX SMY 获取vo类*//*
	public List<RiskMapMainVo> queryData(List<Integer> ids,String sumAmount,String proposalNo,String MapCode,String nowdate,String powerSQL,String sumPay);
	*//**获取暴雨灾害值*//*
	public List<RiskMapMainVo> queryRainStrom(List<Integer> ids,String sumAmount,String proposalNo,String MapCode,String nowdate,String powerSQL,String GraphicsFG,String sumPay);
	public List<RiskMapMainVo> queryPolicyNumber(List<Integer> ids,String sumAmount,String proposalNo,String MapCode,String nowdate,String powerSQL,String sumPay);
	
	
	public List<RiskMapMainVo> querySwitching(List<Integer> ids,String sumAmount,String proposalNo,String MapCode,String nowdate,String powerSQL,String GraphicsFG,String sumPay);
	public String queryUserCode(String userCode);
	*//**
	 * @功能：根据地址、保单号获取标的信息
	 * @param RiskMapMainVo
	 * @return RiskMapMainVo
	 * @author 马军亮
	 * @时间：2018-09-18 
	 * @修改记录：
	 *//*
	public RiskMapMainVo queryAddress( RiskMapMainVo riskMapMainVo,String powerSQL);
	*//**
	 * @功能：修改标的经纬度
	 * @param RiskMapInsuredModify
	 * @return AjaxResult
	 * @author 马军亮
	 * @时间：2018-09-20
	 * @修改记录：
	 *//*
	public AjaxResult updateLonLat(RiskMapAddressModify riskMapAddressModify);
	*//**每日数据处理，生成riskmap各表以及地图表*//*
	public AjaxResult createData(String proposalno);
	*//**根据地址信息获取经纬度*//*
	public RiskMapAddress getLongAndLat(RiskMapAddress riskMapAddress);	
	
	*//**批量导入excel信息，保存到库中*//*
	public void saveRiskMapFloodAddress(List<RiskMapFloodAddress>  floodAddressList,UserInfo userInfo);
	

	*//**
	 * 修改一条水淹数据
	 * @param riskMapFloodUpdateVo
	 *//*
	public AjaxResult updateFloodLonLat(RiskMapFloodUpdateVo riskMapFloodUpdateVo);
	*//**
	 * 插入一条水淹数据
	 * @param riskMapFloodUpdateVo
	 *//*
	public AjaxResult insertFloodLonLat(RiskMapFloodUpdateVo riskMapFloodUpdateVo);
	*//**
	 * 删除一条水淹数据
	 * @param riskMapFloodUpdateVo
	 *//*
	public AjaxResult deleteFloodLonLat(String dangerId);
	
	public void updateDtvData();
	
	*//**
	 * 获取汇率
	 * 
	 *//*
	public List<ExchRateVo> getExchRate();
	public void saveExchRate(ExchRateVo exchRateVo, String proposalNo, Integer addressId);
	public List<MapMainByAddrVo> queryRiskMapMain(List<Integer> ids, String sumAmount, String policyno, String mapCode,
			String nowdate, String powerSQL,String sumPay);
	
	*//**
	 * 查询理赔信息
	 *//*
	public List<PrplClaimVo> queryPrpLclaim(String policyNo, List<RiskMapItemkind> itemkindList);
	
	public AjaxResult downloadMapExcelData(String geometry);
	
	public Map<String, String> searchAddress(String lonX,String latY,String locaKindFlag);
	
	public List<Province> findAllArea();
	*//**
	 * 	根据省市县来查询不同的信息
	 * areaFlag: 1  省，2  市，3  县
	 * *//*
	public Map<String, List<CurrentDistrict>> findKindArea(String areaName,String areaFlag);
	
	*//**每日承保数据处理*//*
	public void  handlePrpins();
	
	*//**每日承保数据main表处理*//*
	public AjaxResult saveDayPrpMain(String line,String dataType);
	
	*//**每日承保数据address表处理*//*
	public AjaxResult saveDayPrpAddress(String line,String dataType);
	
	*//**每日承保数据coins表处理*//*
	public AjaxResult saveDayPrpCoins(String line,String dataType);
	
	*//**每日承保数据insured表处理*//*
	public AjaxResult saveDayPrpInsured(String line,String dataType);
	
	*//**每日承保数据itemkind表处理*//*
	public AjaxResult saveDayPrpItem(String line,String dataType);
	
	*//**每日承保数据表处理*//*
	public Set<String> everyDayProcess();
	*//**台风黑点*//*
	public AjaxResult updateTyphoon(RiskMapTyphoonBlack vo,UserInfo userInfo);
	public AjaxResult deleteTyphoon(String deleteId);
	public void saveRiskMapTyphoonBlack(UserInfo userInfo,List<RiskMapTyphoonBlack> riskMapTyphoonBlackList);
	public AjaxResult findProvince();
	public AjaxResult queryCity(String upperCode);
	
	public AjaxResult exportStandard(RiskMapMainVo riskMapMainVo);
	public AjaxResult queryDataone();
	*//** test 测试获取地址的经纬度和打分分数的方法*//*
	public HttpResponseAddressReset getLongAndLat_test(RiskMapAddress riskMapAddress);
	
	*//**每日承保数据，当数据导入prpc表后将prpc_temp各表清空*//*
	public void deletePrpTemp();
	public AjaxResult sumTyphoon(List<String> ids,String sql, String dangerFlag);
	*//** 根据经纬度获取暴雨分数*//*
	public AjaxResult getRainScoreByPoint(String pointX,String pointY);
	
	*//**
	 * @功能：iobjectjava 直接把后台的多个面数据转换成一个面数据
	 * @param 
	 * @return AjaxResult
	 * @author liqiankun
	 * @时间：20190515
	 * @修改记录：
	 *//*
	public AjaxResult returnGeometrist(MapRequestInfoVo mapRequestInfoVo);
	*//**分页查询Wz_Tfbh**//*
	public WZ_tfbhResponse findWzTfbhBypage(WZ_tfbhVo wz_tfbhVo);
	
	public List<Object> queryDangerData(String sql, String dangerFlag);
	*//**根据台风编号查询历史台风信息并按照时间排序**//*
	public AjaxResult queryLSTfbh(String tfbh);
	*//**根据台风编号和时间查询台风预测表数据信息**//*
	public AjaxResult queryYbljForTimeAndTfbh(String tfbh, String ybsj);
	
	public String getMaxSerialNo();
	public List<WZ_tfbh> getTFBH();
	public void saveRiskWarningPush(RiskWarningPush wp);
	public AjaxResult queryRiskWarningPush(RiskWarningPush wp,UserInfo userInfo);
	
	*//**生成实时台风报告**//*
	public AjaxResult createTyphoonWordCurrent(String typhoonNo,String imgData,String userCode);

	public AjaxResult deleteWarningPush(Integer serialNo);
	public AjaxResult queryByserialNo(Integer serialNo);
	public List<Code> queryRiskCode(String classCode, String comCode);
	*//**根据台风编号查询台风影响标的 及 台风预测硬性标的 **//*
	public AjaxResult queryTargetForTfbh(String tfbh, String target);
	
	public AjaxResult sumAmountLs();
	
	*//**生成预警台风报告**//*
	public AjaxResult createTyphoonWordYJ(String tfbh, String imgData,String userCode);
	
	*//**
	 * 精算数据：企财险基本数据
	 * 根据标的地址信息 获取该标的点保费、费率等数据   
	 * 数据单位为（万元）  费率为（百分之xxx）
	 * @author 崔凤志
	 * @param address
	 * @return
	 *//*
	public AjaxResult getActuarialDataByAddress(String locationX,String locationY);
	*//**
	 * 精算数据 : 根据 条件查询企财险基本数据
	 * 根据标的地址信息 获取该标的点保费、费率等数据   
	 * 数据单位为（万元）  费率为（百分之xxx）
	 * @author 崔凤志
	 * @param address
	 * @return
	 *//*
	public AjaxResult getActuarialData(String address,String businessName);
	
	*//**
	 * 精算数据：企财险详细数据
	 * 根据标的地址信息 获取该标的点保费、费率等详细数据
	 * @author 崔凤志
	 * @param address
	 * @param pageNo
	 * @param pageSize
	 *//*
	public AjaxResult  getActuarialDataInfoByAddress(MapRequestInfoVo mapRequestInfoVo);
	
	public String queryDangerCodeName(String dangerCode);
	
	*//**地图标的查询精算数据 工程险基本数据查询计算**//*
	public AjaxResult getGManagerActuarialDataByAdd(MapRequestInfoVo mapRequestInfoVo);
	
	*//**地图标的查询精算数据 工程险详细数据查询计算**//*
	public AjaxResult getGManagerActuarialDataInfoByAdd(MapRequestInfoVo mapRequestInfoVo);
	
}
*/
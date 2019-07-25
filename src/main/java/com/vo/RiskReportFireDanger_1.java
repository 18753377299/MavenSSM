package com.vo;

import java.io.Serializable;
import java.util.Date;

	/**
 * @author  作者 E-mail:   liqiankun
 * @date 创建时间：2019年7月16日 上午9:42:48
 * @version 1.0 
 * @parameter 
 * @since  火灾风险排查表
 * @return  */

public class RiskReportFireDanger_1 implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/** 风控档案编号*/
	private String riskFileNo;
	/*防火分隔*/
	private String fireproofSeparate;
	/*建筑结构*/
	private String buildStructure;
	/*建筑使用年限*/
	private String buildUseYear;
	/*建筑所有权性质*/
	private String buildOwnerShipNature;
	/*火灾荷载密度（建筑物内所容纳可燃物容积占比）*/
	private String fireLoadDensity;
	/*主要生产或仓储材料燃烧性质*/
	private String mainMaterialBurnNature;
	/*有无爆炸生产环境*/
	private String explodeProductEnviron;
	/*危险工艺部位（可多选）*/
	private String dangerProcessPart;
	/*作业车充电位置*/
	private String chargePosition;
	/*电气线路投入使用年限*/
	private String lineYear;
	/*仓储区域灯具*/
	private String storageAreaLight;
	/*仓储存放情况满足“堆垛间距1m，安全通道2m，与柱0.3m，与墙与顶板0.5m”*/
	private String storageSituation;
	/*电气线路或用电设备与可燃物周边间距*/
	private String lineDistance;
	/*生产和仓储场所有其他无关电器设备（如生活用电等）*/
	private String proIrrelevantDevice;
	/*消防设施（可多选）*/
	private String fireFacility;
	/*室内消火栓系统*/
	private String indoorHydrantSystem;
	/*室外消火栓系统*/
	private String outdoorHydrantSystem;
	/*灭火器*/
	private String fireExtinguisher;
	/*消防器材通道*/
	private String fireEquipmentPassage;
	/*自动灭火系统（可多选）*/
	private String autoExtinguishSystem;
	/*自动报警系统状态*/
	private String autoAlarmSystemStatus;
	/*自动报警系统监管*/
	private String autoAlarmSystemWatch;
	/*消防水源供应（可多选）*/
	private String fireWaterSupply;
	/*电气线路保护*/
	private String electricLineProtect;
	/*防火间距*/
	private String  fireSeparation;
	/*建筑物间存在物体*/
	private String  bodyBetweenBuild;
	/*厂区周边环境*/
	private String  surroundEnvironment;
	/*企业是否建立消防安全组织架构*/
	private String establishFireSafety;
	/*是否配置专兼职消防人员*/
	private String  configureFireFighter;
	/*防火巡查、检查制度及落实情况*/
	private String  fireCheckHappen;
	/*动火审批制度和落实情况*/
	private String  hotFireApproval;
	/*开展消防演练情况*/
	private String  fireDrill;
	/*定期对员工的消防培训*/
	private String  fireTrain;
	/*消防设施维护保养*/
	private String  fireMaintenance;
	/*禁烟管理情况*/
	private String  noSmokeManage;
	/*消防控制室值班制度*/
	private String  fireControlDuty;
	/*一年内是否收到相关消防安全管理部门风险警示或整改建议函*/
	private String  rectificateSuggest;
	/**插入时间*/
	private Date insertTimeForHis;
	/**更新时间*/
	private Date operateTimeForHis;
	/** 风控主表 */
	private RiskReportMain_1 riskReportMain;
	public String getRiskFileNo() {
		return riskFileNo;
	}
	public void setRiskFileNo(String riskFileNo) {
		this.riskFileNo = riskFileNo;
	}
	public String getFireproofSeparate() {
		return fireproofSeparate;
	}
	public void setFireproofSeparate(String fireproofSeparate) {
		this.fireproofSeparate = fireproofSeparate;
	}
	public String getBuildStructure() {
		return buildStructure;
	}
	public void setBuildStructure(String buildStructure) {
		this.buildStructure = buildStructure;
	}
	public String getBuildUseYear() {
		return buildUseYear;
	}
	public void setBuildUseYear(String buildUseYear) {
		this.buildUseYear = buildUseYear;
	}
	public String getBuildOwnerShipNature() {
		return buildOwnerShipNature;
	}
	public void setBuildOwnerShipNature(String buildOwnerShipNature) {
		this.buildOwnerShipNature = buildOwnerShipNature;
	}
	public String getFireLoadDensity() {
		return fireLoadDensity;
	}
	public void setFireLoadDensity(String fireLoadDensity) {
		this.fireLoadDensity = fireLoadDensity;
	}
	public String getMainMaterialBurnNature() {
		return mainMaterialBurnNature;
	}
	public void setMainMaterialBurnNature(String mainMaterialBurnNature) {
		this.mainMaterialBurnNature = mainMaterialBurnNature;
	}
	public String getExplodeProductEnviron() {
		return explodeProductEnviron;
	}
	public void setExplodeProductEnviron(String explodeProductEnviron) {
		this.explodeProductEnviron = explodeProductEnviron;
	}
	public String getDangerProcessPart() {
		return dangerProcessPart;
	}
	public void setDangerProcessPart(String dangerProcessPart) {
		this.dangerProcessPart = dangerProcessPart;
	}
	public String getChargePosition() {
		return chargePosition;
	}
	public void setChargePosition(String chargePosition) {
		this.chargePosition = chargePosition;
	}
	public String getLineYear() {
		return lineYear;
	}
	public void setLineYear(String lineYear) {
		this.lineYear = lineYear;
	}
	public String getStorageAreaLight() {
		return storageAreaLight;
	}
	public void setStorageAreaLight(String storageAreaLight) {
		this.storageAreaLight = storageAreaLight;
	}
	public String getStorageSituation() {
		return storageSituation;
	}
	public void setStorageSituation(String storageSituation) {
		this.storageSituation = storageSituation;
	}
	public String getLineDistance() {
		return lineDistance;
	}
	public void setLineDistance(String lineDistance) {
		this.lineDistance = lineDistance;
	}
	public String getProIrrelevantDevice() {
		return proIrrelevantDevice;
	}
	public void setProIrrelevantDevice(String proIrrelevantDevice) {
		this.proIrrelevantDevice = proIrrelevantDevice;
	}
	public String getFireFacility() {
		return fireFacility;
	}
	public void setFireFacility(String fireFacility) {
		this.fireFacility = fireFacility;
	}
	public String getIndoorHydrantSystem() {
		return indoorHydrantSystem;
	}
	public void setIndoorHydrantSystem(String indoorHydrantSystem) {
		this.indoorHydrantSystem = indoorHydrantSystem;
	}
	public String getOutdoorHydrantSystem() {
		return outdoorHydrantSystem;
	}
	public void setOutdoorHydrantSystem(String outdoorHydrantSystem) {
		this.outdoorHydrantSystem = outdoorHydrantSystem;
	}
	public String getFireExtinguisher() {
		return fireExtinguisher;
	}
	public void setFireExtinguisher(String fireExtinguisher) {
		this.fireExtinguisher = fireExtinguisher;
	}
	public String getFireEquipmentPassage() {
		return fireEquipmentPassage;
	}
	public void setFireEquipmentPassage(String fireEquipmentPassage) {
		this.fireEquipmentPassage = fireEquipmentPassage;
	}
	public String getAutoExtinguishSystem() {
		return autoExtinguishSystem;
	}
	public void setAutoExtinguishSystem(String autoExtinguishSystem) {
		this.autoExtinguishSystem = autoExtinguishSystem;
	}
	public String getAutoAlarmSystemStatus() {
		return autoAlarmSystemStatus;
	}
	public void setAutoAlarmSystemStatus(String autoAlarmSystemStatus) {
		this.autoAlarmSystemStatus = autoAlarmSystemStatus;
	}
	public String getAutoAlarmSystemWatch() {
		return autoAlarmSystemWatch;
	}
	public void setAutoAlarmSystemWatch(String autoAlarmSystemWatch) {
		this.autoAlarmSystemWatch = autoAlarmSystemWatch;
	}
	public String getFireWaterSupply() {
		return fireWaterSupply;
	}
	public void setFireWaterSupply(String fireWaterSupply) {
		this.fireWaterSupply = fireWaterSupply;
	}
	public String getElectricLineProtect() {
		return electricLineProtect;
	}
	public void setElectricLineProtect(String electricLineProtect) {
		this.electricLineProtect = electricLineProtect;
	}
	public String getFireSeparation() {
		return fireSeparation;
	}
	public void setFireSeparation(String fireSeparation) {
		this.fireSeparation = fireSeparation;
	}
	public String getBodyBetweenBuild() {
		return bodyBetweenBuild;
	}
	public void setBodyBetweenBuild(String bodyBetweenBuild) {
		this.bodyBetweenBuild = bodyBetweenBuild;
	}
	public String getSurroundEnvironment() {
		return surroundEnvironment;
	}
	public void setSurroundEnvironment(String surroundEnvironment) {
		this.surroundEnvironment = surroundEnvironment;
	}
	public String getEstablishFireSafety() {
		return establishFireSafety;
	}
	public void setEstablishFireSafety(String establishFireSafety) {
		this.establishFireSafety = establishFireSafety;
	}
	public String getConfigureFireFighter() {
		return configureFireFighter;
	}
	public void setConfigureFireFighter(String configureFireFighter) {
		this.configureFireFighter = configureFireFighter;
	}
	public String getFireCheckHappen() {
		return fireCheckHappen;
	}
	public void setFireCheckHappen(String fireCheckHappen) {
		this.fireCheckHappen = fireCheckHappen;
	}
	public String getHotFireApproval() {
		return hotFireApproval;
	}
	public void setHotFireApproval(String hotFireApproval) {
		this.hotFireApproval = hotFireApproval;
	}
	public String getFireDrill() {
		return fireDrill;
	}
	public void setFireDrill(String fireDrill) {
		this.fireDrill = fireDrill;
	}
	public String getFireTrain() {
		return fireTrain;
	}
	public void setFireTrain(String fireTrain) {
		this.fireTrain = fireTrain;
	}
	public String getFireMaintenance() {
		return fireMaintenance;
	}
	public void setFireMaintenance(String fireMaintenance) {
		this.fireMaintenance = fireMaintenance;
	}
	public String getNoSmokeManage() {
		return noSmokeManage;
	}
	public void setNoSmokeManage(String noSmokeManage) {
		this.noSmokeManage = noSmokeManage;
	}
	public String getFireControlDuty() {
		return fireControlDuty;
	}
	public void setFireControlDuty(String fireControlDuty) {
		this.fireControlDuty = fireControlDuty;
	}
	public String getRectificateSuggest() {
		return rectificateSuggest;
	}
	public void setRectificateSuggest(String rectificateSuggest) {
		this.rectificateSuggest = rectificateSuggest;
	}
	public Date getInsertTimeForHis() {
		return insertTimeForHis;
	}
	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}
	public Date getOperateTimeForHis() {
		return operateTimeForHis;
	}
	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}
	public RiskReportMain_1 getRiskReportMain() {
		return riskReportMain;
	}
	public void setRiskReportMain(RiskReportMain_1 riskReportMain) {
		this.riskReportMain = riskReportMain;
	}
	
	
}

package com.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
* @author  作者 E-mail:   liqiankun
* @date 创建时间：2019年7月16日 上午9:42:48
* @version 1.0 
* @parameter 
* @since  火灾风险排查表
* @return  */

public class RiskReportFireDanger implements Serializable {
	
    @ApiModelProperty(value = "风控档案编号")
    private String riskFileNo;

    @ApiModelProperty(value = "防火分隔")
    private String fireProofSeparate;

    @ApiModelProperty(value = "建筑结构")
    private String buildStructure;

    @ApiModelProperty(value = "建筑使用年限")
    private String buildUseYear;

    @ApiModelProperty(value = "建筑所有权性质")
    private String buildOwnerShipNature;

    @ApiModelProperty(value = "火灾荷载密度（建筑物内所容纳可燃物容积占比）")
    private String fireLoadDensity;

    @ApiModelProperty(value = "主要生产或仓储材料燃烧性质")
    private String mainMaterialBurnNature;

    @ApiModelProperty(value = "有无爆炸生产环境")
    private String explodeProductEnviron;

    @ApiModelProperty(value = "危险工艺部位（可多选）")
    private String dangerProcessPart;

    @ApiModelProperty(value = "作业车充电位置")
    private String chargePosition;

    @ApiModelProperty(value = "电气线路投入使用年限")
    private String lineYear;

    @ApiModelProperty(value = "仓储区域灯具")
    private String storageAreaLight;

    @ApiModelProperty(value = "仓储存放情况")
    private String storageSituation;

    @ApiModelProperty(value = "电气线路或用电设备与可燃物周边间距")
    private String lineDistance;

    @ApiModelProperty(value = "生产和仓储场所有其他无关电器设备")
    private String proIrrelevantDevice;

    @ApiModelProperty(value = "消防设施")
    private String fireFacility;

    @ApiModelProperty(value = "室内消火栓系统")
    private String indoorHydrantSystem;

    @ApiModelProperty(value = "室外消火栓系统")
    private String outdoorHydrantSystem;

    @ApiModelProperty(value = "灭火器")
    private String fireExtinguisher;

    @ApiModelProperty(value = "消防器材通道")
    private String fireEquipmentPassage;

    @ApiModelProperty(value = "自动灭火系统")
    private String autoExtinguishSystem;

    @ApiModelProperty(value = "自动报警系统状态")
    private String autoAlarmSystemStatus;

    @ApiModelProperty(value = "自动报警系统监")
    private String autoAlarmSystemWatch;

    @ApiModelProperty(value = "消防水源供应")
    private String fireWaterSupply;

    @ApiModelProperty(value = "电气线路保护")
    private String electricLineProtect;

    @ApiModelProperty(value = "防火间距")
    private String fireSeparation;

    @ApiModelProperty(value = "建筑物间存在物体")
    private String bodyBetweenBuild;

    @ApiModelProperty(value = "厂区周边环境")
    private String surroundEnvironment;

    @ApiModelProperty(value = "企业是否建立消防安全组织架构")
    private String establishFireSafety;

    @ApiModelProperty(value = "是否配置专兼职消防人员")
    private String configureFireFighter;

    @ApiModelProperty(value = "防火巡查、检查制度及落实情况")
    private String fireCheckHappen;

    @ApiModelProperty(value = "动火审批制度和落实情况")
    private String hotFireApproval;

    @ApiModelProperty(value = "开展消防演练情况")
    private String fireDrill;

    @ApiModelProperty(value = "定期对员工的消防培训")
    private String fireTrain;

    @ApiModelProperty(value = "消防设施维护保养")
    private String fireMaintenance;

    @ApiModelProperty(value = "禁烟管理情况")
    private String noSmokeManage;

    @ApiModelProperty(value = "消防控制室值班制度")
    private String fireControlDuty;

    @ApiModelProperty(value = "一年内是否收到相关消防安全管理部门风险警示或整改建议函")
    private String rectificateSuggest;

    @ApiModelProperty(value = "插入时间")
    private Date insertTimeForHis;

    @ApiModelProperty(value = "修改时间")
    private Date operateTimeForHis;

    private static final long serialVersionUID = 1L;

    public String getRiskFileNo() {
        return riskFileNo;
    }

    public void setRiskFileNo(String riskFileNo) {
        this.riskFileNo = riskFileNo == null ? null : riskFileNo.trim();
    }

    public String getFireProofSeparate() {
        return fireProofSeparate;
    }

    public void setFireProofSeparate(String fireProofSeparate) {
        this.fireProofSeparate = fireProofSeparate == null ? null : fireProofSeparate.trim();
    }

    public String getBuildStructure() {
        return buildStructure;
    }

    public void setBuildStructure(String buildStructure) {
        this.buildStructure = buildStructure == null ? null : buildStructure.trim();
    }

    public String getBuildUseYear() {
        return buildUseYear;
    }

    public void setBuildUseYear(String buildUseYear) {
        this.buildUseYear = buildUseYear == null ? null : buildUseYear.trim();
    }

    public String getBuildOwnerShipNature() {
        return buildOwnerShipNature;
    }

    public void setBuildOwnerShipNature(String buildOwnerShipNature) {
        this.buildOwnerShipNature = buildOwnerShipNature == null ? null : buildOwnerShipNature.trim();
    }

    public String getFireLoadDensity() {
        return fireLoadDensity;
    }

    public void setFireLoadDensity(String fireLoadDensity) {
        this.fireLoadDensity = fireLoadDensity == null ? null : fireLoadDensity.trim();
    }

    public String getMainMaterialBurnNature() {
        return mainMaterialBurnNature;
    }

    public void setMainMaterialBurnNature(String mainMaterialBurnNature) {
        this.mainMaterialBurnNature = mainMaterialBurnNature == null ? null : mainMaterialBurnNature.trim();
    }

    public String getExplodeProductEnviron() {
        return explodeProductEnviron;
    }

    public void setExplodeProductEnviron(String explodeProductEnviron) {
        this.explodeProductEnviron = explodeProductEnviron == null ? null : explodeProductEnviron.trim();
    }

    public String getDangerProcessPart() {
        return dangerProcessPart;
    }

    public void setDangerProcessPart(String dangerProcessPart) {
        this.dangerProcessPart = dangerProcessPart == null ? null : dangerProcessPart.trim();
    }

    public String getChargePosition() {
        return chargePosition;
    }

    public void setChargePosition(String chargePosition) {
        this.chargePosition = chargePosition == null ? null : chargePosition.trim();
    }

    public String getLineYear() {
        return lineYear;
    }

    public void setLineYear(String lineYear) {
        this.lineYear = lineYear == null ? null : lineYear.trim();
    }

    public String getStorageAreaLight() {
        return storageAreaLight;
    }

    public void setStorageAreaLight(String storageAreaLight) {
        this.storageAreaLight = storageAreaLight == null ? null : storageAreaLight.trim();
    }

    public String getStorageSituation() {
        return storageSituation;
    }

    public void setStorageSituation(String storageSituation) {
        this.storageSituation = storageSituation == null ? null : storageSituation.trim();
    }

    public String getLineDistance() {
        return lineDistance;
    }

    public void setLineDistance(String lineDistance) {
        this.lineDistance = lineDistance == null ? null : lineDistance.trim();
    }

    public String getProIrrelevantDevice() {
        return proIrrelevantDevice;
    }

    public void setProIrrelevantDevice(String proIrrelevantDevice) {
        this.proIrrelevantDevice = proIrrelevantDevice == null ? null : proIrrelevantDevice.trim();
    }

    public String getFireFacility() {
        return fireFacility;
    }

    public void setFireFacility(String fireFacility) {
        this.fireFacility = fireFacility == null ? null : fireFacility.trim();
    }

    public String getIndoorHydrantSystem() {
        return indoorHydrantSystem;
    }

    public void setIndoorHydrantSystem(String indoorHydrantSystem) {
        this.indoorHydrantSystem = indoorHydrantSystem == null ? null : indoorHydrantSystem.trim();
    }

    public String getOutdoorHydrantSystem() {
        return outdoorHydrantSystem;
    }

    public void setOutdoorHydrantSystem(String outdoorHydrantSystem) {
        this.outdoorHydrantSystem = outdoorHydrantSystem == null ? null : outdoorHydrantSystem.trim();
    }

    public String getFireExtinguisher() {
        return fireExtinguisher;
    }

    public void setFireExtinguisher(String fireExtinguisher) {
        this.fireExtinguisher = fireExtinguisher == null ? null : fireExtinguisher.trim();
    }

    public String getFireEquipmentPassage() {
        return fireEquipmentPassage;
    }

    public void setFireEquipmentPassage(String fireEquipmentPassage) {
        this.fireEquipmentPassage = fireEquipmentPassage == null ? null : fireEquipmentPassage.trim();
    }

    public String getAutoExtinguishSystem() {
        return autoExtinguishSystem;
    }

    public void setAutoExtinguishSystem(String autoExtinguishSystem) {
        this.autoExtinguishSystem = autoExtinguishSystem == null ? null : autoExtinguishSystem.trim();
    }

    public String getAutoAlarmSystemStatus() {
        return autoAlarmSystemStatus;
    }

    public void setAutoAlarmSystemStatus(String autoAlarmSystemStatus) {
        this.autoAlarmSystemStatus = autoAlarmSystemStatus == null ? null : autoAlarmSystemStatus.trim();
    }

    public String getAutoAlarmSystemWatch() {
        return autoAlarmSystemWatch;
    }

    public void setAutoAlarmSystemWatch(String autoAlarmSystemWatch) {
        this.autoAlarmSystemWatch = autoAlarmSystemWatch == null ? null : autoAlarmSystemWatch.trim();
    }

    public String getFireWaterSupply() {
        return fireWaterSupply;
    }

    public void setFireWaterSupply(String fireWaterSupply) {
        this.fireWaterSupply = fireWaterSupply == null ? null : fireWaterSupply.trim();
    }

    public String getElectricLineProtect() {
        return electricLineProtect;
    }

    public void setElectricLineProtect(String electricLineProtect) {
        this.electricLineProtect = electricLineProtect == null ? null : electricLineProtect.trim();
    }

    public String getFireSeparation() {
        return fireSeparation;
    }

    public void setFireSeparation(String fireSeparation) {
        this.fireSeparation = fireSeparation == null ? null : fireSeparation.trim();
    }

    public String getBodyBetweenBuild() {
        return bodyBetweenBuild;
    }

    public void setBodyBetweenBuild(String bodyBetweenBuild) {
        this.bodyBetweenBuild = bodyBetweenBuild == null ? null : bodyBetweenBuild.trim();
    }

    public String getSurroundEnvironment() {
        return surroundEnvironment;
    }

    public void setSurroundEnvironment(String surroundEnvironment) {
        this.surroundEnvironment = surroundEnvironment == null ? null : surroundEnvironment.trim();
    }

    public String getEstablishFireSafety() {
        return establishFireSafety;
    }

    public void setEstablishFireSafety(String establishFireSafety) {
        this.establishFireSafety = establishFireSafety == null ? null : establishFireSafety.trim();
    }

    public String getConfigureFireFighter() {
        return configureFireFighter;
    }

    public void setConfigureFireFighter(String configureFireFighter) {
        this.configureFireFighter = configureFireFighter == null ? null : configureFireFighter.trim();
    }

    public String getFireCheckHappen() {
        return fireCheckHappen;
    }

    public void setFireCheckHappen(String fireCheckHappen) {
        this.fireCheckHappen = fireCheckHappen == null ? null : fireCheckHappen.trim();
    }

    public String getHotFireApproval() {
        return hotFireApproval;
    }

    public void setHotFireApproval(String hotFireApproval) {
        this.hotFireApproval = hotFireApproval == null ? null : hotFireApproval.trim();
    }

    public String getFireDrill() {
        return fireDrill;
    }

    public void setFireDrill(String fireDrill) {
        this.fireDrill = fireDrill == null ? null : fireDrill.trim();
    }

    public String getFireTrain() {
        return fireTrain;
    }

    public void setFireTrain(String fireTrain) {
        this.fireTrain = fireTrain == null ? null : fireTrain.trim();
    }

    public String getFireMaintenance() {
        return fireMaintenance;
    }

    public void setFireMaintenance(String fireMaintenance) {
        this.fireMaintenance = fireMaintenance == null ? null : fireMaintenance.trim();
    }

    public String getNoSmokeManage() {
        return noSmokeManage;
    }

    public void setNoSmokeManage(String noSmokeManage) {
        this.noSmokeManage = noSmokeManage == null ? null : noSmokeManage.trim();
    }

    public String getFireControlDuty() {
        return fireControlDuty;
    }

    public void setFireControlDuty(String fireControlDuty) {
        this.fireControlDuty = fireControlDuty == null ? null : fireControlDuty.trim();
    }

    public String getRectificateSuggest() {
        return rectificateSuggest;
    }

    public void setRectificateSuggest(String rectificateSuggest) {
        this.rectificateSuggest = rectificateSuggest == null ? null : rectificateSuggest.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", riskFileNo=").append(riskFileNo);
        sb.append(", fireProofSeparate=").append(fireProofSeparate);
        sb.append(", buildStructure=").append(buildStructure);
        sb.append(", buildUseYear=").append(buildUseYear);
        sb.append(", buildOwnerShipNature=").append(buildOwnerShipNature);
        sb.append(", fireLoadDensity=").append(fireLoadDensity);
        sb.append(", mainMaterialBurnNature=").append(mainMaterialBurnNature);
        sb.append(", explodeProductEnviron=").append(explodeProductEnviron);
        sb.append(", dangerProcessPart=").append(dangerProcessPart);
        sb.append(", chargePosition=").append(chargePosition);
        sb.append(", lineYear=").append(lineYear);
        sb.append(", storageAreaLight=").append(storageAreaLight);
        sb.append(", storageSituation=").append(storageSituation);
        sb.append(", lineDistance=").append(lineDistance);
        sb.append(", proIrrelevantDevice=").append(proIrrelevantDevice);
        sb.append(", fireFacility=").append(fireFacility);
        sb.append(", indoorHydrantSystem=").append(indoorHydrantSystem);
        sb.append(", outdoorHydrantSystem=").append(outdoorHydrantSystem);
        sb.append(", fireExtinguisher=").append(fireExtinguisher);
        sb.append(", fireEquipmentPassage=").append(fireEquipmentPassage);
        sb.append(", autoExtinguishSystem=").append(autoExtinguishSystem);
        sb.append(", autoAlarmSystemStatus=").append(autoAlarmSystemStatus);
        sb.append(", autoAlarmSystemWatch=").append(autoAlarmSystemWatch);
        sb.append(", fireWaterSupply=").append(fireWaterSupply);
        sb.append(", electricLineProtect=").append(electricLineProtect);
        sb.append(", fireSeparation=").append(fireSeparation);
        sb.append(", bodyBetweenBuild=").append(bodyBetweenBuild);
        sb.append(", surroundEnvironment=").append(surroundEnvironment);
        sb.append(", establishFireSafety=").append(establishFireSafety);
        sb.append(", configureFireFighter=").append(configureFireFighter);
        sb.append(", fireCheckHappen=").append(fireCheckHappen);
        sb.append(", hotFireApproval=").append(hotFireApproval);
        sb.append(", fireDrill=").append(fireDrill);
        sb.append(", fireTrain=").append(fireTrain);
        sb.append(", fireMaintenance=").append(fireMaintenance);
        sb.append(", noSmokeManage=").append(noSmokeManage);
        sb.append(", fireControlDuty=").append(fireControlDuty);
        sb.append(", rectificateSuggest=").append(rectificateSuggest);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
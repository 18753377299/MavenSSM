drop table if exists RISKREPORT_CHEMICALS;
CREATE TABLE RISKREPORT_CHEMICALS (
	riskFileNo  CHARACTER VARYING(22) NOT NULL,
	businessLicense CHARACTER VARYING(1),
	businessInfo CHARACTER VARYING(1),
-- 	businessMainEquipment CHARACTER VARYING(1),
	operatingYears CHARACTER VARYING(1),
	operatingRate CHARACTER VARYING(1),
	businessRisk CHARACTER VARYING(1),
	HSEManagementSys CHARACTER VARYING(1),
	safeProductionManageSys CHARACTER VARYING(1),


	contractorManageSys CHARACTER VARYING(1),
	dangerGovernanceSys CHARACTER VARYING(1),
	safeEducationSys CHARACTER VARYING(1),
	specialOperationManageSys CHARACTER VARYING(1),
	hotWorkManageSys CHARACTER VARYING(1),
	specialSafetyManageSys CHARACTER VARYING(1),
	facilityMaintenanceManageSys CHARACTER VARYING(1),
	noSmokingManageSys CHARACTER VARYING(1),
	emergencyPlanDrillSyshighly CHARACTER VARYING(1),
	emergencyPlanDrillSysgeneral CHARACTER VARYING(1),

	safeProductionInvestment CHARACTER VARYING(1),
	fireManageSys CHARACTER VARYING(1),
	fireFacilities CHARACTER VARYING(1),
	businessSafeTraining CHARACTER VARYING(1),
	safeProductionAccident CHARACTER VARYING(1),
	safeStandardization CHARACTER VARYING(1),

	mainProducts CHARACTER VARYING(1),
	majorDangerSource CHARACTER VARYING(1),
	productionTemperature CHARACTER VARYING(1),
	maximumPressure CHARACTER VARYING(1),
	emergencyEquipment CHARACTER VARYING(1),
	fireWastewaterCollectionSys CHARACTER VARYING(1),
	emergencyDevices CHARACTER VARYING(1),
	generalOperator CHARACTER VARYING(1),
	specialOperators CHARACTER VARYING(1),
	lightningProtectionMeasures CHARACTER VARYING(1),
	antiStaticMeasures CHARACTER VARYING(1),
	explosionProofMeasures CHARACTER VARYING(1),
	monitoringWarningEquipment CHARACTER VARYING(1),
	fireEmbankment CHARACTER VARYING(1),
	loadingOperationManageSys CHARACTER VARYING(1),
	residentialSchoolsHospitals CHARACTER VARYING(10),
	farmlandGrassland CHARACTER VARYING(10),
	chemicalPark CHARACTER VARYING(1),
	
	majorDangers CHARACTER VARYING(1),

	insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,

	CONSTRAINT pk_riskreport_chemicals PRIMARY KEY (riskFileNo),
	CONSTRAINT ck_riskreport_chemicals1 CHECK(businessLicense IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals2 CHECK(businessInfo IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals3 CHECK(operatingYears IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals4 CHECK(operatingRate IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals5 CHECK(businessRisk IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals6 CHECK(HSEManagementSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals7 CHECK(safeProductionManageSys IN ('','A','B')),


	CONSTRAINT ck_riskreport_chemicals8 CHECK(contractorManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals9 CHECK(dangerGovernanceSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals10 CHECK(safeEducationSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals11 CHECK(specialOperationManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals12 CHECK(hotWorkManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals13 CHECK(specialSafetyManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals14 CHECK(facilityMaintenanceManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals15 CHECK(noSmokingManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals16 CHECK(emergencyPlanDrillSyshighly IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals17 CHECK(emergencyPlanDrillSysgeneral IN ('','A','B')),

	CONSTRAINT ck_riskreport_chemicals18 CHECK(safeProductionInvestment IN ('','A','B','C','D')),
	CONSTRAINT ck_riskreport_chemicals19 CHECK(fireManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals20 CHECK(fireFacilities IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals21 CHECK(businessSafeTraining IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals22 CHECK(safeProductionAccident IN ('','A','B','C','D')),
	CONSTRAINT ck_riskreport_chemicals23 CHECK(safeStandardization IN ('','A','B','C','D')),

	CONSTRAINT ck_riskreport_chemicals24 CHECK(mainProducts IN ('','A','B','C','D')),
	CONSTRAINT ck_riskreport_chemicals25 CHECK(majorDangerSource IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals26 CHECK(productionTemperature IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals27 CHECK(maximumPressure IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals28 CHECK(emergencyEquipment IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals29 CHECK(fireWastewaterCollectionSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals30 CHECK(emergencyDevices IN ('','A','B','C','D')),
	CONSTRAINT ck_riskreport_chemicals31 CHECK(generalOperator IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals32 CHECK(specialOperators IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals33 CHECK(lightningProtectionMeasures IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals34 CHECK(antiStaticMeasures IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals35 CHECK(explosionProofMeasures IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals36 CHECK(monitoringWarningEquipment IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals37 CHECK(fireEmbankment IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals38 CHECK(loadingOperationManageSys IN ('','A','B','C')),
-- 	CONSTRAINT ck_riskreport_chemicals1 CHECK(residentialSchoolsHospitals IN ('','A','B')),
--  CONSTRAINT ck_riskreport_chemicals1 CHECK(farmlandGrassland IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals39 CHECK(chemicalPark IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals40 CHECK(majorDangers IN ('','A','B','C'))


);

comment on column RISKREPORT_CHEMICALS.riskFileNo is '风控编号';
comment on column RISKREPORT_CHEMICALS.businessLicense is '企业证照是否健全';
comment on column RISKREPORT_CHEMICALS.businessInfo is '企业基本情况是否良好';
comment on column RISKREPORT_CHEMICALS.operatingYears is '企业主要设备运营年限';
comment on column RISKREPORT_CHEMICALS.operatingRate is '生产能力与设计能力比值';
comment on column RISKREPORT_CHEMICALS.businessRisk is '经营风险';
comment on column RISKREPORT_CHEMICALS.HSEManagementSys is '有无 HSE 管理体系';
comment on column RISKREPORT_CHEMICALS.safeProductionManageSys is '安全生产管理制度,其中包括安全生产责任制 ';


comment on column RISKREPORT_CHEMICALS.contractorManageSys is '承包商管理制度';
comment on column RISKREPORT_CHEMICALS.dangerGovernanceSys is '隐患排查与治理制度';
comment on column RISKREPORT_CHEMICALS.safeEducationSys is '安全教育制度';
comment on column RISKREPORT_CHEMICALS.specialOperationManageSys is '特种作业管理制度';
comment on column RISKREPORT_CHEMICALS.hotWorkManageSys is '动火作业管理制度';
comment on column RISKREPORT_CHEMICALS.specialSafetyManageSys is '特征设备安全管理制度';
comment on column RISKREPORT_CHEMICALS.facilityMaintenanceManageSys is '设施维修保养管理制度';
comment on column RISKREPORT_CHEMICALS.noSmokingManageSys is '禁烟制度内务管理';
comment on column RISKREPORT_CHEMICALS.emergencyPlanDrillSyshighly is '应急预案演练制度（剧毒化学品）';
comment on column RISKREPORT_CHEMICALS.emergencyPlanDrillSysgeneral is '应急预案演练制度（一般化学品）';

comment on column RISKREPORT_CHEMICALS.safeProductionInvestment is '安全生产投入占销售额比例';
comment on column RISKREPORT_CHEMICALS.fireManageSys is '消防管理制度';
comment on column RISKREPORT_CHEMICALS.fireFacilities is '消防设施';
comment on column RISKREPORT_CHEMICALS.businessSafeTraining is '企业安全培训情况';
comment on column RISKREPORT_CHEMICALS.safeProductionAccident is '安全生产事故';
comment on column RISKREPORT_CHEMICALS.safeStandardization is '安全标准化评定标准';

comment on column RISKREPORT_CHEMICALS.mainProducts is '主要原料、中间体、产品';
comment on column RISKREPORT_CHEMICALS.majorDangerSource is '是否构成重大危险源';
comment on column RISKREPORT_CHEMICALS.productionTemperature is '生产最高温度';
comment on column RISKREPORT_CHEMICALS.maximumPressure is '最高压力';
comment on column RISKREPORT_CHEMICALS.emergencyEquipment is '应急设备设施';
comment on column RISKREPORT_CHEMICALS.fireWastewaterCollectionSys is '消防废水收集系统';
comment on column RISKREPORT_CHEMICALS.emergencyDevices is '事故应急设备和装置';
comment on column RISKREPORT_CHEMICALS.generalOperator is '一般操作人员';
comment on column RISKREPORT_CHEMICALS.specialOperators is '动火、特种操作工（焊工、电工）';
comment on column RISKREPORT_CHEMICALS.lightningProtectionMeasures is '防雷措施';
comment on column RISKREPORT_CHEMICALS.antiStaticMeasures is '防静电措施';
comment on column RISKREPORT_CHEMICALS.explosionProofMeasures is '防爆措施';
comment on column RISKREPORT_CHEMICALS.monitoringWarningEquipment is '监控、预警、防护设备设施';
comment on column RISKREPORT_CHEMICALS.fireEmbankment is '存储区有无防火堤';
comment on column RISKREPORT_CHEMICALS.loadingOperationManageSys is '装卸操作管理制度';
comment on column RISKREPORT_CHEMICALS.residentialSchoolsHospitals is '有无居民区，学校、医院';
comment on column RISKREPORT_CHEMICALS.farmlandGrassland is '有无农田、基本农田、草场、林场、行洪区';

comment on column RISKREPORT_CHEMICALS.chemicalPark is '企业所处地区是否属于化工园区，周围是否存在其他化工企业';
comment on column RISKREPORT_CHEMICALS.majorDangers is '是否存在重大安全隐患';
comment on column RISKREPORT_CHEMICALS.insertTimeForHis is '插入时间';
comment on column RISKREPORT_CHEMICALS.operateTimeForHis is '更新时间';
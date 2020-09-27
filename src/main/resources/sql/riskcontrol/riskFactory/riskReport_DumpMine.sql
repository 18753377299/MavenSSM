drop table if exists RISKREPORT_DUMPMINE;
CREATE TABLE RISKREPORT_DUMPMINE (
	riskFileNo  CHARACTER VARYING(22) NOT NULL,
	businessLicense CHARACTER VARYING(1),
	businessInfo CHARACTER VARYING(1),
	dumpingLevel CHARACTER VARYING(1),
	dumpingStatus CHARACTER VARYING(1),
	businessRisk CHARACTER VARYING(1),
	safeManageSystem CHARACTER VARYING(1),
	safeManageinstitution CHARACTER VARYING(1),
	contractorManageSys CHARACTER VARYING(1),
	dangerGovernanceSys CHARACTER VARYING(1),
	safeEducationSys CHARACTER VARYING(1),
	specialOperationManageSys CHARACTER VARYING(1),
	specialSafetyManageSys CHARACTER VARYING(1),
	facilityMaintenanceManageSys CHARACTER VARYING(1),
	dangerInvestigationManageSys CHARACTER VARYING(1),
	emergencyPlanDrillSys CHARACTER VARYING(1),
	safeProductionPercentage CHARACTER VARYING(1),
	fireManageSys CHARACTER VARYING(1),
	fireFacilities CHARACTER VARYING(1),
	businessSafeTraining CHARACTER VARYING(1),
	safeProductionAccident CHARACTER VARYING(1),
	safeStandardization CHARACTER VARYING(1),
	dumpingByRequirements CHARACTER VARYING(1),
	safeSignsOtherOperations CHARACTER VARYING(1),
	directDumpingOperation CHARACTER VARYING(1),
	dumpingSiteManagement CHARACTER VARYING(1),
	carGear CHARACTER VARYING(1),
	emergencyEquipmentFacilities CHARACTER VARYING(1),
	monitoringSystem CHARACTER VARYING(1),
	safeClassificationEvaluation CHARACTER VARYING(1),
	dumpingSiteStability CHARACTER VARYING(1),
	floodProtectionFacilities CHARACTER VARYING(1),
	preventMudslides CHARACTER VARYING(1),
	dumpingSafeInspection CHARACTER VARYING(1),
	dumpingMonitoringSystem CHARACTER VARYING(1),
	checkFloodStructures CHARACTER VARYING(1),
	dumpingOutside CHARACTER VARYING(1),
	dumpingInternal CHARACTER VARYING(20),
	majorDangersCriteria CHARACTER VARYING(1),
	insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT pk_riskreport_dumpmine PRIMARY KEY (riskFileNo),
	CONSTRAINT ck_riskreport_dumpmine1 CHECK (businessLicense IN ('','A','B')),
	CONSTRAINT ck_riskreport_dumpmine2 CHECK (businessInfo IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_dumpmine3 CHECK (dumpingLevel IN ('','A','B','C','D')),
	CONSTRAINT ck_riskreport_dumpmine4 CHECK (dumpingStatus IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_dumpmine5 CHECK (businessRisk IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine6 CHECK (safeManageSystem IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine7 CHECK (safeManageinstitution IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine8 CHECK (contractorManageSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine9 CHECK (dangerGovernanceSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine10 CHECK (safeEducationSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine11 CHECK (specialOperationManageSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine12 CHECK (specialSafetyManageSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine13 CHECK (facilityMaintenanceManageSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine14 CHECK (dangerInvestigationManageSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine15 CHECK (emergencyPlanDrillSys IN ('','A','B','C')),


    CONSTRAINT ck_riskreport_dumpmine16 CHECK (safeProductionPercentage IN ('','A','B','C','D')),
    CONSTRAINT ck_riskreport_dumpmine17 CHECK (fireManageSys IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine18 CHECK (fireFacilities IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine19 CHECK (businessSafeTraining IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine20 CHECK (safeProductionAccident IN ('','A','B','C','D','E')),
    CONSTRAINT ck_riskreport_dumpmine21 CHECK (safeStandardization IN ('','A','B','C','D')),

    


    CONSTRAINT ck_riskreport_dumpmine22 CHECK (dumpingByRequirements IN ('','A','B','C','D')),
    CONSTRAINT ck_riskreport_dumpmine23 CHECK (safeSignsOtherOperations IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine24 CHECK (directDumpingOperation IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine25 CHECK (dumpingSiteManagement IN ('','A','B','C','D')),
    CONSTRAINT ck_riskreport_dumpmine26 CHECK (carGear IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine27 CHECK (emergencyEquipmentFacilities IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine28 CHECK (monitoringSystem IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine29 CHECK (safeClassificationEvaluation IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine30 CHECK (dumpingSiteStability IN ('','A','B','C','D')),


    CONSTRAINT ck_riskreport_dumpmine31 CHECK (floodProtectionFacilities IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine32 CHECK (preventMudslides IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine33 CHECK (dumpingSafeInspection IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine34 CHECK (dumpingMonitoringSystem IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine35 CHECK (checkFloodStructures IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine36 CHECK (dumpingOutside IN ('','A','B')),
--    CONSTRAINT ck_riskreport_dumpmine37 CHECK (dumpingInternal IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine38 CHECK (majorDangersCriteria IN ('','A','B','C'))


);

comment on column RISKREPORT_DUMPMINE.businessLicense is '企业证照是否健全';
comment on column RISKREPORT_DUMPMINE.businessInfo is '企业基本情况是否良好';
comment on column RISKREPORT_DUMPMINE.dumpingLevel is '排土场等级';
comment on column RISKREPORT_DUMPMINE.dumpingStatus is '排土场的运行状态';
comment on column RISKREPORT_DUMPMINE.businessRisk is '经营风险';
comment on column RISKREPORT_DUMPMINE.safeManageSystem is '有无安全生产管理体系';
comment on column RISKREPORT_DUMPMINE.safeManageinstitution is '安全生产管理制度';
comment on column RISKREPORT_DUMPMINE.contractorManageSys is '承包商管理制度';
comment on column RISKREPORT_DUMPMINE.dangerGovernanceSys is '隐患排查与治理制度';
comment on column RISKREPORT_DUMPMINE.safeEducationSys is '安全教育制度';
comment on column RISKREPORT_DUMPMINE.specialOperationManageSys is '特种作业管理制度';
comment on column RISKREPORT_DUMPMINE.specialSafetyManageSys is '特种设备安全管理制度';
comment on column RISKREPORT_DUMPMINE.facilityMaintenanceManageSys is '设施维修保养管理制度';
comment on column RISKREPORT_DUMPMINE.dangerInvestigationManageSys is '隐患排查管理制度';
comment on column RISKREPORT_DUMPMINE.emergencyPlanDrillSys is '应急预案演练制度';


comment on column RISKREPORT_DUMPMINE.safeProductionPercentage is '安全生产投入占销售额比例';
comment on column RISKREPORT_DUMPMINE.fireManageSys is '消防管理制度';
comment on column RISKREPORT_DUMPMINE.fireFacilities is '消防设施';
comment on column RISKREPORT_DUMPMINE.businessSafeTraining is '企业安全培训情况';
comment on column RISKREPORT_DUMPMINE.safeProductionAccident is '企业五年内历史事故记录';
comment on column RISKREPORT_DUMPMINE.safeStandardization is '安全标准化评定标准';

comment on column RISKREPORT_DUMPMINE.dumpingByRequirements is '按设计要求排土';
comment on column RISKREPORT_DUMPMINE.safeSignsOtherOperations is '安全标志及其他作业';
comment on column RISKREPORT_DUMPMINE.directDumpingOperation is '是否有人指挥排土作业';
comment on column RISKREPORT_DUMPMINE.dumpingSiteManagement is '排土现场管理';
comment on column RISKREPORT_DUMPMINE.carGear is '车档';
comment on column RISKREPORT_DUMPMINE.emergencyEquipmentFacilities is '应急设备设施';
comment on column RISKREPORT_DUMPMINE.monitoringSystem is '监测系统';
comment on column RISKREPORT_DUMPMINE.safeClassificationEvaluation is '安全度分类与评价';
comment on column RISKREPORT_DUMPMINE.dumpingSiteStability is '排土场稳定';


comment on column RISKREPORT_DUMPMINE.floodProtectionFacilities is '防洪设施';
comment on column RISKREPORT_DUMPMINE.preventMudslides is '防泥石流措施';
comment on column RISKREPORT_DUMPMINE.dumpingSafeInspection is '排土场安全检查';
comment on column RISKREPORT_DUMPMINE.dumpingMonitoringSystem is '排土场监测系统';
comment on column RISKREPORT_DUMPMINE.checkFloodStructures is '定期检查防洪构筑物';
comment on column RISKREPORT_DUMPMINE.dumpingOutside is '采场外排土场';
comment on column RISKREPORT_DUMPMINE.dumpingInternal is '内排土场';
comment on column RISKREPORT_DUMPMINE.majorDangersCriteria is '是否存在重大安全隐患';
comment on column RISKREPORT_DUMPMINE.insertTimeForHis is '插入时间';
comment on column RISKREPORT_DUMPMINE.operateTimeForHis is '更新时间';
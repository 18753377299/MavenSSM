drop table if exists RISKREPORT_FACTORYCONSTRUCTION;
CREATE TABLE RISKREPORT_FACTORYCONSTRUCTION
(
    riskFileNo                       CHARACTER VARYING(22) NOT NULL,
    productionSafeAccident           CHARACTER VARYING(1),
    safeProductionLicense            CHARACTER VARYING(1),
    financialRisk                     CHARACTER VARYING(1),
    safeProductionResponsibility     CHARACTER VARYING(1),
    safeProductionAssessment         CHARACTER VARYING(1),
    fundGuaranteeSystem              CHARACTER VARYING(1),
    safeEducationTraining            CHARACTER VARYING(1),
    safeInspectionSys                CHARACTER VARYING(1),
    securityIncidentHandlingSys     CHARACTER VARYING(1),
    emergencyRescueSys               CHARACTER VARYING(1),
    constructionOrganizationSys      CHARACTER VARYING(1),
    safetyTechnicalRegulations       CHARACTER VARYING(1),
    hazardSupervisionSys             CHARACTER VARYING(1),
    hazardDisclosureSys              CHARACTER VARYING(1),
    equipmentDisposalSys             CHARACTER VARYING(1),
    protectionProductsManageSys     CHARACTER VARYING(1),
    constructionFacilityManageSys   CHARACTER VARYING(1),
    constructionSafetyWarnSys       CHARACTER VARYING(1),
    constructionInspectionSys CHARACTER VARYING(1),
    securityRiskControlSys          CHARACTER VARYING(1),
    securityRiskIdentification       CHARACTER VARYING(1),
    securityRiskControl              CHARACTER VARYING(1),
    securityRiskControlMeasures     CHARACTER VARYING(1),
    dangerInvestigationSys           CHARACTER VARYING(1),
    majorDangerRectification         CHARACTER VARYING(1),
    emergencyPlan                     CHARACTER VARYING(1),
    emergencyRescueTeam              CHARACTER VARYING(1),
    emergencyRescueEquipment         CHARACTER VARYING(1),
    foundationPitEngineering         CHARACTER VARYING(1),
    templateEngineering               CHARACTER VARYING(1),
    liftingInstallationWorks         CHARACTER VARYING(1),
    scaffoldingProject                CHARACTER VARYING(1),
    demolition                         CHARACTER VARYING(1),
    subsurfaceExcavationProject      CHARACTER VARYING(1),
    otherProjects                     CHARACTER VARYING(1),
    safeManageQualification    CHARACTER VARYING(1),
    safeManageStaffing         CHARACTER VARYING(1),
    practitionerQualification         CHARACTER VARYING(1),
    subcontractorsPersonnel           CHARACTER VARYING(1),
    foundationPitDepth               CHARACTER VARYING(1),
    buildingHeight                    CHARACTER VARYING(1),
    geologicalStructure               CHARACTER VARYING(1),
    otherDisasters                    CHARACTER VARYING(1),
    majorSafeHazards                 CHARACTER VARYING(1),
	
	insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT pk_riskreport_factoryconstruction PRIMARY KEY (riskFileNo),
    CONSTRAINT ck_riskreport_factoryconstruction1 CHECK (productionSafeAccident IN ('', 'A', 'B','C','D','E')),
    CONSTRAINT ck_riskreport_factoryconstruction2 CHECK (safeProductionLicense IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction3 CHECK (financialRisk IN ('', 'A', 'B','C')),

    CONSTRAINT ck_riskreport_factoryconstruction4 CHECK (safeProductionResponsibility IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction5 CHECK (safeProductionAssessment IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction6 CHECK (fundGuaranteeSystem IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction7 CHECK (safeEducationTraining IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction8 CHECK (safeInspectionSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction9 CHECK (securityIncidentHandlingSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction10 CHECK (emergencyRescueSys IN ('', 'A', 'B','C')),

    CONSTRAINT ck_riskreport_factoryconstruction11 CHECK (constructionOrganizationSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction12 CHECK (safetyTechnicalRegulations IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction13 CHECK (hazardSupervisionSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction14 CHECK (hazardDisclosureSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction15 CHECK (equipmentDisposalSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction16 CHECK (protectionProductsManageSys IN ('', 'A', 'B','C')),

    CONSTRAINT ck_riskreport_factoryconstruction17 CHECK (constructionFacilityManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction18 CHECK (constructionSafetyWarnSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_factoryconstruction19 CHECK (constructionInspectionSys IN ('', 'A', 'B','C')),

    CONSTRAINT ck_riskreport_factoryconstruction20 CHECK (securityRiskControlSys IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction21 CHECK (securityRiskIdentification IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction22 CHECK (securityRiskControl IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_factoryconstruction23 CHECK (securityRiskControlMeasures IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction24 CHECK (dangerInvestigationSys IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction25 CHECK (majorDangerRectification IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction26 CHECK (emergencyPlan IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction27 CHECK (emergencyRescueTeam IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction28 CHECK (emergencyRescueEquipment IN ('', 'A', 'B')),


    CONSTRAINT ck_riskreport_factoryconstruction29 CHECK (foundationPitEngineering IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_factoryconstruction30 CHECK (templateEngineering IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_factoryconstruction31 CHECK (liftingInstallationWorks IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction32 CHECK (scaffoldingProject IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_factoryconstruction33 CHECK (demolition IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_factoryconstruction34 CHECK (subsurfaceExcavationProject IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_factoryconstruction35 CHECK (otherProjects IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction36 CHECK (safeManageQualification IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction37 CHECK (safeManageStaffing IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction38 CHECK (practitionerQualification IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction39 CHECK (subcontractorsPersonnel IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction40 CHECK (foundationPitDepth IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction41 CHECK (buildingHeight IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction42 CHECK (geologicalStructure IN ('', 'A', 'B','C','D')),
    CONSTRAINT ck_riskreport_factoryconstruction43 CHECK (otherDisasters IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_factoryconstruction44 CHECK (majorSafeHazards IN ('', 'A', 'B','C'))


);
comment on column RISKREPORT_FACTORYCONSTRUCTION.riskFileNo is '风控编号';
comment on column RISKREPORT_FACTORYCONSTRUCTION.productionSafeAccident is '生产安全事故';
comment on column RISKREPORT_FACTORYCONSTRUCTION.safeProductionLicense is '安全生产许可证有效性';
comment on column RISKREPORT_FACTORYCONSTRUCTION.financialRisk is '考察企业财务状况及经营稳定性';

comment on column RISKREPORT_FACTORYCONSTRUCTION.safeProductionResponsibility is '安全生产责任制度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.safeProductionAssessment is '安全生产考核制度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.fundGuaranteeSystem is '安全文明资金保障制度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.safeEducationTraining is '安全教育培训制度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.safeInspectionSys is '安全检查及隐患排查制度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.securityIncidentHandlingSys is '生产安全事故报告处理制度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.emergencyRescueSys is '安全生产应急救援制度';

comment on column RISKREPORT_FACTORYCONSTRUCTION.constructionOrganizationSys is '施工组织设计、专项方案（措施）编制、审核、审批制度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.safetyTechnicalRegulations is '安全技术交底规定';
comment on column RISKREPORT_FACTORYCONSTRUCTION.hazardSupervisionSys is '危险源监管制度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.hazardDisclosureSys is '危险源公示、告知制度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.equipmentDisposalSys is '设备（包括应急救援器材）采购、租赁、安装（拆除）、验收、检测、使用、检查、保养、维修、改造和报废制度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.protectionProductsManageSys is '安全防护用品管理制度';

comment on column RISKREPORT_FACTORYCONSTRUCTION.constructionFacilityManageSys is '施工现场临时设施（包括临时建、构筑物、活动板房）的采购、租赁、搭设与拆除、验收、检查、使用的相关管理规定';
comment on column RISKREPORT_FACTORYCONSTRUCTION.constructionSafetyWarnSys is '施工现场安全警示、警告标识、标志使用管理规定';
comment on column RISKREPORT_FACTORYCONSTRUCTION.constructionInspectionSys is '施工场所安全检查、检验仪器、工具配备制度';

comment on column RISKREPORT_FACTORYCONSTRUCTION.securityRiskControlSys is '安全风险管控体系';
comment on column RISKREPORT_FACTORYCONSTRUCTION.securityRiskIdentification is '安全风险辨识';
comment on column RISKREPORT_FACTORYCONSTRUCTION.securityRiskControl is '安全风险管控';

comment on column RISKREPORT_FACTORYCONSTRUCTION.securityRiskControlMeasures is '安全风险管控措施';
comment on column RISKREPORT_FACTORYCONSTRUCTION.dangerInvestigationSys is '隐患排查治理体系';
comment on column RISKREPORT_FACTORYCONSTRUCTION.majorDangerRectification is '重大隐患整改';
comment on column RISKREPORT_FACTORYCONSTRUCTION.emergencyPlan is '应急预案';
comment on column RISKREPORT_FACTORYCONSTRUCTION.emergencyRescueTeam is '应急救援队伍或应急救援协议';
comment on column RISKREPORT_FACTORYCONSTRUCTION.emergencyRescueEquipment is '应急救援装备及物资';


comment on column RISKREPORT_FACTORYCONSTRUCTION.foundationPitEngineering is '基坑工程';

comment on column RISKREPORT_FACTORYCONSTRUCTION.templateEngineering is '模板工程及支撑体系';

comment on column RISKREPORT_FACTORYCONSTRUCTION.liftingInstallationWorks is '起重吊装及起重机械安装拆卸工程';
comment on column RISKREPORT_FACTORYCONSTRUCTION.scaffoldingProject is '脚手架工程';

comment on column RISKREPORT_FACTORYCONSTRUCTION.demolition is '拆除工程';

comment on column RISKREPORT_FACTORYCONSTRUCTION.subsurfaceExcavationProject is '暗挖工程';

comment on column RISKREPORT_FACTORYCONSTRUCTION.otherProjects is '其它工程';
comment on column RISKREPORT_FACTORYCONSTRUCTION.safeManageQualification is '安全管理人员资格';
comment on column RISKREPORT_FACTORYCONSTRUCTION.safeManageStaffing is '安全管理人员配置';
comment on column RISKREPORT_FACTORYCONSTRUCTION.practitionerQualification is '从业人员资格';
comment on column RISKREPORT_FACTORYCONSTRUCTION.subcontractorsPersonnel is '分包单位及人员';
comment on column RISKREPORT_FACTORYCONSTRUCTION.foundationPitDepth is '基坑深度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.buildingHeight is '建筑高度';
comment on column RISKREPORT_FACTORYCONSTRUCTION.geologicalStructure is '地质构造';
comment on column RISKREPORT_FACTORYCONSTRUCTION.otherDisasters is '其他灾害';
comment on column RISKREPORT_FACTORYCONSTRUCTION.majorSafeHazards is '是否存在重大安全隐患';

comment on column RISKREPORT_FACTORYCONSTRUCTION.insertTimeForHis is '插入时间';
comment on column RISKREPORT_FACTORYCONSTRUCTION.operateTimeForHis is '更新时间';
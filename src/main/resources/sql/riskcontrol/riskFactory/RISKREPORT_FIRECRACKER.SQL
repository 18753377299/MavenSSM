drop table if exists RISKREPORT_FIRECRACKER;
CREATE TABLE RISKREPORT_FIRECRACKER
(
    riskFileNo                        CHARACTER VARYING(22) NOT NULL,
    businessLicense                    CHARACTER VARYING(1),
    legalPersonalityProof             CHARACTER VARYING(1),
    safeManageAgency                  CHARACTER VARYING(1),
    materialInspectionAgency          CHARACTER VARYING(1),
    safetyCommittee                    CHARACTER VARYING(1),
    voluntaryFireBrigade              CHARACTER VARYING(1),
    emergencyRescueOrganization       CHARACTER VARYING(1),
    businessInfo                       CHARACTER VARYING(1),
    operatingYears                     CHARACTER VARYING(1),
    operatingRate                      CHARACTER VARYING(1),
    businessRisk                       CHARACTER VARYING(1),


    safeProductionSys                 CHARACTER VARYING(1),
    headDutySys                       CHARACTER VARYING(1),
    employeeRegistrationSys           CHARACTER VARYING(1),
    educationManageSys                CHARACTER VARYING(1),
    guardDutySys                      CHARACTER VARYING(1),
    riskManageSys                     CHARACTER VARYING(1),
    dangerGovernanceSys               CHARACTER VARYING(1),
    majorHazardManageSys             CHARACTER VARYING(1),
    safeProductionExpenseUseSys     CHARACTER VARYING(1),

    safeEquipmentManageSys           CHARACTER VARYING(1),
    newThingManageSys                CHARACTER VARYING(1),
    rawMaterialManageSys             CHARACTER VARYING(1),
    drugManageSys                     CHARACTER VARYING(1),

    productFlowManageSys             CHARACTER VARYING(1),
    occupationalPreventionSys CHARACTER VARYING(1),
    protectiveEquipmentManageSys     CHARACTER VARYING(1),
    safeProductionLegalSys           CHARACTER VARYING(1),
    safeWarnSignManageSys           CHARACTER VARYING(1),
    safeProductionRewardSys          CHARACTER VARYING(1),
    changeSafeManageSys              CHARACTER VARYING(1),
    emergencyManageSys                CHARACTER VARYING(1),
    constructionSafeManageSys        CHARACTER VARYING(1),
    documentManageSys                 CHARACTER VARYING(1),

    safeProductionRatio               CHARACTER VARYING(1),
    insuranceSituation                 CHARACTER VARYING(1),
    fireManageSystem                  CHARACTER VARYING(1),
    fireFacilities                     CHARACTER VARYING(1),
    safeEvacuation                     CHARACTER VARYING(1),
    enterpriseSafeTraining            CHARACTER VARYING(1),
    safeProductionAccident            CHARACTER VARYING(1),
    safeStandardization                CHARACTER VARYING(1),

    mainIngreadient                    CHARACTER VARYING(1),
    processLayout                      CHARACTER VARYING(1),
    buildingStructure                  CHARACTER VARYING(1),
    majorHazard                        CHARACTER VARYING(1),
    emergencyEquipment                 CHARACTER VARYING(1),
    emergencyDrillSituation           CHARACTER VARYING(1),
    fireWastewaterCollectionSys      CHARACTER VARYING(1),
    emergencyDevices                   CHARACTER VARYING(1),
    generalOperator                    CHARACTER VARYING(1),
    specialOperator                    CHARACTER VARYING(1),
    explosionProofMeasures            CHARACTER VARYING(1),
    wastewaterCollectionSys           CHARACTER VARYING(1),
    protectiveEquipment                CHARACTER VARYING(1),


    fireBarrier                        CHARACTER VARYING(1),
    fireExtinguisher                   CHARACTER VARYING(1),
    loadingManageSys                  CHARACTER VARYING(1),
    trunkRoad                          CHARACTER VARYING(1),
    roadHardening                      CHARACTER VARYING(1),
    transportationRoadGradient        CHARACTER VARYING(1),
    areasSchoolsHospitals             CHARACTER VARYING(10),
    majorDanger                        CHARACTER VARYING(1),
	insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT pk_riskreport_firecracker PRIMARY KEY (riskFileNo),
    CONSTRAINT ck_riskreport_firecracker1 CHECK (businessLicense IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker2 CHECK (legalPersonalityProof IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker3 CHECK (safeManageAgency IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker4 CHECK (materialInspectionAgency IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker5 CHECK (safetyCommittee IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker6 CHECK (voluntaryFireBrigade IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker7 CHECK (emergencyRescueOrganization IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker8 CHECK (businessInfo IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker9 CHECK (operatingYears IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker10 CHECK (operatingRate IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker11 CHECK (businessRisk IN ('', 'A', 'B','C')),


    CONSTRAINT ck_riskreport_firecracker12 CHECK (safeProductionSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker13 CHECK (headDutySys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker14 CHECK (employeeRegistrationSys IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker15 CHECK (educationManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker16 CHECK (guardDutySys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker17 CHECK (riskManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker18 CHECK (dangerGovernanceSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker19 CHECK (majorHazardManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker20 CHECK (safeProductionExpenseUseSys IN ('', 'A', 'B','C')),

    CONSTRAINT ck_riskreport_firecracker21 CHECK (safeEquipmentManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker22 CHECK (newThingManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker23 CHECK (rawMaterialManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker24 CHECK (drugManageSys IN ('', 'A', 'B','C')),

    CONSTRAINT ck_riskreport_firecracker25 CHECK (productFlowManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker26 CHECK (occupationalPreventionSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker27 CHECK (protectiveEquipmentManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker28 CHECK ( safeProductionLegalSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker29 CHECK ( safeWarnSignManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker30 CHECK ( safeProductionRewardSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker31 CHECK (changeSafeManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker32 CHECK ( emergencyManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker33 CHECK ( constructionSafeManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker34 CHECK ( documentManageSys IN ('', 'A', 'B','C')),

    CONSTRAINT ck_riskreport_firecracker35 CHECK ( safeProductionRatio IN ('', 'A', 'B','C','D')),
    CONSTRAINT ck_riskreport_firecracker36 CHECK (insuranceSituation IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker37 CHECK ( fireManageSystem IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker38 CHECK ( fireFacilities IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker39 CHECK (safeEvacuation IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker40 CHECK (enterpriseSafeTraining IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker41 CHECK ( safeProductionAccident IN ('', 'A', 'B','C','D')),
    CONSTRAINT ck_riskreport_firecracker42 CHECK ( safeStandardization IN ('', 'A', 'B','C','D')),

    CONSTRAINT ck_riskreport_firecracker43 CHECK ( mainIngreadient IN ('', 'A', 'B','C','D')),
    CONSTRAINT ck_riskreport_firecracker44 CHECK (processLayout IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker45 CHECK ( buildingStructure IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker46 CHECK ( majorHazard IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker47 CHECK (emergencyEquipment IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker48 CHECK ( emergencyDrillSituation IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker49 CHECK ( fireWastewaterCollectionSys IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker50 CHECK ( emergencyDevices IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker51 CHECK ( generalOperator IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker52 CHECK ( specialOperator IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker53 CHECK ( explosionProofMeasures IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker54 CHECK ( wastewaterCollectionSys IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker55 CHECK ( protectiveEquipment IN ('', 'A', 'B')),


    CONSTRAINT ck_riskreport_firecracker56 CHECK (fireBarrier IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker57 CHECK ( fireExtinguisher IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker58 CHECK (loadingManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_firecracker59 CHECK ( trunkRoad IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker60 CHECK ( roadHardening IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker61 CHECK ( transportationRoadGradient IN ('', 'A', 'B','C','D')),
--     CONSTRAINT ck_riskreport_firecracker62 CHECK (areasSchoolsHospitals IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_firecracker63 CHECK ( majorDanger IN ('', 'A', 'B','C'))


);
comment on column RISKREPORT_FIRECRACKER.businessLicense is '企业证照是否健全';
    comment on column RISKREPORT_FIRECRACKER.legalPersonalityProof is '法人条件证明';
    comment on column RISKREPORT_FIRECRACKER.safeManageAgency is '安全管理机构';
    comment on column RISKREPORT_FIRECRACKER.materialInspectionAgency is '原材料检测检验机构';
    comment on column RISKREPORT_FIRECRACKER.safetyCommittee is '安全委员会';
    comment on column RISKREPORT_FIRECRACKER.voluntaryFireBrigade is '义务消防队';
    comment on column RISKREPORT_FIRECRACKER.emergencyRescueOrganization is '应急救援组织';
    comment on column RISKREPORT_FIRECRACKER.businessInfo is '企业基本情况是否良好';
    comment on column RISKREPORT_FIRECRACKER.operatingYears is '企业主要设备运营年限';
    comment on column RISKREPORT_FIRECRACKER.operatingRate is '生产能力与设计能力比值';
    comment on column RISKREPORT_FIRECRACKER.businessRisk is '主要考察企业财务状况及经营稳定性';


    comment on column RISKREPORT_FIRECRACKER.safeProductionSys is '安全生产责任制作规程';
    comment on column RISKREPORT_FIRECRACKER.headDutySys is '企业负责人及涉裸药生产线负责人值（带）班制度';
    comment on column RISKREPORT_FIRECRACKER.employeeRegistrationSys is '职工出入厂（库）区登记制度';
    comment on column RISKREPORT_FIRECRACKER.educationManageSys is '从业人员安全教育培训和特种作业人员管理制度';
    comment on column RISKREPORT_FIRECRACKER.guardDutySys is '厂（库）区门卫值班（守卫）制度';
    comment on column RISKREPORT_FIRECRACKER.riskManageSys is '安全预测预警和风险管理制度';
    comment on column RISKREPORT_FIRECRACKER.dangerGovernanceSys is '隐患排查治理制度';
    comment on column RISKREPORT_FIRECRACKER.majorHazardManageSys is '重大危险源（重点危险部位）监控管理制度';
    comment on column RISKREPORT_FIRECRACKER.safeProductionExpenseUseSys is '安全生产费用提取和使用制度';

    comment on column RISKREPORT_FIRECRACKER.safeEquipmentManageSys is '安全设施设备维护管理制度';
    comment on column RISKREPORT_FIRECRACKER.newThingManageSys is '新药物、新设备、新工艺管理制度';
    comment on column RISKREPORT_FIRECRACKER.rawMaterialManageSys is '原材料购买、检验、储存及使用管理制度';
    comment on column RISKREPORT_FIRECRACKER.drugManageSys is '药物存储管理、 领取管理和余（废） 药处理制度';

    comment on column RISKREPORT_FIRECRACKER.productFlowManageSys is '产品流向登记管理制度';
    comment on column RISKREPORT_FIRECRACKER.occupationalPreventionSys is '工作场所职业病危害防治制度';
    comment on column RISKREPORT_FIRECRACKER.protectiveEquipmentManageSys is '劳动防护用品配备、使用和管理制度';
    comment on column RISKREPORT_FIRECRACKER.safeProductionLegalSys is '安全生产法律法规、标准规范获取制度';
    comment on column RISKREPORT_FIRECRACKER.safeWarnSignManageSys is '安全警示标志管理制度';
    comment on column RISKREPORT_FIRECRACKER.safeProductionRewardSys is '安全生产奖惩管理制度';
    comment on column RISKREPORT_FIRECRACKER.changeSafeManageSys is '变更和相关方安全管理制度';
    comment on column RISKREPORT_FIRECRACKER.emergencyManageSys is '应急和事故管理制度';
    comment on column RISKREPORT_FIRECRACKER.constructionSafeManageSys is '施工和检维修安全管理制度';
    comment on column RISKREPORT_FIRECRACKER.documentManageSys is '文件、档案和记录管理制度';

    comment on column RISKREPORT_FIRECRACKER.safeProductionRatio is '安全生产投入占销售额比例';
    comment on column RISKREPORT_FIRECRACKER.insuranceSituation is '保险情况';
    comment on column RISKREPORT_FIRECRACKER.fireManageSystem is '消防管理制度';
    comment on column RISKREPORT_FIRECRACKER.fireFacilities is '消防设施';
    comment on column RISKREPORT_FIRECRACKER.safeEvacuation is '安全疏散';
    comment on column RISKREPORT_FIRECRACKER.enterpriseSafeTraining is '企业安全培训情况';
    comment on column RISKREPORT_FIRECRACKER.safeProductionAccident is '安全生产事故';
    comment on column RISKREPORT_FIRECRACKER.safeStandardization is '安全标准化评定标准';

    comment on column RISKREPORT_FIRECRACKER.mainIngreadient is '主要原料';
    comment on column RISKREPORT_FIRECRACKER.processLayout is '工艺布置情况';
    comment on column RISKREPORT_FIRECRACKER.buildingStructure is '建筑结构';
    comment on column RISKREPORT_FIRECRACKER.majorHazard is '是否构成重大危险源';
    comment on column RISKREPORT_FIRECRACKER.emergencyEquipment is '应急设备设施';
    comment on column RISKREPORT_FIRECRACKER.emergencyDrillSituation is '应急预案及演练情况';
    comment on column RISKREPORT_FIRECRACKER.fireWastewaterCollectionSys is '消防废水收集系统';
    comment on column RISKREPORT_FIRECRACKER.emergencyDevices is '事故应急设备和装置';
    comment on column RISKREPORT_FIRECRACKER.generalOperator is '操作人员';
    comment on column RISKREPORT_FIRECRACKER.specialOperator is '动火、特种操作工（焊工、电工）';
    comment on column RISKREPORT_FIRECRACKER.explosionProofMeasures is '防爆措施';
    comment on column RISKREPORT_FIRECRACKER.wastewaterCollectionSys is '废水收集系统';
    comment on column RISKREPORT_FIRECRACKER.protectiveEquipment is '监控、预警、防护设备设施';


    comment on column RISKREPORT_FIRECRACKER.fireBarrier is '存储区有无防火隔离带';
    comment on column RISKREPORT_FIRECRACKER.fireExtinguisher is '灭火器';
    comment on column RISKREPORT_FIRECRACKER.loadingManageSys is '装卸操作管理制度';
    comment on column RISKREPORT_FIRECRACKER.trunkRoad is '运输主干道路';
    comment on column RISKREPORT_FIRECRACKER.roadHardening is '道路硬化';
    comment on column RISKREPORT_FIRECRACKER.transportationRoadGradient is '运输道路坡度';
    comment on column RISKREPORT_FIRECRACKER.areasSchoolsHospitals is '安全距离范围内有无居民区，学校、医院';
    comment on column RISKREPORT_FIRECRACKER.majorDanger is '是否存在重大安全隐患';

comment on column RISKREPORT_FIRECRACKER.insertTimeForHis is '插入时间';
comment on column RISKREPORT_FIRECRACKER.operateTimeForHis is '更新时间';
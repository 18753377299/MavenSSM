drop table if exists RISKREPORT_CIVILIANEXPLOSIVE;
CREATE TABLE RISKREPORT_CIVILIANEXPLOSIVE
(
    riskFileNo                       CHARACTER VARYING(22) NOT NULL,
    civilianExplosivesProduction     CHARACTER VARYING(1),
    civilianExplosivesOperation      CHARACTER VARYING(1),
    civilianExplosivesTransportation CHARACTER VARYING(1),
    productionScale                   CHARACTER VARYING(1),

    itemHazardLevel                  CHARACTER VARYING(1),
    buildingHazardLevel              CHARACTER VARYING(1),
    dangerousGoodsAmount             CHARACTER VARYING(1),

    generalLayout                     CHARACTER VARYING(1),
    productionAreaMinDistance       CHARACTER VARYING(1),
    warehouseMinDistance             CHARACTER VARYING(1),
    processEquipmentLayout           CHARACTER VARYING(1),

    dangerousBuildingsSelection      CHARACTER VARYING(1),
    dangerousBuildingsConstruction   CHARACTER VARYING(1),
    antiBlastRoom                    CHARACTER VARYING(1),
    safeEvacuation                    CHARACTER VARYING(1),
    dangerousBuildingsArchitectural  CHARACTER VARYING(1),
    dangerousWarehouseConstruction   CHARACTER VARYING(1),

    safeProductionManageSys         CHARACTER VARYING(1),
    contractorManageSys              CHARACTER VARYING(1),
    dangerInvestigationSys           CHARACTER VARYING(1),
    safeEducationSys                 CHARACTER VARYING(1),
    specialOperationManageSys       CHARACTER VARYING(1),
    hotWorkManageSys                CHARACTER VARYING(1),
    riskControl                       CHARACTER VARYING(1),
    facilityMaintenanceManageSys    CHARACTER VARYING(1),
    smokingSysManage                 CHARACTER VARYING(1),
    emergencyPlanDrillSys           CHARACTER VARYING(1),


    safeProductionInvestment         CHARACTER VARYING(1),
    productionSafeAccident           CHARACTER VARYING(1),
    safeTraining                      CHARACTER VARYING(1),
    safeStandardization               CHARACTER VARYING(1),
    electricalSafe                    CHARACTER VARYING(1),

    detectionControlDevice           CHARACTER VARYING(1),
    safeFacilityEquipment            CHARACTER VARYING(1),
    securitySys                       CHARACTER VARYING(1),
    fireAlarmSystem                  CHARACTER VARYING(1),

    employeeNumber                    CHARACTER VARYING(1),
    professionalTechnical   CHARACTER VARYING(1),
    holdingRatePersonnel             CHARACTER VARYING(1),


    businessLocation                  CHARACTER VARYING(1),
    geologicalCondition               CHARACTER VARYING(1),
    naturalDisaster                   CHARACTER VARYING(1),
    climaticConditions                CHARACTER VARYING(1),
    dangerousWarehouseDistance       CHARACTER VARYING(1),
    surroundingSafeProduction        CHARACTER VARYING(1),
	
	insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT pk_riskreport_civilianexplosive PRIMARY KEY (riskFileNo),
    CONSTRAINT ck_riskreport_civilianexplosive1 CHECK (civilianExplosivesProduction IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive2 CHECK (civilianExplosivesOperation IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive3 CHECK (civilianExplosivesTransportation IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive4 CHECK (productionScale IN ('', 'A', 'B','C')),

    CONSTRAINT ck_riskreport_civilianexplosive5 CHECK (itemHazardLevel IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive6 CHECK (buildingHazardLevel IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive7 CHECK (dangerousGoodsAmount IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_civilianexplosive8 CHECK (generalLayout IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive9 CHECK (productionAreaMinDistance IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive10 CHECK (warehouseMinDistance IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive11 CHECK (processEquipmentLayout IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_civilianexplosive12 CHECK (dangerousBuildingsSelection IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive13 CHECK (dangerousBuildingsConstruction IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive14 CHECK (antiBlastRoom IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive15 CHECK (safeEvacuation IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive16 CHECK (dangerousBuildingsArchitectural IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive17 CHECK (dangerousWarehouseConstruction IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_civilianexplosive18 CHECK (safeProductionManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_civilianexplosive19 CHECK (contractorManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_civilianexplosive20 CHECK (dangerInvestigationSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_civilianexplosive21 CHECK (safeEducationSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_civilianexplosive22 CHECK (specialOperationManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_civilianexplosive23 CHECK (hotWorkManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_civilianexplosive24 CHECK (riskControl IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_civilianexplosive25 CHECK (facilityMaintenanceManageSys IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_civilianexplosive26 CHECK (smokingSysManage IN ('', 'A', 'B','C')),
    CONSTRAINT ck_riskreport_civilianexplosive27 CHECK (emergencyPlanDrillSys IN ('', 'A', 'B','C')),


    CONSTRAINT ck_riskreport_civilianexplosive28 CHECK (safeProductionInvestment IN ('', 'A', 'B','C','D')),
    CONSTRAINT ck_riskreport_civilianexplosive29 CHECK (productionSafeAccident IN ('', 'A', 'B','C','D','E')),
    CONSTRAINT ck_riskreport_civilianexplosive30 CHECK (safeTraining IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive31 CHECK (safeStandardization IN ('', 'A', 'B','C','D')),
    CONSTRAINT ck_riskreport_civilianexplosive32 CHECK (electricalSafe IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_civilianexplosive33 CHECK (detectionControlDevice IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive34 CHECK (safeFacilityEquipment IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive35 CHECK (securitySys IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive36 CHECK (fireAlarmSystem IN ('', 'A', 'B')),

    CONSTRAINT ck_riskreport_civilianexplosive37 CHECK (employeeNumber IN ('', 'A', 'B','C','D','E')),
    CONSTRAINT ck_riskreport_civilianexplosive38 CHECK (professionalTechnical IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive39 CHECK (holdingRatePersonnel IN ('', 'A', 'B')),


    CONSTRAINT ck_riskreport_civilianexplosive40 CHECK (businessLocation IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive41 CHECK (geologicalCondition IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive42 CHECK (naturalDisaster IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive43 CHECK (climaticConditions IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive44 CHECK (dangerousWarehouseDistance IN ('', 'A', 'B')),
    CONSTRAINT ck_riskreport_civilianexplosive45 CHECK (surroundingSafeProduction IN ('', 'A', 'B'))
);
comment on column RISKREPORT_CIVILIANEXPLOSIVE.riskFileNo is '风控编号';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.civilianExplosivesProduction is '民用爆炸物品生产';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.civilianExplosivesOperation is '民用爆炸物品经营';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.civilianExplosivesTransportation is '民用爆炸物品运输';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.productionScale is '生产规模';

comment on column RISKREPORT_CIVILIANEXPLOSIVE.itemHazardLevel is '危险品的危险等级';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.buildingHazardLevel is '建筑物危险等级';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.dangerousGoodsAmount is '危险品的药量';

comment on column RISKREPORT_CIVILIANEXPLOSIVE.generalLayout is '总平面布置';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.productionAreaMinDistance is '危险品生产区内部最小允许距离';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.warehouseMinDistance is '危险品仓库内部最小允许距离';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.processEquipmentLayout is '工艺、设备布局';

comment on column RISKREPORT_CIVILIANEXPLOSIVE.dangerousBuildingsSelection is '危险性建筑物的结构与选型';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.dangerousBuildingsConstruction is '危险性建筑物的结构构造';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.antiBlastRoom is '抗爆间室和抗爆屏院';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.safeEvacuation is '安全疏散';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.dangerousBuildingsArchitectural is '危险性建筑物的建筑构造';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.dangerousWarehouseConstruction is '危险品仓库的建筑构造';


comment on column RISKREPORT_CIVILIANEXPLOSIVE.safeProductionManageSys is '有无安全生产管理制度';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.contractorManageSys is '承包商管理制度';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.dangerInvestigationSys is '隐患排查与治理制度';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.safeEducationSys is '安全教育制度';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.specialOperationManageSys is '特种作业管理制度';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.hotWorkManageSys is '动火作业管理制度';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.riskControl is '风险管控制度';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.facilityMaintenanceManageSys is '设施维修保养管理制度';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.smokingSysManage is '禁烟制度内务管理';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.emergencyPlanDrillSys is '应急预案演练制度';



comment on column RISKREPORT_CIVILIANEXPLOSIVE.safeProductionInvestment is '安全生产投入占销售额比例';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.productionSafeAccident is '生产安全事故情况';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.safeTraining is '安全培训情况';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.safeStandardization is '安全标准化评定标准';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.electricalSafe is '电气安全';

comment on column RISKREPORT_CIVILIANEXPLOSIVE.detectionControlDevice is '检测、控制和联锁装置';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.safeFacilityEquipment is '安全设施设备';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.securitySys is '安全防范系统';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.fireAlarmSystem is '火灾报警系统';

comment on column RISKREPORT_CIVILIANEXPLOSIVE.employeeNumber is '从业人员数量';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.professionalTechnical is '专业技术人员比例';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.holdingRatePersonnel is '“三项岗位”人员持证率';


comment on column RISKREPORT_CIVILIANEXPLOSIVE.businessLocation is '企业位置';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.geologicalCondition is '地质条件';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.naturalDisaster is '自然灾害';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.climaticConditions is '气候条件';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.dangerousWarehouseDistance is '危险品生产区和总仓库区外部距离';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.surroundingSafeProduction is '周围企业安全生产情况';



comment on column RISKREPORT_CIVILIANEXPLOSIVE.insertTimeForHis is '插入时间';
comment on column RISKREPORT_CIVILIANEXPLOSIVE.operateTimeForHis is '更新时间';
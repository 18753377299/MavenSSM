--金属冶炼
drop table if exists RiskReport_SmeltMetal;
CREATE TABLE  RiskReport_SmeltMetal(
        riskFileNo CHARACTER VARYING(22) NOT NULL,
        companyLicPer CHARACTER VARYING(1),
        companyGoodCond CHARACTER VARYING(1),
        Majorequipmentoperateyear CHARACTER VARYING(1),
        prodesignabilityratio CHARACTER VARYING(1),
        compoperatestability CHARACTER VARYING(1),
        establishlegalmansys CHARACTER VARYING(1),
        safepromansys CHARACTER VARYING(1),
        hidedangerinvessys CHARACTER VARYING(1),
        safeeducatesys CHARACTER VARYING(1),
        spectaskmansys CHARACTER VARYING(1),
        hotworkmansys CHARACTER VARYING(1),
        specsafemansys CHARACTER VARYING(1),
        maintainmansys CHARACTER VARYING(1),
        nosmokehousekeepsys CHARACTER VARYING(1),
        electrworkmansys CHARACTER VARYING(1),
        fireplandrillsys CHARACTER VARYING(1),
        dangerworkmansys CHARACTER VARYING(1),
        safeprosaleratio CHARACTER VARYING(1),
        fireconmansys CHARACTER VARYING(1),
        firefacility CHARACTER VARYING(1),
        safetraincondit CHARACTER VARYING(1),
        safeproaccident CHARACTER VARYING(1),
        safestandlevel CHARACTER VARYING(1),
        mainingreadientpro CHARACTER VARYING(1),
        constitutemajordanger CHARACTER VARYING(1),
        protemperature CHARACTER VARYING(1),
        maxpressure CHARACTER VARYING(1),
        emergequipfacility CHARACTER VARYING(1),
        emergemanwordsys CHARACTER VARYING(1),
        majorprotectmeasure CHARACTER VARYING(1),
        exceptemergetreat CHARACTER VARYING(1),
        emergesupply CHARACTER VARYING(1),
        generaloperate CHARACTER VARYING(1),
        hotoperateworker CHARACTER VARYING(1),
        pressequipsafemeasure CHARACTER VARYING(1),
        pressEquipSafeRunMeasure CHARACTER VARYING(1),
        equipmaintensafemeasure CHARACTER VARYING(1),
        prelightmeasure CHARACTER VARYING(1),
        antistaticmeasure CHARACTER VARYING(1),
        explosproofmeasure CHARACTER VARYING(1),
        listenproteequip CHARACTER VARYING(1),
        mainoperatenum CHARACTER VARYING(1),
        prooperateNum CHARACTER VARYING(1),
        metalsmeltsafecert CHARACTER VARYING(1),
        metalsmeltmainexper CHARACTER VARYING(1),
        metalsmeltchargeexper CHARACTER VARYING(1),
        metalsmeltspecexper CHARACTER VARYING(1),
        metalsmeltotherexper CHARACTER VARYING(1),
        residschoolarea CHARACTER VARYING(1),
        farmforestmorearea CHARACTER VARYING(1),
        aroundexistsmeltcomp CHARACTER VARYING(1),
        basehiddendanger CHARACTER VARYING(1),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskReport_SmeltMetal PRIMARY KEY (riskFileNo),
        constraint ck_RiskReport_SmeltMetal1 check (companyLicPer in ('A','B')),
        constraint ck_RiskReport_SmeltMetal2 check (companyGoodCond in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal3 check (Majorequipmentoperateyear in ('A','B')),
        constraint ck_RiskReport_SmeltMetal4 check (prodesignabilityratio in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal5 check (compoperatestability in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal6 check (establishlegalmansys in ('A','B')),
        constraint ck_RiskReport_SmeltMetal7 check (safepromansys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal8 check (hidedangerinvessys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal9 check (safeeducatesys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal10 check (spectaskmansys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal11 check (hotworkmansys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal12 check (specsafemansys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal13 check (maintainmansys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal14 check (nosmokehousekeepsys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal15 check (fireplandrillsys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal16 check (dangerworkmansys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal17 check (safeprosaleratio in ('A','B','C','D')),
        constraint ck_RiskReport_SmeltMetal18 check (fireconmansys in ('A','B')),
        constraint ck_RiskReport_SmeltMetal19 check (firefacility in ('A','B')),
        constraint ck_RiskReport_SmeltMetal20 check (safetraincondit in ('A','B')),
        constraint ck_RiskReport_SmeltMetal21 check (safeproaccident in ('A','B','C','D')),
        constraint ck_RiskReport_SmeltMetal22 check (safestandlevel in ('A','B','C','D')),
        constraint ck_RiskReport_SmeltMetal23 check (mainingreadientpro in ('A','B','C','D')),
        constraint ck_RiskReport_SmeltMetal24 check (constitutemajordanger in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal25 check (protemperature in ('A','B')),
        constraint ck_RiskReport_SmeltMetal26 check (maxpressure in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal27 check (emergequipfacility in ('A','B')),
        constraint ck_RiskReport_SmeltMetal28 check (emergemanwordsys in ('A','B')),
        constraint ck_RiskReport_SmeltMetal29 check (majorprotectmeasure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal30 check (exceptemergetreat in ('A','B')),
        constraint ck_RiskReport_SmeltMetal31 check (emergesupply in ('A','B')),
        constraint ck_RiskReport_SmeltMetal32 check (generaloperate in ('A','B')),
        constraint ck_RiskReport_SmeltMetal33 check (hotoperateworker in ('A','B')),
        constraint ck_RiskReport_SmeltMetal34 check (pressequipsafemeasure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal35 check (equipmaintensafemeasure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal36 check (prelightmeasure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal37 check (antistaticmeasure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal38 check (explosproofmeasure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal39 check (listenproteequip in ('A','B')),
        constraint ck_RiskReport_SmeltMetal40 check (mainoperatenum in ('A','B','C','D','E')),
        constraint ck_RiskReport_SmeltMetal41 check (prooperateNum in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal42 check (metalsmeltsafecert in ('A','B')),
        constraint ck_RiskReport_SmeltMetal43 check (metalsmeltmainexper in ('A','B')),
        constraint ck_RiskReport_SmeltMetal44 check (metalsmeltchargeexper in ('A','B')),
        constraint ck_RiskReport_SmeltMetal45 check (metalsmeltspecexper in ('A','B')),
        constraint ck_RiskReport_SmeltMetal46 check (metalsmeltotherexper in ('A','B')),
        constraint ck_RiskReport_SmeltMetal47 check (residschoolarea in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal48 check (farmforestmorearea in ('A','B')),
        constraint ck_RiskReport_SmeltMetal49 check (aroundexistsmeltcomp in ('A','B')),
        constraint ck_RiskReport_SmeltMetal50 check (basehiddendanger in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal51 check (electrworkmansys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal52 check (pressEquipSafeRunMeasure in ('A','B'))
    );
    
comment on column RiskReport_SmeltMetal.riskFileNo is '风控报告编号';
comment on column RiskReport_SmeltMetal.companyLicPer is '企业证照是否健全';
comment on column RiskReport_SmeltMetal.companyGoodCond is '企业基本情况是否良好';
comment on column RiskReport_SmeltMetal.Majorequipmentoperateyear is '企业主要设备运营年限';
comment on column RiskReport_SmeltMetal.prodesignabilityratio is '生产能力与设计能力比值';
comment on column RiskReport_SmeltMetal.compoperatestability is '主要考察企业财务状况及经营稳定性';
comment on column RiskReport_SmeltMetal.establishlegalmansys is '建立识别、获取、评审、更新安全生产法律法规与其他要求的管理制度';
comment on column RiskReport_SmeltMetal.safepromansys is '安全生产管理制度,其中包括安全生产责任制 ';
comment on column RiskReport_SmeltMetal.hidedangerinvessys is '隐患排查与治理制度';
comment on column RiskReport_SmeltMetal.safeeducatesys is '安全教育制度';
comment on column RiskReport_SmeltMetal.spectaskmansys is '特种作业管理制度';
comment on column RiskReport_SmeltMetal.hotworkmansys is '动火作业管理制度';
comment on column RiskReport_SmeltMetal.specsafemansys is '特种设备安全管理制度';
comment on column RiskReport_SmeltMetal.maintainmansys is '设施维修保养管理制度';
comment on column RiskReport_SmeltMetal.nosmokehousekeepsys is '禁烟制度内务管理';

comment on column RiskReport_SmeltMetal.electrworkmansys is '动电作业管理制度';

comment on column RiskReport_SmeltMetal.fireplandrillsys is '火灾应急预案演练制度';
comment on column RiskReport_SmeltMetal.dangerworkmansys is '危险作业管理制度';
comment on column RiskReport_SmeltMetal.safeprosaleratio is '安全生产投入占销售额比例';
comment on column RiskReport_SmeltMetal.fireconmansys is '消防管理制度';
comment on column RiskReport_SmeltMetal.firefacility is '消防设施';
comment on column RiskReport_SmeltMetal.safetraincondit is '企业安全培训情况';
comment on column RiskReport_SmeltMetal.safeproaccident is '安全生产事故';
comment on column RiskReport_SmeltMetal.safestandlevel is '安全标准化评定标准';
comment on column RiskReport_SmeltMetal.mainingreadientpro is '主要原料、中间体、产品';
comment on column RiskReport_SmeltMetal.constitutemajordanger is '是否构成重大危险源';
comment on column RiskReport_SmeltMetal.protemperature is '生产最高温度';
comment on column RiskReport_SmeltMetal.maxpressure is '最高压力';
comment on column RiskReport_SmeltMetal.emergequipfacility is '应急设备设施';
comment on column RiskReport_SmeltMetal.emergemanwordsys is '应急管理工作制度';
comment on column RiskReport_SmeltMetal.majorprotectmeasure is '重要设备（部位）的温度、压力等关键参数的检测、报警、联锁等应急保护措施';
comment on column RiskReport_SmeltMetal.exceptemergetreat is '异常工况及事故状态下的应急处置措施';
comment on column RiskReport_SmeltMetal.emergesupply is '应急救援装备和物资';
comment on column RiskReport_SmeltMetal.generaloperate is '一般操作人员';
comment on column RiskReport_SmeltMetal.hotoperateworker is '动火、特种操作工（焊工、电工）';
comment on column RiskReport_SmeltMetal.pressequipsafemeasure is '起重设备、压力容器和压力管道等特种设备设计安全措施';

comment on column RiskReport_SmeltMetal.pressEquipSafeRunMeasure is '起重设备、压力容器和压力管道等特种设备安全运行措施';

comment on column RiskReport_SmeltMetal.equipmaintensafemeasure is '设备设施检维修过程中的安全措施';
comment on column RiskReport_SmeltMetal.prelightmeasure is '防雷措施';
comment on column RiskReport_SmeltMetal.antistaticmeasure is '防静电措施';
comment on column RiskReport_SmeltMetal.explosproofmeasure is '防爆措施';
comment on column RiskReport_SmeltMetal.listenproteequip is '监控、预警、防护设备设施';
comment on column RiskReport_SmeltMetal.mainoperatenum is '主要负责人、安全生产管理人员、特种作业人员、其他作业人数总数';
comment on column RiskReport_SmeltMetal.prooperateNum is '生产班当班作业人数';
comment on column RiskReport_SmeltMetal.metalsmeltsafecert is '金属冶炼企业主要负责人、安全生产管理人员、特种作业人员安全资格证书';
comment on column RiskReport_SmeltMetal.metalsmeltmainexper is '金属冶炼企业厂长、副厂长、总工程师、副总工程师学历和工作经历';
comment on column RiskReport_SmeltMetal.metalsmeltchargeexper is '金属冶炼企业安全生产管理机构负责人学历和工作经历';
comment on column RiskReport_SmeltMetal.metalsmeltspecexper is '金属冶炼企业特种作业人员学历和工作经历';
comment on column RiskReport_SmeltMetal.metalsmeltotherexper is '金属冶炼企业其他从业人员学历';
comment on column RiskReport_SmeltMetal.residschoolarea is '有无居民区，学校、医院';
comment on column RiskReport_SmeltMetal.farmforestmorearea is '有无农田、基本农田、草场、林场、河流、湖泊、水库、海岸';
--comment on column RiskReportTailingsLibrary.farmforest is '有无农田、基本农田、草场、林场、行洪区';
comment on column RiskReport_SmeltMetal.aroundexistsmeltcomp is '企业所处地区是否属于工业园区，周围是否存在其他金属冶炼企业';
comment on column RiskReport_SmeltMetal.basehiddendanger is '依据重大隐患判定标准';
comment on column RiskReport_SmeltMetal.inserttimeforhis is '插入时间';
comment on column RiskReport_SmeltMetal.operatetimeforhis is '更新时间';


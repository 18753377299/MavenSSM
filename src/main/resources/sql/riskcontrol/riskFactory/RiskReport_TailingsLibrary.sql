--尾矿库
drop table if exists RiskReport_TailingsLibrary;
CREATE TABLE  RiskReport_TailingsLibrary(
        riskFileNo CHARACTER VARYING(22) NOT NULL,
        companyLicPer CHARACTER VARYING(1),
        companyGoodCond CHARACTER VARYING(1),
        tailypondgrade CHARACTER VARYING(1),
        tailypondisrun CHARACTER VARYING(1),
        operateStabily CHARACTER VARYING(1),
        safePromansetup CHARACTER VARYING(1),
        safePromansys CHARACTER VARYING(1),
        contractmansys CHARACTER VARYING(1),
        hidedangerinvessys CHARACTER VARYING(1),
        safeeducatesys CHARACTER VARYING(1),
        spectaskmansys CHARACTER VARYING(1),
        hotworkmansys CHARACTER VARYING(1),
        specsafemansys CHARACTER VARYING(1),
        maintainmansys CHARACTER VARYING(1),
        floodconmansys CHARACTER VARYING(1),
        emergdrillsys CHARACTER VARYING(1),
        safeprosaleratio CHARACTER VARYING(1),
        fireconmansys CHARACTER VARYING(1),
        firefacility CHARACTER VARYING(1),
        safetraincondit CHARACTER VARYING(1),
        safeproaccident CHARACTER VARYING(1),
        safestandlevel CHARACTER VARYING(1),
        dammingsituation CHARACTER VARYING(1),
        flooddischargefacility CHARACTER VARYING(1),
        damseeplinecon CHARACTER VARYING(1),
        damaccumulategreen CHARACTER VARYING(1),
        emergequipfacility CHARACTER VARYING(1),
        hasshangbaroad CHARACTER VARYING(1),
        emergeequipsuppply CHARACTER VARYING(1),
        tailingpindstaff CHARACTER VARYING(1),
        detectsys CHARACTER VARYING(1),
        seepagemanagementonerule CHARACTER VARYING(1),
        seepagemanagementtworule CHARACTER VARYING(1),
        damstablity CHARACTER VARYING(1),
        drybeachlength CHARACTER VARYING(1),
        seepagelineobservate CHARACTER VARYING(1),
        damsurfacesafe CHARACTER VARYING(1),
        floodstoragemeetrequire CHARACTER VARYING(1),
        overheadlibrary CHARACTER VARYING(1),
        farmforest CHARACTER VARYING(20),
        minedumparound CHARACTER VARYING(1),
        basehiddendanger CHARACTER VARYING(1),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskReport_TailingsLibrary PRIMARY KEY (riskFileNo),
        constraint ck_RiskReport_TailingsLibrary1 check (companyLicPer in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary2 check (companyGoodCond in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary3 check (tailypondgrade in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary4 check (tailypondisrun in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary5 check (operateStabily in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary6 check (safePromansetup in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary7 check (safePromansys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary8 check (contractmansys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary9 check (hidedangerinvessys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary10 check (safeeducatesys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary11 check (spectaskmansys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary12 check (hotworkmansys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary13 check (specsafemansys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary14 check (maintainmansys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary15 check (floodconmansys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary16 check (emergdrillsys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary17 check (safeprosaleratio in ('A','B','C','D')),
        constraint ck_RiskReport_TailingsLibrary18 check (fireconmansys in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary19 check (firefacility in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary20 check (safetraincondit in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary21 check (safeproaccident in ('A','B','C','D','E','F')),
        constraint ck_RiskReport_TailingsLibrary22 check (safestandlevel in ('A','B','C','D')),
        constraint ck_RiskReport_TailingsLibrary23 check (dammingsituation in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary24 check (flooddischargefacility in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary25 check (damseeplinecon in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary26 check (damaccumulategreen in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary27 check (emergequipfacility in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary28 check (hasshangbaroad in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary29 check (emergeequipsuppply in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary30 check (tailingpindstaff in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary31 check (detectsys in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary32 check (seepagemanagementonerule in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary33 check (seepagemanagementtworule in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary34 check (damstablity in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary35 check (drybeachlength in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary36 check (seepagelineobservate in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary37 check (damsurfacesafe in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary38 check (floodstoragemeetrequire in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary39 check (overheadlibrary in ('A','B')),
        ----有无农田、基本农田、草场、林场、行洪区 : 为多选，暂不限制
        constraint ck_RiskReport_TailingsLibrary40 check (minedumparound in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary41 check (basehiddendanger in ('A','B','C'))
    );
---管理风险
comment on column RiskReport_TailingsLibrary.riskFileNo is '风控报告编号';
comment on column RiskReport_TailingsLibrary.companyLicPer is '企业证照是否健全';
comment on column RiskReport_TailingsLibrary.companyGoodCond is '企业基本情况是否良好';
comment on column RiskReport_TailingsLibrary.tailypondgrade is '尾矿库等级';
comment on column RiskReport_TailingsLibrary.tailypondisrun is '尾矿库是否运行';
comment on column RiskReport_TailingsLibrary.operateStabily is '主要考察企业财务状况及经营稳定性';
comment on column RiskReport_TailingsLibrary.safePromansetup is '有无安全生产管理体系';
comment on column RiskReport_TailingsLibrary.safePromansys is '安全生产管理制度';
comment on column RiskReport_TailingsLibrary.contractmansys is '承包商管理制度';
comment on column RiskReport_TailingsLibrary.hidedangerinvessys is '隐患排查与治理制度';
comment on column RiskReport_TailingsLibrary.safeeducatesys is '安全教育制度';
comment on column RiskReport_TailingsLibrary.spectaskmansys is '特种作业管理制度';
comment on column RiskReport_TailingsLibrary.hotworkmansys is '动火作业管理制度';
comment on column RiskReport_TailingsLibrary.specsafemansys is '特种设备安全管理制度';
comment on column RiskReport_TailingsLibrary.maintainmansys is '设施维修保养管理制度';
comment on column RiskReport_TailingsLibrary.floodconmansys is '防洪度汛管理制度';
comment on column RiskReport_TailingsLibrary.emergdrillsys is '应急预案演练制度';
--comment on column RiskReport_TailingsLibrary.riskFileNo is '应急预案演练制度';
comment on column RiskReport_TailingsLibrary.safeprosaleratio is '安全生产投入占销售额比例';
comment on column RiskReport_TailingsLibrary.fireconmansys is '消防管理制度';
comment on column RiskReport_TailingsLibrary.firefacility is '消防设施';
comment on column RiskReport_TailingsLibrary.safetraincondit is '企业安全培训情况';
comment on column RiskReport_TailingsLibrary.safeproaccident is '安全生产事故';
comment on column RiskReport_TailingsLibrary.safestandlevel is '安全标准化评定标准';
---2、工艺风险
comment on column RiskReport_TailingsLibrary.dammingsituation is '筑坝放矿情况';
comment on column RiskReport_TailingsLibrary.flooddischargefacility is '排洪设施';
comment on column RiskReport_TailingsLibrary.damseeplinecon is '坝体渗润线控制';
comment on column RiskReport_TailingsLibrary.damaccumulategreen is '坝体堆积及绿化';
comment on column RiskReport_TailingsLibrary.emergequipfacility is '应急设备设施';
comment on column RiskReport_TailingsLibrary.hasshangbaroad is '有无上坝公路';
comment on column RiskReport_TailingsLibrary.emergeequipsuppply is '事故应急设备和物资';
comment on column RiskReport_TailingsLibrary.tailingpindstaff is '尾矿库人员';
comment on column RiskReport_TailingsLibrary.detectsys is '监测系统';
comment on column RiskReport_TailingsLibrary.seepagemanagementonerule is '渗流管理第一规则';
comment on column RiskReport_TailingsLibrary.seepagemanagementtworule is '渗流管理第二规则';
comment on column RiskReport_TailingsLibrary.damstablity is '坝体稳定';
comment on column RiskReport_TailingsLibrary.drybeachlength is '干滩长度';
comment on column RiskReport_TailingsLibrary.seepagelineobservate is '尾矿坝渗润线观测';
comment on column RiskReport_TailingsLibrary.damsurfacesafe is '坡比、坝面安全情况';
comment on column RiskReport_TailingsLibrary.floodstoragemeetrequire is '调洪库容是否符合要求';
comment on column RiskReport_TailingsLibrary.overheadlibrary is '是否为头顶库';
comment on column RiskReport_TailingsLibrary.farmforest is '有无农田、基本农田、草场、林场、行洪区';
comment on column RiskReport_TailingsLibrary.minedumparound is '尾矿库库区四周是否有采矿、排土场、滑坡等';
comment on column RiskReport_TailingsLibrary.basehiddendanger is '依据重大隐患判定标准';
comment on column RiskReport_TailingsLibrary.inserttimeforhis is '插入时间';
comment on column RiskReport_TailingsLibrary.operatetimeforhis is '更新时间';


    
    
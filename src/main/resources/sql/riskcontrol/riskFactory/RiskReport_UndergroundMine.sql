--地下矿山
drop table if exists RiskReport_UndergroundMine;
CREATE TABLE  RiskReport_UndergroundMine(
        riskFileNo CHARACTER VARYING(22) NOT NULL,
        companyLicPer CHARACTER VARYING(1),
        companyGoodCond CHARACTER VARYING(1),
        openAirUndergr CHARACTER VARYING(1),
        operateStabily CHARACTER VARYING(1),
        safePromansetup CHARACTER VARYING(1),
        safePromansys CHARACTER VARYING(1),
        contractmansys CHARACTER VARYING(1),
        hidedangerinvessys CHARACTER VARYING(1),
        safeeducatesys CHARACTER VARYING(1),
        spectaskmansys CHARACTER VARYING(1),
        specsafemansys CHARACTER VARYING(1),
        maintainmansys CHARACTER VARYING(1),
        roofgrademansys CHARACTER VARYING(1),
        emergdrillsys CHARACTER VARYING(1),
        safeprosaleratio CHARACTER VARYING(1),
        fireconmansys CHARACTER VARYING(1),
        firefacility CHARACTER VARYING(1),
        safetraincondit CHARACTER VARYING(1),
        safeproaccident CHARACTER VARYING(1),
        safestandlevel CHARACTER VARYING(1),
        safeexitonerule CHARACTER VARYING(1),
        safeexittworule CHARACTER VARYING(1),
        welllanepassonerule CHARACTER VARYING(1),
        welllanepasstworule CHARACTER VARYING(1),
        welllanepassthrrule CHARACTER VARYING(1),
        welllanepassfourrule CHARACTER VARYING(1),
        welllanesupponerule CHARACTER VARYING(1),
        welllanesupptworule CHARACTER VARYING(1),
        welllanescrap CHARACTER VARYING(1),
        fallprotect CHARACTER VARYING(1),
        emergequipfacility CHARACTER VARYING(1),
        detectsys CHARACTER VARYING(1),
        safeassess CHARACTER VARYING(1),
        secupillMinearea CHARACTER VARYING(1),
        drawore CHARACTER VARYING(1),
        roofmanage CHARACTER VARYING(1),
        pillarmine CHARACTER VARYING(1),
        electrakewinchore CHARACTER VARYING(1),
        trackshipequiptransp CHARACTER VARYING(1),
        roadtransport CHARACTER VARYING(1),
        shaftlift CHARACTER VARYING(1),
        inclineshaftlift CHARACTER VARYING(1),
        mineventsys CHARACTER VARYING(1),
        dustproof CHARACTER VARYING(1),
        powersupplyunder CHARACTER VARYING(1),
        lightcomunicate CHARACTER VARYING(1),
        groundsysonerule CHARACTER VARYING(1),
        groundsystworule CHARACTER VARYING(1),
        waterproofunder CHARACTER VARYING(1),
        drainageunder CHARACTER VARYING(1),
        fireprevent CHARACTER VARYING(1),
        basehiddendanger CHARACTER VARYING(1),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskReport_UndergroundMine PRIMARY KEY (riskFileNo),
        constraint ck_RiskReport_UndergroundMine1 check (companyLicPer in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine2 check (companyGoodCond in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine3 check (openAirUndergr in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine4 check (operateStabily in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine5 check (safePromansetup in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine6 check (safePromansys in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine7 check (contractmansys in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine8 check (hidedangerinvessys in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine9 check (safeeducatesys in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine10 check (spectaskmansys in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine11 check (specsafemansys in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine12 check (maintainmansys in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine13 check (roofgrademansys in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine14 check (emergdrillsys in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine15 check (safeprosaleratio in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine16 check (fireconmansys in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine17 check (firefacility in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine18 check (safetraincondit in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine19 check (safeproaccident in ('','A','B','C','D','E')),
        constraint ck_RiskReport_UndergroundMine20 check (safestandlevel in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine21 check (safeexitonerule in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine22 check (safeexittworule in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine23 check (welllanepassonerule in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine24 check (welllanepasstworule in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine25 check (welllanepassthrrule in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine26 check (welllanepassfourrule in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine27 check (welllanesupponerule in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine28 check (welllanesupptworule in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine29 check (welllanescrap in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine30 check (fallprotect in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine31 check (emergequipfacility in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine32 check (detectsys in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine33 check (safeassess in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine34 check (secupillMinearea in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine35 check (drawore in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine36 check (roofmanage in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine37 check (pillarmine in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine38 check (electrakewinchore in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine39 check (trackshipequiptransp in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine40 check (roadtransport in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine41 check (shaftlift in ('','A','B','C')),
        constraint ck_RiskReport_UndergroundMine42 check (inclineshaftlift in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine43 check (mineventsys in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine44 check (dustproof in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine45 check (powersupplyunder in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine46 check (lightcomunicate in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine47 check (groundsysonerule in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine48 check (groundsystworule in ('','A','B')),
        constraint ck_RiskReport_UndergroundMine49 check (waterproofunder in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine50 check (drainageunder in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine51 check (fireprevent in ('','A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine52 check (basehiddendanger in ('','A','B','C'))
    );
    
comment on column RiskReport_UndergroundMine.riskFileNo is '风控报告编号';
comment on column RiskReport_UndergroundMine.companyLicPer is '企业证照是否健全';
comment on column RiskReport_UndergroundMine.companyGoodCond is '企业基本情况是否良好';
comment on column RiskReport_UndergroundMine.openAirUndergr is '地下、露天转地下';
comment on column RiskReport_UndergroundMine.operateStabily is '主要考察企业财务状况及经营稳定性';
comment on column RiskReport_UndergroundMine.safePromansetup is '有无安全生产管理体系';
comment on column RiskReport_UndergroundMine.safePromansys is '安全生产管理制度';
comment on column RiskReport_UndergroundMine.contractmansys is '承包商管理制度';
comment on column RiskReport_UndergroundMine.hidedangerinvessys is '隐患排查与治理制度';
comment on column RiskReport_UndergroundMine.safeeducatesys is '安全教育制度';
comment on column RiskReport_UndergroundMine.spectaskmansys is '特种作业管理制度';
comment on column RiskReport_UndergroundMine.specsafemansys is '特种设备安全管理制度';
comment on column RiskReport_UndergroundMine.maintainmansys is '设施维修保养管理制度';
comment on column RiskReport_UndergroundMine.roofgrademansys is '顶板分级管理制度';
comment on column RiskReport_UndergroundMine.emergdrillsys is '应急预案演练制度';
--comment on column RiskReport_UndergroundMine.riskFileNo is '应急预案演练制度';
comment on column RiskReport_UndergroundMine.safeprosaleratio is '安全生产投入占销售额比例';
comment on column RiskReport_UndergroundMine.fireconmansys is '消防管理制度';
comment on column RiskReport_UndergroundMine.firefacility is '消防设施';
comment on column RiskReport_UndergroundMine.safetraincondit is '安全培训情况';
comment on column RiskReport_UndergroundMine.safeproaccident is '安全生产事故';
comment on column RiskReport_UndergroundMine.safestandlevel is '安全标准化等级';
comment on column RiskReport_UndergroundMine.safeexitonerule is '安全出口第一规则';
comment on column RiskReport_UndergroundMine.safeexittworule is '安全出口第二规则';
comment on column RiskReport_UndergroundMine.welllanepassonerule is '井巷人行通道第一规则';
comment on column RiskReport_UndergroundMine.welllanepasstworule is '井巷人行通道第二规则';
comment on column RiskReport_UndergroundMine.welllanepassthrrule is '井巷人行通道第三规则';
comment on column RiskReport_UndergroundMine.welllanepassfourrule is '井巷人行通道第四规则';
comment on column RiskReport_UndergroundMine.welllanesupponerule is '井巷支护第一规则';
comment on column RiskReport_UndergroundMine.welllanesupptworule is '井巷支护第二规则';
comment on column RiskReport_UndergroundMine.welllanescrap is '井巷报废';
comment on column RiskReport_UndergroundMine.fallprotect is '防坠落';
comment on column RiskReport_UndergroundMine.emergequipfacility is '应急设备设施';
comment on column RiskReport_UndergroundMine.detectsys is '监测系统';
comment on column RiskReport_UndergroundMine.safeassess is '安全评价';
comment on column RiskReport_UndergroundMine.secupillMinearea is '保安矿柱及采空区';
comment on column RiskReport_UndergroundMine.drawore is '放矿';
comment on column RiskReport_UndergroundMine.roofmanage is '顶板管理';
comment on column RiskReport_UndergroundMine.pillarmine is '矿柱回采';
comment on column RiskReport_UndergroundMine.electrakewinchore is '电耙绞车出矿';
comment on column RiskReport_UndergroundMine.trackshipequiptransp is '无轨装运设备运输';
comment on column RiskReport_UndergroundMine.roadtransport is '平巷运输';
comment on column RiskReport_UndergroundMine.shaftlift is '竖井提升';
comment on column RiskReport_UndergroundMine.inclineshaftlift is '斜井提升';
comment on column RiskReport_UndergroundMine.mineventsys is '矿井通风系统';
comment on column RiskReport_UndergroundMine.dustproof is '防尘';
comment on column RiskReport_UndergroundMine.powersupplyunder is '井下供电';
comment on column RiskReport_UndergroundMine.lightcomunicate is '照明、通信';
comment on column RiskReport_UndergroundMine.groundsysonerule is '接地系统第一规则';
comment on column RiskReport_UndergroundMine.groundsystworule is '接地系统第二规则';
comment on column RiskReport_UndergroundMine.waterproofunder is '井下防水';
comment on column RiskReport_UndergroundMine.drainageunder is '井下排水';
comment on column RiskReport_UndergroundMine.fireprevent is '防火';
comment on column RiskReport_UndergroundMine.basehiddendanger is '依据重大隐患判定标准';
comment on column RiskReport_UndergroundMine.inserttimeforhis is '插入时间';
comment on column RiskReport_UndergroundMine.operatetimeforhis is '更新时间';


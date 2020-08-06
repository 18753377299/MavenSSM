--露天矿山
drop table if exists RiskReport_AbovegroundMine;
CREATE TABLE  RiskReport_AbovegroundMine(
        riskFileNo CHARACTER VARYING(22) NOT NULL,
        companyLicPer CHARACTER VARYING(1),
        companyGoodCond CHARACTER VARYING(1),
        openhillsidesunken CHARACTER VARYING(1),
        operateStabily CHARACTER VARYING(1),
        safePromansetup CHARACTER VARYING(1),
        safePromansys CHARACTER VARYING(1),
        contractmansys CHARACTER VARYING(1),
        hidedangerinvessys CHARACTER VARYING(1),
        safeeducatesys CHARACTER VARYING(1),
        spectaskmansys CHARACTER VARYING(1),
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
        stope CHARACTER VARYING(1),
        heightsafeplat CHARACTER VARYING(1),
        stopeslope CHARACTER VARYING(1),
        airundertogemine CHARACTER VARYING(1),
        stopeoperleaddistance CHARACTER VARYING(1),
        emergequipfacility CHARACTER VARYING(1),
        detectsys CHARACTER VARYING(1),
        safeassess CHARACTER VARYING(1),
        perforateequipsel CHARACTER VARYING(1),
        rig CHARACTER VARYING(1),
        blastmethod CHARACTER VARYING(1),
        shoveequiprequire CHARACTER VARYING(1),
        excavator CHARACTER VARYING(1),
        Preinstalled CHARACTER VARYING(1),
        minedumptruck CHARACTER VARYING(1),
        electlocomotive CHARACTER VARYING(1),
        Beltconveyor CHARACTER VARYING(1),
        Crushequip CHARACTER VARYING(1),
        transportroad CHARACTER VARYING(1),
        floodprotefactility CHARACTER VARYING(1),
        powersupplysys CHARACTER VARYING(1),
        powersupplycir CHARACTER VARYING(1),
        groundsysonerule CHARACTER VARYING(1),
        groundsystworule CHARACTER VARYING(1),
        detect CHARACTER VARYING(1),
        basehiddendanger CHARACTER VARYING(1),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskReport_AbovegroundMine PRIMARY KEY (riskFileNo),
        constraint ck_RiskReport_AbovegroundMine1 check (companyLicPer in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine2 check (companyGoodCond in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine3 check (openhillsidesunken in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine4 check (operateStabily in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine5 check (safePromansetup in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine6 check (safePromansys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine7 check (contractmansys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine8 check (hidedangerinvessys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine9 check (safeeducatesys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine10 check (spectaskmansys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine11 check (specsafemansys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine12 check (maintainmansys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine13 check (floodconmansys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine14 check (emergdrillsys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine15 check (safeprosaleratio in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine16 check (fireconmansys in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine17 check (firefacility in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine18 check (safetraincondit in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine19 check (safeproaccident in ('A','B','C','D','E')),
        constraint ck_RiskReport_AbovegroundMine20 check (safestandlevel in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine21 check (stope in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine22 check (heightsafeplat in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine23 check (stopeslope in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine24 check (airundertogemine in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine25 check (stopeoperleaddistance in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine26 check (emergequipfacility in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine27 check (detectsys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine28 check (safeassess in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine29 check (perforateequipsel in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine30 check (rig in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine31 check (blastmethod in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine32 check (shoveequiprequire in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine33 check (excavator in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine34 check (Preinstalled in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine35 check (minedumptruck in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine36 check (electlocomotive in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine37 check (Beltconveyor in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine38 check (Crushequip in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine39 check (transportroad in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine40 check (floodprotefactility in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine41 check (powersupplysys in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine42 check (powersupplycir in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine43 check (groundsysonerule in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine44 check (groundsystworule in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine45 check (detect in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine46 check (basehiddendanger in ('A','B','C'))
    );  
comment on column RiskReport_AbovegroundMine.riskFileNo is '风控报告编号';
comment on column RiskReport_AbovegroundMine.companyLicPer is '企业证照是否健全';
comment on column RiskReport_AbovegroundMine.companyGoodCond is '企业基本情况是否良好';
comment on column RiskReport_AbovegroundMine.openhillsidesunken is '山坡露天、凹陷露天';
comment on column RiskReport_AbovegroundMine.operateStabily is '主要考察企业财务状况及经营稳定性';
comment on column RiskReport_AbovegroundMine.safePromansetup is '有无安全生产管理体系';
comment on column RiskReport_AbovegroundMine.safePromansys is '安全生产管理制度';
comment on column RiskReport_AbovegroundMine.contractmansys is '承包商管理制度';
comment on column RiskReport_AbovegroundMine.hidedangerinvessys is '隐患排查与治理制度';
comment on column RiskReport_AbovegroundMine.safeeducatesys is '安全教育制度';
comment on column RiskReport_AbovegroundMine.spectaskmansys is '特种作业管理制度';
comment on column RiskReport_AbovegroundMine.specsafemansys is '特种设备安全管理制度';
comment on column RiskReport_AbovegroundMine.maintainmansys is '设施维修保养管理制度';
comment on column RiskReport_AbovegroundMine.floodconmansys is '防洪度汛管理制度';
comment on column RiskReport_AbovegroundMine.emergdrillsys is '应急预案演练制度';
--comment on column RiskReport_AbovegroundMine.riskFileNo is '应急预案演练制度';
comment on column RiskReport_AbovegroundMine.safeprosaleratio is '安全生产投入占销售额比例';
comment on column RiskReport_AbovegroundMine.fireconmansys is '消防管理制度';
comment on column RiskReport_AbovegroundMine.firefacility is '消防设施';
comment on column RiskReport_AbovegroundMine.safetraincondit is '企业安全培训情况';
comment on column RiskReport_AbovegroundMine.safeproaccident is '安全生产事故';
comment on column RiskReport_AbovegroundMine.safestandlevel is '安全标准化评定标准';
comment on column RiskReport_AbovegroundMine.stope is '采场';
comment on column RiskReport_AbovegroundMine.heightsafeplat is '台阶高度、安全平台';
comment on column RiskReport_AbovegroundMine.stopeslope is '采场边坡';
comment on column RiskReport_AbovegroundMine.airundertogemine is '露天开采转地下开采、地下开采改为露天开采和露天与地下同时开采';
comment on column RiskReport_AbovegroundMine.stopeoperleaddistance is '采场各作业水平上、下台阶之间的超前距离';
comment on column RiskReport_AbovegroundMine.emergequipfacility is '应急设备设施';
comment on column RiskReport_AbovegroundMine.detectsys is '监测系统';
comment on column RiskReport_AbovegroundMine.safeassess is '安全评价';
comment on column RiskReport_AbovegroundMine.perforateequipsel is '穿孔设备选型';
comment on column RiskReport_AbovegroundMine.rig is '钻机';
comment on column RiskReport_AbovegroundMine.blastmethod is '爆破方式';
comment on column RiskReport_AbovegroundMine.shoveequiprequire is '铲装设备一般要求';
comment on column RiskReport_AbovegroundMine.excavator is '挖掘机';
comment on column RiskReport_AbovegroundMine.Preinstalled is '前装机';
comment on column RiskReport_AbovegroundMine.minedumptruck is '矿用自卸矿车';
comment on column RiskReport_AbovegroundMine.electlocomotive is '电机车';
comment on column RiskReport_AbovegroundMine.Beltconveyor is '带式输送机';
comment on column RiskReport_AbovegroundMine.Crushequip is '破碎设备';
comment on column RiskReport_AbovegroundMine.transportroad is '运输道路';
comment on column RiskReport_AbovegroundMine.floodprotefactility is '防洪设施';
comment on column RiskReport_AbovegroundMine.powersupplysys is '供电系统';
comment on column RiskReport_AbovegroundMine.powersupplycir is '供电线路';
comment on column RiskReport_AbovegroundMine.groundsysonerule is '接地系统第一规则';
comment on column RiskReport_AbovegroundMine.groundsystworule is '接地系统第二规则';
comment on column RiskReport_AbovegroundMine.detect is '检验检测';
comment on column RiskReport_AbovegroundMine.basehiddendanger is '依据重大隐患判定标准';
comment on column RiskReport_AbovegroundMine.inserttimeforhis is '插入时间';
comment on column RiskReport_AbovegroundMine.operatetimeforhis is '更新时间';


    
    
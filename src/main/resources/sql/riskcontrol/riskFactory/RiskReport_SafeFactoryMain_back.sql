-----安全工厂主表
drop table if exists RiskReport_SafeFactoryMain;
CREATE TABLE  RiskReport_SafeFactoryMain
    (
        risk_file_no CHARACTER VARYING(22) NOT NULL,
        class_code CHARACTER VARYING(2),
        riskcode CHARACTER VARYING(3),
        comcode CHARACTER VARYING(8),
        riskmodel CHARACTER VARYING(3),
        insuredtype CHARACTER VARYING(1),
        insuredcode CHARACTER VARYING(30),
        insuredname CHARACTER VARYING(120),
        postcode CHARACTER VARYING(6),
        businesssource CHARACTER VARYING(6),
        businessclass CHARACTER VARYING(2),
        unitnature CHARACTER VARYING(1),
        underwritestatus CHARACTER VARYING(1),
        operatorcode CHARACTER VARYING(10),
        operatorcodeuni CHARACTER VARYING(10),
        sumamount NUMERIC(14,4),
        undwrtsubmitdate DATE,
        underwriteflag CHARACTER VARYING(1),
        underwritedate DATE,
        underwritecode CHARACTER VARYING(10),
        underwritename CHARACTER VARYING(120),
        explorecomcode CHARACTER VARYING(8),
        explorer CHARACTER VARYING(10),
        exploreruni CHARACTER VARYING(10),
        exploredate DATE,
        madedate DATE,
        exploretype CHARACTER VARYING(1),
        lastriskfileno CHARACTER VARYING(22),
        mobileflag CHARACTER VARYING(1),
        archivesno CHARACTER VARYING(22),
        addrisk CHARACTER VARYING(15),
        customerexplain CHARACTER VARYING(4000),
        onceaccidentlosest NUMERIC(14,2),
        riskunitnumber INTEGER,
        riskunitexplain CHARACTER VARYING(4000),
        loserate NUMERIC(5,2),
        highlightrisk CHARACTER VARYING(4000),
        score NUMERIC(5,2),
        supplementappraisal CHARACTER VARYING(4000),
        risksuggest CHARACTER VARYING(1),
        othsuggest CHARACTER VARYING(4000),
        addmessage CHARACTER VARYING(4000),
        utiweightid INTEGER,
        executionid CHARACTER VARYING(50),
        repulsesugggest CHARACTER VARYING(1000),
        valuation CHARACTER VARYING(1),
        proposalno CHARACTER VARYING(22),
        policyno CHARACTER VARYING(22),
        insert_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operate_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskReport_SafeFactoryMain PRIMARY KEY (risk_file_no)
    );
comment on column RiskReport_AbovegroundMine.risk_File_No is '风控报告编号';
comment on column RiskReport_AbovegroundMine.company_Lic_Per is '企业证照是否健全';
comment on column RiskReport_AbovegroundMine.company_Good_Cond is '企业基本情况是否良好';
comment on column RiskReport_AbovegroundMine.open_hillside_sunken is '山坡露天、凹陷露天';
comment on column RiskReport_AbovegroundMine.operate_Stabily is '主要考察企业财务状况及经营稳定性';
comment on column RiskReport_AbovegroundMine.safe_Pro_man_set_up is '有无安全生产管理体系';
comment on column RiskReport_AbovegroundMine.safe_Pro_man_sys is '安全生产管理制度';
comment on column RiskReport_AbovegroundMine.contract_man_sys is '承包商管理制度';
comment on column RiskReport_AbovegroundMine.hide_danger_inves_sys is '隐患排查与治理制度';
comment on column RiskReport_AbovegroundMine.safe_educate_sys is '安全教育制度';
comment on column RiskReport_AbovegroundMine.spec_task_man_sys is '特种作业管理制度';
comment on column RiskReport_AbovegroundMine.spec_safe_man_sys is '特种设备安全管理制度';
comment on column RiskReport_AbovegroundMine.main_tain_man_sys is '设施维修保养管理制度';
comment on column RiskReport_AbovegroundMine.flood_con_man_sys is '防洪度汛管理制度';
comment on column RiskReport_AbovegroundMine.emerg_drill_sys is '应急预案演练制度';
--comment on column RiskReport_AbovegroundMine.risk_File_No is '应急预案演练制度';
comment on column RiskReport_AbovegroundMine.safe_pro_sale_ratio is '安全生产投入占销售额比例';
comment on column RiskReport_AbovegroundMine.fire_con_man_sys is '消防管理制度';
comment on column RiskReport_AbovegroundMine.fire_facility is '消防设施';
comment on column RiskReport_AbovegroundMine.safe_train_condit is '企业安全培训情况';
comment on column RiskReport_AbovegroundMine.safe_pro_accident is '安全生产事故';
comment on column RiskReport_AbovegroundMine.safe_stand_level is '安全标准化评定标准';
comment on column RiskReport_AbovegroundMine.stope is '采场';
comment on column RiskReport_AbovegroundMine.height_safe_plat is '台阶高度、安全平台';
comment on column RiskReport_AbovegroundMine.stope_slope is '采场边坡';
comment on column RiskReport_AbovegroundMine.air_under_toge_mine is '露天开采转地下开采、地下开采改为露天开采和露天与地下同时开采';
comment on column RiskReport_AbovegroundMine.stope_oper_lead_distance is '采场各作业水平上、下台阶之间的超前距离';
comment on column RiskReport_AbovegroundMine.emerg_equip_facility is '应急设备设施';
comment on column RiskReport_AbovegroundMine.detect_sys is '监测系统';
comment on column RiskReport_AbovegroundMine.safe_assess is '安全评价';
comment on column RiskReport_AbovegroundMine.perforate_equip_sel is '穿孔设备选型';
comment on column RiskReport_AbovegroundMine.rig is '钻机';
comment on column RiskReport_AbovegroundMine.blast_method is '爆破方式';
comment on column RiskReport_AbovegroundMine.shove_equip_require is '铲装设备一般要求';
comment on column RiskReport_AbovegroundMine.excavator is '挖掘机';
comment on column RiskReport_AbovegroundMine.Pre_installed is '前装机';
comment on column RiskReport_AbovegroundMine.mine_dump_truck is '矿用自卸矿车';
comment on column RiskReport_AbovegroundMine.elect_locomotive is '电机车';
comment on column RiskReport_AbovegroundMine.Belt_conveyor is '带式输送机';
comment on column RiskReport_AbovegroundMine.Crush_equip is '破碎设备';
comment on column RiskReport_AbovegroundMine.transport_road is '运输道路';
comment on column RiskReport_AbovegroundMine.flood_prote_factility is '防洪设施';
comment on column RiskReport_AbovegroundMine.power_supply_sys is '供电系统';
comment on column RiskReport_AbovegroundMine.power_supply_cir is '供电线路';
comment on column RiskReport_AbovegroundMine.ground_sys_one_rule is '接地系统第一规则';
comment on column RiskReport_AbovegroundMine.ground_sys_two_rule is '接地系统第二规则';
comment on column RiskReport_AbovegroundMine.detect is '检验检测';
comment on column RiskReport_AbovegroundMine.base_hidden_danger is '依据重大隐患判定标准';
comment on column RiskReport_AbovegroundMine.insert_time_for_his is '插入时间';
comment on column RiskReport_AbovegroundMine.operate_time_for_his is '更新时间';
    
    
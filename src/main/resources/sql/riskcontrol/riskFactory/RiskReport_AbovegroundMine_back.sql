--露天矿山
drop table if exists RiskReport_AbovegroundMine;
CREATE TABLE  RiskReport_AbovegroundMine(
        risk_File_No CHARACTER VARYING(22) NOT NULL,
        company_Lic_Per CHARACTER VARYING(1),
        company_Good_Cond CHARACTER VARYING(1),
        open_hillside_sunken CHARACTER VARYING(1),
        operate_Stabily CHARACTER VARYING(1),
        safe_Pro_man_set_up CHARACTER VARYING(1),
        safe_Pro_man_sys CHARACTER VARYING(1),
        contract_man_sys CHARACTER VARYING(1),
        hide_danger_inves_sys CHARACTER VARYING(1),
        safe_educate_sys CHARACTER VARYING(1),
        spec_task_man_sys CHARACTER VARYING(1),
        spec_safe_man_sys CHARACTER VARYING(1),
        main_tain_man_sys CHARACTER VARYING(1),
        flood_con_man_sys CHARACTER VARYING(1),
        emerg_drill_sys CHARACTER VARYING(1),
        safe_pro_sale_ratio CHARACTER VARYING(1),
        fire_con_man_sys CHARACTER VARYING(1),
        fire_facility CHARACTER VARYING(1),
        safe_train_condit CHARACTER VARYING(1),
        safe_pro_accident CHARACTER VARYING(1),
        safe_stand_level CHARACTER VARYING(1),
        stope CHARACTER VARYING(1),
        height_safe_plat CHARACTER VARYING(1),
        stope_slope CHARACTER VARYING(1),
        air_under_toge_mine CHARACTER VARYING(1),
        stope_oper_lead_distance CHARACTER VARYING(1),
        emerg_equip_facility CHARACTER VARYING(1),
        detect_sys CHARACTER VARYING(1),
        safe_assess CHARACTER VARYING(1),
        perforate_equip_sel CHARACTER VARYING(1),
        rig CHARACTER VARYING(1),
        blast_method CHARACTER VARYING(1),
        shove_equip_require CHARACTER VARYING(1),
        excavator CHARACTER VARYING(1),
        Pre_installed CHARACTER VARYING(1),
        mine_dump_truck CHARACTER VARYING(1),
        elect_locomotive CHARACTER VARYING(1),
        Belt_conveyor CHARACTER VARYING(1),
        Crush_equip CHARACTER VARYING(1),
        transport_road CHARACTER VARYING(1),
        flood_prote_factility CHARACTER VARYING(1),
        power_supply_sys CHARACTER VARYING(1),
        power_supply_cir CHARACTER VARYING(1),
        ground_sys_one_rule CHARACTER VARYING(1),
        ground_sys_two_rule CHARACTER VARYING(1),
        detect CHARACTER VARYING(1),
        base_hidden_danger CHARACTER VARYING(1),
        insert_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operate_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskReport_AbovegroundMine PRIMARY KEY (risk_File_No),
        constraint ck_RiskReport_AbovegroundMine1 check (company_Lic_Per in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine2 check (company_Good_Cond in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine3 check (open_hillside_sunken in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine4 check (operate_Stabily in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine5 check (safe_Pro_man_set_up in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine6 check (safe_Pro_man_sys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine7 check (contract_man_sys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine8 check (hide_danger_inves_sys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine9 check (safe_educate_sys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine10 check (spec_task_man_sys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine11 check (spec_safe_man_sys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine12 check (main_tain_man_sys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine13 check (flood_con_man_sys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine14 check (emerg_drill_sys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine15 check (safe_pro_sale_ratio in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine16 check (fire_con_man_sys in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine17 check (fire_facility in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine18 check (safe_train_condit in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine19 check (safe_pro_accident in ('A','B','C','D','E')),
        constraint ck_RiskReport_AbovegroundMine20 check (safe_stand_level in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine21 check (stope in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine22 check (height_safe_plat in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine23 check (stope_slope in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine24 check (air_under_toge_mine in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine25 check (stope_oper_lead_distance in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine26 check (emerg_equip_facility in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine27 check (detect_sys in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine28 check (safe_assess in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine29 check (perforate_equip_sel in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine30 check (rig in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine31 check (blast_method in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine32 check (shove_equip_require in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine33 check (excavator in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine34 check (Pre_installed in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine35 check (mine_dump_truck in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine36 check (elect_locomotive in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine37 check (Belt_conveyor in ('A','B','C')),
        constraint ck_RiskReport_AbovegroundMine38 check (Crush_equip in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine39 check (transport_road in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine40 check (flood_prote_factility in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine41 check (power_supply_sys in ('A','B','C','D')),
        constraint ck_RiskReport_AbovegroundMine42 check (power_supply_cir in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine43 check (ground_sys_one_rule in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine44 check (ground_sys_two_rule in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine45 check (detect in ('A','B')),
        constraint ck_RiskReport_AbovegroundMine46 check (base_hidden_danger in ('A','B','C'))
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


    
    
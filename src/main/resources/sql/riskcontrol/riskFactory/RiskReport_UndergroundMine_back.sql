--地下矿山
drop table if exists  RiskReport_UndergroundMine;
CREATE TABLE  RiskReport_UndergroundMine(
        risk_File_No CHARACTER VARYING(22) NOT NULL,
        company_Lic_Per CHARACTER VARYING(1),
        company_Good_Cond CHARACTER VARYING(1),
        open_Air_Undergr CHARACTER VARYING(1),
        operate_Stabily CHARACTER VARYING(1),
        safe_Pro_man_set_up CHARACTER VARYING(1),
        safe_Pro_man_sys CHARACTER VARYING(1),
        contract_man_sys CHARACTER VARYING(1),
        hide_danger_inves_sys CHARACTER VARYING(1),
        safe_educate_sys CHARACTER VARYING(1),
        spec_task_man_sys CHARACTER VARYING(1),
        spec_safe_man_sys CHARACTER VARYING(1),
        main_tain_man_sys CHARACTER VARYING(1),
        roof_grade_man_sys CHARACTER VARYING(1),
        emerg_drill_sys CHARACTER VARYING(1),
        safe_pro_sale_ratio CHARACTER VARYING(1),
        fire_con_man_sys CHARACTER VARYING(1),
        fire_facility CHARACTER VARYING(1),
        safe_train_condit CHARACTER VARYING(1),
        safe_pro_accident CHARACTER VARYING(1),
        safe_stand_level CHARACTER VARYING(1),
        safe_exit_one_rule CHARACTER VARYING(1),
        safe_exit_two_rule CHARACTER VARYING(1),
        well_lane_pass_one_rule CHARACTER VARYING(1),
        well_lane_pass_two_rule CHARACTER VARYING(1),
        well_lane_pass_thr_rule CHARACTER VARYING(1),
        well_lane_pass_four_rule CHARACTER VARYING(1),
        well_lane_supp_one_rule CHARACTER VARYING(1),
        well_lane_supp_two_rule CHARACTER VARYING(1),
        well_lane_scrap CHARACTER VARYING(1),
        fall_protect CHARACTER VARYING(1),
        emerg_equip_facility CHARACTER VARYING(1),
        detect_sys CHARACTER VARYING(1),
        safe_assess CHARACTER VARYING(1),
        secu_pill_Mine_area CHARACTER VARYING(1),
        draw_ore CHARACTER VARYING(1),
        roof_manage CHARACTER VARYING(1),
        pillar_mine CHARACTER VARYING(1),
        elect_rake_winch_ore CHARACTER VARYING(1),
        track_ship_equip_transp CHARACTER VARYING(1),
        road_transport CHARACTER VARYING(1),
        shaft_lift CHARACTER VARYING(1),
        incline_shaft_lift CHARACTER VARYING(1),
        mine_vent_sys CHARACTER VARYING(1),
        dust_proof CHARACTER VARYING(1),
        power_supply_under CHARACTER VARYING(1),
        light_comunicate CHARACTER VARYING(1),
        ground_sys_one_rule CHARACTER VARYING(1),
        ground_sys_two_rule CHARACTER VARYING(1),
        water_proof_under CHARACTER VARYING(1),
        drainage_under CHARACTER VARYING(1),
        fire_prevent CHARACTER VARYING(1),
        base_hidden_danger CHARACTER VARYING(1),
        insert_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operate_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskReport_UndergroundMine PRIMARY KEY (risk_File_No),
        constraint ck_RiskReport_UndergroundMine1 check (company_Lic_Per in ('A','B')),
        constraint ck_RiskReport_UndergroundMine2 check (company_Good_Cond in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine3 check (open_Air_Undergr in ('A','B')),
        constraint ck_RiskReport_UndergroundMine4 check (operate_Stabily in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine5 check (safe_Pro_man_set_up in ('A','B')),
        constraint ck_RiskReport_UndergroundMine6 check (safe_Pro_man_sys in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine7 check (contract_man_sys in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine8 check (hide_danger_inves_sys in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine9 check (safe_educate_sys in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine10 check (spec_task_man_sys in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine11 check (spec_safe_man_sys in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine12 check (main_tain_man_sys in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine13 check (roof_grade_man_sys in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine14 check (emerg_drill_sys in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine15 check (safe_pro_sale_ratio in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine16 check (fire_con_man_sys in ('A','B')),
        constraint ck_RiskReport_UndergroundMine17 check (fire_facility in ('A','B')),
        constraint ck_RiskReport_UndergroundMine18 check (safe_train_condit in ('A','B')),
        constraint ck_RiskReport_UndergroundMine19 check (safe_pro_accident in ('A','B','C','D','E')),
        constraint ck_RiskReport_UndergroundMine20 check (safe_stand_level in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine21 check (safe_exit_one_rule in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine22 check (safe_exit_two_rule in ('A','B')),
        constraint ck_RiskReport_UndergroundMine23 check (well_lane_pass_one_rule in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine24 check (well_lane_pass_two_rule in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine25 check (well_lane_pass_thr_rule in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine26 check (well_lane_pass_four_rule in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine27 check (well_lane_supp_one_rule in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine28 check (well_lane_supp_two_rule in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine29 check (well_lane_scrap in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine30 check (fall_protect in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine31 check (emerg_equip_facility in ('A','B')),
        constraint ck_RiskReport_UndergroundMine32 check (detect_sys in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine33 check (safe_assess in ('A','B')),
        constraint ck_RiskReport_UndergroundMine34 check (secu_pill_Mine_area in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine35 check (draw_ore in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine36 check (roof_manage in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine37 check (pillar_mine in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine38 check (elect_rake_winch_ore in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine39 check (track_ship_equip_transp in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine40 check (road_transport in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine41 check (shaft_lift in ('A','B','C')),
        constraint ck_RiskReport_UndergroundMine42 check (incline_shaft_lift in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine43 check (mine_vent_sys in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine44 check (dust_proof in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine45 check (power_supply_under in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine46 check (light_comunicate in ('A','B')),
        constraint ck_RiskReport_UndergroundMine47 check (ground_sys_one_rule in ('A','B')),
        constraint ck_RiskReport_UndergroundMine48 check (ground_sys_two_rule in ('A','B')),
        constraint ck_RiskReport_UndergroundMine49 check (water_proof_under in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine50 check (drainage_under in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine51 check (fire_prevent in ('A','B','C','D')),
        constraint ck_RiskReport_UndergroundMine52 check (base_hidden_danger in ('A','B','C'))
    );
    
comment on column RiskReport_UndergroundMine.risk_File_No is '风控报告编号';
comment on column RiskReport_UndergroundMine.company_Lic_Per is '企业证照是否健全';
comment on column RiskReport_UndergroundMine.company_Good_Cond is '企业基本情况是否良好';
comment on column RiskReport_UndergroundMine.open_Air_Undergr is '地下、露天转地下';
comment on column RiskReport_UndergroundMine.operate_Stabily is '主要考察企业财务状况及经营稳定性';
comment on column RiskReport_UndergroundMine.safe_Pro_man_set_up is '有无安全生产管理体系';
comment on column RiskReport_UndergroundMine.safe_Pro_man_sys is '安全生产管理制度';
comment on column RiskReport_UndergroundMine.contract_man_sys is '承包商管理制度';
comment on column RiskReport_UndergroundMine.hide_danger_inves_sys is '隐患排查与治理制度';
comment on column RiskReport_UndergroundMine.safe_educate_sys is '安全教育制度';
comment on column RiskReport_UndergroundMine.spec_task_man_sys is '特种作业管理制度';
comment on column RiskReport_UndergroundMine.spec_safe_man_sys is '特种设备安全管理制度';
comment on column RiskReport_UndergroundMine.main_tain_man_sys is '设施维修保养管理制度';
comment on column RiskReport_UndergroundMine.roof_grade_man_sys is '顶板分级管理制度';
comment on column RiskReport_UndergroundMine.emerg_drill_sys is '应急预案演练制度';
--comment on column RiskReport_UndergroundMine.risk_File_No is '应急预案演练制度';
comment on column RiskReport_UndergroundMine.safe_pro_sale_ratio is '安全生产投入占销售额比例';
comment on column RiskReport_UndergroundMine.fire_con_man_sys is '消防管理制度';
comment on column RiskReport_UndergroundMine.fire_facility is '消防设施';
comment on column RiskReport_UndergroundMine.safe_train_condit is '安全培训情况';
comment on column RiskReport_UndergroundMine.safe_pro_accident is '安全生产事故';
comment on column RiskReport_UndergroundMine.safe_stand_level is '安全标准化等级';
comment on column RiskReport_UndergroundMine.safe_exit_one_rule is '安全出口第一规则';
comment on column RiskReport_UndergroundMine.safe_exit_two_rule is '安全出口第二规则';
comment on column RiskReport_UndergroundMine.well_lane_pass_one_rule is '井巷人行通道第一规则';
comment on column RiskReport_UndergroundMine.well_lane_pass_two_rule is '井巷人行通道第二规则';
comment on column RiskReport_UndergroundMine.well_lane_pass_thr_rule is '井巷人行通道第三规则';
comment on column RiskReport_UndergroundMine.well_lane_pass_four_rule is '井巷人行通道第四规则';
comment on column RiskReport_UndergroundMine.well_lane_supp_one_rule is '井巷支护第一规则';
comment on column RiskReport_UndergroundMine.well_lane_supp_two_rule is '井巷支护第二规则';
comment on column RiskReport_UndergroundMine.well_lane_scrap is '井巷报废';
comment on column RiskReport_UndergroundMine.fall_protect is '防坠落';
comment on column RiskReport_UndergroundMine.emerg_equip_facility is '应急设备设施';
comment on column RiskReport_UndergroundMine.detect_sys is '监测系统';
comment on column RiskReport_UndergroundMine.safe_assess is '安全评价';
comment on column RiskReport_UndergroundMine.secu_pill_Mine_area is '保安矿柱及采空区';
comment on column RiskReport_UndergroundMine.draw_ore is '放矿';
comment on column RiskReport_UndergroundMine.roof_manage is '顶板管理';
comment on column RiskReport_UndergroundMine.pillar_mine is '矿柱回采';
comment on column RiskReport_UndergroundMine.elect_rake_winch_ore is '电耙绞车出矿';
comment on column RiskReport_UndergroundMine.track_ship_equip_transp is '无轨装运设备运输';
comment on column RiskReport_UndergroundMine.road_transport is '平巷运输';
comment on column RiskReport_UndergroundMine.shaft_lift is '竖井提升';
comment on column RiskReport_UndergroundMine.incline_shaft_lift is '斜井提升';
comment on column RiskReport_UndergroundMine.mine_vent_sys is '矿井通风系统';
comment on column RiskReport_UndergroundMine.dust_proof is '防尘';
comment on column RiskReport_UndergroundMine.power_supply_under is '井下供电';
comment on column RiskReport_UndergroundMine.light_comunicate is '照明、通信';
comment on column RiskReport_UndergroundMine.ground_sys_one_rule is '接地系统第一规则';
comment on column RiskReport_UndergroundMine.ground_sys_two_rule is '接地系统第二规则';
comment on column RiskReport_UndergroundMine.water_proof_under is '井下防水';
comment on column RiskReport_UndergroundMine.drainage_under is '井下排水';
comment on column RiskReport_UndergroundMine.fire_prevent is '防火';
comment on column RiskReport_UndergroundMine.base_hidden_danger is '依据重大隐患判定标准';
comment on column RiskReport_UndergroundMine.insert_time_for_his is '插入时间';
comment on column RiskReport_UndergroundMine.operate_time_for_his is '更新时间';


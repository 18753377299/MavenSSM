--尾矿库
drop table if exists RiskReport_TailingsLibrary;
CREATE TABLE  RiskReport_TailingsLibrary(
        risk_File_No CHARACTER VARYING(22) NOT NULL,
        company_Lic_Per CHARACTER VARYING(1),
        company_Good_Cond CHARACTER VARYING(1),
        taily_pond_grade CHARACTER VARYING(1),
        taily_pond_is_run CHARACTER VARYING(1),
        operate_Stabily CHARACTER VARYING(1),
        safe_Pro_man_set_up CHARACTER VARYING(1),
        safe_Pro_man_sys CHARACTER VARYING(1),
        contract_man_sys CHARACTER VARYING(1),
        hide_danger_inves_sys CHARACTER VARYING(1),
        safe_educate_sys CHARACTER VARYING(1),
        spec_task_man_sys CHARACTER VARYING(1),
        hot_work_man_sys CHARACTER VARYING(1),
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
        damming_situation CHARACTER VARYING(1),
        flood_discharge_facility CHARACTER VARYING(1),
        dam_seep_line_con CHARACTER VARYING(1),
        dam_accumulate_green CHARACTER VARYING(1),
        emerg_equip_facility CHARACTER VARYING(1),
        has_shangba_road CHARACTER VARYING(1),
        emerge_equip_suppply CHARACTER VARYING(1),
        tailing_pind_staff CHARACTER VARYING(1),
        detect_sys CHARACTER VARYING(1),
        seepage_management_one_rule CHARACTER VARYING(1),
        seepage_management_two_rule CHARACTER VARYING(1),
        dam_stablity CHARACTER VARYING(1),
        dry_beach_length CHARACTER VARYING(1),
        seepage_line_observate CHARACTER VARYING(1),
        dam_surface_safe CHARACTER VARYING(1),
        flood_storage_meet_require CHARACTER VARYING(1),
        overhead_library CHARACTER VARYING(1),
        farm_forest CHARACTER VARYING(20),
        mine_dump_around CHARACTER VARYING(1),
        base_hidden_danger CHARACTER VARYING(1),
        insert_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operate_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskReport_TailingsLibrary PRIMARY KEY (risk_File_No),
        constraint ck_RiskReport_TailingsLibrary1 check (company_Lic_Per in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary2 check (company_Good_Cond in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary3 check (taily_pond_grade in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary4 check (taily_pond_is_run in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary5 check (operate_Stabily in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary6 check (safe_Pro_man_set_up in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary7 check (safe_Pro_man_sys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary8 check (contract_man_sys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary9 check (hide_danger_inves_sys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary10 check (safe_educate_sys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary11 check (spec_task_man_sys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary12 check (hot_work_man_sys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary13 check (spec_safe_man_sys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary14 check (main_tain_man_sys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary15 check (flood_con_man_sys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary16 check (emerg_drill_sys in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary17 check (safe_pro_sale_ratio in ('A','B','C','D')),
        constraint ck_RiskReport_TailingsLibrary18 check (fire_con_man_sys in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary19 check (fire_facility in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary20 check (safe_train_condit in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary21 check (safe_pro_accident in ('A','B','C','D','E','F')),
        constraint ck_RiskReport_TailingsLibrary22 check (safe_stand_level in ('A','B','C','D')),
        constraint ck_RiskReport_TailingsLibrary23 check (damming_situation in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary24 check (flood_discharge_facility in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary25 check (dam_seep_line_con in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary26 check (dam_accumulate_green in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary27 check (emerg_equip_facility in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary28 check (has_shangba_road in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary29 check (emerge_equip_suppply in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary30 check (tailing_pind_staff in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary31 check (detect_sys in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary32 check (seepage_management_one_rule in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary33 check (seepage_management_two_rule in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary34 check (dam_stablity in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary35 check (dry_beach_length in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary36 check (seepage_line_observate in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary37 check (dam_surface_safe in ('A','B','C')),
        constraint ck_RiskReport_TailingsLibrary38 check (flood_storage_meet_require in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary39 check (overhead_library in ('A','B')),
        ----有无农田、基本农田、草场、林场、行洪区 : 为多选，暂不限制
        constraint ck_RiskReport_TailingsLibrary40 check (mine_dump_around in ('A','B')),
        constraint ck_RiskReport_TailingsLibrary41 check (base_hidden_danger in ('A','B','C'))
    );
---管理风险
comment on column RiskReport_TailingsLibrary.risk_File_No is '风控报告编号';
comment on column RiskReport_TailingsLibrary.company_Lic_Per is '企业证照是否健全';
comment on column RiskReport_TailingsLibrary.company_Good_Cond is '企业基本情况是否良好';
comment on column RiskReport_TailingsLibrary.taily_pond_grade is '尾矿库等级';
comment on column RiskReport_TailingsLibrary.taily_pond_is_run is '尾矿库是否运行';
comment on column RiskReport_TailingsLibrary.operate_Stabily is '主要考察企业财务状况及经营稳定性';
comment on column RiskReport_TailingsLibrary.safe_Pro_man_set_up is '有无安全生产管理体系';
comment on column RiskReport_TailingsLibrary.safe_Pro_man_sys is '安全生产管理制度';
comment on column RiskReport_TailingsLibrary.contract_man_sys is '承包商管理制度';
comment on column RiskReport_TailingsLibrary.hide_danger_inves_sys is '隐患排查与治理制度';
comment on column RiskReport_TailingsLibrary.safe_educate_sys is '安全教育制度';
comment on column RiskReport_TailingsLibrary.spec_task_man_sys is '特种作业管理制度';
comment on column RiskReport_TailingsLibrary.hot_work_man_sys is '动火作业管理制度';
comment on column RiskReport_TailingsLibrary.spec_safe_man_sys is '特种设备安全管理制度';
comment on column RiskReport_TailingsLibrary.main_tain_man_sys is '设施维修保养管理制度';
comment on column RiskReport_TailingsLibrary.flood_con_man_sys is '防洪度汛管理制度';
comment on column RiskReport_TailingsLibrary.emerg_drill_sys is '应急预案演练制度';
--comment on column RiskReport_TailingsLibrary.risk_File_No is '应急预案演练制度';
comment on column RiskReport_TailingsLibrary.safe_pro_sale_ratio is '安全生产投入占销售额比例';
comment on column RiskReport_TailingsLibrary.fire_con_man_sys is '消防管理制度';
comment on column RiskReport_TailingsLibrary.fire_facility is '消防设施';
comment on column RiskReport_TailingsLibrary.safe_train_condit is '企业安全培训情况';
comment on column RiskReport_TailingsLibrary.safe_pro_accident is '安全生产事故';
comment on column RiskReport_TailingsLibrary.safe_stand_level is '安全标准化评定标准';
---2、工艺风险
comment on column RiskReport_TailingsLibrary.damming_situation is '筑坝放矿情况';
comment on column RiskReport_TailingsLibrary.flood_discharge_facility is '排洪设施';
comment on column RiskReport_TailingsLibrary.dam_seep_line_con is '坝体渗润线控制';
comment on column RiskReport_TailingsLibrary.dam_accumulate_green is '坝体堆积及绿化';
comment on column RiskReport_TailingsLibrary.emerg_equip_facility is '应急设备设施';
comment on column RiskReport_TailingsLibrary.has_shangba_road is '有无上坝公路';
comment on column RiskReport_TailingsLibrary.emerge_equip_suppply is '事故应急设备和物资';
comment on column RiskReport_TailingsLibrary.tailing_pind_staff is '尾矿库人员';
comment on column RiskReport_TailingsLibrary.detect_sys is '监测系统';
comment on column RiskReport_TailingsLibrary.seepage_management_one_rule is '渗流管理第一规则';
comment on column RiskReport_TailingsLibrary.seepage_management_two_rule is '渗流管理第二规则';
comment on column RiskReport_TailingsLibrary.dam_stablity is '坝体稳定';
comment on column RiskReport_TailingsLibrary.dry_beach_length is '干滩长度';
comment on column RiskReport_TailingsLibrary.seepage_line_observate is '尾矿坝渗润线观测';
comment on column RiskReport_TailingsLibrary.dam_surface_safe is '坡比、坝面安全情况';
comment on column RiskReport_TailingsLibrary.flood_storage_meet_require is '调洪库容是否符合要求';
comment on column RiskReport_TailingsLibrary.overhead_library is '是否为头顶库';
comment on column RiskReport_TailingsLibrary.farm_forest is '有无农田、基本农田、草场、林场、行洪区';
comment on column RiskReport_TailingsLibrary.mine_dump_around is '尾矿库库区四周是否有采矿、排土场、滑坡等';
comment on column RiskReport_TailingsLibrary.base_hidden_danger is '依据重大隐患判定标准';
comment on column RiskReport_TailingsLibrary.insert_time_for_his is '插入时间';
comment on column RiskReport_TailingsLibrary.operate_time_for_his is '更新时间';


    
    
--金属冶炼
drop table if exists RiskReport_SmeltMetal;
CREATE TABLE  RiskReport_SmeltMetal(
        risk_File_No CHARACTER VARYING(22) NOT NULL,
        company_Lic_Per CHARACTER VARYING(1),
        company_Good_Cond CHARACTER VARYING(1),
        Major_equipment_operate_year CHARACTER VARYING(1),
        pro_design_ability_ratio CHARACTER VARYING(1),
        comp_operate_stability CHARACTER VARYING(1),
        establish_legal_man_sys CHARACTER VARYING(1),
        safe_pro_man_sys CHARACTER VARYING(1),
        hide_danger_inves_sys CHARACTER VARYING(1),
        safe_educate_sys CHARACTER VARYING(1),
        spec_task_man_sys CHARACTER VARYING(1),
        hot_work_man_sys CHARACTER VARYING(1),
        spec_safe_man_sys CHARACTER VARYING(1),
        main_tain_man_sys CHARACTER VARYING(1),
        no_smoke_house_keep_sys CHARACTER VARYING(1),
        fire_plan_drill_sys CHARACTER VARYING(1),
        danger_work_man_sys CHARACTER VARYING(1),
        safe_pro_sale_ratio CHARACTER VARYING(1),
        fire_con_man_sys CHARACTER VARYING(1),
        fire_facility CHARACTER VARYING(1),
        safe_train_condit CHARACTER VARYING(1),
        safe_pro_accident CHARACTER VARYING(1),
        safe_stand_level CHARACTER VARYING(1),
        main_ingreadient_pro CHARACTER VARYING(1),
        constitute_major_danger CHARACTER VARYING(1),
        pro_temperature CHARACTER VARYING(1),
        max_pressure CHARACTER VARYING(1),
        emerg_equip_facility CHARACTER VARYING(1),
        emerge_man_word_sys CHARACTER VARYING(1),
        major_protect_measure CHARACTER VARYING(1),
        except_emerge_treat CHARACTER VARYING(1),
        emerge_supply CHARACTER VARYING(1),
        general_operate CHARACTER VARYING(1),
        hot_operate_worker CHARACTER VARYING(1),
        press_equip_safe_measure CHARACTER VARYING(1),
        equip_mainten_safe_measure CHARACTER VARYING(1),
        pre_light_measure CHARACTER VARYING(1),
        anti_static_measure CHARACTER VARYING(1),
        explos_proof_measure CHARACTER VARYING(1),
        listen_prote_equip CHARACTER VARYING(1),
        main_operate_num CHARACTER VARYING(1),
        pro_operate_Num CHARACTER VARYING(1),
        metal_smelt_safe_cert CHARACTER VARYING(1),
        metal_smelt_main_exper CHARACTER VARYING(1),
        metal_smelt_charge_exper CHARACTER VARYING(1),
        metal_smelt_spec_exper CHARACTER VARYING(1),
        metal_smelt_other_exper CHARACTER VARYING(1),
        resid_school_area CHARACTER VARYING(1),
        farm_forest_more_area CHARACTER VARYING(1),
        around_exist_smelt_comp CHARACTER VARYING(1),
        base_hidden_danger CHARACTER VARYING(1),
        insert_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operate_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskReport_SmeltMetal PRIMARY KEY (risk_File_No),
        constraint ck_RiskReport_SmeltMetal1 check (company_Lic_Per in ('A','B')),
        constraint ck_RiskReport_SmeltMetal2 check (company_Good_Cond in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal3 check (Major_equipment_operate_year in ('A','B')),
        constraint ck_RiskReport_SmeltMetal4 check (pro_design_ability_ratio in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal5 check (comp_operate_stability in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal6 check (establish_legal_man_sys in ('A','B')),
        constraint ck_RiskReport_SmeltMetal7 check (safe_pro_man_sys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal8 check (hide_danger_inves_sys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal9 check (safe_educate_sys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal10 check (spec_task_man_sys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal11 check (hot_work_man_sys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal12 check (spec_safe_man_sys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal13 check (main_tain_man_sys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal14 check (no_smoke_house_keep_sys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal15 check (fire_plan_drill_sys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal16 check (danger_work_man_sys in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal17 check (safe_pro_sale_ratio in ('A','B','C','D')),
        constraint ck_RiskReport_SmeltMetal18 check (fire_con_man_sys in ('A','B')),
        constraint ck_RiskReport_SmeltMetal19 check (fire_facility in ('A','B')),
        constraint ck_RiskReport_SmeltMetal20 check (safe_train_condit in ('A','B')),
        constraint ck_RiskReport_SmeltMetal21 check (safe_pro_accident in ('A','B','C','D')),
        constraint ck_RiskReport_SmeltMetal22 check (safe_stand_level in ('A','B','C','D')),
        constraint ck_RiskReport_SmeltMetal23 check (main_ingreadient_pro in ('A','B','C','D')),
        constraint ck_RiskReport_SmeltMetal24 check (constitute_major_danger in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal25 check (pro_temperature in ('A','B')),
        constraint ck_RiskReport_SmeltMetal26 check (max_pressure in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal27 check (emerg_equip_facility in ('A','B')),
        constraint ck_RiskReport_SmeltMetal28 check (emerge_man_word_sys in ('A','B')),
        constraint ck_RiskReport_SmeltMetal29 check (major_protect_measure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal30 check (except_emerge_treat in ('A','B')),
        constraint ck_RiskReport_SmeltMetal31 check (emerge_supply in ('A','B')),
        constraint ck_RiskReport_SmeltMetal32 check (general_operate in ('A','B')),
        constraint ck_RiskReport_SmeltMetal33 check (hot_operate_worker in ('A','B')),
        constraint ck_RiskReport_SmeltMetal34 check (press_equip_safe_measure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal35 check (equip_mainten_safe_measure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal36 check (pre_light_measure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal37 check (anti_static_measure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal38 check (explos_proof_measure in ('A','B')),
        constraint ck_RiskReport_SmeltMetal39 check (listen_prote_equip in ('A','B')),
        constraint ck_RiskReport_SmeltMetal40 check (main_operate_num in ('A','B','C','D','E')),
        constraint ck_RiskReport_SmeltMetal41 check (pro_operate_Num in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal42 check (metal_smelt_safe_cert in ('A','B')),
        constraint ck_RiskReport_SmeltMetal43 check (metal_smelt_main_exper in ('A','B')),
        constraint ck_RiskReport_SmeltMetal44 check (metal_smelt_charge_exper in ('A','B')),
        constraint ck_RiskReport_SmeltMetal45 check (metal_smelt_spec_exper in ('A','B')),
        constraint ck_RiskReport_SmeltMetal46 check (metal_smelt_other_exper in ('A','B')),
        constraint ck_RiskReport_SmeltMetal47 check (resid_school_area in ('A','B','C')),
        constraint ck_RiskReport_SmeltMetal48 check (farm_forest_more_area in ('A','B')),
        constraint ck_RiskReport_SmeltMetal49 check (around_exist_smelt_comp in ('A','B')),
        constraint ck_RiskReport_SmeltMetal50 check (base_hidden_danger in ('A','B','C'))
    );
    
comment on column RiskReport_SmeltMetal.risk_File_No is '风控报告编号';
comment on column RiskReport_SmeltMetal.company_Lic_Per is '企业证照是否健全';
comment on column RiskReport_SmeltMetal.company_Good_Cond is '企业基本情况是否良好';
comment on column RiskReport_SmeltMetal.Major_equipment_operate_year is '企业主要设备运营年限';
comment on column RiskReport_SmeltMetal.pro_design_ability_ratio is '生产能力与设计能力比值';
comment on column RiskReport_SmeltMetal.comp_operate_stability is '主要考察企业财务状况及经营稳定性';
comment on column RiskReport_SmeltMetal.establish_legal_man_sys is '建立识别、获取、评审、更新安全生产法律法规与其他要求的管理制度';
comment on column RiskReport_SmeltMetal.safe_pro_man_sys is '安全生产管理制度,其中包括安全生产责任制 ';
comment on column RiskReport_SmeltMetal.hide_danger_inves_sys is '隐患排查与治理制度';
comment on column RiskReport_SmeltMetal.safe_educate_sys is '安全教育制度';
comment on column RiskReport_SmeltMetal.spec_task_man_sys is '特种作业管理制度';
comment on column RiskReport_SmeltMetal.hot_work_man_sys is '动火作业管理制度';
comment on column RiskReport_SmeltMetal.spec_safe_man_sys is '特种设备安全管理制度';
comment on column RiskReport_SmeltMetal.main_tain_man_sys is '设施维修保养管理制度';
comment on column RiskReport_SmeltMetal.no_smoke_house_keep_sys is '禁烟制度内务管理';
--comment on column RiskReport_SmeltMetal.risk_File_No is '动电作业管理制度';
comment on column RiskReport_SmeltMetal.fire_plan_drill_sys is '火灾应急预案演练制度';
comment on column RiskReport_SmeltMetal.danger_work_man_sys is '危险作业管理制度';
comment on column RiskReport_SmeltMetal.safe_pro_sale_ratio is '安全生产投入占销售额比例';
comment on column RiskReport_SmeltMetal.fire_con_man_sys is '消防管理制度';
comment on column RiskReport_SmeltMetal.fire_facility is '消防设施';
comment on column RiskReport_SmeltMetal.safe_train_condit is '企业安全培训情况';
comment on column RiskReport_SmeltMetal.safe_pro_accident is '安全生产事故';
comment on column RiskReport_SmeltMetal.safe_stand_level is '安全标准化评定标准';
comment on column RiskReport_SmeltMetal.main_ingreadient_pro is '主要原料、中间体、产品';
comment on column RiskReport_SmeltMetal.constitute_major_danger is '是否构成重大危险源';
comment on column RiskReport_SmeltMetal.pro_temperature is '生产最高温度';
comment on column RiskReport_SmeltMetal.max_pressure is '最高压力';
comment on column RiskReport_SmeltMetal.emerg_equip_facility is '应急设备设施';
comment on column RiskReport_SmeltMetal.emerge_man_word_sys is '应急管理工作制度';
comment on column RiskReport_SmeltMetal.major_protect_measure is '重要设备（部位）的温度、压力等关键参数的检测、报警、联锁等应急保护措施';
comment on column RiskReport_SmeltMetal.except_emerge_treat is '异常工况及事故状态下的应急处置措施';
comment on column RiskReport_SmeltMetal.emerge_supply is '应急救援装备和物资';
comment on column RiskReport_SmeltMetal.general_operate is '一般操作人员';
comment on column RiskReport_SmeltMetal.hot_operate_worker is '动火、特种操作工（焊工、电工）';
comment on column RiskReport_SmeltMetal.press_equip_safe_measure is '起重设备、压力容器和压力管道等特种设备设计安全措施';
--comment on column RiskReport_SmeltMetal.risk_File_No is '起重设备、压力容器和压力管道等特种设备安全运行措施';
comment on column RiskReport_SmeltMetal.equip_mainten_safe_measure is '设备设施检维修过程中的安全措施';
comment on column RiskReport_SmeltMetal.pre_light_measure is '防雷措施';
comment on column RiskReport_SmeltMetal.anti_static_measure is '防静电措施';
comment on column RiskReport_SmeltMetal.explos_proof_measure is '防爆措施';
comment on column RiskReport_SmeltMetal.listen_prote_equip is '监控、预警、防护设备设施';
comment on column RiskReport_SmeltMetal.main_operate_num is '主要负责人、安全生产管理人员、特种作业人员、其他作业人数总数';
comment on column RiskReport_SmeltMetal.pro_operate_Num is '生产班当班作业人数';
comment on column RiskReport_SmeltMetal.metal_smelt_safe_cert is '金属冶炼企业主要负责人、安全生产管理人员、特种作业人员安全资格证书';
comment on column RiskReport_SmeltMetal.metal_smelt_main_exper is '金属冶炼企业厂长、副厂长、总工程师、副总工程师学历和工作经历';
comment on column RiskReport_SmeltMetal.metal_smelt_charge_exper is '金属冶炼企业安全生产管理机构负责人学历和工作经历';
comment on column RiskReport_SmeltMetal.metal_smelt_spec_exper is '金属冶炼企业特种作业人员学历和工作经历';
comment on column RiskReport_SmeltMetal.metal_smelt_other_exper is '金属冶炼企业其他从业人员学历';
comment on column RiskReport_SmeltMetal.resid_school_area is '有无居民区，学校、医院';
comment on column RiskReport_SmeltMetal.farm_forest_more_area is '有无农田、基本农田、草场、林场、河流、湖泊、水库、海岸';
--comment on column RiskReport_TailingsLibrary.farm_forest is '有无农田、基本农田、草场、林场、行洪区';
comment on column RiskReport_SmeltMetal.around_exist_smelt_comp is '企业所处地区是否属于工业园区，周围是否存在其他金属冶炼企业';
comment on column RiskReport_SmeltMetal.base_hidden_danger is '依据重大隐患判定标准';
comment on column RiskReport_SmeltMetal.insert_time_for_his is '插入时间';
comment on column RiskReport_SmeltMetal.operate_time_for_his is '更新时间';


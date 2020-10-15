--RD2
---将多条数据的信息去除 modify by  liqiankun 20201010
drop table if exists  RiskWisdom_WorkSiteRDTwo;
CREATE TABLE  RiskWisdom_WorkSiteRDTwo(
        risk_File_No CHARACTER VARYING(22) NOT NULL,
		explorer_name  CHARACTER VARYING(255),
		explorer_job_title  CHARACTER VARYING(255),
		explorer_Education  CHARACTER VARYING(255),
		explorer_office  CHARACTER VARYING(255),
		explorer_profession  CHARACTER VARYING(255),
		the_explorer_weather  CHARACTER VARYING(255),
		the_explorer_range  CHARACTER VARYING(255),
		tis_Intervention_phase  CHARACTER VARYING(255),
		
		tis_Evaluation_scope_item_one  CHARACTER VARYING(255),
		tis_Evaluation_scope_item_two  CHARACTER VARYING(255),
		tis_Evaluation_scope_item_three  CHARACTER VARYING(255),

		check_method  CHARACTER VARYING(255),
		the_check_content  CHARACTER VARYING(255),
		the_explorer_date DATE,
		
--		Rectified_Risk_No  CHARACTER VARYING(255),
--		Rectified_defect_Location  CHARACTER VARYING(255),
--		Rectified_defect_description  CHARACTER VARYING(255),
--		Rectified_risk_description  CHARACTER VARYING(255),
--		risk_level_Rectify_before  CHARACTER VARYING(255),
--		risk_level_Rectify_after  CHARACTER VARYING(255),
		
--		not_Rectified_Risk_No  CHARACTER VARYING(255),
--		not_Rectified_defect_Location  CHARACTER VARYING(255),
--		not_Rectified_defect_description  CHARACTER VARYING(255),
--		not_Rectified_risk_description  CHARACTER VARYING(255),
--		not_Rectified_reason  CHARACTER VARYING(255),
--		not_Rectified_risk_level  CHARACTER VARYING(255),
--		Rectified_situation   CHARACTER VARYING(255),

		prophase_Revision_statistics  CHARACTER VARYING(255),
		risk_level   CHARACTER VARYING(255),
		risk_level_description   CHARACTER VARYING(255),
		---本次查勘缺陷清单
--		the_explorer_defect_no   CHARACTER VARYING(255),
--		the_explorer_defect_desc   CHARACTER VARYING(255),
--		the_explorer_defect_risk_desc   CHARACTER VARYING(255),
--		the_explorer_defect_suggest   CHARACTER VARYING(255),
--		the_explorer_defect_risk_level   CHARACTER VARYING(255),
		
		Check_summary   CHARACTER VARYING(255),
		risk_warn   CHARACTER VARYING(255),
		Write_plan_content   CHARACTER VARYING(255),
		Plan_explorer_content   CHARACTER VARYING(255),
		Plan_explorer_date DATE,
        insert_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operate_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskWisdom_WorkSiteRDTwo PRIMARY KEY (risk_File_No)
    );
    
comment on column RiskWisdom_WorkSiteRDTwo.risk_File_No is '风控报告编号';   
comment on column RiskWisdom_WorkSiteRDTwo.explorer_name is '查勘人员姓名';
comment on column RiskWisdom_WorkSiteRDTwo.explorer_job_title is '查勘人员职称';
comment on column RiskWisdom_WorkSiteRDTwo.explorer_Education is '查勘人员学历';
comment on column RiskWisdom_WorkSiteRDTwo.explorer_office is '查勘人员职位';
comment on column RiskWisdom_WorkSiteRDTwo.explorer_profession is '查勘人员专业';
comment on column RiskWisdom_WorkSiteRDTwo.the_explorer_weather is '本次查勘天气';
comment on column RiskWisdom_WorkSiteRDTwo.the_explorer_range is '本次查勘范围';
comment on column RiskWisdom_WorkSiteRDTwo.tis_Intervention_phase is 'TIS介入阶段';

comment on column RiskWisdom_WorkSiteRDTwo.tis_Evaluation_scope_item_one is 'TIS评估范围第一项';
comment on column RiskWisdom_WorkSiteRDTwo.tis_Evaluation_scope_item_two is 'TIS评估范围第二项';
comment on column RiskWisdom_WorkSiteRDTwo.tis_Evaluation_scope_item_three is 'TIS评估范围第三项';

comment on column RiskWisdom_WorkSiteRDTwo.check_method is '检查方法';
comment on column RiskWisdom_WorkSiteRDTwo.the_check_content is '本次检查内容';
comment on column RiskWisdom_WorkSiteRDTwo.the_explorer_date is '本次查勘日期';
--已整改项
--comment on column RiskWisdom_WorkSiteRDTwo.Rectified_Risk_No is '已整改项，序号/风险编号';
--comment on column RiskWisdom_WorkSiteRDTwo.Rectified_defect_Location is '已整改项，缺陷所处部位';
--comment on column RiskWisdom_WorkSiteRDTwo.Rectified_defect_description is '已整改项，缺陷描述';
--comment on column RiskWisdom_WorkSiteRDTwo.Rectified_risk_description is '已整改项，风险描述';
--comment on column RiskWisdom_WorkSiteRDTwo.risk_level_Rectify_before is '已整改项，（风险等级）整改前';
--comment on column RiskWisdom_WorkSiteRDTwo.risk_level_Rectify_after is '已整改项，（风险等级）整改后';
--comment on column RiskWisdom_WorkSiteRDTwo.picture_Rectify_before is '已整改，项整改前图片';
--comment on column RiskWisdom_WorkSiteRDTwo.picture_Rectify_after is '已整改项，整改后图片';
---未整改项
--comment on column RiskWisdom_WorkSiteRDTwo.not_Rectified_Risk_No is '未整改项,序号/风险编号';
--comment on column RiskWisdom_WorkSiteRDTwo.not_Rectified_defect_Location is '未整改项,缺陷所处部位';
--comment on column RiskWisdom_WorkSiteRDTwo.not_Rectified_defect_description is '未整改项,缺陷描述';
--comment on column RiskWisdom_WorkSiteRDTwo.not_Rectified_risk_description is '未整改项,风险描述';
--comment on column RiskWisdom_WorkSiteRDTwo.not_Rectified_reason is '未整改项,未整改原因';
--comment on column RiskWisdom_WorkSiteRDTwo.not_Rectified_risk_level is '未整改项,风险等级';
--comment on column RiskWisdom_WorkSiteRDTwo.Rectified_situation is '整改情况';

comment on column RiskWisdom_WorkSiteRDTwo.prophase_Revision_statistics is '前期整改统计';
comment on column RiskWisdom_WorkSiteRDTwo.risk_level is '风险等级';
comment on column RiskWisdom_WorkSiteRDTwo.risk_level_description is '风险等级描述';
---本次查勘缺陷清单
--comment on column RiskWisdom_WorkSiteRDTwo.the_explorer_defect_no is '本次查勘缺陷清单,序号/风险编号';
--comment on column RiskWisdom_WorkSiteRDTwo.the_explorer_defect_desc is '本次查勘缺陷清单,缺陷描述';
--comment on column RiskWisdom_WorkSiteRDTwo.the_explorer_defect_risk_desc is '本次查勘缺陷清单,风险描述';
--comment on column RiskWisdom_WorkSiteRDTwo.the_explorer_defect_suggest is '本次查勘缺陷清单,纠正和预防建议';
--comment on column RiskWisdom_WorkSiteRDTwo.the_explorer_defect_risk_level is '本次查勘缺陷清单,风险等级';

comment on column RiskWisdom_WorkSiteRDTwo.Check_summary is '检查小结';
comment on column RiskWisdom_WorkSiteRDTwo.risk_warn is '风险提示';
comment on column RiskWisdom_WorkSiteRDTwo.Write_plan_content is '书写计划内容';
comment on column RiskWisdom_WorkSiteRDTwo.Plan_explorer_content is '计划查勘内容';
comment on column RiskWisdom_WorkSiteRDTwo.Plan_explorer_date is '计划查勘日期';
comment on column RiskWisdom_WorkSiteRDTwo.insert_time_for_his is '插入时间';
comment on column RiskWisdom_WorkSiteRDTwo.operate_time_for_his is '更新时间';





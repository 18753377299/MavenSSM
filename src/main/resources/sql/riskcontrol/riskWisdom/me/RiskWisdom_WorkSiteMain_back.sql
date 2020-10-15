---智慧工地-项目基本信息表
drop table if exists  RiskWisdom_WorkSiteMain;
CREATE TABLE  RiskWisdom_WorkSiteMain(
        risk_File_No CHARACTER VARYING(22) NOT NULL,
		Entrusted_company  CHARACTER VARYING(255),
		item_name  CHARACTER VARYING(255),
		project_name  CHARACTER VARYING(255),
		Community_name   CHARACTER VARYING(255),
		Project_address   CHARACTER VARYING(255),
		Total_land_area NUMERIC(255,4), 
		Total_building_area NUMERIC(255,4), 
		Build_area_above_ground  NUMERIC(255,4), 
		Underground_build_area  NUMERIC(255,4), 
		Fabricated_structure   CHARACTER VARYING(255),
		assembly_rate  NUMERIC(255,4), 
		Highest_build_height  NUMERIC(255,4), 
		Project_Overview   CHARACTER VARYING(255),
		Total_investment  NUMERIC(255,4), 
		Total_contract_cost  NUMERIC(255,4), 
		tis_Engineering_phase   CHARACTER VARYING(255),
		Completion_permit_number   CHARACTER VARYING(255),
		Construction_permit_number   CHARACTER VARYING(255),
		Construction_unit   CHARACTER VARYING(255),
		Survey_unit   CHARACTER VARYING(255),
		Design_unit   CHARACTER VARYING(255),	
		Drawing_review_unit   CHARACTER VARYING(255),	
		Supervision_unit   CHARACTER VARYING(255),
		General_contractor   CHARACTER VARYING(255),
		tis_mechanism   CHARACTER VARYING(255),
		type_features   CHARACTER VARYING(255),
		Decoration_standard   CHARACTER VARYING(255),
		Quality_requirements   CHARACTER VARYING(255),
		Start_date DATE,
		Completion_date DATE,
		tis_Intervention_date DATE,
		completion_permit_date  DATE,
		Construction_permit_date DATE,
        insert_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operate_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskWisdom_WorkSiteMain PRIMARY KEY (risk_File_No)
    );
comment on column RiskWisdom_WorkSiteMain.risk_File_No is '风控报告编号';  
comment on column RiskWisdom_WorkSiteMain.Entrusted_company is '委托公司';	
comment on column RiskWisdom_WorkSiteMain.item_name is '项目名称';	
comment on column RiskWisdom_WorkSiteMain.project_name is '工程名称';	
comment on column RiskWisdom_WorkSiteMain.Community_name is '小区名称	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Project_address is '工程地址';	
comment on column RiskWisdom_WorkSiteMain.Total_land_area is '占地总面积  RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Total_building_area is '建筑总面积	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Build_area_above_ground is '地上建筑面积 RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Underground_build_area is '地下建筑面积  RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Fabricated_structure is '装配式结构	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.assembly_rate is '装配率 RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Highest_build_height is '最高建筑高度	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Project_Overview is '工程概况';	
comment on column RiskWisdom_WorkSiteMain.Total_investment is '总投资		RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Total_contract_cost is '合同总造价	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.tis_Engineering_phase is 'TIS介入时工程阶段	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Completion_permit_number is '竣工许可证编号	RD7';
comment on column RiskWisdom_WorkSiteMain.Construction_permit_number is '施工许可证编号	 RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Construction_unit is '建设单位';
comment on column RiskWisdom_WorkSiteMain.Survey_unit is '勘察单位';	
comment on column RiskWisdom_WorkSiteMain.Design_unit is '设计单位';	
comment on column RiskWisdom_WorkSiteMain.Drawing_review_unit is '审图单位';	
comment on column RiskWisdom_WorkSiteMain.Supervision_unit is '监理单位';	
comment on column RiskWisdom_WorkSiteMain.General_contractor is '总承包单位';	
comment on column RiskWisdom_WorkSiteMain.tis_mechanism is 'TIS机构';	
comment on column RiskWisdom_WorkSiteMain.type_features is '类型（特点）';	
comment on column RiskWisdom_WorkSiteMain.Decoration_standard is '装修标准（特点）';
comment on column RiskWisdom_WorkSiteMain.Quality_requirements is '质量要求	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Start_date is '开工日期（工期安排）	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Completion_date is '（拟）竣工日期（工期安排）	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.tis_Intervention_date is 'TIS介入日期	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.completion_permit_date is '竣工许可证日期	日期	RD7';
comment on column RiskWisdom_WorkSiteMain.Construction_permit_date is '施工许可证日期	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.insert_time_for_his is '插入时间';
comment on column RiskWisdom_WorkSiteMain.operate_time_for_his is '更新时间';



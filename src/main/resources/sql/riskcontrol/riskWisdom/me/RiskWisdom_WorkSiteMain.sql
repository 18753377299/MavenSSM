---智慧工地-项目基本信息表
drop table if exists  RiskWisdom_WorkSiteMain;
CREATE TABLE  RiskWisdom_WorkSiteMain(
        riskFileNo CHARACTER VARYING(22) NOT NULL,
		Entrustedcompany  CHARACTER VARYING(255),
		itemName  CHARACTER VARYING(255),
		projectname  CHARACTER VARYING(255),
		Communityname   CHARACTER VARYING(255),
		Projectaddress   CHARACTER VARYING(255),
		Totallandarea NUMERIC(255,4), 
		Totalbuildingarea NUMERIC(255,4), 
		Buildareaaboveground  NUMERIC(255,4), 
		Undergroundbuildarea  NUMERIC(255,4), 
		Fabricatedstructure   CHARACTER VARYING(255),
		assemblyrate  NUMERIC(255,4), 
		Highestbuildheight  NUMERIC(255,4), 
		ProjectOverview   CHARACTER VARYING(255),
		Totalinvestment  NUMERIC(255,4), 
		Totalcontractcost  NUMERIC(255,4), 
		tisEngineeringphase   CHARACTER VARYING(255),
		Completionpermitnumber   CHARACTER VARYING(255),
		Constructionpermitnumber   CHARACTER VARYING(255),
		Constructionunit   CHARACTER VARYING(255),
		Surveyunit   CHARACTER VARYING(255),
		Designunit   CHARACTER VARYING(255),	
		Drawingreviewunit   CHARACTER VARYING(255),	
		Supervisionunit   CHARACTER VARYING(255),
		Generalcontractor   CHARACTER VARYING(255),
		tismechanism   CHARACTER VARYING(255),
		typefeatures   CHARACTER VARYING(255),
		Decorationstandard   CHARACTER VARYING(255),
		Qualityrequirements   CHARACTER VARYING(255),
		Startdate DATE,
		Completiondate DATE,
		tisInterventiondate DATE,
		completionpermitdate  DATE,
		Constructionpermitdate DATE,
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskWisdom_WorkSiteMain PRIMARY KEY (riskFileNo)
    );
comment on column RiskWisdom_WorkSiteMain.riskFileNo is '风控报告编号';  
comment on column RiskWisdom_WorkSiteMain.Entrustedcompany is '委托公司';	
comment on column RiskWisdom_WorkSiteMain.itemName is '项目名称';	
comment on column RiskWisdom_WorkSiteMain.projectname is '工程名称';	
comment on column RiskWisdom_WorkSiteMain.Communityname is '小区名称	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Projectaddress is '工程地址';	
comment on column RiskWisdom_WorkSiteMain.Totallandarea is '占地总面积  RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Totalbuildingarea is '建筑总面积	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Buildareaaboveground is '地上建筑面积 RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Undergroundbuildarea is '地下建筑面积  RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Fabricatedstructure is '装配式结构	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.assemblyrate is '装配率 RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Highestbuildheight is '最高建筑高度	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.ProjectOverview is '工程概况';	
comment on column RiskWisdom_WorkSiteMain.Totalinvestment is '总投资		RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Totalcontractcost is '合同总造价	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.tisEngineeringphase is 'TIS介入时工程阶段	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Completionpermitnumber is '竣工许可证编号	RD7';
comment on column RiskWisdom_WorkSiteMain.Constructionpermitnumber is '施工许可证编号	 RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Constructionunit is '建设单位';
comment on column RiskWisdom_WorkSiteMain.Surveyunit is '勘察单位';	
comment on column RiskWisdom_WorkSiteMain.Designunit is '设计单位';	
comment on column RiskWisdom_WorkSiteMain.Drawingreviewunit is '审图单位';	
comment on column RiskWisdom_WorkSiteMain.Supervisionunit is '监理单位';	
comment on column RiskWisdom_WorkSiteMain.Generalcontractor is '总承包单位';	
comment on column RiskWisdom_WorkSiteMain.tismechanism is 'TIS机构';	
comment on column RiskWisdom_WorkSiteMain.typefeatures is '类型（特点）';	
comment on column RiskWisdom_WorkSiteMain.Decorationstandard is '装修标准（特点）';
comment on column RiskWisdom_WorkSiteMain.Qualityrequirements is '质量要求	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Startdate is '开工日期（工期安排）	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.Completiondate is '（拟）竣工日期（工期安排）	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.tisInterventiondate is 'TIS介入日期	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.completionpermitdate is '竣工许可证日期	日期	RD7';
comment on column RiskWisdom_WorkSiteMain.Constructionpermitdate is '施工许可证日期	RD0、RD6、RD7、RD9';
comment on column RiskWisdom_WorkSiteMain.inserttimeforhis is '插入时间';
comment on column RiskWisdom_WorkSiteMain.operatetimeforhis is '更新时间';



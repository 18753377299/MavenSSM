--R0--zhangzhi
drop table if exists RiskWisdom_WorkSiteRDOne;
CREATE TABLE RiskWisdom_WorkSiteRDOne(
	riskFileNo varchar(22) NOT NULL ,
	residentialBuilding varchar(255),
	commercialHousing varchar(255),
	ancillaryFacility varchar(255),
	basement varchar(255),
	otherBuilding varchar(255),
	basementDivisionOverview varchar(255),
	structDesignDurability int4,
	buildingCategory varchar(255),
	buildingSafetyGrade varchar(255),
	pileFoundationDesignGrade varchar(255),
	foundationDesignGrade varchar(255),
	fireProofLimit varchar(255),
	mainLoadMessage varchar(255),
	roofWaterproofGrade varchar(255),
	basementWaterproofGrade varchar(255),
	seismicFortifyCategory varchar(255),
	basicEarthquakeAcceleration numeric(4,2),
	seismicFortifyIntensity int4,
	designEarthquakeGroup varchar(255),
	siteCategory varchar(255),
	characteristicPeriod numeric(4,2),
	surroundingSiteConditions varchar(255),
	newThings varchar(255),
	otherThings varchar(255),
	projectLocationMap  varchar(255),
	buildingLayoutPlan varchar(255),
	itemmanagerRiskAnalysis varchar(255),
	relevantpartiesRiskAnalysis varchar(255),
	interveneStage varchar(255),
	interveneDate date,
	fristExploreDate date,
	getDataDate date,
	assessmentScopeItemOne varchar(255),
	assessmentScopeItemTwo varchar(255),
	assessmentScopeItemThr varchar(255),
	checkContent varchar(255),
	checkMethod varchar(255),
	entrustBasis varchar(255),
	policyDocument varchar(255),
	standard varchar(255),
	conclusionSuggest varchar(255),
	inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT pk_RiskWisdom_WorkSiteRDOne PRIMARY KEY (riskFileNo)
);

comment on column RiskWisdom_WorkSiteRDOne.riskFileNo is '报告单号';
comment on column RiskWisdom_WorkSiteRDOne.residentialBuilding is '住宅建筑';
comment on column RiskWisdom_WorkSiteRDOne.commercialHousing is '商业用房';
comment on column RiskWisdom_WorkSiteRDOne.ancillaryFacility is '附属配套';
comment on column RiskWisdom_WorkSiteRDOne.basement is '地下室';
comment on column RiskWisdom_WorkSiteRDOne.otherBuilding is '其他建筑';
comment on column RiskWisdom_WorkSiteRDOne.basementDivisionOverview is '地下室分部概况';
comment on column RiskWisdom_WorkSiteRDOne.structDesignDurability is '结构设计耐久年限';
comment on column RiskWisdom_WorkSiteRDOne.buildingCategory is '建筑类别';
comment on column RiskWisdom_WorkSiteRDOne.buildingSafetyGrade is '建筑结构安全等级';
comment on column RiskWisdom_WorkSiteRDOne.pileFoundationDesignGrade is '桩基设计等级';
comment on column RiskWisdom_WorkSiteRDOne.foundationDesignGrade is '地基基础设计等级';
comment on column RiskWisdom_WorkSiteRDOne.fireProofLimit is '耐火极限';
comment on column RiskWisdom_WorkSiteRDOne.mainLoadMessage is '主要载荷信息';
comment on column RiskWisdom_WorkSiteRDOne.roofWaterproofGrade is '屋面防水等级';
comment on column RiskWisdom_WorkSiteRDOne.basementWaterproofGrade is '地下室防水等级';
comment on column RiskWisdom_WorkSiteRDOne.seismicFortifyCategory is '抗震设防类别';
comment on column RiskWisdom_WorkSiteRDOne.basicEarthquakeAcceleration is '基本地震加速度值';
comment on column RiskWisdom_WorkSiteRDOne.seismicFortifyIntensity is '抗震设防烈度';
comment on column RiskWisdom_WorkSiteRDOne.designEarthquakeGroup is '设计地震分组';
comment on column RiskWisdom_WorkSiteRDOne.siteCategory is '场地类别';
comment on column RiskWisdom_WorkSiteRDOne.characteristicPeriod is '特征周期值';
comment on column RiskWisdom_WorkSiteRDOne.surroundingSiteConditions is '周边场地状况';
comment on column RiskWisdom_WorkSiteRDOne.newThings is '（新技术、新工艺、新材料）';
comment on column RiskWisdom_WorkSiteRDOne.otherThings is '其他';
comment on column RiskWisdom_WorkSiteRDOne.projectLocationMap is '项目所处地理位置图';
comment on column RiskWisdom_WorkSiteRDOne.buildingLayoutPlan is '项目内楼宇平面布置图';
comment on column RiskWisdom_WorkSiteRDOne.itemmanagerRiskAnalysis is '总承包单位项目经理风险分析';
comment on column RiskWisdom_WorkSiteRDOne.relevantpartiesRiskAnalysis is '相关各方资质风险分析';
comment on column RiskWisdom_WorkSiteRDOne.policyDocument is '政策文件';
comment on column RiskWisdom_WorkSiteRDOne.standard is '规范标准';
comment on column RiskWisdom_WorkSiteRDOne.interveneStage is 'TIS介入阶段';
comment on column RiskWisdom_WorkSiteRDOne.assessmentScopeItemOne is 'TIS评估范围（第一项）';
comment on column RiskWisdom_WorkSiteRDOne.assessmentScopeItemTwo is 'TIS评估范围（第二项）';
comment on column RiskWisdom_WorkSiteRDOne.assessmentScopeItemThr is 'TIS评估范围（第三项）';
comment on column RiskWisdom_WorkSiteRDOne.checkContent is '检查内容';
comment on column RiskWisdom_WorkSiteRDOne.checkMethod is '检查方法';
comment on column RiskWisdom_WorkSiteRDOne.entrustBasis is '委托依据';
comment on column RiskWisdom_WorkSiteRDOne.interveneDate is 'TIS介入时间';
comment on column RiskWisdom_WorkSiteRDOne.fristExploreDate is '首次查勘时间';
comment on column RiskWisdom_WorkSiteRDOne.getDataDate is '收到资料时间';
comment on column RiskWisdom_WorkSiteRDOne.conclusionSuggest is '结论与建议';
comment on column RiskWisdom_WorkSiteRDOne.inserttimeforhis is '插入时间';
comment on column RiskWisdom_WorkSiteRDOne.operatetimeforhis is '更新时间';

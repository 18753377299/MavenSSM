--RD7
drop table if exists  RiskWisdom_WorkSiteRDSeven;
CREATE TABLE  RiskWisdom_WorkSiteRDSeven(
        riskFileNo varchar(22) NOT NULL,
        residentialBuilding varchar(255),
        commercialHousing varchar(255),
        ancillaryFacility varchar(255),
        basement varchar(255),
        otherBuilding varchar(255),
        basementDivisionOverview varchar(255),
        structDesignDurability int,
        buildingCategory varchar(255),
        BuildingsafetyGrade varchar(255),
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
        projectLocationMap varchar(255),
        buildingLayoutPlan varchar(255),
        interveneStage varchar(20),
        assessmentScopeItemOne varchar(20),
		assessmentScopeItemTwo varchar(20),
		assessmentScopeItemThr varchar(20),
        checkContent varchar(20),
        checkMethod varchar(20),
        entrustBasis varchar(20),
        interveneDate date,
        firstExploreDate date,
        getDataDate date,
		policyDocument varchar(255),
		standard varchar(255),
        tisWork varchar(4000),
        riskTrackingAnalysis varchar(4000),
        riskIdentificationAnalysis varchar(4000),
        riskProposalUpdate varchar(4000),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskWisdom_WorkSiteRDSeven PRIMARY KEY (risk_File_No)
    );
	    
comment on column RiskWisdom_WorkSiteRDSeven.riskFileNo is '风控报告编号';
comment on column RiskWisdom_WorkSiteRDSeven.residentialBuilding is '住宅建筑';
comment on column RiskWisdom_WorkSiteRDSeven.commercialHousing is '商业用房';
comment on column RiskWisdom_WorkSiteRDSeven.ancillaryFacility is '附属配套';
comment on column RiskWisdom_WorkSiteRDSeven.basement is '地下室';
comment on column RiskWisdom_WorkSiteRDSeven.otherBuilding is '其他建筑';
comment on column RiskWisdom_WorkSiteRDSeven.basementDivisionOverview is '地下室分部概况';
comment on column RiskWisdom_WorkSiteRDSeven.structDesignDurability is '结构设计耐久年限';
comment on column RiskWisdom_WorkSiteRDSeven.buildingCategory is '建筑类别';
comment on column RiskWisdom_WorkSiteRDSeven.BuildingsafetyGrade is '建筑结构安全等级';
comment on column RiskWisdom_WorkSiteRDSeven.pileFoundationDesignGrade is '桩基设计等级';
comment on column RiskWisdom_WorkSiteRDSeven.foundationDesignGrade is '地基基础设计等级';
comment on column RiskWisdom_WorkSiteRDSeven.fireProofLimit is '耐火极限';
comment on column RiskWisdom_WorkSiteRDSeven.mainLoadMessage is '主要载荷信息';
comment on column RiskWisdom_WorkSiteRDSeven.roofWaterproofGrade is '屋面防水等级';
comment on column RiskWisdom_WorkSiteRDSeven.basementWaterproofGrade is '地下室防水等级';
comment on column RiskWisdom_WorkSiteRDSeven.seismicFortifyCategory is '抗震设防类别';
comment on column RiskWisdom_WorkSiteRDSeven.basicEarthquakeAcceleration is '基本地震加速度值';
comment on column RiskWisdom_WorkSiteRDSeven.seismicFortifyIntensity is '抗震设防烈度';
comment on column RiskWisdom_WorkSiteRDSeven.designEarthquakeGroup is '设计地震分组';
comment on column RiskWisdom_WorkSiteRDSeven.siteCategory is '场地类别';
comment on column RiskWisdom_WorkSiteRDSeven.characteristicPeriod is '特征周期值';
comment on column RiskWisdom_WorkSiteRDSeven.surroundingSiteConditions is '周边场地状况';
comment on column RiskWisdom_WorkSiteRDSeven.newThings is '（新技术、新工艺、新材料）';
comment on column RiskWisdom_WorkSiteRDSeven.otherThings is '其他';
comment on column RiskWisdom_WorkSiteRDSeven.projectLocationMap is '项目所处地理位置图';
comment on column RiskWisdom_WorkSiteRDSeven.buildingLayoutPlan is '项目内楼宇平面布置图';
comment on column RiskWisdom_WorkSiteRDSeven.policyDocument is '政策文件';
comment on column RiskWisdom_WorkSiteRDSeven.standard is '规范标准';
comment on column RiskWisdom_WorkSiteRDSeven.interveneStage is 'TIS介入阶段';
comment on column RiskWisdom_WorkSiteRDSeven.assessmentScopeItemOne is 'TIS评估范围第一项';
comment on column RiskWisdom_WorkSiteRDSeven.assessmentScopeItemTwo is 'TIS评估范围第二项';
comment on column RiskWisdom_WorkSiteRDSeven.assessmentScopeItemThr is 'TIS评估范围第三项';
comment on column RiskWisdom_WorkSiteRDSeven.checkContent is '检查内容';
comment on column RiskWisdom_WorkSiteRDSeven.checkMethod is '检查方法';
comment on column RiskWisdom_WorkSiteRDSeven.entrustBasis is '委托依据';
comment on column RiskWisdom_WorkSiteRDSeven.interveneDate is 'TIS介入时间';
comment on column RiskWisdom_WorkSiteRDSeven.firstExploreDate is '首次查勘时间';
comment on column RiskWisdom_WorkSiteRDSeven.getDataDate is '收到资料时间';
comment on column RiskWisdom_WorkSiteRDSeven.tisWork is 'TIS工作';
comment on column RiskWisdom_WorkSiteRDSeven.riskTrackingAnalysis is '风险跟踪和分析';
comment on column RiskWisdom_WorkSiteRDSeven.riskIdentificationAnalysis is '风险辨识和分析';
comment on column RiskWisdom_WorkSiteRDSeven.riskProposalUpdate is '风险建议更新';
comment on column RiskWisdom_WorkSiteRDSeven.inserttimeforhis is '插入时间';
comment on column RiskWisdom_WorkSiteRDSeven.operatetimeforhis is '更新时间';
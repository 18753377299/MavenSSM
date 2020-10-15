--RD9
drop table if exists  RiskWisdom_WorkSiteRDNine;
CREATE TABLE  RiskWisdom_WorkSiteRDNine(
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
        completedAcceptanceDescribe varchar(4000),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskWisdom_WorkSiteRDNine PRIMARY KEY (risk_File_No)
    );
	    
comment on column RiskWisdom_WorkSiteRDNine.riskFileNo is '风控报告编号';
comment on column RiskWisdom_WorkSiteRDNine.residentialBuilding is '住宅建筑';
comment on column RiskWisdom_WorkSiteRDNine.commercialHousing is '商业用房';
comment on column RiskWisdom_WorkSiteRDNine.ancillaryFacility is '附属配套';
comment on column RiskWisdom_WorkSiteRDNine.basement is '地下室';
comment on column RiskWisdom_WorkSiteRDNine.otherBuilding is '其他建筑';
comment on column RiskWisdom_WorkSiteRDNine.basementDivisionOverview is '地下室分部概况';
comment on column RiskWisdom_WorkSiteRDNine.structDesignDurability is '结构设计耐久年限';
comment on column RiskWisdom_WorkSiteRDNine.buildingCategory is '建筑类别';
comment on column RiskWisdom_WorkSiteRDNine.BuildingsafetyGrade is '建筑结构安全等级';
comment on column RiskWisdom_WorkSiteRDNine.pileFoundationDesignGrade is '桩基设计等级';
comment on column RiskWisdom_WorkSiteRDNine.foundationDesignGrade is '地基基础设计等级';
comment on column RiskWisdom_WorkSiteRDNine.fireProofLimit is '耐火极限';
comment on column RiskWisdom_WorkSiteRDNine.mainLoadMessage is '主要载荷信息';
comment on column RiskWisdom_WorkSiteRDNine.roofWaterproofGrade is '屋面防水等级';
comment on column RiskWisdom_WorkSiteRDNine.basementWaterproofGrade is '地下室防水等级';
comment on column RiskWisdom_WorkSiteRDNine.seismicFortifyCategory is '抗震设防类别';
comment on column RiskWisdom_WorkSiteRDNine.basicEarthquakeAcceleration is '基本地震加速度值';
comment on column RiskWisdom_WorkSiteRDNine.seismicFortifyIntensity is '抗震设防烈度';
comment on column RiskWisdom_WorkSiteRDNine.designEarthquakeGroup is '设计地震分组';
comment on column RiskWisdom_WorkSiteRDNine.siteCategory is '场地类别';
comment on column RiskWisdom_WorkSiteRDNine.characteristicPeriod is '特征周期值';
comment on column RiskWisdom_WorkSiteRDNine.surroundingSiteConditions is '周边场地状况';
comment on column RiskWisdom_WorkSiteRDNine.newThings is '（新技术、新工艺、新材料）';
comment on column RiskWisdom_WorkSiteRDNine.otherThings is '其他';
comment on column RiskWisdom_WorkSiteRDNine.projectLocationMap is '项目所处地理位置图';
comment on column RiskWisdom_WorkSiteRDNine.buildingLayoutPlan is '项目内楼宇平面布置图';
comment on column RiskWisdom_WorkSiteRDNine.policyDocument is '政策文件';
comment on column RiskWisdom_WorkSiteRDNine.standard is '规范标准';
comment on column RiskWisdom_WorkSiteRDNine.interveneStage is 'TIS介入阶段';
comment on column RiskWisdom_WorkSiteRDNine.assessmentScopeItemOne is 'TIS评估范围第一项';
comment on column RiskWisdom_WorkSiteRDNine.assessmentScopeItemTwo is 'TIS评估范围第二项';
comment on column RiskWisdom_WorkSiteRDNine.assessmentScopeItemThr is 'TIS评估范围第三项';
comment on column RiskWisdom_WorkSiteRDNine.checkContent is '检查内容';
comment on column RiskWisdom_WorkSiteRDNine.checkMethod is '检查方法';
comment on column RiskWisdom_WorkSiteRDNine.entrustBasis is '委托依据';
comment on column RiskWisdom_WorkSiteRDNine.interveneDate is 'TIS介入时间';
comment on column RiskWisdom_WorkSiteRDNine.firstExploreDate is '首次查勘时间';
comment on column RiskWisdom_WorkSiteRDNine.getDataDate is '收到资料时间';
comment on column RiskWisdom_WorkSiteRDNine.completedAcceptanceDescribe is '项目竣工验收状态描述';
comment on column RiskWisdom_WorkSiteRDNine.inserttimeforhis is '插入时间';
comment on column RiskWisdom_WorkSiteRDNine.operatetimeforhis is '更新时间';
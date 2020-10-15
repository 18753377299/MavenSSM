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
	    
comment on column RiskWisdom_WorkSiteRDNine.riskFileNo is '��ر�����';
comment on column RiskWisdom_WorkSiteRDNine.residentialBuilding is 'סլ����';
comment on column RiskWisdom_WorkSiteRDNine.commercialHousing is '��ҵ�÷�';
comment on column RiskWisdom_WorkSiteRDNine.ancillaryFacility is '��������';
comment on column RiskWisdom_WorkSiteRDNine.basement is '������';
comment on column RiskWisdom_WorkSiteRDNine.otherBuilding is '��������';
comment on column RiskWisdom_WorkSiteRDNine.basementDivisionOverview is '�����ҷֲ��ſ�';
comment on column RiskWisdom_WorkSiteRDNine.structDesignDurability is '�ṹ����;�����';
comment on column RiskWisdom_WorkSiteRDNine.buildingCategory is '�������';
comment on column RiskWisdom_WorkSiteRDNine.BuildingsafetyGrade is '�����ṹ��ȫ�ȼ�';
comment on column RiskWisdom_WorkSiteRDNine.pileFoundationDesignGrade is '׮����Ƶȼ�';
comment on column RiskWisdom_WorkSiteRDNine.foundationDesignGrade is '�ػ�������Ƶȼ�';
comment on column RiskWisdom_WorkSiteRDNine.fireProofLimit is '�ͻ���';
comment on column RiskWisdom_WorkSiteRDNine.mainLoadMessage is '��Ҫ�غ���Ϣ';
comment on column RiskWisdom_WorkSiteRDNine.roofWaterproofGrade is '�����ˮ�ȼ�';
comment on column RiskWisdom_WorkSiteRDNine.basementWaterproofGrade is '�����ҷ�ˮ�ȼ�';
comment on column RiskWisdom_WorkSiteRDNine.seismicFortifyCategory is '����������';
comment on column RiskWisdom_WorkSiteRDNine.basicEarthquakeAcceleration is '����������ٶ�ֵ';
comment on column RiskWisdom_WorkSiteRDNine.seismicFortifyIntensity is '��������Ҷ�';
comment on column RiskWisdom_WorkSiteRDNine.designEarthquakeGroup is '��Ƶ������';
comment on column RiskWisdom_WorkSiteRDNine.siteCategory is '�������';
comment on column RiskWisdom_WorkSiteRDNine.characteristicPeriod is '��������ֵ';
comment on column RiskWisdom_WorkSiteRDNine.surroundingSiteConditions is '�ܱ߳���״��';
comment on column RiskWisdom_WorkSiteRDNine.newThings is '���¼������¹��ա��²��ϣ�';
comment on column RiskWisdom_WorkSiteRDNine.otherThings is '����';
comment on column RiskWisdom_WorkSiteRDNine.projectLocationMap is '��Ŀ��������λ��ͼ';
comment on column RiskWisdom_WorkSiteRDNine.buildingLayoutPlan is '��Ŀ��¥��ƽ�沼��ͼ';
comment on column RiskWisdom_WorkSiteRDNine.policyDocument is '�����ļ�';
comment on column RiskWisdom_WorkSiteRDNine.standard is '�淶��׼';
comment on column RiskWisdom_WorkSiteRDNine.interveneStage is 'TIS����׶�';
comment on column RiskWisdom_WorkSiteRDNine.assessmentScopeItemOne is 'TIS������Χ��һ��';
comment on column RiskWisdom_WorkSiteRDNine.assessmentScopeItemTwo is 'TIS������Χ�ڶ���';
comment on column RiskWisdom_WorkSiteRDNine.assessmentScopeItemThr is 'TIS������Χ������';
comment on column RiskWisdom_WorkSiteRDNine.checkContent is '�������';
comment on column RiskWisdom_WorkSiteRDNine.checkMethod is '��鷽��';
comment on column RiskWisdom_WorkSiteRDNine.entrustBasis is 'ί������';
comment on column RiskWisdom_WorkSiteRDNine.interveneDate is 'TIS����ʱ��';
comment on column RiskWisdom_WorkSiteRDNine.firstExploreDate is '�״β鿱ʱ��';
comment on column RiskWisdom_WorkSiteRDNine.getDataDate is '�յ�����ʱ��';
comment on column RiskWisdom_WorkSiteRDNine.completedAcceptanceDescribe is '��Ŀ��������״̬����';
comment on column RiskWisdom_WorkSiteRDNine.inserttimeforhis is '����ʱ��';
comment on column RiskWisdom_WorkSiteRDNine.operatetimeforhis is '����ʱ��';
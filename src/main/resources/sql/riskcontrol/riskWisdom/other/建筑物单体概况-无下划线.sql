--建筑物单体概况
drop table if exists RiskWisdom_singleBuildProfile;
CREATE TABLE  RiskWisdom_singleBuildProfile(
	riskFileNo varchar(22) NOT NULL ,
	buildingNumber varchar(255) NOT NULL ,
    buildingFunction varchar(255),
    layersAbove int4,
    layersUnderground int4,
    buildingHeight numeric(255,4),
    floorageAbove numeric(255,4),
    floorageUnderground numeric(255,4),
    superstructType varchar(255),
    assemblyRate numeric(255,4),
    foundationType varchar(255),
    basicForm varchar(255),
    foundationDepth numeric(255,4),
	decorationRoom varchar(1),
	roughHouse varchar(1),
	inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT pk_RiskWisdom_singleBuildProfile PRIMARY KEY (riskFileNo,buildingNumber)
);

comment on column RiskWisdom_singleBuildProfile.riskFileNo is '风险报告单号';
comment on column RiskWisdom_singleBuildProfile.buildingNumber is '楼号';
comment on column RiskWisdom_singleBuildProfile.buildingFunction is '功能';
comment on column RiskWisdom_singleBuildProfile.layersAbove is '地上层数';
comment on column RiskWisdom_singleBuildProfile.layersUnderground is '地下层数';
comment on column RiskWisdom_singleBuildProfile.buildingHeight is '建筑高度';
comment on column RiskWisdom_singleBuildProfile.floorageAbove is '地上建筑面积';
comment on column RiskWisdom_singleBuildProfile.floorageUnderground is '地下建筑面积';
comment on column RiskWisdom_singleBuildProfile.superstructType is '上部机构类型';
comment on column RiskWisdom_singleBuildProfile.assemblyRate is '装配式（率）';
comment on column RiskWisdom_singleBuildProfile.foundationType is '地基类型';
comment on column RiskWisdom_singleBuildProfile.basicForm is '基础形式';
comment on column RiskWisdom_singleBuildProfile.foundationDepth is '基础埋深（m）';
comment on column RiskWisdom_singleBuildProfile.decorationRoom is '装修房';
comment on column RiskWisdom_singleBuildProfile.roughHouse is '毛坯房';
comment on column RiskWisdom_singleBuildProfile.inserttimeforhis is '插入时间';
comment on column RiskWisdom_singleBuildProfile.operatetimeforhis is '更新时间';


--联系人信息
drop table if exists RiskWisdom_contactInfo;
CREATE TABLE  RiskWisdom_contactInfo(
	riskFileNo varchar(22) NOT NULL ,
	participantType varchar(255) NOT NULL ,
	serialno serial NOT NULL ,
	linkName varchar(255),
	linkTele varchar(255),
	email varchar(255),
	inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT pk_RiskWisdom_contactInfo PRIMARY KEY (riskFileNo,participantType,serialno)
);

comment on column RiskWisdom_contactInfo.riskFileNo is '风险报告单号';
comment on column RiskWisdom_contactInfo.participantType is '参建各方类型';
comment on column RiskWisdom_contactInfo.serialno is '序号';
comment on column RiskWisdom_contactInfo.linkName is '联系人名称';
comment on column RiskWisdom_contactInfo.linkTele is '联系电话/微信';
comment on column RiskWisdom_contactInfo.email is '电子邮箱';
comment on column RiskWisdom_contactInfo.inserttimeforhis is '插入时间';
comment on column RiskWisdom_contactInfo.operatetimeforhis is '更新时间';

--保单承保内容
drop table if exists  RiskWisdom_PolicyCoverContent;
CREATE TABLE  RiskWisdom_PolicyCoverContent(
        riskFileNo varchar(22) NOT NULL,
        serialno serial NOT NULL,
        insurancePeriodType varchar(1) NOT NULL,
        content varchar(255),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskWisdom_PolicyCoverContent PRIMARY KEY (riskFileNo,insurancePeriodType,serialno)
    );
	    
comment on column RiskWisdom_PolicyCoverContent.riskFileNo is '风控报告编号';
comment on column RiskWisdom_PolicyCoverContent.serialno is '序号';
comment on column RiskWisdom_PolicyCoverContent.insurancePeriodType is '保险期限类型';
comment on column RiskWisdom_PolicyCoverContent.content is '内容';
comment on column RiskWisdom_PolicyCoverContent.inserttimeforhis is '插入时间';
comment on column RiskWisdom_PolicyCoverContent.operatetimeforhis is '更新时间';
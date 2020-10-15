--已获得技术资料/尚未提供的技术资料
drop table if exists  RiskWisdom_TechnicalInfo;
CREATE TABLE  RiskWisdom_TechnicalInfo(
        riskFileNo varchar(22) NOT NULL,
        technicalDataType varchar(1),
        serialno varchar(255),
        dataName varchar(255),
        ProvideTime date,
        versionNumber varchar(255),
        pieceNumber int,
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskWisdom_TechnicalInfo PRIMARY KEY (riskFileNo)
    );
	    
comment on column RiskWisdom_TechnicalInfo.riskFileNo is '风控报告编号';
comment on column RiskWisdom_TechnicalInfo.technicalDataType is '技术资料类型';
comment on column RiskWisdom_TechnicalInfo.serialno is '序号';
comment on column RiskWisdom_TechnicalInfo.dataName is '资料名称';
comment on column RiskWisdom_TechnicalInfo.ProvideTime is '提供时间';
comment on column RiskWisdom_TechnicalInfo.versionNumber is '电子版/纸质版（版本号）';
comment on column RiskWisdom_TechnicalInfo.pieceNumber is '份数';
comment on column RiskWisdom_TechnicalInfo.inserttimeforhis is '插入时间';
comment on column RiskWisdom_TechnicalInfo.operatetimeforhis is '更新时间';
--风险评估人员名单
drop table if exists  RiskWisdom_riskAssessor;
CREATE TABLE  RiskWisdom_riskAssessor(
        riskFileNo varchar(22) NOT NULL,
        serialno varchar(255),
        riskAssessmentName varchar(255),
        titleCertificate varchar(255),
        education varchar(255),
        positionalTitle varchar(255),
        major varchar(255),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskWisdom_riskAssessor PRIMARY KEY (riskFileNo)
    );
	    
comment on column RiskWisdom_riskAssessor.riskFileNo is '风控报告编号';
comment on column RiskWisdom_riskAssessor.serialno is '序号';
comment on column RiskWisdom_riskAssessor.riskAssessmentName is '姓名';
comment on column RiskWisdom_riskAssessor.titleCertificate is '职称及执业证书';
comment on column RiskWisdom_riskAssessor.education is '学历';
comment on column RiskWisdom_riskAssessor.positionalTitle is '职位';
comment on column RiskWisdom_riskAssessor.major is '专业';
comment on column RiskWisdom_riskAssessor.inserttimeforhis is '插入时间';
comment on column RiskWisdom_riskAssessor.operatetimeforhis is '更新时间';
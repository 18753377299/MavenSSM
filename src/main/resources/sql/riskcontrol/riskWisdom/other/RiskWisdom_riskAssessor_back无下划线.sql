--����������Ա����
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
	    
comment on column RiskWisdom_riskAssessor.riskFileNo is '��ر�����';
comment on column RiskWisdom_riskAssessor.serialno is '���';
comment on column RiskWisdom_riskAssessor.riskAssessmentName is '����';
comment on column RiskWisdom_riskAssessor.titleCertificate is 'ְ�Ƽ�ִҵ֤��';
comment on column RiskWisdom_riskAssessor.education is 'ѧ��';
comment on column RiskWisdom_riskAssessor.positionalTitle is 'ְλ';
comment on column RiskWisdom_riskAssessor.major is 'רҵ';
comment on column RiskWisdom_riskAssessor.inserttimeforhis is '����ʱ��';
comment on column RiskWisdom_riskAssessor.operatetimeforhis is '����ʱ��';
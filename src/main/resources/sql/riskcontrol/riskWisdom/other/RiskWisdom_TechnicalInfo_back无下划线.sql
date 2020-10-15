--�ѻ�ü�������/��δ�ṩ�ļ�������
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
	    
comment on column RiskWisdom_TechnicalInfo.riskFileNo is '��ر�����';
comment on column RiskWisdom_TechnicalInfo.technicalDataType is '������������';
comment on column RiskWisdom_TechnicalInfo.serialno is '���';
comment on column RiskWisdom_TechnicalInfo.dataName is '��������';
comment on column RiskWisdom_TechnicalInfo.ProvideTime is '�ṩʱ��';
comment on column RiskWisdom_TechnicalInfo.versionNumber is '���Ӱ�/ֽ�ʰ棨�汾�ţ�';
comment on column RiskWisdom_TechnicalInfo.pieceNumber is '����';
comment on column RiskWisdom_TechnicalInfo.inserttimeforhis is '����ʱ��';
comment on column RiskWisdom_TechnicalInfo.operatetimeforhis is '����ʱ��';
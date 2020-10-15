---RD2: 本次查勘缺陷清单  add by liqiankun
drop table if exists  RiskWisdom_ExplorerDefect;
CREATE TABLE  RiskWisdom_ExplorerDefect(
        riskFileNo CHARACTER VARYING(22) NOT NULL,
		serialNo  serial NOT NULL, 
		---本次查勘缺陷清单
		theexplorerdefectdesc   CHARACTER VARYING(255),
		theexplorerdefectriskdesc   CHARACTER VARYING(255),
		theexplorerdefectsuggest   CHARACTER VARYING(255),
		theexplorerdefectrisklevel   CHARACTER VARYING(255),
		
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskWisdom_ExplorerDefect PRIMARY KEY (riskFileNo,serialNo)
    );

comment on column RiskWisdom_ExplorerDefect.riskFileNo is '风控报告编号';  
comment on column RiskWisdom_ExplorerDefect.serialNo is '序号';  
---本次查勘缺陷清单
--comment on column RiskWisdom_ExplorerDefect.theexplorerdefectno is '本次查勘缺陷清单,序号/风险编号';
comment on column RiskWisdom_ExplorerDefect.theexplorerdefectdesc is '本次查勘缺陷清单,缺陷描述:附带照片';
comment on column RiskWisdom_ExplorerDefect.theexplorerdefectriskdesc is '本次查勘缺陷清单,风险描述';
comment on column RiskWisdom_ExplorerDefect.theexplorerdefectsuggest is '本次查勘缺陷清单,纠正和预防建议';
comment on column RiskWisdom_ExplorerDefect.theexplorerdefectrisklevel is '本次查勘缺陷清单,风险等级';
comment on column RiskWisdom_ExplorerDefect.inserttimeforhis is '插入时间';
comment on column RiskWisdom_ExplorerDefect.operatetimeforhis is '更新时间';


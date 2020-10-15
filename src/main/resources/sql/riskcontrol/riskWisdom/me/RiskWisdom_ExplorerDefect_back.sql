---RD2: 本次查勘缺陷清单  add by liqiankun
drop table if exists  RiskWisdom_ExplorerDefect;
CREATE TABLE  RiskWisdom_ExplorerDefect(
        risk_File_No CHARACTER VARYING(22) NOT NULL,
		serial_No  serial NOT NULL, 
		---本次查勘缺陷清单
		the_explorer_defect_desc   CHARACTER VARYING(255),
		the_explorer_defect_risk_desc   CHARACTER VARYING(255),
		the_explorer_defect_suggest   CHARACTER VARYING(255),
		the_explorer_defect_risk_level   CHARACTER VARYING(255),
		
        insert_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operate_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskWisdom_ExplorerDefect PRIMARY KEY (risk_File_No,serial_No)
    );

comment on column RiskWisdom_ExplorerDefect.risk_File_No is '风控报告编号';  
comment on column RiskWisdom_ExplorerDefect.serial_No is '序号';  
---本次查勘缺陷清单
--comment on column RiskWisdom_ExplorerDefect.the_explorer_defect_no is '本次查勘缺陷清单,序号/风险编号';
comment on column RiskWisdom_ExplorerDefect.the_explorer_defect_desc is '本次查勘缺陷清单,缺陷描述:附带照片';
comment on column RiskWisdom_ExplorerDefect.the_explorer_defect_risk_desc is '本次查勘缺陷清单,风险描述';
comment on column RiskWisdom_ExplorerDefect.the_explorer_defect_suggest is '本次查勘缺陷清单,纠正和预防建议';
comment on column RiskWisdom_ExplorerDefect.the_explorer_defect_risk_level is '本次查勘缺陷清单,风险等级';
comment on column RiskWisdom_ExplorerDefect.insert_time_for_his is '插入时间';
comment on column RiskWisdom_ExplorerDefect.operate_time_for_his is '更新时间';


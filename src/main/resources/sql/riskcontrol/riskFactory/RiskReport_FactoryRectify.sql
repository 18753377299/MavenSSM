--安全工厂整改表
drop table if exists RiskReport_FactoryRectify;
CREATE TABLE RiskReport_FactoryRectify (
 		riskFileNo CHARACTER VARYING(22) NOT NULL,
        rectifyColumnName CHARACTER VARYING(50) NOT NULL,
        title CHARACTER VARYING(255),
        RectifybeforeProblem CHARACTER VARYING(4000),
        RectifyaforeProblem CHARACTER VARYING(4000),
        Rectifyflag CHARACTER VARYING(2),
        operatecode CHARACTER VARYING(20),
        rectifycode CHARACTER VARYING(20),
        submitDate DATE,
        RectifyDate DATE,
		insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskReport_FactoryRectify PRIMARY KEY (riskFileNo,rectifyColumnName)
);

comment on column RiskReport_FactoryRectify.riskFileNo is '风控编号';
---  comment on column RiskReport_FactoryRectify.serialno is '整改序号';
--将整改序号改为整改字段名称
comment on column RiskReport_FactoryRectify.rectifyColumnName is '整改字段名称';

comment on column RiskReport_FactoryRectify.title is '标题';
comment on column RiskReport_FactoryRectify.RectifybeforeProblem is '整改前问题';
comment on column RiskReport_FactoryRectify.RectifyaforeProblem is '整改后问题';
comment on column RiskReport_FactoryRectify.Rectifyflag is '整改标记,0: 未整改,1:已整改,2:整改不通过';
comment on column RiskReport_FactoryRectify.operatecode is '提交人员';
comment on column RiskReport_FactoryRectify.rectifycode is '整改人员';
comment on column RiskReport_FactoryRectify.submitDate is '提交日期';
comment on column RiskReport_FactoryRectify.RectifyDate is '整改期限';
comment on column RiskReport_FactoryRectify.insertTimeForHis is '插入时间';
comment on column RiskReport_FactoryRectify.operateTimeForHis is '更新时间';







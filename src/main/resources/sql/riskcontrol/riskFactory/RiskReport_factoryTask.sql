--安全工厂任务表
drop table if exists RiskReport_factoryTask;
CREATE TABLE RiskReport_factoryTask (
        serialno serial NOT NULL,
        registrationNumber CHARACTER VARYING(20) NOT NULL,
        companyname CHARACTER VARYING(255),
        companyaddress CHARACTER VARYING(255),
        IndustryInfo CHARACTER VARYING(255),
        expectedservicedate DATE,
        taskflag CHARACTER VARYING(2),
        taskassignment CHARACTER VARYING(20),
        taskprincipal CHARACTER VARYING(20),
        companycode CHARACTER VARYING(20),
        linkName CHARACTER VARYING(50),
        linkNumber CHARACTER VARYING(50),
        Withspecialrequire CHARACTER VARYING(255),
		insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskReport_factoryTask PRIMARY KEY (serialno)
);
comment on column RiskReport_factoryTask.serialno is '任务序号';
comment on column RiskReport_factoryTask.registrationNumber is '企业注册号';
comment on column RiskReport_factoryTask.companyname is '企业名称';
comment on column RiskReport_factoryTask.companyaddress is '企业所在地';
comment on column RiskReport_factoryTask.IndustryInfo is '所属行业信息';
comment on column RiskReport_factoryTask.expectedservicedate is '期望服务日期';

comment on column RiskReport_factoryTask.taskflag is '任务状态';
comment on column RiskReport_factoryTask.taskassignment is '任务分配人员';
comment on column RiskReport_factoryTask.taskprincipal is '任务负责人';
comment on column RiskReport_factoryTask.companycode is '企业机构';

comment on column RiskReport_factoryTask.linkName is '联系人名称';
comment on column RiskReport_factoryTask.linkNumber is '联系人电话';
comment on column RiskReport_factoryTask.Withspecialrequire is '有无特殊要求';
comment on column RiskReport_factoryTask.insertTimeForHis is '插入时间';
comment on column RiskReport_factoryTask.operateTimeForHis is '更新时间';







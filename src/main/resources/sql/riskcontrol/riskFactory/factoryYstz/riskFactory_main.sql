-- 验收整改主表信息 riskFactory_main，看是否需要双机构

drop table riskFactory_main;
CREATE TABLE riskFactory_main (
	riskFileNo varchar(22) NOT NULL, --**报告编号
    comCode varchar(8), --**归属机构
    riskModel varchar(3),--**模板号
    insuredType char(1),--**被保险人类型 1 个人 2 团体
    insuredCode varchar(30), --**被保险人代码
    insuredName varchar(120),--**被保险人姓名/企业名称
    businessClass varchar(2),--**行业类型代码
    operatorCode varchar(10),--**操作人员代码
    undwrtSubmitDate DATETIME YEAR TO SECOND,--**提交核保时间
    underwriteFlag char(1),--**审核状态
    underwriteDate DATETIME YEAR TO SECOND,--**核保通过时间
    underwriteCode varchar(10),--**核保人员代码
    underwriteName varchar(120),--**核保人员姓名
    explorecomCode varchar(8),--**查勘机构
    explorer varchar(10),--**查勘机构
    exploreDate DATETIME YEAR TO DAY,--**查勘日期
    exploreType char(1),--**查勘类别 1 初勘 2 复勘
    lastRiskFileNo varchar(22),--**初勘风控报告编号
    madeDate DATETIME YEAR TO SECOND,--**操作日期，
    mobileFlag char(1),--**请求端标志 0-web 1-Android 2-IOS
    issueOrderType char(1),--**出单类型，1-内部人员出单 2-外部人员出单
    extendedFieldOne  varchar(255),--**拓展字段1
	extendedFieldTwo  varchar(255),--**拓展字段2
	extendedFieldThree  varchar(255),--**拓展字段3
	inserttimeforhis DATETIME YEAR TO SECOND DEFAULT CURRENT YEAR TO SECOND,
	operatetimeforhis DATETIME YEAR TO SECOND DEFAULT CURRENT YEAR TO SECOND,
	PRIMARY KEY (riskFileNo)
);


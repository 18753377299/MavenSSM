-- 验收整改主表信息 riskFactory_main，看是否需要双机构

drop table riskFactory_main;
CREATE TABLE riskFactory_main (
	riskFileNo varchar(22) NOT NULL, --**报告编号
    comCode,--**归属机构
    riskModel,--**模板号
    insuredType,--**被保险人类型 1 个人 2 团体
    insuredCode, --**被保险人代码
    insuredName,--**被保险人姓名/企业名称
    businessClass,--**行业类型代码
    operatorCode,--**操作人员代码
    undwrtSubmitDate,--**提交核保时间
    underwriteFlag,--**审核状态
    underwriteDate,--**核保通过时间
    underwriteCode,--**核保人员代码
    underwriteName,--**核保人员姓名
    explorecomCode,--**查勘机构
    explorer,--**查勘机构
    exploreDate,--**查勘日期
    madeDate,--**操作日期，
    mobileFlag,--**请求端标志 0-web 1-Android 2-IOS
    issueOrderType,--**出单类型，1-内部人员出单 2-外部人员出单
    extendedFieldOne  varchar(255),--**拓展字段1
	extendedFieldTwo  varchar(255),--**拓展字段2
	extendedFieldThree  varchar(255),--**拓展字段3
	inserttimeforhis DATETIME YEAR TO SECOND DEFAULT CURRENT YEAR TO SECOND,
	operatetimeforhis DATETIME YEAR TO SECOND DEFAULT CURRENT YEAR TO SECOND,
	PRIMARY KEY (riskFileNo)
);


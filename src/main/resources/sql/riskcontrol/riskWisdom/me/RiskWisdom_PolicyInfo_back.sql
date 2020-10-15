---智慧工地保单信息表  add by liqiankun 20201013 begin

drop table if exists  RiskWisdom_PolicyInfo;
CREATE TABLE  RiskWisdom_PolicyInfo(
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

保单号  PolicyNo
保险起期
保险止期
保险分类
保险期限  InsuranceDuration
总保费
总保额
免赔额
牵头保险公司
共保公司名称
共保公司承保份额
被保项目名称
投保人名称（建设单位名称）
投保人统一社会信用代码
保险费率
建安总造价
承保总建筑面积
保单签单日期




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
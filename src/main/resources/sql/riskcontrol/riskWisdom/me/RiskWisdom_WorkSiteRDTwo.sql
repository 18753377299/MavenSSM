--RD2
drop table if exists  RiskWisdom_WorkSiteRDTwo;
CREATE TABLE  RiskWisdom_WorkSiteRDTwo(
        riskFileNo CHARACTER VARYING(22) NOT NULL,
		explorername  CHARACTER VARYING(255),
		explorerjobtitle  CHARACTER VARYING(255),
		explorerEducation  CHARACTER VARYING(255),
		exploreroffice  CHARACTER VARYING(255),
		explorerprofession  CHARACTER VARYING(255),
		theexplorerweather  CHARACTER VARYING(255),
		theexplorerrange  CHARACTER VARYING(255),
		tisInterventionphase  CHARACTER VARYING(255),
		
		tisEvaluationscopeitemone  CHARACTER VARYING(255),
		tisEvaluationscopeitemtwo  CHARACTER VARYING(255),
		tisEvaluationscopeitemthree  CHARACTER VARYING(255),
		
		checkmethod  CHARACTER VARYING(255),
		thecheckcontent  CHARACTER VARYING(255),
		theexplorerdate DATE,
		RectifiedRiskNo  CHARACTER VARYING(255),
		RectifieddefectLocation  CHARACTER VARYING(255),
		Rectifieddefectdescription  CHARACTER VARYING(255),
		Rectifiedriskdescription  CHARACTER VARYING(255),
		risklevelRectifybefore  CHARACTER VARYING(255),
		risklevelRectifyafter  CHARACTER VARYING(255),
		
		notRectifiedRiskNo  CHARACTER VARYING(255),
		notRectifieddefectLocation  CHARACTER VARYING(255),
		notRectifieddefectdescription  CHARACTER VARYING(255),
		notRectifiedriskdescription  CHARACTER VARYING(255),
		notRectifiedreason  CHARACTER VARYING(255),
		notRectifiedrisklevel  CHARACTER VARYING(255),
		Rectifiedsituation   CHARACTER VARYING(255),

		prophaseRevisionstatistics  CHARACTER VARYING(255),
		risklevel   CHARACTER VARYING(255),
		riskleveldescription   CHARACTER VARYING(255),
		---本次查勘缺陷清单
		theexplorerdefectno   CHARACTER VARYING(255),
		theexplorerdefectdesc   CHARACTER VARYING(255),
		theexplorerdefectriskdesc   CHARACTER VARYING(255),
		theexplorerdefectsuggest   CHARACTER VARYING(255),
		theexplorerdefectrisklevel   CHARACTER VARYING(255),
		
		Checksummary   CHARACTER VARYING(255),
		riskwarn   CHARACTER VARYING(255),
		Writeplancontent   CHARACTER VARYING(255),
		Planexplorercontent   CHARACTER VARYING(255),
		Planexplorerdate DATE,
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskWisdom_WorkSiteRDTwo PRIMARY KEY (riskFileNo)
    );
    
comment on column RiskWisdom_WorkSiteRDTwo.riskFileNo is '风控报告编号';   
comment on column RiskWisdom_WorkSiteRDTwo.explorername is '查勘人员姓名';
comment on column RiskWisdom_WorkSiteRDTwo.explorerjobtitle is '查勘人员职称';
comment on column RiskWisdom_WorkSiteRDTwo.explorerEducation is '查勘人员学历';
comment on column RiskWisdom_WorkSiteRDTwo.exploreroffice is '查勘人员职位';
comment on column RiskWisdom_WorkSiteRDTwo.explorerprofession is '查勘人员专业';
comment on column RiskWisdom_WorkSiteRDTwo.theexplorerweather is '本次查勘天气';
comment on column RiskWisdom_WorkSiteRDTwo.theexplorerrange is '本次查勘范围';
comment on column RiskWisdom_WorkSiteRDTwo.tisInterventionphase is 'TIS介入阶段';
--comment on column RiskWisdom_WorkSiteRDTwo.tisEvaluationscope is 'TIS评估范围';

comment on column RiskWisdom_WorkSiteRDTwo.tisEvaluationscopeitemone is 'TIS评估范围第一项';
comment on column RiskWisdom_WorkSiteRDTwo.tisEvaluationscopeitemtwo is 'TIS评估范围第二项';
comment on column RiskWisdom_WorkSiteRDTwo.tisEvaluationscopeitemthree is 'TIS评估范围第三项';

comment on column RiskWisdom_WorkSiteRDTwo.checkmethod is '检查方法';
comment on column RiskWisdom_WorkSiteRDTwo.thecheckcontent is '本次检查内容';
comment on column RiskWisdom_WorkSiteRDTwo.theexplorerdate is '本次查勘日期';
--已整改项
comment on column RiskWisdom_WorkSiteRDTwo.RectifiedRiskNo is '已整改项，序号/风险编号';
comment on column RiskWisdom_WorkSiteRDTwo.RectifieddefectLocation is '已整改项，缺陷所处部位';
comment on column RiskWisdom_WorkSiteRDTwo.Rectifieddefectdescription is '已整改项，缺陷描述';
comment on column RiskWisdom_WorkSiteRDTwo.Rectifiedriskdescription is '已整改项，风险描述';
comment on column RiskWisdom_WorkSiteRDTwo.risklevelRectifybefore is '已整改项，（风险等级）整改前';
comment on column RiskWisdom_WorkSiteRDTwo.risklevelRectifyafter is '已整改项，（风险等级）整改后';
--comment on column RiskWisdom_WorkSiteRDTwo.pictureRectifybefore is '已整改，项整改前图片';
--comment on column RiskWisdom_WorkSiteRDTwo.pictureRectifyafter is '已整改项，整改后图片';
---未整改项
comment on column RiskWisdom_WorkSiteRDTwo.notRectifiedRiskNo is '未整改项,序号/风险编号';
comment on column RiskWisdom_WorkSiteRDTwo.notRectifieddefectLocation is '未整改项,缺陷所处部位';
comment on column RiskWisdom_WorkSiteRDTwo.notRectifieddefectdescription is '未整改项,缺陷描述';
comment on column RiskWisdom_WorkSiteRDTwo.notRectifiedriskdescription is '未整改项,风险描述';
comment on column RiskWisdom_WorkSiteRDTwo.notRectifiedreason is '未整改项,未整改原因';
comment on column RiskWisdom_WorkSiteRDTwo.notRectifiedrisklevel is '未整改项,风险等级';
comment on column RiskWisdom_WorkSiteRDTwo.Rectifiedsituation is '整改情况';

comment on column RiskWisdom_WorkSiteRDTwo.prophaseRevisionstatistics is '前期整改统计';
comment on column RiskWisdom_WorkSiteRDTwo.risklevel is '风险等级';
comment on column RiskWisdom_WorkSiteRDTwo.riskleveldescription is '风险等级描述';
---本次查勘缺陷清单
comment on column RiskWisdom_WorkSiteRDTwo.theexplorerdefectno is '本次查勘缺陷清单,序号/风险编号';
comment on column RiskWisdom_WorkSiteRDTwo.theexplorerdefectdesc is '本次查勘缺陷清单,缺陷描述';
comment on column RiskWisdom_WorkSiteRDTwo.theexplorerdefectriskdesc is '本次查勘缺陷清单,风险描述';
comment on column RiskWisdom_WorkSiteRDTwo.theexplorerdefectsuggest is '本次查勘缺陷清单,纠正和预防建议';
comment on column RiskWisdom_WorkSiteRDTwo.theexplorerdefectrisklevel is '本次查勘缺陷清单,风险等级';

comment on column RiskWisdom_WorkSiteRDTwo.Checksummary is '检查小结';
comment on column RiskWisdom_WorkSiteRDTwo.riskwarn is '风险提示';
comment on column RiskWisdom_WorkSiteRDTwo.Writeplancontent is '书写计划内容';
comment on column RiskWisdom_WorkSiteRDTwo.Planexplorercontent is '计划查勘内容';
comment on column RiskWisdom_WorkSiteRDTwo.Planexplorerdate is '计划查勘日期';
comment on column RiskWisdom_WorkSiteRDTwo.inserttimeforhis is '插入时间';
comment on column RiskWisdom_WorkSiteRDTwo.operatetimeforhis is '更新时间';






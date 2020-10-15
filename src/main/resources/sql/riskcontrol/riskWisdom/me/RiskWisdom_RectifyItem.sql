---RD2 整改清单信息--尚未整改项/已整改项 add by liqiankun

drop table if exists  RiskWisdom_RectifyItem;
CREATE TABLE  RiskWisdom_RectifyItem(
        riskFileNo CHARACTER VARYING(22) NOT NULL,
		RectifiedType  CHARACTER VARYING(1)  NOT NULL,
		serialNo  serial NOT NULL, 
		RectifieddefectLocation  CHARACTER VARYING(255),
		Rectifieddefectdescription  CHARACTER VARYING(255),
		Rectifiedriskdescription  CHARACTER VARYING(255),
		risklevelRectifybefore  CHARACTER VARYING(255),
		risklevelRectifyafter  CHARACTER VARYING(255),
		Rectifiedsituation   CHARACTER VARYING(255),
		notRectifiedriskdescription  CHARACTER VARYING(255),
		notRectifiedreason  CHARACTER VARYING(255),
		notRectifiedrisklevel  CHARACTER VARYING(255),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskWisdom_RectifyItem PRIMARY KEY (riskFileNo,RectifiedType,serialNo)
    );
    
comment on column RiskWisdom_RectifyItem.riskFileNo is '风控报告编号';  
comment on column RiskWisdom_RectifyItem.RectifiedType is '整改类型,1:已整改,2:未整改'; 
comment on column RiskWisdom_RectifyItem.serialNo is '序号';  
--已整改项
--comment on column RiskWisdom_RectifyItem.RectifiedRiskNo is '已整改项，序号/风险编号';
comment on column RiskWisdom_RectifyItem.RectifieddefectLocation is '已整改项/未整改项，缺陷所处部位';
comment on column RiskWisdom_RectifyItem.Rectifieddefectdescription is '已整改项/未整改项，缺陷描述';
comment on column RiskWisdom_RectifyItem.Rectifiedriskdescription is '已整改项/未整改项，风险描述';
comment on column RiskWisdom_RectifyItem.risklevelRectifybefore is '已整改项，（风险等级）整改前';
comment on column RiskWisdom_RectifyItem.risklevelRectifyafter is '已整改项，（风险等级）整改后';
--comment on column RiskWisdom_RectifyItem.pictureRectifybefore is '已整改，项整改前图片';
--comment on column RiskWisdom_RectifyItem.pictureRectifyafter is '已整改项，整改后图片';
---未整改项
--comment on column RiskWisdom_RectifyItem.notRectifiedRiskNo is '未整改项,序号/风险编号';
--comment on column RiskWisdom_RectifyItem.notRectifieddefectLocation is '未整改项,缺陷所处部位';
--comment on column RiskWisdom_RectifyItem.notRectifieddefectdescription is '未整改项,缺陷描述';
comment on column RiskWisdom_RectifyItem.Rectifiedsituation is '整改情况';
comment on column RiskWisdom_RectifyItem.notRectifiedriskdescription is '未整改项,风险描述';
comment on column RiskWisdom_RectifyItem.notRectifiedreason is '未整改项,未整改原因';
comment on column RiskWisdom_RectifyItem.notRectifiedrisklevel is '未整改项,风险等级';
comment on column RiskWisdom_RectifyItem.inserttimeforhis is '插入时间';
comment on column RiskWisdom_RectifyItem.operatetimeforhis is '更新时间';







---RD2 整改清单信息--尚未整改项/已整改项 add by liqiankun

drop table if exists  RiskWisdom_RectifyItem;
CREATE TABLE  RiskWisdom_RectifyItem(
        risk_File_No CHARACTER VARYING(22) NOT NULL,
		Rectified_Type  CHARACTER VARYING(1)  NOT NULL,
		serial_No  serial NOT NULL, 
		Rectified_defect_Location  CHARACTER VARYING(255),
		Rectified_defect_description  CHARACTER VARYING(255),
		Rectified_risk_description  CHARACTER VARYING(255),
		risk_level_Rectify_before  CHARACTER VARYING(255),
		risk_level_Rectify_after  CHARACTER VARYING(255),
		Rectified_situation   CHARACTER VARYING(255),
		not_Rectified_risk_description  CHARACTER VARYING(255),
		not_Rectified_reason  CHARACTER VARYING(255),
		not_Rectified_risk_level  CHARACTER VARYING(255),
        insert_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operate_time_for_his TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskWisdom_RectifyItem PRIMARY KEY (risk_File_No,Rectified_Type,serial_No)
    );
    
comment on column RiskWisdom_RectifyItem.risk_File_No is '风控报告编号';  
comment on column RiskWisdom_RectifyItem.Rectified_Type is '整改类型,1:已整改,2:未整改'; 
comment on column RiskWisdom_RectifyItem.serial_No is '序号';  
--已整改项
--comment on column RiskWisdom_RectifyItem.Rectified_Risk_No is '已整改项，序号/风险编号';
comment on column RiskWisdom_RectifyItem.Rectified_defect_Location is '已整改项/未整改项，缺陷所处部位';
comment on column RiskWisdom_RectifyItem.Rectified_defect_description is '已整改项/未整改项，缺陷描述';
comment on column RiskWisdom_RectifyItem.Rectified_risk_description is '已整改项/未整改项，风险描述';
comment on column RiskWisdom_RectifyItem.risk_level_Rectify_before is '已整改项，（风险等级）整改前';
comment on column RiskWisdom_RectifyItem.risk_level_Rectify_after is '已整改项，（风险等级）整改后';
--comment on column RiskWisdom_RectifyItem.picture_Rectify_before is '已整改，项整改前图片';
--comment on column RiskWisdom_RectifyItem.picture_Rectify_after is '已整改项，整改后图片';
---未整改项
--comment on column RiskWisdom_RectifyItem.not_Rectified_Risk_No is '未整改项,序号/风险编号';
--comment on column RiskWisdom_RectifyItem.not_Rectified_defect_Location is '未整改项,缺陷所处部位';
--comment on column RiskWisdom_RectifyItem.not_Rectified_defect_description is '未整改项,缺陷描述';
comment on column RiskWisdom_RectifyItem.Rectified_situation is '整改情况';
comment on column RiskWisdom_RectifyItem.not_Rectified_risk_description is '未整改项,风险描述';
comment on column RiskWisdom_RectifyItem.not_Rectified_reason is '未整改项,未整改原因';
comment on column RiskWisdom_RectifyItem.not_Rectified_risk_level is '未整改项,风险等级';
comment on column RiskWisdom_RectifyItem.insert_time_for_his is '插入时间';
comment on column RiskWisdom_RectifyItem.operate_time_for_his is '更新时间';







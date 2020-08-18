--安全工厂整改表
drop table if exists RiskReport_FactoryRectify;
CREATE TABLE RiskReport_FactoryRectify (
 		risk_File_No CHARACTER VARYING(22) NOT NULL,
        serial_no serial NOT NULL,
        title CHARACTER VARYING(255) NOT NULL,
        Rectify_before_Problem CHARACTER VARYING(4000),
        Rectify_afore_Problem CHARACTER VARYING(4000),
        Rectify_flag CHARACTER VARYING(2),
        operate_code CHARACTER VARYING(20),
        rectify_code CHARACTER VARYING(20),
        submit_Date DATE,
        Rectify_Date DATE,
		insert_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operate_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskReport_FactoryRectify PRIMARY KEY (risk_File_No,serial_no)
);

comment on column RiskReport_FactoryRectify.risk_File_No is '风控编号';
comment on column RiskReport_FactoryRectify.serial_no is '整改序号';
comment on column RiskReport_FactoryRectify.title is '标题';
comment on column RiskReport_FactoryRectify.Rectify_before_Problem is '整改前问题';
comment on column RiskReport_FactoryRectify.Rectify_afore_Problem is '整改后问题';
comment on column RiskReport_FactoryRectify.Rectify_flag is '整改标记';
comment on column RiskReport_FactoryRectify.operate_code is '提交人员';
comment on column RiskReport_FactoryRectify.rectify_code is '整改人员';
comment on column RiskReport_FactoryRectify.submit_Date is '提交日期';
comment on column RiskReport_FactoryRectify.Rectify_Date is '整改期限';
comment on column RiskReport_FactoryRectify.insert_Time_For_His is '插入时间';
comment on column RiskReport_FactoryRectify.operate_Time_For_His is '更新时间';







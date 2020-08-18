--安全工厂任务表
drop table if exists RiskReport_factoryTask;
CREATE TABLE RiskReport_factoryTask (
        serial_no serial NOT NULL,
        registration_Number CHARACTER VARYING(20) NOT NULL,
        company_name CHARACTER VARYING(255),
        company_address CHARACTER VARYING(255),
        Industry_Info CHARACTER VARYING(255),
        expected_service_date DATE,
        task_flag CHARACTER VARYING(2),
        task_assignment CHARACTER VARYING(20),
        task_principal CHARACTER VARYING(20),
        link_Name CHARACTER VARYING(50),
        link_Number CHARACTER VARYING(50),
        With_special_require CHARACTER VARYING(255),
		insert_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operate_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskReport_factoryTask PRIMARY KEY (serial_no)
);
comment on column RiskReport_factoryTask.serial_no is '任务序号';
comment on column RiskReport_factoryTask.registration_Number is '企业注册号';
comment on column RiskReport_factoryTask.company_name is '企业名称';
comment on column RiskReport_factoryTask.company_address is '企业所在地';
comment on column RiskReport_factoryTask.Industry_Info is '所属行业信息';
comment on column RiskReport_factoryTask.expected_service_date is '期望服务日期';

comment on column RiskReport_factoryTask.task_flag is '任务状态';
comment on column RiskReport_factoryTask.task_assignment is '任务分配人员';
comment on column RiskReport_factoryTask.task_principal is '任务负责人';

comment on column RiskReport_factoryTask.link_Name is '联系人名称';
comment on column RiskReport_factoryTask.link_Number is '联系人电话';
comment on column RiskReport_factoryTask.With_special_require is '有无特殊要求';
comment on column RiskReport_factoryTask.insert_Time_For_His is '插入时间';
comment on column RiskReport_factoryTask.operate_Time_For_His is '更新时间';







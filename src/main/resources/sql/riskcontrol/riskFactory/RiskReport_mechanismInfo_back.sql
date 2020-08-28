---安全工厂机构信息表
drop table if exists RiskReport_mechanismInfo;
CREATE TABLE RiskReport_mechanismInfo (
        registration_Number CHARACTER VARYING(20) NOT NULL,
        company_name CHARACTER VARYING(255),
        svr_Scope CHARACTER VARYING(2) NOT NULL,
        user_Name CHARACTER VARYING(50) NOT NULL,
        user_Type CHARACTER VARYING(2) NOT NULL,
        com_Code CHARACTER VARYING(10) NOT NULL,
        valid_Status CHARACTER VARYING(2) NOT NULL,
        mobile CHARACTER VARYING(20) NOT NULL,
        email CHARACTER VARYING(50) NOT NULL,
        identify_Number CHARACTER VARYING(20) NOT NULL,
        inser_User_Code CHARACTER VARYING(20) NOT NULL,
        operate_User_Code CHARACTER VARYING(20) NOT NULL,
        user_Code CHARACTER VARYING(20) NOT NULL,
        
        profession  CHARACTER VARYING(255),
        education  CHARACTER VARYING(255),
        mail_address  CHARACTER VARYING(255),
         
        unify_social_credit_code CHARACTER VARYING(50),
        company_type CHARACTER VARYING(255),
        establishment_date DATE,
        legal_representative CHARACTER VARYING(255),
        operating_period CHARACTER VARYING(255),
        registered_capital NUMERIC(255,0),
        issue_Date DATE,
        registration_authority CHARACTER VARYING(255),
        company_address CHARACTER VARYING(255),
        business_Scope CHARACTER VARYING(255),
        contact_name CHARACTER VARYING(50),
        contact_number CHARACTER VARYING(20),
		insert_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operate_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskReport_mechanismInfo PRIMARY KEY (registration_Number,com_Code)
);

comment on column RiskReport_mechanismInfo.registration_Number is '注册号';
comment on column RiskReport_mechanismInfo.company_name is '企业名称';

comment on column RiskReport_mechanismInfo.svr_Scope is '所属子公司类型';
comment on column RiskReport_mechanismInfo.user_Name is '用户名称';
comment on column RiskReport_mechanismInfo.user_Type is '用户类型';
comment on column RiskReport_mechanismInfo.com_Code is '归属机构';
comment on column RiskReport_mechanismInfo.valid_Status is '有效状态';
comment on column RiskReport_mechanismInfo.mobile is '电话';
comment on column RiskReport_mechanismInfo.email is '邮箱';
comment on column RiskReport_mechanismInfo.identify_Number is '身份证号';
comment on column RiskReport_mechanismInfo.inser_User_Code is '信息创建人员';
comment on column RiskReport_mechanismInfo.operate_User_Code is '信息变更人员';
comment on column RiskReport_mechanismInfo.user_Code is '用户账号';


comment on column RiskReport_mechanismInfo.unify_social_credit_code is '统一社会信用代码';
comment on column RiskReport_mechanismInfo.company_type is '公司类型';
comment on column RiskReport_mechanismInfo.establishment_date is '成立日期';
comment on column RiskReport_mechanismInfo.legal_representative is '法定代表人';
comment on column RiskReport_mechanismInfo.operating_period is '营业期限';
comment on column RiskReport_mechanismInfo.registered_capital is '注册资本';
comment on column RiskReport_mechanismInfo.issue_Date is '发照日期';
comment on column RiskReport_mechanismInfo.registration_authority is '登记机关';
comment on column RiskReport_mechanismInfo.company_address is '企业地址';
comment on column RiskReport_mechanismInfo.business_Scope is '经营范围';
comment on column RiskReport_mechanismInfo.contact_name is '联系人名称';
comment on column RiskReport_mechanismInfo.contact_number is '联系人号码';
comment on column RiskReport_mechanismInfo.insert_Time_For_His is '插入时间';
comment on column RiskReport_mechanismInfo.operate_Time_For_His is '更新时间';




drop table if exists RISKREPORT_comcode;
CREATE TABLE RISKREPORT_comcode (
        registration_Number CHARACTER VARYING(20) NOT NULL,
        company_name CHARACTER VARYING(255),
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
		CONSTRAINT pk_RISKREPORT_comcode PRIMARY KEY (registration_Number)
);
comment on column RISKREPORT_comcode.registration_Number is '注册号';
comment on column RISKREPORT_comcode.company_name is '企业名称';
comment on column RISKREPORT_comcode.unify_social_credit_code is '统一社会信用代码';
comment on column RISKREPORT_comcode.company_type is '公司类型';
comment on column RISKREPORT_comcode.establishment_date is '成立日期';
comment on column RISKREPORT_comcode.legal_representative is '法定代表人';
comment on column RISKREPORT_comcode.operating_period is '营业期限';
comment on column RISKREPORT_comcode.registered_capital is '注册资本';
comment on column RISKREPORT_comcode.issue_Date is '发照日期';
comment on column RISKREPORT_comcode.registration_authority is '登记机关';
comment on column RISKREPORT_comcode.company_address is '企业地址';
comment on column RISKREPORT_comcode.business_Scope is '经营范围';
comment on column RISKREPORT_comcode.contact_name is '联系人姓名';
comment on column RISKREPORT_comcode.contact_number is '联系人电话';
comment on column RISKREPORT_comcode.insert_Time_For_His is '插入时间';
comment on column RISKREPORT_comcode.operate_Time_For_His is '更新时间';




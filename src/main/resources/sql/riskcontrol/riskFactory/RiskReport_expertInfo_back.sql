---安全工厂专家信息表
drop table if exists RiskReport_expertInfo;
CREATE TABLE RiskReport_expertInfo (
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
        
        new_User_Code CHARACTER VARYING(50),
        tele_Phone CHARACTER VARYING(50),
        fax_Number CHARACTER VARYING(50),
        post_Code CHARACTER VARYING(50),
        post_Address CHARACTER VARYING(255),
        sex CHARACTER VARYING(2),
        birth_Date CHARACTER VARYING(50),
        age CHARACTER VARYING(10),
        health CHARACTER VARYING(255),
        occupation_Code CHARACTER VARYING(50),
        education_Code CHARACTER VARYING(50),
		insert_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operate_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskReport_expertInfo PRIMARY KEY (registration_Number,com_Code)
);

comment on column RiskReport_expertInfo.registration_Number is '企业注册号';
comment on column RiskReport_expertInfo.company_name is '企业名称';

comment on column RiskReport_expertInfo.svr_Scope is '所属子公司类型';
comment on column RiskReport_expertInfo.user_Name is '用户名称';
comment on column RiskReport_expertInfo.user_Type is '用户类型';
comment on column RiskReport_expertInfo.com_Code is '归属机构';
comment on column RiskReport_expertInfo.valid_Status is '有效状态';
comment on column RiskReport_expertInfo.mobile is '电话';
comment on column RiskReport_expertInfo.email is '邮箱';
comment on column RiskReport_expertInfo.identify_Number is '身份证号';
comment on column RiskReport_expertInfo.inser_User_Code is '信息创建人员';
comment on column RiskReport_expertInfo.operate_User_Code is '信息变更人员';
comment on column RiskReport_expertInfo.user_Code is '用户账号';
comment on column RiskReport_expertInfo.new_User_Code is '新用户代码';
comment on column RiskReport_expertInfo.tele_Phone is '固定电话';
comment on column RiskReport_expertInfo.fax_Number is '传真号';
comment on column RiskReport_expertInfo.post_Code is '邮政编码';
comment on column RiskReport_expertInfo.post_Address is '邮寄地址';
comment on column RiskReport_expertInfo.sex is '性别';
comment on column RiskReport_expertInfo.birth_Date is '生日';
comment on column RiskReport_expertInfo.age is '年龄';
comment on column RiskReport_expertInfo.health is '健康状况';
comment on column RiskReport_expertInfo.occupation_Code is '职业';
comment on column RiskReport_expertInfo.education_Code is '学历';

comment on column RiskReport_expertInfo.insert_Time_For_His is '插入时间';
comment on column RiskReport_expertInfo.operate_Time_For_His is '更新时间';




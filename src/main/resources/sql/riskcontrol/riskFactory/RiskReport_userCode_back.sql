--用户表
drop table if exists RISKREPORT_userCode;
CREATE TABLE RISKREPORT_userCode (
        registration_Number CHARACTER VARYING(20) NOT NULL,
        com_code CHARACTER VARYING(20) NOT NULL,
        user_Code CHARACTER VARYING(20) NOT NULL,
        is_authorize CHARACTER VARYING(2),
        user_purview CHARACTER VARYING(255),
        upper_code CHARACTER VARYING(255),
        pass_word CHARACTER VARYING(50),
        user_Name CHARACTER VARYING(50),
        user_email CHARACTER VARYING(50),
        identify_number CHARACTER VARYING(30),
        link_number CHARACTER VARYING(20),
		insert_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operate_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RISKREPORT_userCode PRIMARY KEY (com_code,registration_Number,user_Code)
);
comment on column RISKREPORT_userCode.registration_Number is '注册号';
comment on column RISKREPORT_userCode.com_code is '机构编码';
comment on column RISKREPORT_userCode.user_Code is '用户编码';
comment on column RISKREPORT_userCode.is_authorize is '是否授权:授权只有通过注册到用户中心才能进行使用';
comment on column RISKREPORT_userCode.user_purview is '用户权限: 比如用户能够进行哪些操作';
comment on column RISKREPORT_userCode.upper_code is '上级编码';
comment on column RISKREPORT_userCode.pass_word is '密码';
comment on column RISKREPORT_userCode.user_Name is '用户名称';
comment on column RISKREPORT_userCode.user_email is '用户邮箱';
comment on column RISKREPORT_userCode.identify_number is '身份证号';
comment on column RISKREPORT_userCode.link_number is '联系电话';
comment on column RISKREPORT_userCode.insert_Time_For_His is '插入时间';
comment on column RISKREPORT_userCode.operate_Time_For_His is '更新时间';






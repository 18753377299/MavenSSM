--用户表
drop table if exists RISKREPORT_userinfo;
CREATE TABLE RISKREPORT_userinfo (
        user_code CHARACTER VARYING(20) NOT NULL,
        user_id CHARACTER VARYING(20),
        svr_code CHARACTER VARYING(2),
        svr_scope CHARACTER VARYING(2),
        insert_user_code CHARACTER VARYING(20),
        operate_user_code CHARACTER VARYING(20),
        valid_Status CHARACTER VARYING(2),
		insert_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operate_Time_For_His TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RISKREPORT_userinfo PRIMARY KEY (user_code)
);

comment on column RISKREPORT_userinfo.user_code is '用户账号';
comment on column RISKREPORT_userinfo.user_id is '用户编码';
comment on column RISKREPORT_userinfo.svr_code is '应用代码';
comment on column RISKREPORT_userinfo.svr_scope is '用户所属子公司类型';
comment on column RISKREPORT_userinfo.insert_user_code is '信息创建人员';
comment on column RISKREPORT_userinfo.operate_user_code is '信息变更人员';
comment on column RISKREPORT_userinfo.valid_Status is '是否有效';
comment on column RISKREPORT_userinfo.expiration_time is '有效截止时间';
comment on column RISKREPORT_userinfo.insert_Time_For_His is '插入时间';
comment on column RISKREPORT_userinfo.operate_Time_For_His is '更新时间';












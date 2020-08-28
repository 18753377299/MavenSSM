--用户表
drop table if exists RISKREPORT_userinfo;
CREATE TABLE RISKREPORT_userinfo (
        usercode CHARACTER VARYING(20) NOT NULL,
        userid CHARACTER VARYING(20),
        svrcode CHARACTER VARYING(2),
        svrscope CHARACTER VARYING(2),
        insertusercode CHARACTER VARYING(20),
        operateusercode CHARACTER VARYING(20),
        validStatus CHARACTER VARYING(2),
        expirationtime DATE,
		insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RISKREPORT_userinfo PRIMARY KEY (usercode)
);

comment on column RISKREPORT_userinfo.usercode is '用户账号';
comment on column RISKREPORT_userinfo.userid is '用户编码';
comment on column RISKREPORT_userinfo.svrcode is '应用代码';
comment on column RISKREPORT_userinfo.svrscope is '用户所属子公司类型';
comment on column RISKREPORT_userinfo.insertusercode is '信息创建人员';
comment on column RISKREPORT_userinfo.operateusercode is '信息变更人员';
comment on column RISKREPORT_userinfo.validStatus is '是否有效';
comment on column RISKREPORT_userinfo.expirationtime is '有效截止时间';
comment on column RISKREPORT_userinfo.insertTimeForHis is '插入时间';
comment on column RISKREPORT_userinfo.operateTimeForHis is '更新时间';












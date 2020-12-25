--用户表
drop table if exists RISKREPORT_userinfo;
CREATE TABLE RISKREPORT_userinfo (
        usercode CHARACTER VARYING(20) NOT NULL,
        ---userid CHARACTER VARYING(20),
        svrcode CHARACTER VARYING(2),
        svrscope CHARACTER VARYING(2),
        insertusercode CHARACTER VARYING(20),
        operateusercode CHARACTER VARYING(20),
        validStatus CHARACTER VARYING(2),
        ---expirationtime DATE,
		insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RISKREPORT_userinfo PRIMARY KEY (usercode)
);

comment on column RISKREPORT_userinfo.usercode is '用户账号';
--comment on column RISKREPORT_userinfo.userid is '用户编码';
comment on column RISKREPORT_userinfo.svrcode is '应用代码';
comment on column RISKREPORT_userinfo.svrscope is '用户所属子公司类型';
comment on column RISKREPORT_userinfo.insertusercode is '信息创建人员';
comment on column RISKREPORT_userinfo.operateusercode is '信息变更人员';
comment on column RISKREPORT_userinfo.validStatus is '是否有效';
---comment on column RISKREPORT_userinfo.expirationtime is '有效截止时间';
comment on column RISKREPORT_userinfo.insertTimeForHis is '插入时间';
comment on column RISKREPORT_userinfo.operateTimeForHis is '更新时间';


alter table riskreport_userinfo add column customername varchar(100);

alter table riskreport_userinfo  drop column  insuredtype;
alter table riskreport_userinfo  drop column customerstatus;
alter table riskreport_userinfo  drop column idtpcd;
alter table riskreport_userinfo  drop column idnum;
alter table riskreport_userinfo  drop column phonetp;



alter table riskreport_userinfo add column insuredtype varchar(2);
alter table riskreport_userinfo add column customerstatus varchar(2);
alter table riskreport_userinfo add column idtpcd varchar(2);
alter table riskreport_userinfo add column idnum varchar(50);
alter table riskreport_userinfo add column phonetp varchar(2);

comment on column riskreport_userinfo.insuredtype is '被保险人类型';
comment on column riskreport_userinfo.customerstatus is '投保企业名称';
comment on column riskreport_userinfo.idtpcd is '证件类型';
comment on column riskreport_userinfo.idnum is '证件号码';
comment on column riskreport_userinfo.phonetp is '电话类型';


alter table riskreport_userinfo add column comcode varchar(10);
alter table riskreport_userinfo add column customername varchar(100);
alter table riskreport_userinfo add column phonenum varchar(50);
alter table riskreport_userinfo add column email varchar(50);
alter table riskreport_userinfo add column identifynumber varchar(50);
alter table riskreport_userinfo add column expandfieldone varchar(255);
alter table riskreport_userinfo add column expandfieldtwo varchar(255);

comment on column riskreport_userinfo.customername is '投保企业名称';
comment on column riskreport_userinfo.phonenum is '电话号码';
comment on column riskreport_userinfo.email is '邮箱';
comment on column riskreport_userinfo.identifynumber is '身份证号号码';
comment on column riskreport_userinfo.expandfieldone is '拓展字段1';
comment on column riskreport_userinfo.expandfieldtwo is '拓展字段2';
comment on column riskreport_userinfo.comcode is '归属机构';






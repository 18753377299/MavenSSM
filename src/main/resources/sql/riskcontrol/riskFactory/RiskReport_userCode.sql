--用户表
drop table if exists RISKREPORT_userCode;
CREATE TABLE RISKREPORT_userCode (
        registrationNumber CHARACTER VARYING(20) NOT NULL,
        comcode CHARACTER VARYING(20) NOT NULL,
        userCode CHARACTER VARYING(20) NOT NULL,
        isauthorize CHARACTER VARYING(2),
        userpurview CHARACTER VARYING(255),
        uppercode CHARACTER VARYING(255),
        password CHARACTER VARYING(50),
        userName CHARACTER VARYING(50),
        useremail CHARACTER VARYING(50),
        identifynumber CHARACTER VARYING(30),
        linknumber CHARACTER VARYING(20),
		insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RISKREPORT_userCode PRIMARY KEY (comcode,registrationNumber,userCode)
);
comment on column RISKREPORT_userCode.registrationNumber is '注册号';
comment on column RISKREPORT_userCode.comcode is '机构编码';
comment on column RISKREPORT_userCode.userCode is '用户编码';
comment on column RISKREPORT_userCode.isauthorize is '是否授权:授权只有通过注册到用户中心才能进行使用';
comment on column RISKREPORT_userCode.userpurview is '用户权限: 比如用户能够进行哪些操作';
comment on column RISKREPORT_userCode.uppercode is '上级编码';
comment on column RISKREPORT_userCode.password is '密码';
comment on column RISKREPORT_userCode.userName is '用户名称';
comment on column RISKREPORT_userCode.useremail is '用户邮箱';
comment on column RISKREPORT_userCode.identifynumber is '身份证号';
comment on column RISKREPORT_userCode.linknumber is '联系电话';
comment on column RISKREPORT_userCode.insertTimeForHis is '插入时间';
comment on column RISKREPORT_userCode.operateTimeForHis is '更新时间';






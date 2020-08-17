drop table if exists RISKREPORT_comcode;
CREATE TABLE RISKREPORT_comcode (
        registrationNumber CHARACTER VARYING(20) NOT NULL,
        companyname CHARACTER VARYING(255),
        unifysocialcreditcode CHARACTER VARYING(50),
        companytype CHARACTER VARYING(255),
        establishmentdate DATE,
        legalrepresentative CHARACTER VARYING(255),
        operatingperiod CHARACTER VARYING(255),
        registeredcapital NUMERIC(255,0),
        issueDate DATE,
        registrationauthority CHARACTER VARYING(255),
        companyaddress CHARACTER VARYING(255),
        businessScope CHARACTER VARYING(255),
        contactname CHARACTER VARYING(50),
        contactnumber CHARACTER VARYING(20),
		insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RISKREPORT_comcode PRIMARY KEY (registrationNumber)
);
comment on column RISKREPORT_comcode.registrationNumber is '注册号';
comment on column RISKREPORT_comcode.companyname is '企业名称';
comment on column RISKREPORT_comcode.unifysocialcreditcode is '统一社会信用代码';
comment on column RISKREPORT_comcode.companytype is '公司类型';
comment on column RISKREPORT_comcode.establishmentdate is '成立日期';
comment on column RISKREPORT_comcode.legalrepresentative is '法定代表人';
comment on column RISKREPORT_comcode.operatingperiod is '营业期限';
comment on column RISKREPORT_comcode.registeredcapital is '注册资本';
comment on column RISKREPORT_comcode.issueDate is '发照日期';
comment on column RISKREPORT_comcode.registrationauthority is '登记机关';
comment on column RISKREPORT_comcode.companyaddress is '企业地址';
comment on column RISKREPORT_comcode.businessScope is '经营范围';
comment on column RISKREPORT_comcode.contactname is '联系人姓名';
comment on column RISKREPORT_comcode.contactnumber is '联系人电话';
comment on column RISKREPORT_comcode.insertTimeForHis is '插入时间';
comment on column RISKREPORT_comcode.operateTimeForHis is '更新时间';




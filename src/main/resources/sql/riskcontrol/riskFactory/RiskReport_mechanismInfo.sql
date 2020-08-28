---安全工厂机构信息表
drop table if exists RiskReport_mechanismInfo;
CREATE TABLE RiskReport_mechanismInfo (
        registrationNumber CHARACTER VARYING(20) NOT NULL,
        companyname CHARACTER VARYING(255),
        svrScope CHARACTER VARYING(2) NOT NULL,
        userName CHARACTER VARYING(50) NOT NULL,
        userType CHARACTER VARYING(2) NOT NULL,
        comCode CHARACTER VARYING(10) NOT NULL,
        validStatus CHARACTER VARYING(2) NOT NULL,
        mobile CHARACTER VARYING(20) NOT NULL,
        email CHARACTER VARYING(50) NOT NULL,
        identifyNumber CHARACTER VARYING(20) NOT NULL,
        inserUserCode CHARACTER VARYING(20) NOT NULL,
        operateUserCode CHARACTER VARYING(20) NOT NULL,
        userCode CHARACTER VARYING(20) NOT NULL,
        
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
		CONSTRAINT pk_RiskReport_mechanismInfo PRIMARY KEY (registrationNumber,comCode)
);

comment on column RiskReport_mechanismInfo.registrationNumber is '企业注册号';
comment on column RiskReport_mechanismInfo.companyname is '企业名称';
--用于进行生成用户账号 begin
comment on column RiskReport_mechanismInfo.svrScope is '所属子公司类型';
comment on column RiskReport_mechanismInfo.userName is '用户名称';
comment on column RiskReport_mechanismInfo.userType is '用户类型';
comment on column RiskReport_mechanismInfo.comCode is '归属机构';
comment on column RiskReport_mechanismInfo.validStatus is '有效状态';
comment on column RiskReport_mechanismInfo.mobile is '电话';
comment on column RiskReport_mechanismInfo.email is '邮箱';
comment on column RiskReport_mechanismInfo.identifyNumber is '身份证号';
comment on column RiskReport_mechanismInfo.inserUserCode is '信息创建人员';
comment on column RiskReport_mechanismInfo.operateUserCode is '信息变更人员';
comment on column RiskReport_mechanismInfo.userCode is '用户账号';
--用于进行生成用户账号 end

comment on column RiskReport_mechanismInfo.unifysocialcreditcode is '统一社会信用代码';
comment on column RiskReport_mechanismInfo.companytype is '公司类型';
comment on column RiskReport_mechanismInfo.establishmentdate is '成立日期';
comment on column RiskReport_mechanismInfo.legalrepresentative is '法定代表人';
comment on column RiskReport_mechanismInfo.operatingperiod is '营业期限';
comment on column RiskReport_mechanismInfo.registeredcapital is '注册资本';
comment on column RiskReport_mechanismInfo.issueDate is '发照日期';
comment on column RiskReport_mechanismInfo.registrationauthority is '登记机关';
comment on column RiskReport_mechanismInfo.companyaddress is '企业地址';
comment on column RiskReport_mechanismInfo.businessScope is '经营范围';

comment on column RiskReport_mechanismInfo.contactname is '联系人名称';
comment on column RiskReport_mechanismInfo.contactnumber is '联系人号码';
comment on column RiskReport_mechanismInfo.insertTimeForHis is '插入时间';
comment on column RiskReport_mechanismInfo.operateTimeForHis is '更新时间';




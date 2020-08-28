---安全工厂专家信息表
drop table if exists RiskReport_expertInfo;
CREATE TABLE RiskReport_expertInfo (
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
        
        newUserCode CHARACTER VARYING(50),
        telePhone CHARACTER VARYING(50),
        faxNumber CHARACTER VARYING(50),
        postCode CHARACTER VARYING(50),
        postAddress CHARACTER VARYING(255),
        sex CHARACTER VARYING(2),
        birthDate CHARACTER VARYING(50),
        age CHARACTER VARYING(10),
        health CHARACTER VARYING(255),
        occupationCode CHARACTER VARYING(50),
        educationCode CHARACTER VARYING(50),
        
        workExpertise CHARACTER VARYING(4000),
        projectExperience CHARACTER VARYING(4000),
        workExperience CHARACTER VARYING(4000),
        professionalDirection CHARACTER VARYING(4000),
        prospectingIndustry CHARACTER VARYING(4000),
        personalQualification CHARACTER VARYING(4000),
        
		insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
		CONSTRAINT pk_RiskReport_expertInfo PRIMARY KEY (registrationNumber,comCode)
);

comment on column RiskReport_expertInfo.registrationNumber is '企业注册号';
comment on column RiskReport_expertInfo.companyname is '企业名称';

comment on column RiskReport_expertInfo.svrScope is '所属子公司类型';
comment on column RiskReport_expertInfo.userName is '用户名称';
comment on column RiskReport_expertInfo.userType is '用户类型';
comment on column RiskReport_expertInfo.comCode is '归属机构';
comment on column RiskReport_expertInfo.validStatus is '有效状态';
comment on column RiskReport_expertInfo.mobile is '电话';
comment on column RiskReport_expertInfo.email is '邮箱';
comment on column RiskReport_expertInfo.identifyNumber is '身份证号';
comment on column RiskReport_expertInfo.inserUserCode is '信息创建人员';
comment on column RiskReport_expertInfo.operateUserCode is '信息变更人员';
comment on column RiskReport_expertInfo.userCode is '用户账号';



comment on column RiskReport_expertInfo.newUserCode is '新用户代码';
comment on column RiskReport_expertInfo.telePhone is '固定电话';
comment on column RiskReport_expertInfo.faxNumber is '传真号';
comment on column RiskReport_expertInfo.postCode is '邮政编码';
comment on column RiskReport_expertInfo.postAddress is '邮寄地址';
comment on column RiskReport_expertInfo.sex is '性别';
comment on column RiskReport_expertInfo.birthDate is '生日';
comment on column RiskReport_expertInfo.age is '年龄';
comment on column RiskReport_expertInfo.health is '健康状况';
comment on column RiskReport_expertInfo.occupationCode is '职业';
comment on column RiskReport_expertInfo.educationCode is '学历';

comment on column RiskReport_expertInfo.workExpertise is '工作专长';
comment on column RiskReport_expertInfo.projectExperience is '项目经验';
comment on column RiskReport_expertInfo.workExperience is '工作经验';
comment on column RiskReport_expertInfo.professionalDirection is '专业方向';
comment on column RiskReport_expertInfo.prospectingIndustry is '查勘行业';
comment on column RiskReport_expertInfo.personalQualification is '个人资质';

comment on column RiskReport_expertInfo.insertTimeForHis is '插入时间';
comment on column RiskReport_expertInfo.operateTimeForHis is '更新时间';




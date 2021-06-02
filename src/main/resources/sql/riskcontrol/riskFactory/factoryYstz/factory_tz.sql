-- informix数据库:
-- 重大隐患tab：　
-- 报告编号
-- 隐患类型: “煤矿行业重大生产安全事故隐患排查清单”或“非煤行业重大生产安全事故隐患排查清单”
-- 一级类目字段名称:
-- 一级类目字段值:“适用”、“不适用”、“本次未排查”
-- 二级类目字段名称: “符合要求”、“不符合要求，存在隐患”、“本次未排查”
-- 二级类目字段值:
-- 隐患描述：　可自由填写文本
-- 隐患照片：　必须上传，放在隐患描述后面
-- 整改建议：　可自由填写文本
-- 整改情况：　报告生成时暂不填写，进入整改审核流程时，被服务企业方填写
-- 拓展字段1：
-- 拓展字段2：
-- 拓展字段3：
-- 插入时间：
-- 更新时间：
-- 一般安全隐患里的条目和重大安全隐患里的条目一样，只是可以进行选择录入。


drop table riskFactory_MajorDanger;
CREATE TABLE riskFactory_MajorDanger (
	riskFileNo varchar(22) NOT NULL, --**报告编号
	dangerType varchar(30) NOT NULL,--**隐患类型,1: 为一般安全隐患，其他的暂不定义(使用字母代替)
	firstCategoryCode varchar(30), --**一级类目字段编码
	firstCategoryName varchar(100), --**一级类目字段名称
	firstCategoryValue varchar(2),--**一级类目字段值
	secCategoryCode varchar(30) NOT NULL,--**二级类目字段编码
	secCategoryName varchar(255),--**二级类目字段名称
	secCategoryValue varchar(2),--*二级类目字段值
	dangerDesc lvarchar(3000),--**隐患描述
-- 	dangerPicture lvarchar(3000),--**照片，是否放到riskReport_picture表中
	rectifySuggestion lvarchar(3000), --**整改建议
	rectifySituation lvarchar(3000), --**整改情况
	extendedFieldOne  varchar(255),--**拓展字段1
	extendedFieldTwo  varchar(255),--**拓展字段2
	extendedFieldThree  varchar(255),--**拓展字段3
	inserttimeforhis DATETIME YEAR TO SECOND DEFAULT CURRENT YEAR TO SECOND,
	operatetimeforhis DATETIME YEAR TO SECOND DEFAULT CURRENT YEAR TO SECOND,
	PRIMARY KEY (riskFileNo,dangerType,secCategoryCode)
);


/**
一般隐患tab（可供专家按隐患条目录入）：
隐患描述：　可自由填写文本
隐患照片：　必须上传，放在隐患描述后面
整改建议：　可自由填写文本
整改情况：　报告生成时暂不填写，进入整改审核流程时，被服务企业方填写
*/








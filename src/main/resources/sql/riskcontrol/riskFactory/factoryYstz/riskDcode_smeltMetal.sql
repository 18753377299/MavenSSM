-- 安全工厂验收调整
--codeType:安全工厂重大隐患，codecode: 二级类目编码， uppercode： 行业类型 ，
-- codecname：一级类目编码  ，codeename：一级类目名称，introduce： 二级类目名称

delete from  riskDcode where  codeType in ('factoryFirCategory','factorySecCategory');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus) VALUES (
'factoryFirCategory',NULL,'A',NULL,'适用',NULL,NULL,'1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus) VALUES (
'factoryFirCategory',NULL,'B',NULL,'不适用',NULL,NULL,'1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus) VALUES (
'factoryFirCategory',NULL,'C',NULL,'本次未排查',NULL,NULL,'1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus) VALUES (
'factorySecCategory',NULL,'A',NULL,'符合要求',NULL,NULL,'1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus) VALUES (
'factorySecCategory',NULL,'B',NULL,'不符合要求，存在隐患',NULL,NULL,'1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus) VALUES (
'factorySecCategory',NULL,'C',NULL,'本次未排查',NULL,NULL,'1');

--smeltMetal: 金属冶炼
delete from  riskDcode where  codeType='factoryMA'   and codecode ='smeltMetal';
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
		VALUES ('factoryMA',NULL,'inSphereInfluence','smeltMetal','metalIndustry','冶金行业','会议室、活动室、休息室、更衣室等场所设置在铁水、钢水与液渣吊运影响的范围内','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
		VALUES ('factoryMA',NULL,'craneNoCheckRectify','smeltMetal','metalIndustry','冶金行业','吊运铁水、钢水与液渣起重机不符合冶金起重机的相关要求；炼钢厂在吊运重罐铁水、钢水或液渣时，未使用固定式龙门钩的铸造起重机，龙门钩横梁、耳轴销和吊钩、钢丝绳及其端头固定零件，未进行定期检查，发现问题未及时整改','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
		VALUES ('factoryMA',NULL,'cisternNoInspection','smeltMetal','metalIndustry','冶金行业','盛装铁水、钢水与液渣的罐（包、盆）等容器耳轴未按国家标准规定要求定期进行探伤检测','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'metalNoEmerFacilities','smeltMetal','metalIndustry','冶金行业','冶炼、熔炼、精炼生产区域的安全坑内及熔体泄漏、喷溅影响范围内存在积水，放置有易燃易爆物品。金属铸造、连铸、浇铸流程未设置铁水罐、钢水罐、溢流槽、中间溢流罐等高温熔融金属紧急排放和应急储存设施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'furnaceNoCheck','smeltMetal','metalIndustry','冶金行业','炉、窑、槽、罐类设备本体及附属设施未定期检查，出现严重焊缝开裂、腐蚀、破损、衬砖损坏、壳体发红及明显弯曲变形等未报修或报废，仍继续使用','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'oxygenLanceNoConfig','smeltMetal','metalIndustry','冶金行业','氧枪等水冷元件未配置出水温度与进出水流量差检测、报警装置及温度监测，未与炉体倾动、氧气开闭等联锁','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasTankNotFaraway','smeltMetal','metalIndustry','冶金行业','煤气柜建设在居民稠密区，未远离大型建筑、仓库、通信和交通枢纽等重要设施；附属设备设施未按防火防爆要求配置防爆型设备；柜顶未设置防雷装置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasAreaNoAlarm','smeltMetal','metalIndustry','冶金行业','煤气区域的值班室、操作室等人员较集中的地方，未设置固定式一氧化碳监测报警装置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
		VALUES ('factoryMA',NULL,'gasPipeNoIsolation','smeltMetal','metalIndustry','冶金行业','高炉、转炉、加热炉、煤气柜、除尘器等设施的煤气管道未设置可靠隔离装置和吹扫设施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
		VALUES ('factoryMA',NULL,'gasSupervisorNoCut','smeltMetal','metalIndustry','冶金行业','煤气分配主管上支管引接处，未设置可靠的切断装置；车间内各类燃气管线，在车间入口未设置总管切断阀','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'principalNoCheck','smeltMetal','metalIndustry','冶金行业','金属冶炼企业主要负责人和安全生产管理人员未依法经考核合格','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'colorCraneNoCheckRectify','smeltMetal','nonFerrousIndustry','有色行业','吊运铜水等熔融有色金属及渣的起重机不符合冶金起重机的相关要求；横梁、耳轴销和吊钩、钢丝绳及其端头固定零件，未进行定期检查，发现问题未及时处理','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'inColorMetalRange','smeltMetal','nonFerrousIndustry','有色行业','会议室、活动室、休息室、更衣室等场所设置在铜水等熔融有色金属及渣的吊运影响范围内','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'tankNoCheck','smeltMetal','nonFerrousIndustry','有色行业','盛装铜水等熔融有色金属及渣的罐（包、盆）等容器耳轴未定期进行检测','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'existWaterFlammableRes','smeltMetal','nonFerrousIndustry','有色行业','铜水等高温熔融有色金属冶炼、精炼、铸造生产区域的安全坑内及熔体泄漏、喷溅影响范围内存在非生产性积水；熔体容易喷溅到的区域，放置有易燃易爆物品','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'metalCastNoSetMeasure','smeltMetal','nonFerrousIndustry','有色行业','铜水等熔融有色金属铸造、浇铸流程未设置紧急排放和应急储存设施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'metalSmeltNoCoolMeasure','smeltMetal','nonFerrousIndustry','有色行业','高温工作的熔融有色金属冶炼炉窑、铸造机、加热炉及水冷元件未设置应急冷却水源等冷却应急处置措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'smeltFurnaceNoSafeMeasure','smeltMetal','nonFerrousIndustry','有色行业','冶炼炉窑的水冷元件未配置温度、进出水流量差检测及报警装置；未设置防止冷却水大量进入炉内的安全设施（如：快速切断阀等）','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'colorFurnaceNoCheck','smeltMetal','nonFerrousIndustry','有色行业','炉、窑、槽、罐类设备本体及附属设施未定期检查，出现严重焊缝开裂、腐蚀、破损、衬砖损坏、壳体发红及明显弯曲变形等未报修或报废，仍继续使用','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasDeviceNoCut','smeltMetal','nonFerrousIndustry','有色行业','使用煤气（天然气）的烧嘴等燃烧装置，未设置防突然熄火或点火失败的快速切断阀，以切断煤气（天然气）','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'colorPrincipalNoCheck','smeltMetal','nonFerrousIndustry','有色行业','金属冶炼企业主要负责人和安全生产管理人员未依法经考核合格','1');


--fireCracker: 烟花爆竹
delete from  riskDcode where  codeType='factoryMA'   and uppercode ='fireCracker';

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'fcPrincipalNoCheck','fireCracker','fireCrackerPro','烟花爆竹生产经营','主要负责人、安全生产管理人员未依法经考核合格','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'personNoRepairEquip','fireCracker','fireCrackerPro','烟花爆竹生产经营','特种作业人员未持证上岗，作业人员带药检维修设备设施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'staffWithToolWork','fireCracker','fireCrackerPro','烟花爆竹生产经营','职工自行携带工器具、机器设备进厂进行涉药作业','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'staffOverApprovedNum','fireCracker','fireCrackerPro','烟花爆竹生产经营','工（库）房实际作业人员数量超过核定人数','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'retainDrugExcessive','fireCracker','fireCrackerPro','烟花爆竹生产经营','工（库）房实际滞留、存储药量超过核定药量','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'lackWarehouseProtection','fireCracker','fireCrackerPro','烟花爆竹生产经营','工（库）房内、外部安全距离不足，防护屏障缺失或者不符合要求','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'failLightningProtection','fireCracker','fireCrackerPro','烟花爆竹生产经营','防静电、防火、防雷设备设施缺失或者失效','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'illegalConstruction','fireCracker','fireCrackerPro','烟花爆竹生产经营','擅自改变工（库）房用途或者违规私搭乱建','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'zoneSettNotMeetStandard','fireCracker','fireCrackerPro','烟花爆竹生产经营','工厂围墙缺失或者分区设置不符合国家标准','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'oxidantPremix','fireCracker','fireCrackerPro','烟花爆竹生产经营','将氧化剂、还原剂同库储存、违规预混或者在同一工房内粉碎、称量','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'drugRelatMachineChange','fireCracker','fireCrackerPro','烟花爆竹生产经营','在用涉药机械设备未经安全性论证或者擅自更改、改变用途','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'storageDesignNotMatch','fireCracker','fireCrackerPro','烟花爆竹生产经营','中转库、药物总库和成品总库的存储能力与设计产能不匹配','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSafeProduceSys','fireCracker','fireCrackerPro','烟花爆竹生产经营','未建立与岗位相匹配的全员安全生产责任制或者未制定实施生产安全事故隐患排查治理制度','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'fakeLicense','fireCracker','fireCrackerPro','烟花爆竹生产经营','出租、出借、转让、买卖、冒用或者伪造许可证','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'productUseIllicitDrug','fireCracker','fireCrackerPro','烟花爆竹生产经营','生产经营的产品种类、危险等级超许可范围或者生产使用违禁药物','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'warehouseOrganizProduct','fireCracker','fireCrackerPro','烟花爆竹生产经营','分包转包生产线、工房、库房组织生产经营','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'oneCertiMultipleFactory','fireCracker','fireCrackerPro','烟花爆竹生产经营','一证多厂或者多股东各自独立组织生产经营','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'discontOrganizProduct','fireCracker','fireCrackerPro','烟花爆竹生产经营','许可证过期、整顿改造、恶劣天气等停产停业期间组织生产经营','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'overStandOrganizProduct','fireCracker','fireCrackerPro','烟花爆竹生产经营','烟花爆竹仓库存放其它爆炸物等危险物品或者生产经营违禁超标产品','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'openFlameRetailLocation','fireCracker','fireCrackerPro','烟花爆竹生产经营','零售点与居民居住场所设置在同一建筑物内或者在零售场所使用明火','1');

--chemicals:  危险化学品
delete from  riskDcode where  codeType='factoryMA'   and uppercode ='chemicals';

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'chPrincipalNoCheck','chemicals','chemicalsPro','化工和危险化学品生产经营','危险化学品生产、经营单位主要负责人和安全生产管理人员未依法经考核合格','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'staffWorkNoLicense','chemicals','chemicalsPro','化工和危险化学品生产经营','特种作业人员未持证上岗','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'proteDistanceNoStandard','chemicals','chemicalsPro','化工和危险化学品生产经营','涉及“两重点一重大”的生产装置、储存设施外部安全防护距离不符合国家标准要求','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'sysAutomationNoUse','chemicals','chemicalsPro','化工和危险化学品生产经营','涉及重点监管危险化工工艺的装置未实现自动化控制，系统未实现紧急停车功能，装备的自动化控制系统、紧急停车系统未投入使用','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noEquipSafeInstrumentSys','chemicals','chemicalsPro','化工和危险化学品生产经营','构成一级、二级重大危险源的危险化学品罐区未实现紧急切断功能；涉及毒性气体、液化气体、剧毒液体的一级、二级重大危险源的危险化学品罐区未配备独立的安全仪表系统','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSetWaterInjectionMeas','chemicals','chemicalsPro','化工和危险化学品生产经营','全压力式液化烃储罐未按国家标准设置注水措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noUsePipelineFillSys','chemicals','chemicalsPro','化工和危险化学品生产经营','液化烃、液氨、液氯等易燃易爆、有毒有害液化气体的充装未使用万向管道充装系统','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'toxicGasThroughPublicArea','chemicals','chemicalsPro','化工和危险化学品生产经营','光气、氯气等剧毒气体及硫化氢气体管道穿越除厂区(包括化工园区、工业园区）外的公共区域','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'lineCrossProAreaNoStand','chemicals','chemicalsPro','化工和危险化学品生产经营','地区架空电力线路穿越生产区且不符合国家标准要求','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'chemicalPlantNoSafeDesign','chemicals','chemicalsPro','化工和危险化学品生产经营','在役化工装置未经正规设计且未进行安全设计诊断','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'eliminateSafeTech','chemicals','chemicalsPro','化工和危险化学品生产经营','使用淘汰落后安全技术工艺、设备目录列出的工艺、设备','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'harmfulGasNoAlarmSys','chemicals','chemicalsPro','化工和危险化学品生产经营','涉及可燃和有毒有害气体泄漏的场所未按国家标准设置检测报警装置，爆炸危险场所未按国家标准安装使用防爆电气设备','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'controlRoomNoMeetRequire','chemicals','chemicalsPro','化工和危险化学品生产经营','控制室或机柜间面向具有火灾、爆炸危险性装置一侧不满足国家标准关于防火防爆的要求','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'chProNoSetDualPower','chemicals','chemicalsPro','化工和危险化学品生产经营','化工生产装置未按国家标准要求设置双重电源供电，自动化控制系统未设置不间断电源','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'safeValveNoUseNormal','chemicals','chemicalsPro','化工和危险化学品生产经营','安全阀、爆破片等安全附件未正常投用','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSetSafeProSys','chemicals','chemicalsPro','化工和危险化学品生产经营','未建立与岗位相匹配的全员安全生产责任制或者未制定实施生产安全事故隐患排查治理制度','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSetOperateRule','chemicals','chemicalsPro','化工和危险化学品生产经营','未制定操作规程和工艺控制指标','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSetSpeWorkSys','chemicals','chemicalsPro','化工和危险化学品生产经营','未按照国家标准制定动火、进入受限空间等特殊作业管理制度，或者制度未有效执行','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSetSafeRiskAssess','chemicals','chemicalsPro','化工和危险化学品生产经营','新开发的危险化学品生产工艺未经小试、中试、工业化试验直接进行工业化生产；国内首次使用的化工工艺未经过省级人民政府有关部门组织的安全可靠性论证；新建装置未制定试生产方案投料开车；精细化工企业未按规范性文件要求开展反应安全风险评估','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'chNoClassifyStorage','chemicals','chemicalsPro','化工和危险化学品生产经营','未按国家标准分区分类储存危险化学品，超量、超品种储存危险化学品，相互禁配物质混放混存','1');

--otherIndustry:  其他行业
delete from  riskDcode where  codeType='factoryMA'   and uppercode ='otherIndustry';

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'crowPlaceInsuffSafeDist','otherIndustry','dustExplHazardInd','存在粉尘爆炸危险的行业领域','粉尘爆炸危险场所设置在非框架结构的多层建构筑物内，或与居民区、员工宿舍、会议室等人员密集场所安全距离不足','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'interconnDustRemoveSys','otherIndustry','dustExplHazardInd','存在粉尘爆炸危险的行业领域','可燃性粉尘与可燃气体等易加剧爆炸危险的介质共用一套除尘系统，不同防火分区的除尘系统互联互通','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dustRemovSysNoExplosMea','otherIndustry','dustExplHazardInd','存在粉尘爆炸危险的行业领域','干式除尘系统未规范采用泄爆、隔爆、惰化、抑爆等任一种控爆措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dustRemovSysNoPreFire','otherIndustry','dustExplHazardInd','存在粉尘爆炸危险的行业领域','除尘系统采用正压吹送粉尘，且未采取可靠的防范点燃源的措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dustRemovSysUseSettCham','otherIndustry','dustExplHazardInd','存在粉尘爆炸危险的行业领域','除尘系统采用粉尘沉降室除尘，或者采用干式巷道式构筑物作为除尘风道','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dustSysNoLockUnloadDev','otherIndustry','dustExplHazardInd','存在粉尘爆炸危险的行业领域','铝镁等金属粉尘及木质粉尘的干式除尘系统未规范设置锁气卸灰装置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dustAreaNoExplosProofEle','otherIndustry','dustExplHazardInd','存在粉尘爆炸危险的行业领域','粉尘爆炸危险场所的20区未使用防爆电气设备设施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noRemoveIronEquip','otherIndustry','dustExplHazardInd','存在粉尘爆炸危险的行业领域','在粉碎、研磨、造粒等易于产生机械点火源的工艺设备前，未按规范设置去除铁、石等异物的装置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'woodProNoSetAlarmEquip','otherIndustry','dustExplHazardInd','存在粉尘爆炸危险的行业领域','木制品加工企业，与砂光机连接的风管未规范设置火花探测报警装置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noDustREmoveSys','otherIndustry','dustExplHazardInd','存在粉尘爆炸危险的行业领域','未制定粉尘清扫制度，作业现场积尘未及时规范清理','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'packRoomSetCoolSys','otherIndustry','liquidAmmonRefriInd','使用液氨制冷的行业领域','包装间、分割间、产品整理间等人员较多生产场所的空调系统采用氨直接蒸发制冷系统','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'workRoomPersonOverNine','otherIndustry','liquidAmmonRefriInd','使用液氨制冷的行业领域','快速冻结装置未设置在单独的作业间内，且作业间内作业人员数量超过9人','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'limitRoomNoSetAlarmFlag','otherIndustry','limitSpaceWorkInd','有限空间作业相关的行业领域','未对有限空间作业场所进行辨识，并设置明显安全警示标志','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'notAllowInLimitRoomWork','otherIndustry','limitSpaceWorkInd','有限空间作业相关的行业领域','未落实作业审批制度，擅自进入有限空间作业','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'cemFactNoSetGasExtiDev','otherIndustry','buildMaterInd','建材行业','水泥工厂煤磨袋式收尘器（或煤粉仓）未设置温度和一氧化碳监测，或未设置气体灭火装置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'cemFactNoRiskAnaly','otherIndustry','buildMaterInd','建材行业','水泥工厂筒型储存库人工清库作业外包给不具备高空作业工程专业承包资质的承包方且作业前未进行风险分析','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasKilnNoSetAlarmSys','otherIndustry','buildMaterInd','建材行业','燃气窑炉未设置燃气低压警报器和快速切断阀，或易燃易爆气体聚集区域未设置监测报警装置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'fiberProCoolLeak','otherIndustry','buildMaterInd','建材行业','纤维制品三相电弧炉、电熔制品电炉，水冷构件泄漏','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'limtRoomNoIsoProMeas','otherIndustry','buildMaterInd','建材行业','进入筒型储库、磨机、破碎机、篦冷机、各种焙烧窑等有限空间作业时，未采取有效的防止电气设备意外启动、热气涌入等隔离防护措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'glassFurnaceNoAlarmSys','otherIndustry','buildMaterInd','建材行业','玻璃窑炉、玻璃锡槽，水冷、风冷保护系统存在漏水、漏气，未设置监测报警装置','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'meetRoomInPourArea','otherIndustry','machineryInd','机械行业','会议室、活动室、休息室、更衣室等场所设置在熔炼炉、熔融金属吊运和浇注影响范围内','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'liftPourLadNoRegularCheck','otherIndustry','machineryInd','机械行业','吊运熔融金属的起重机不符合冶金铸造起重机技术条件,或驱动装置中未设置两套制动器。吊运浇注包的龙门钩横梁、耳轴销和吊钩等零件，未进行定期探伤检查','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'meltFurnaceExistExploItem','otherIndustry','machineryInd','机械行业','铸造熔炼炉炉底、炉坑及浇注坑等作业坑存在潮湿、积水状况，或存放易燃易爆物品','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'meltFurnaceNoSafeFacily','otherIndustry','machineryInd','机械行业','铸造熔炼炉冷却水系统未配置温度、进出水流量检测报警装置，没有设置防止冷却水进入炉内的安全设施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasNoLeakAlarmDevice','otherIndustry','machineryInd','机械行业','天然气（煤气）加热炉燃烧器操作部位未设置可燃气体泄漏报警装置，或燃烧系统未设置防突然熄火或点火失败的安全装置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'cleanEquipNoTakeEffectAct','otherIndustry','machineryInd','机械行业','使用易燃易爆稀释剂（如天拿水）清洗设备设施，未采取有效措施及时清除集聚在地沟、地坑等有限空间内的可燃气体','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'sprayBoothNoGasAlarmSys','otherIndustry','machineryInd','机械行业','涂装调漆间和喷漆室未规范设置可燃气体报警装置和防爆电气设备设施','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'foodProceNoOverHeatAlarmSys','otherIndustry','lightInd','轻工行业','食品制造企业涉及烘制、油炸等设施设备，未采取防过热自动报警切断装置和隔热防护措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'liquorStorageNoDeepCheckSys','otherIndustry','lightInd','轻工行业','白酒储存、勾兑场所未规范设置乙醇浓度检测报警装置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'paperInduUseSteamHeat','otherIndustry','lightInd','轻工行业','纸浆制造、造纸企业使用水蒸气或明火直接加热钢瓶汽化液氯','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dailyGlassNoLowPressAlarm','otherIndustry','lightInd','轻工行业','日用玻璃、陶瓷制造企业燃气窑炉未设燃气低压警报器和快速切断阀，或易燃易爆气体聚集区域未设置监测报警装置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dailyGlassSysDamage','otherIndustry','lightInd','轻工行业','日用玻璃制造企业炉、窑类设备本体及附属设施出现开裂、腐蚀、破损、衬砖损坏、壳体发红及明显弯曲变形','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'sprayRoomNoVentilateDevice','otherIndustry','lightInd','轻工行业','喷涂车间、调漆间未规范设置通风装置和防爆电气设备设施','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'fabricProcessNoSingleSet','otherIndustry','textileInd','纺织行业','纱、线、织物加工的烧毛、开幅、烘干等热定型工艺的汽化室、燃气贮罐、储油罐、热媒炉等未与生产加工、人员密集场所明确分开或单独设置','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'insuranceFanInOpenAir','otherIndustry','textileInd','纺织行业','保险粉、双氧水、亚氯酸钠、雕白粉（吊白块）等危险品与禁忌物料混合贮存的；保险粉露天堆放，或储存场所未采取防水、防潮等措施','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'workPersonNoGasMask','otherIndustry','tobaccoInd','烟草行业','熏蒸杀虫作业前，未确认无关人员全部撤离仓库，且作业人员未配置防毒面具','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'coTwoNoDeepAlarm','otherIndustry','tobaccoInd','烟草行业','使用液态二氧化碳制造膨胀烟丝的生产线和场所，未设置二氧化碳浓度报警仪、燃气浓度报警仪、紧急联动排风装置','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'foodInOutNoEffectProMeas','otherIndustry','commerceInd','商贸行业','在房式仓、筒仓及简易仓囤进行粮食进出仓作业时，未按照作业标准步骤或未采取有效防护措施作业','1');


--nonCoalMine:  非煤矿山

delete from  riskDcode where  codeType='factoryMA'   and uppercode ='nonCoalMine';

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'safeNoMeetDesignRequir','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','安全出口不符合国家标准、行业标准或设计要求','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'useForbidEquip','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','使用国家明令禁止使用的设备、材料和工艺','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'adjacentMineThrough','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','相邻矿山的井巷相互贯通','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'currentPictureNoMatch','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','没有及时填绘图，现状图与实际严重不符','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'openTransUnderThrough','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','露天转地下开采，地表与井下形成贯通，未按照设计要求采取相应措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noTakeWaterMeasure','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','地表水系穿过矿区，未按照设计要求采取防治水措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'reduceDrainageCapacity','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','排水系统与设计要求不符，导致排水能力降低','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'iguchiNoTakeProMeasure','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','井口标高在当地历史最高洪水位1米以下，未采取相应防护措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineNoProWaterOrgan','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','水文地质类型为中等及复杂的矿井没有设立专门防治水机构、配备探放  水作业队伍或配齐专用探放水设备','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'waterproofNoMeetDesign','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','水文地质类型复杂的矿山关键巷道防水门设置与设计要求不符','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineNoPreventFireMeasure','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','有自燃发火危险的矿山，未按照国家标准、行业标准或设计采取防火措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dubiousAreaNoExplorWater','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','在突水威胁区域或可疑区域进行采掘作业，未进行探放水','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'floodPeriodNoStopProduce','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','受地表水倒灌威胁的矿井在强降雨天气或其来水上游发生洪水期间，不实施停产撤人','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineLineOverNoTakeMeas','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','相邻矿山开采错动线重叠，未按照设计要求采取相应措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineStagLineExistVillage','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','开采错动线以内存在居民村庄，或存在重要设备设施时未按照设计要求采取相应措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'paramLowDesignValue','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','擅自开采各种保安矿柱或其形式及参数劣于设计值','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noDealGoaf','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','未按照设计要求对生产形成的采空区进行处理','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noTakePreGroundPress','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','具有严重地压条件，未采取预防地压灾害措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'roadWayNoTakePreMeas','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','巷道或者采场顶板未按照设计要求采取支护措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineNotMeetIndustryReq','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','矿井未按照设计要求建立机械通风系统，或风速、风量、风质不符合国家标准或行业标准的要求','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noConfigAlarm','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','未配齐具有矿用产品安全标志的便携式气体检测报警仪和自救器','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'carStopNoPeriodicTest','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','提升系统的防坠器、阻车器等安全保护装置或信号闭锁措施失效；未定期试验或检测检验','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'singlePowerNoMeetRequ','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','一级负荷没有采用双回路或双电源供电，或单一电源不能满足全部一级负荷需要','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'transformerNeutralGround','nonCoalMine','nonMetalUnderMine','金属非金属地下矿山','地面向井下供电的变压器或井下使用的普通变压器采用中性接地','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'underTransOpenNoProveGoaf','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','地下转露天开采，未探明采空区或未对采空区实施专项安全技术措施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineUseStopEquip','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','使用国家明令禁止使用的设备、材料和工艺','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noLayerMine','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','未采用自上而下、分台阶或分层的方式进行开采','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'layerHeightOver','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','工作帮坡角大于设计工作帮坡角，或台阶（分层）高度超过设计高度','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'unauthoryMiniePillar','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','擅自开采或破坏设计规定保留的矿柱、岩柱和挂帮矿体','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dumpStableNoAssess','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','未按国家标准或行业标准对采场边坡、排土场稳定性进行评估','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dumpNoOnlineMonitor','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','高度200米及以上的边坡或排土场未进行在线监测','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'slopeSlip','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','边坡存在滑移现象','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'roadSlopeGreaterPerTen','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','上山道路坡度大于设计坡度10%以上','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'sunkenMineNoTakeFloodSys','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','封闭圈深度30米及以上的凹陷露天矿山，未按照设计要求建设防洪、排洪设施','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'thunderBlasteOperate','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','雷雨天气实施爆破作业','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'dangerousDump','nonCoalMine','nonMetalOpenPitMine','金属非金属露天矿山','危险级排土场','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'reservoirNoMine','nonCoalMine','tailingsPond','尾矿库','库区和尾矿坝上存在未按批准的设计方案进行开采、挖掘、爆破等活动','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'damCrack','nonCoalMine','tailingsPond','尾矿库','坝体出现贯穿性横向裂缝，且出现较大范围管涌、流土变形，坝体出现深层滑动迹象','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'damSteepGreatDesignSlope','nonCoalMine','tailingsPond','尾矿库','坝外坡坡比陡于设计坡比','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'damHeightOver','nonCoalMine','tailingsPond','尾矿库','坝体超过设计坝高，或超设计库容储存尾矿','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'damTailAscentRateOver','nonCoalMine','tailingsPond','尾矿库','尾矿堆积坝上升速率大于设计堆积上升速率','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noEvaluateDamStable','nonCoalMine','tailingsPond','尾矿库','未按法规、国家标准或行业标准对坝体稳定性进行评估','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'theBuryDepthLess','nonCoalMine','tailingsPond','尾矿库','浸润线埋深小于控制浸润线埋深','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'safeHeigthLessDesignRule','nonCoalMine','tailingsPond','尾矿库','安全超高和干滩长度小于设计规定','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'floodDrainSysBlock','nonCoalMine','tailingsPond','尾矿库','排洪系统构筑物严重堵塞或坍塌，导致排水能力急剧下降','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'wasteWaterStorage','nonCoalMine','tailingsPond','尾矿库','设计以外的尾矿、废料或者废水进库','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mixTailDischargeNoMeetReq','nonCoalMine','tailingsPond','尾矿库','多种矿石性质不同的尾砂混合排放时，未按设计要求进行排放','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'winterAdoptUnderIceMineOpe','nonCoalMine','tailingsPond','尾矿库','冬季未按照设计要求采用冰下放矿作业','1');


--coalIndustry:  煤矿行业
delete from  riskDcode where  codeType='factoryMA'   and uppercode ='coalIndustry';

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineOverCheckPercTen','coalIndustry','superStrenOrganPro','超能力、超强度或者超定员组织生产','煤矿全年原煤产量超过核定（设计）生产能力幅度在10%以上，或者月原煤产量大于核定（设计）生产能力的10%的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineOverProPlan','coalIndustry','superStrenOrganPro','超能力、超强度或者超定员组织生产','煤矿或其上级公司超过煤矿核定（设计）生产能力下达生产计划或者经营指标的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineNoLimitProMeas','coalIndustry','superStrenOrganPro','超能力、超强度或者超定员组织生产','煤矿开拓、准备、回采煤量可采期小于国家规定的最短时间，未主动采取限产或者停产措施，仍然组织生产的（衰老煤矿和地方人民政府计划停产关闭煤矿除外）','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineProOverTwo','coalIndustry','superStrenOrganPro','超能力、超强度或者超定员组织生产','煤矿井下同时生产的水平超过2个，或者一个采（盘）区内同时作业的采煤、煤（半煤岩）巷掘进工作面个数超过《煤矿安全规程》规定的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasNoStandPro','coalIndustry','superStrenOrganPro','超能力、超强度或者超定员组织生产','瓦斯抽采不达标组织生产的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasNoLaborQuotaSys','coalIndustry','superStrenOrganPro','超能力、超强度或者超定员组织生产','煤矿未制定或者未严格执行井下劳动定员制度，或者采掘作业地点单班作业人数超过国家有关限员规定20%以上的','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasExistMissCheck','coalIndustry','gasOverRunOper','瓦斯超限作业','瓦斯检查存在漏检、假检情况且进行作业的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasNoContinueWork','coalIndustry','gasOverRunOper','瓦斯超限作业','井下瓦斯超限后继续作业或者未按照国家规定处置继续进行作业的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasNoSafeMeasu','coalIndustry','gasOverRunOper','瓦斯超限作业','井下排放积聚瓦斯未按照国家规定制定并实施安全技术措施进行作业的','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noConfigProfessional','coalIndustry','gasNoAntiBulgeMeasu','煤与瓦斯突出矿井，未依照规定实施防突出措施','未设立防突机构并配备相应专业人员的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineSysNoNormalRun','coalIndustry','gasNoAntiBulgeMeasu','煤与瓦斯突出矿井，未依照规定实施防突出措施','未建立地面永久瓦斯抽采系统或者系统不能正常运行的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noDangerPrediction','coalIndustry','gasNoAntiBulgeMeasu','煤与瓦斯突出矿井，未依照规定实施防突出措施','未按照国家规定进行区域或者工作面突出危险性预测的（直接认定为突出危险区域或者突出危险工作面的除外）','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noTakePreventMeasu','coalIndustry','gasNoAntiBulgeMeasu','煤与瓦斯突出矿井，未依照规定实施防突出措施','未按照国家规定采取防治突出措施的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noAntiOutbreakMeasu','coalIndustry','gasNoAntiBulgeMeasu','煤与瓦斯突出矿井，未依照规定实施防突出措施','未按照国家规定进行防突措施效果检验和验证，或者防突措施效果检验和验证不达标仍然组织生产建设，或者防突措施效果检验和验证数据造假的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSecurityMeasu','coalIndustry','gasNoAntiBulgeMeasu','煤与瓦斯突出矿井，未依照规定实施防突出措施','未按照国家规定采取安全防护措施的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'overElectricLocomo','coalIndustry','gasNoAntiBulgeMeasu','煤与瓦斯突出矿井，未依照规定实施防突出措施','使用架线式电机车的','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noGasDrainageSys','coalIndustry','highGasMineNoMonitor','高瓦斯矿井未建立瓦斯抽采系统和监控系统，或者系统不能正常运行','按照《煤矿安全规程》规定应当建立而未建立瓦斯抽采系统或者系统不正常使用的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noCheckMethaneSensor','coalIndustry','highGasMineNoMonitor','高瓦斯矿井未建立瓦斯抽采系统和监控系统，或者系统不能正常运行','未按照国家规定安设、调校甲烷传感器，人为造成甲烷传感器失效，或者瓦斯超限后不能报警、断电或者断电范围不符合国家规定的','1');

INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'insuffTotalAirVolume','coalIndustry','ventilaeIncomplete','通风系统不完善、不可靠','矿井总风量不足或者采掘工作面等主要用风地点风量不足的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSpareMainFan','coalIndustry','ventilaeIncomplete','通风系统不完善、不可靠','没有备用主要通风机，或者两台主要通风机不具有同等能力的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'violUseSeriesVentilate','coalIndustry','ventilaeIncomplete','通风系统不完善、不可靠','违反《煤矿安全规程》规定采用串联通风的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noVentilationSys','coalIndustry','ventilaeIncomplete','通风系统不完善、不可靠','未按照设计形成通风系统，或者生产水平和采（盘）区未实现分区通风的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noDedicatReturnAirLane','coalIndustry','ventilaeIncomplete','通风系统不完善、不可靠','高瓦斯、煤与瓦斯突出矿井的任一采（盘）区，开采容易自燃煤层、低瓦斯矿井开采煤层群和分层开采采用联合布置的采（盘）区，未设置专用回风巷，或者突出煤层工作面没有独立的回风系统的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'throttleNoMeetRule','coalIndustry','ventilaeIncomplete','通风系统不完善、不可靠','进、回风井之间和主要进、回风巷之间联络巷中的风墙、风门不符合《煤矿安全规程》规定，造成风流短路的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'returnAirLaneNoThrouMine','coalIndustry','ventilaeIncomplete','通风系统不完善、不可靠','采区进、回风巷未贯穿整个采区，或者虽贯穿整个采区但一段进风、一段回风，或者采用倾斜长壁布置，大巷未超前至少2个区段构成通风系统即开掘其他巷道的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineNoNormalUse','coalIndustry','ventilaeIncomplete','通风系统不完善、不可靠','煤巷、半煤岩巷和有瓦斯涌出的岩巷掘进未按照国家规定装备甲烷电、风电闭锁装置或者有关装置不能正常使用的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasNoAutoTrans','coalIndustry','ventilaeIncomplete','通风系统不完善、不可靠','高瓦斯、煤（岩）与瓦斯（二氧化碳）突出矿井的煤巷、半煤岩巷和有瓦斯涌出的岩巷掘进工作面采用局部通风时，不能实现双风机、双电源且自动切换的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasNoOpenAirSys','coalIndustry','ventilaeIncomplete','通风系统不完善、不可靠','高瓦斯、煤（岩）与瓦斯（二氧化碳）突出建设矿井进入二期工程前，其他建设矿井进入三期工程前，没有形成地面主要通风机供风的全风压通风系统的','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noCheckGoafWithinField','coalIndustry','severeFlood','有严重水患，未采取有效措施','未查明矿井水文地质条件和井田范围内采空区、废弃老窑积水等情况而组织生产建设的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noWaterDetecteEquip','coalIndustry','severeFlood','有严重水患，未采取有效措施','水文地质类型复杂、极复杂的矿井未设置专门的防治水机构、未配备专门的探放水作业队伍，或者未配齐专用探放水设备的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noWaterDetecteRule','coalIndustry','severeFlood','有严重水患，未采取有效措施','在需要探放水的区域进行采掘作业未按照国家规定进行探放水的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSetWaterpCoalPillar','coalIndustry','severeFlood','有严重水患，未采取有效措施','未按照国家规定留设或者擅自开采（破坏）各种防隔水煤（岩）柱的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noWithdrawDangerPers','coalIndustry','severeFlood','有严重水患，未采取有效措施','有突（透、溃）水征兆未撤出井下所有受水患威胁地点人员的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'floodPerNoWithdraw','coalIndustry','severeFlood','有严重水患，未采取有效措施','受地表水倒灌威胁的矿井在强降雨天气或其来水上游发生洪水期间未实施停产撤人的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noBuildPermanDrainSys','coalIndustry','severeFlood','有严重水患，未采取有效措施','建设矿井进入三期工程前，未按照设计建成永久排水系统，或者生产矿井延深到设计水平时，未建成防、排水系统而违规开拓掘进的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'drainageSysNoMeetRule','coalIndustry','severeFlood','有严重水患，未采取有效措施','矿井主要排水系统水泵排水能力、管路和水仓容量不符合《煤矿安全规程》规定的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noEliminaFloodDanger','coalIndustry','severeFlood','有严重水患，未采取有效措施','开采地表水体、老空水淹区域或者强含水层下急倾斜煤层，未按照国家规定消除水患威胁的','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'elevationMining','coalIndustry','crossBorderMine','超层越界开采','超出采矿许可证载明的开采煤层层位或者标高进行开采的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'overStateAreaMine','coalIndustry','crossBorderMine','超层越界开采','超出采矿许可证载明的坐标控制范围进行开采的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'destroySafeCoalPillar','coalIndustry','crossBorderMine','超层越界开采','擅自开采（破坏）安全煤柱的','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'minePressMine','coalIndustry','rockBurstDan','有冲击地压危险，未采取有效措施','未按照国家规定进行煤层（岩层）冲击倾向性鉴定，或者开采有冲击倾向性煤层未进行冲击危险性评价，或者开采冲击地压煤层，未进行采区、采掘工作面冲击危险性评价的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'pressDanNoConfigProfe','coalIndustry','rockBurstDan','有冲击地压危险，未采取有效措施','有冲击地压危险的矿井未设置专门的防冲机构、未配备专业人员或者未编制专门设计的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noPressDangerPredict','coalIndustry','rockBurstDan','有冲击地压危险，未采取有效措施','未进行冲击地压危险性预测，或者未进行防冲措施效果检验以及防冲措施效果检验不达标仍组织生产建设的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'minePressMineViolate','coalIndustry','rockBurstDan','有冲击地压危险，未采取有效措施','开采冲击地压煤层时，违规开采孤岛煤柱，采掘工作面位置、间距不符合国家规定，或者开采顺序不合理、采掘速度不符合国家规定、违反国家规定布置巷道或者留设煤（岩）柱造成应力集中的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noConfigPressDanRule','coalIndustry','rockBurstDan','有冲击地压危险，未采取有效措施','未制定或者未严格执行冲击地压危险区域人员准入制度的','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineBurnNoExtinguMeas','coalIndustry','spontanSevere','自然发火严重，未采取有效措施','开采容易自燃和自燃煤层的矿井，未编制防灭火专项设计或者未采取综合防灭火措施的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasNoValidPrevent','coalIndustry','spontanSevere','自然发火严重，未采取有效措施','高瓦斯矿井采用放顶煤采煤法不能有效防治煤层自然发火的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSafePreventMeas','coalIndustry','spontanSevere','自然发火严重，未采取有效措施','有自然发火征兆没有采取相应的安全防范措施继续生产建设的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'violationTurnFireArea','coalIndustry','spontanSevere','自然发火严重，未采取有效措施','违反《煤矿安全规程》规定启封火区的','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'forbidUseCoalEquip','coalIndustry','useWeedOutEquip','使用明令禁止使用或者淘汰的设备、工艺','使用被列入国家禁止井工煤矿使用的设备及工艺目录的产品或者工艺的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'cableNoGetSafeFlag','coalIndustry','useWeedOutEquip','使用明令禁止使用或者淘汰的设备、工艺','井下电气设备、电缆未取得煤矿矿用产品安全标志的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'underGroundNoMeetGrade','coalIndustry','useWeedOutEquip','使用明令禁止使用或者淘汰的设备、工艺','井下电气设备选型与矿井瓦斯等级不符，或者采（盘）区内防爆型电气设备存在失爆，或者井下使用非防爆无轨胶轮车的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noUseNakedBlast','coalIndustry','useWeedOutEquip','使用明令禁止使用或者淘汰的设备、工艺','未按照矿井瓦斯等级选用相应的煤矿许用炸药和雷管、未使用专用发爆器，或者裸露爆破的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineCoalNoTwoSafeExit','coalIndustry','useWeedOutEquip','使用明令禁止使用或者淘汰的设备、工艺','采煤工作面不能保证2个畅通的安全出口的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasMineUseForward','coalIndustry','useWeedOutEquip','使用明令禁止使用或者淘汰的设备、工艺','高瓦斯矿井、煤与瓦斯突出矿井、开采容易自燃和自燃煤层（薄煤层除外）矿井，采煤工作面采用前进式采煤方法的','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'sinLoopPowerSupply','coalIndustry','noDouLoopPowerSys','煤矿没有双回路供电系统','单回路供电的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'douLoopPowerUseSame','coalIndustry','noDouLoopPowerSys','煤矿没有双回路供电系统','有两回路电源线路但取自一个区域变电所同一母线段的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'thrPhaseNoDouLoopPow','coalIndustry','noDouLoopPowerSys','煤矿没有双回路供电系统','进入二期工程的高瓦斯、煤与瓦斯突出、水文地质类型为复杂和极复杂的建设矿井，以及进入三期工程的其他建设矿井，未形成两回路供电的','1');



INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'buildProjNoCheckAgree','coalIndustry','overSafeFaciDesign','新建煤矿边建设边生产，煤矿改扩建期间，在改扩建的区域生产，或者在其他区域的生产超出安全设施设计规定的范围和规模','建设项目安全设施设计未经审查批准，或者审查批准后作出重大变更未经再次审查批准擅自组织施工的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'newCoalOrganMine','coalIndustry','overSafeFaciDesign','新建煤矿边建设边生产，煤矿改扩建期间，在改扩建的区域生产，或者在其他区域的生产超出安全设施设计规定的范围和规模','新建煤矿在建设期间组织采煤的（经批准的联合试运转除外）','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'reconstructAreaPro','coalIndustry','overSafeFaciDesign','新建煤矿边建设边生产，煤矿改扩建期间，在改扩建的区域生产，或者在其他区域的生产超出安全设施设计规定的范围和规模','改扩建矿井在改扩建区域生产的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'reconstructOverArea','coalIndustry','overSafeFaciDesign','新建煤矿边建设边生产，煤矿改扩建期间，在改扩建的区域生产，或者在其他区域的生产超出安全设施设计规定的范围和规模','改扩建矿井在非改扩建区域超出设计规定范围和规模生产的','1');



INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'coalNoUseAllContract','coalIndustry','mineOverallContrPro','煤矿实行整体承包生产经营后，未重新取得或者及时变更安全生产许可证而从事生产，或者承包方再次转包，以及将井下采掘工作面和井巷维修作业进行劳务承包','煤矿未采取整体承包形式进行发包，或者将煤矿整体发包给不具有法人资格或者未取得合法有效营业执照的单位或者个人的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'allContractNoSignAgree','coalIndustry','mineOverallContrPro','煤矿实行整体承包生产经营后，未重新取得或者及时变更安全生产许可证而从事生产，或者承包方再次转包，以及将井下采掘工作面和井巷维修作业进行劳务承包','实行整体承包的煤矿，未签订安全生产管理协议，或者未按照国家规定约定双方安全生产管理职责而进行生产的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'allContractNoSafeCert','coalIndustry','mineOverallContrPro','煤矿实行整体承包生产经营后，未重新取得或者及时变更安全生产许可证而从事生产，或者承包方再次转包，以及将井下采掘工作面和井巷维修作业进行劳务承包','实行整体承包的煤矿，未重新取得或者变更安全生产许可证进行生产的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'allContractTransToPers','coalIndustry','mineOverallContrPro','煤矿实行整体承包生产经营后，未重新取得或者及时变更安全生产许可证而从事生产，或者承包方再次转包，以及将井下采掘工作面和井巷维修作业进行劳务承包','实行整体承包的煤矿，承包方再次将煤矿转包给其他单位或者个人的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'coalTransToPerson','coalIndustry','mineOverallContrPro','煤矿实行整体承包生产经营后，未重新取得或者及时变更安全生产许可证而从事生产，或者承包方再次转包，以及将井下采掘工作面和井巷维修作业进行劳务承包','井工煤矿将井下采掘作业或者井巷维修作业（井筒及井下新水平延深的井底车场、主运输、主通风、主排水、主要机电硐室开拓工程除外）作为独立工程发包给其他企业或者个人的，以及转包井下新水平延深开拓工程的','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'restructPeriNoDefiPro','coalIndustry','coalMineRestruct','煤矿改制期间，未明确安全生产责任人和安全管理机构，或者在完成改制后，未重新取得或者变更采矿许可证、安全生产许可证和营业执照','改制期间，未明确安全生产责任人进行生产建设的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'restructPeriNoSafeMan','coalIndustry','coalMineRestruct','煤矿改制期间，未明确安全生产责任人和安全管理机构，或者在完成改制后，未重新取得或者变更采矿许可证、安全生产许可证和营业执照','改制期间，未健全安全生产管理机构和配备安全管理人员进行生产建设的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'restructAftNoGetLicen','coalIndustry','coalMineRestruct','煤矿改制期间，未明确安全生产责任人和安全管理机构，或者在完成改制后，未重新取得或者变更采矿许可证、安全生产许可证和营业执照','完成改制后，未重新取得或者变更采矿许可证、安全生产许可证、营业执照而进行生产建设的','1');


INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noConfigFullTimeMinMan','coalIndustry','otherMajorAccident','其他重大事故隐患','未分别配备专职的矿长、总工程师和分管安全、生产、机电的副矿长，以及负责采煤、掘进、机电运输、通风、地测、防治水工作的专业技术人员的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noSafeProFeeByRule','coalIndustry','otherMajorAccident','其他重大事故隐患','未按照国家规定足额提取或者未按照国家规定范围使用安全生产费用的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'noConfigGasLevel','coalIndustry','otherMajorAccident','其他重大事故隐患','未按照国家规定进行瓦斯等级鉴定，或者瓦斯等级鉴定弄虚作假的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'gasDynamicPhenom','coalIndustry','otherMajorAccident','其他重大事故隐患','出现瓦斯动力现象，或者相邻矿井开采的同一煤层发生了突出事故，或者被鉴定、认定为突出煤层，以及煤层瓦斯压力达到或者超过0.74MPa的非突出矿井，未立即按照突出煤层管理并在国家规定期限内进行突出危险性鉴定的（直接认定为突出矿井的除外）','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'fakeDrawing','coalIndustry','otherMajorAccident','其他重大事故隐患','图纸作假、隐瞒采掘工作面，提供虚假信息、隐瞒下井人数，或者矿长、总工程师（技术负责人）履行安全生产岗位责任制及管理制度时伪造记录，弄虚作假的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'mineNoSafeMoniSys','coalIndustry','otherMajorAccident','其他重大事故隐患','矿井未安装安全监控系统、人员位置监测系统或者系统不能正常运行，以及对系统数据进行修改、删除及屏蔽，或者煤与瓦斯突出矿井存在第七条第二项情形的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'transpPerNoSafeProt','coalIndustry','otherMajorAccident','其他重大事故隐患','提升（运送）人员的提升机未按照《煤矿安全规程》规定安装保护装置，或者保护装置失效，或者超员运行的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'conveyorTestFail','coalIndustry','otherMajorAccident','其他重大事故隐患','带式输送机的输送带入井前未经过第三方阻燃和抗静电性能试验，或者试验不合格入井，或者输送带防打滑、跑偏、堆煤等保护装置或者温度、烟雾监测装置失效的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'diggerNoConfWaterSys','coalIndustry','otherMajorAccident','其他重大事故隐患','掘进工作面后部巷道或者独头巷道维修（着火点、高温点处理）时，维修（处理）点以里继续掘进或者有人员进入，或者采掘工作面未按照国家规定安设压风、供水、通信线路及装置的','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus)
	VALUES ('factoryMA',NULL,'openCoalSlopAnglOver','coalIndustry','otherMajorAccident','其他重大事故隐患','露天煤矿边坡角大于设计最大值，或者边坡发生严重变形未及时采取措施进行治理的','1');








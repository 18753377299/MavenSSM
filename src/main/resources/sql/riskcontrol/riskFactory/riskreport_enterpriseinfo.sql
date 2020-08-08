drop table if exists riskreport_enterpriseinfo;
CREATE TABLE
    riskreport_enterpriseinfo
    (
        companycname CHARACTER VARYING(255) NOT NULL,
        companyaddress CHARACTER VARYING(255),
        companycorporation CHARACTER VARYING(255),
        postaddress CHARACTER VARYING(255),
        companymanager CHARACTER VARYING(255),
        businessscope CHARACTER VARYING(255),
        qualificationlevel CHARACTER VARYING(255),
        registrationcompany CHARACTER VARYING(255),
        productaddress CHARACTER VARYING(255),
        safetylicense CHARACTER VARYING(255),
        safetycompany CHARACTER VARYING(255),
        mininglicense CHARACTER VARYING(255),
        safetyprolicense CHARACTER VARYING(255),
        emailaddress CHARACTER VARYING(255),
        phonenum CHARACTER VARYING(255),
        telephone CHARACTER VARYING(255),
        designscalendec NUMERIC(255,0),
        actualyielddec NUMERIC(255,0),
        surplusyielddec NUMERIC(255,0),
        saleslastydec NUMERIC(255,0),
        profitlastydec NUMERIC(255,0),
        investmentlastydec NUMERIC(255,0),
        currentheightdec NUMERIC(255,0),
        miningdepthdec NUMERIC(255,0),
        designminingdeptdec NUMERIC(255,0),
        areacovereddec NUMERIC(255,0),
        sumcovereddec NUMERIC(255,0),
        productioncovereddec NUMERIC(255,0),
        workcovereddec NUMERIC(255,0),
        othercovereddec NUMERIC(255,0),
        worddaysyeardec NUMERIC(255,0),
        worksumhoursdec NUMERIC(255,0),
        checkdayesdec NUMERIC(255,0),
        designcapacitydec NUMERIC(255,0),
        actualycapacitydec NUMERIC(255,0),
        surpluscapacitydec NUMERIC(255,0),
        usedcapacitydec NUMERIC(255,0),
        designstockdec NUMERIC(255,0),
        actualystockdec NUMERIC(255,0),
        surplusstockdec NUMERIC(255,0),
        usedstockdec NUMERIC(255,0),
        designproductdec NUMERIC(255,0),
        actualyproductdec NUMERIC(255,0),
        surplusproductdec NUMERIC(255,0),
        usednproductdec NUMERIC(255,0),
        othercapacitydec NUMERIC(255,0),
        minestoretypesel CHARACTER(1),
        minefloodtypesel CHARACTER(1),
        isonlinesupervisel CHARACTER(1),
        isallonlinesuperviseoksel CHARACTER(1),
        operatingstatusel CHARACTER(1),
        extensiondate DATE,
        signdate DATE,
        validitydate DATE,
        invaliddate DATE,
        establishmentdate DATE,
        completeddate DATE,
        checkdate DATE,
        inserttimeforhis TIMESTAMP(6) WITHOUT TIME ZONE DEFAULT now() NOT NULL,
        operatetimeforhis TIMESTAMP(6) WITHOUT TIME ZONE DEFAULT now() NOT NULL,
        sumemployeecount SMALLINT,
        prodessionemployeecount SMALLINT,
        midemployeecount SMALLINT,
        architectcount SMALLINT,
        costengineercount SMALLINT,
        safetyofficercout SMALLINT,
        firemancount SMALLINT,
        safetymanangercount SMALLINT,
        asafeconductcount SMALLINT,
        bsafeconductcount SMALLINT,
        asafeconductcounc SMALLINT,
        projectcount SMALLINT,
        companytypesel CHARACTER(1),
        companynaturesel CHARACTER(1),
        damtypesel CHARACTER(1),
        exploitationtypesel CHARACTER(1),
        extensiontypesel CHARACTER(1),
        composetypesel CHARACTER(1),
        typeofshippingsel CHARACTER(1),
        worktypesel CHARACTER(1),
        dumplevelsel CHARACTER(1),
        dumpstatesel CHARACTER(1),
        businesssel CHARACTER(1),
        issafetysel CHARACTER(1),
        isregistersel CHARACTER(1),
        islistsel CHARACTER(1),
        mineclasslevelsel CHARACTER(1),
        damearlytypesel CHARACTER(1),
        damearlykindsel CHARACTER(1),
        damfoundationsel CHARACTER(1),
        validstatus CHARACTER(1) NOT NULL,
        riskfileno CHARACTER VARYING(22) NOT NULL
    );
COMMENT ON COLUMN riskreport_enterpriseinfo.companycname
IS
    '企业名称,矿山所属企业名称,';
COMMENT ON COLUMN riskreport_enterpriseinfo.companyaddress
IS
    '公司地点,矿山地点,排土场地点,公司地址';
COMMENT ON COLUMN riskreport_enterpriseinfo.companycorporation
IS
    '法人代表,';
COMMENT ON COLUMN riskreport_enterpriseinfo.postaddress
IS
    '地质构造复杂程度,邮编';
COMMENT ON COLUMN riskreport_enterpriseinfo.companymanager
IS
    '水文地质类型,主要负责人，企业安全负责人';
COMMENT ON COLUMN riskreport_enterpriseinfo.businessscope
IS
    '瓦斯等级,经营范围：';
COMMENT ON COLUMN riskreport_enterpriseinfo.qualificationlevel
IS
    '自然发火倾向性,资质等级,注册地址';
COMMENT ON COLUMN riskreport_enterpriseinfo.registrationcompany
IS
    '煤尘爆炸危险性,登记机关';
COMMENT ON COLUMN riskreport_enterpriseinfo.productaddress
IS
    '冲击地压危险性,企业生产经营地址';
COMMENT ON COLUMN riskreport_enterpriseinfo.safetylicense
IS
    '采矿证号码,营业执照号,统一社会信用代码';
COMMENT ON COLUMN riskreport_enterpriseinfo.safetycompany
IS
    '发证机构1';
COMMENT ON COLUMN riskreport_enterpriseinfo.mininglicense
IS
    '安全生产许可证号码';
COMMENT ON COLUMN riskreport_enterpriseinfo.safetyprolicense
IS
    '发证机构2';
COMMENT ON COLUMN riskreport_enterpriseinfo.emailaddress
IS
    '矿山名称,排土场名称,邮箱';
COMMENT ON COLUMN riskreport_enterpriseinfo.phonenum
IS
    '不在化工园区内（注明所在区域）,手机号码';
COMMENT ON COLUMN riskreport_enterpriseinfo.telephone
IS
    '联系电话,固定电话';
COMMENT ON COLUMN riskreport_enterpriseinfo.designscalendec
IS
    '核定生产能力(万吨/年),设计开采规模,排土场设计容量,设计规模，注册资金';
COMMENT ON COLUMN riskreport_enterpriseinfo.actualyielddec
IS
    '上年度实际产量(万吨),上年度实际生产量,排土场现容量,上年度实际生产量(万箱)，上年度实际开工面积';
COMMENT ON COLUMN riskreport_enterpriseinfo.surplusyielddec
IS
    '剩余可采储量(万吨),产值(万元/年),固定资产总值';
COMMENT ON COLUMN riskreport_enterpriseinfo.saleslastydec
IS
    '上年度销售额(万吨),上年度销售额，上年度合同总额';
COMMENT ON COLUMN riskreport_enterpriseinfo.profitlastydec
IS
    '上年度利润总额(万吨),上年度利润总额';
COMMENT ON COLUMN riskreport_enterpriseinfo.investmentlastydec
IS
    '上年度安全生产投入(万吨),上年度安全生产投入,上年度安全生产投入总额';
COMMENT ON COLUMN riskreport_enterpriseinfo.currentheightdec
IS
    '当前开采深度(m),现开排土高度,引线库2(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.miningdepthdec
IS
    '开采深度（m）,黑火药库(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.designminingdeptdec
IS
    '设计开采深度（m）,设计排土高度,亮珠库(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.areacovereddec
IS
    '矿区占地面积,化工材料库(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.sumcovereddec
IS
    '总面积';
COMMENT ON COLUMN riskreport_enterpriseinfo.productioncovereddec
IS
    '生产区建筑面积,成品库面积';
COMMENT ON COLUMN riskreport_enterpriseinfo.workcovereddec
IS
    '办公区面积,引火线中转库2(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.othercovereddec
IS
    '其他面积，绿化面积,开包药中转库(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.worddaysyeardec
IS
    '开工率(年工作X天)';
COMMENT ON COLUMN riskreport_enterpriseinfo.worksumhoursdec
IS
    '工作时数总计(h/a)';
COMMENT ON COLUMN riskreport_enterpriseinfo.checkdayesdec
IS
    '检修时间（天/年）';
COMMENT ON COLUMN riskreport_enterpriseinfo.designcapacitydec
IS
    '引火线中转库1(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.actualycapacitydec
IS
    '插引饼中转库 (kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.surpluscapacitydec
IS
    '封口饼中转库(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.usedcapacitydec
IS
    '引线库1(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.designstockdec
IS
    '化工库1(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.actualystockdec
IS
    '成品库1(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.surplusstockdec
IS
    '黑火药中转库(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.usedstockdec
IS
    '亮珠中转库(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.designproductdec
IS
    '装药内筒中转库(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.actualyproductdec
IS
    '装发射药后半成品中转(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.surplusproductdec
IS
    '组装后成品中转(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.usednproductdec
IS
    '亮珠晒场和烘房(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.othercapacitydec
IS
    '化工材料中转库(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.minestoretypesel
IS
    '尾矿堆存方式';
COMMENT ON COLUMN riskreport_enterpriseinfo.minefloodtypesel
IS
    '是否安装在线监测系统';
COMMENT ON COLUMN riskreport_enterpriseinfo.isonlinesupervisel
IS
    '是否在现监督';
COMMENT ON COLUMN riskreport_enterpriseinfo.isallonlinesuperviseoksel
IS
    '在线监督是否全部安全';
COMMENT ON COLUMN riskreport_enterpriseinfo.operatingstatusel
IS
    '运行状态';
COMMENT ON COLUMN riskreport_enterpriseinfo.extensiondate
IS
    '改扩建日期,发证日期1';
COMMENT ON COLUMN riskreport_enterpriseinfo.signdate
IS
    '有效期限1，发证日期2';
COMMENT ON COLUMN riskreport_enterpriseinfo.validitydate
IS
    '有效期限2';
COMMENT ON COLUMN riskreport_enterpriseinfo.invaliddate
IS
    '成立时日期';
COMMENT ON COLUMN riskreport_enterpriseinfo.establishmentdate
IS
    '创立日期';
COMMENT ON COLUMN riskreport_enterpriseinfo.completeddate
IS
    '竣工日期';
COMMENT ON COLUMN riskreport_enterpriseinfo.checkdate
IS
    '验收日期';
COMMENT ON COLUMN riskreport_enterpriseinfo.inserttimeforhis
IS
    '插入时间';
COMMENT ON COLUMN riskreport_enterpriseinfo.operatetimeforhis
IS
    '更新时间';
COMMENT ON COLUMN riskreport_enterpriseinfo.sumemployeecount
IS
    '职工人数(人),职工人数,自有职工总数,从业人员数量';
COMMENT ON COLUMN riskreport_enterpriseinfo.prodessionemployeecount
IS
    '生产班现场作业人数(人),每班平均在岗人数,每天平均在岗人数,涉裸露药操作岗位人数，高级工程师总数,特种作业人员数量';
COMMENT ON COLUMN riskreport_enterpriseinfo.midemployeecount
IS
    '每班下井人数，中级工程师总数';
COMMENT ON COLUMN riskreport_enterpriseinfo.architectcount
IS
    '一天X班，注册建造师总数';
COMMENT ON COLUMN riskreport_enterpriseinfo.costengineercount
IS
    '注册造价师总数';
COMMENT ON COLUMN riskreport_enterpriseinfo.safetyofficercout
IS
    '注册安全工程师总数';
COMMENT ON COLUMN riskreport_enterpriseinfo.firemancount
IS
    '注册消防工程师总数';
COMMENT ON COLUMN riskreport_enterpriseinfo.safetymanangercount
IS
    '安全管理人员数量';
COMMENT ON COLUMN riskreport_enterpriseinfo.asafeconductcount
IS
    '安全考核证（A本）数';
COMMENT ON COLUMN riskreport_enterpriseinfo.bsafeconductcount
IS
    '安全考核证（B本）数';
COMMENT ON COLUMN riskreport_enterpriseinfo.asafeconductcounc
IS
    '安全考核证（C本）数';
COMMENT ON COLUMN riskreport_enterpriseinfo.projectcount
IS
    '上年度在施项目总数';
COMMENT ON COLUMN riskreport_enterpriseinfo.companytypesel
IS
    '企业类型（A大型、B中型、C小型）';
COMMENT ON COLUMN riskreport_enterpriseinfo.companynaturesel
IS
    '企业性质（A国有重点、B地方国有、C乡镇煤矿）
,矿山性质（A国有、B股份、C私营）';
COMMENT ON COLUMN riskreport_enterpriseinfo.damtypesel
IS
    '矿山种类（A金属矿山，B非金属矿山 ）';
COMMENT ON COLUMN riskreport_enterpriseinfo.exploitationtypesel
IS
    '开采类型（A地下开采，B露天转地下开采）';
COMMENT ON COLUMN riskreport_enterpriseinfo.extensiontypesel
IS
    '开拓方式（A平硐开拓 ，B斜井开拓，C竖井开拓，D平硐盲斜井联合开拓 ，E平硐盲竖井联合开拓，F竖井斜坡道联合开拓   ）';
COMMENT ON COLUMN riskreport_enterpriseinfo.composetypesel
IS
    '企业构成（A采矿 ,B选矿,C尾矿库）';
COMMENT ON COLUMN riskreport_enterpriseinfo.typeofshippingsel
IS
    '排土运输方式(A汽车排土,B铁路排土,C推土梨排土,D单都挖掘机排土,E排土机排土 )';
COMMENT ON COLUMN riskreport_enterpriseinfo.worktypesel
IS
    '排土作业方式(A单台阶排土,B覆盖式多台阶排土 , C压坡脚式组合台阶排土)';
COMMENT ON COLUMN riskreport_enterpriseinfo.dumplevelsel
IS
    '排土场等级（A一级,B二级,C三级,D四级)';
COMMENT ON COLUMN riskreport_enterpriseinfo.dumpstatesel
IS
    '排土场状态(A在用,B停用,C关闭并复耕,D关闭未复垦,E其他)';
COMMENT ON COLUMN riskreport_enterpriseinfo.businesssel
IS
    '行业类型（国民经济行业分类）';
COMMENT ON COLUMN riskreport_enterpriseinfo.issafetysel
IS
    '是否在化工园区内(A是，B否),安全机构设置情况(A是B否)';
COMMENT ON COLUMN riskreport_enterpriseinfo.isregistersel
IS
    '是否注册安全工程师（A是B否）';
COMMENT ON COLUMN riskreport_enterpriseinfo.islistsel
IS
    '是否上市公司(A是B否)';
COMMENT ON COLUMN riskreport_enterpriseinfo.mineclasslevelsel
IS
    '尾矿库等别';
COMMENT ON COLUMN riskreport_enterpriseinfo.damearlytypesel
IS
    '初期坝类型';
COMMENT ON COLUMN riskreport_enterpriseinfo.damearlykindsel
IS
    '初期坝坝型';
COMMENT ON COLUMN riskreport_enterpriseinfo.damfoundationsel
IS
    '坝基地质情况';
COMMENT ON COLUMN riskreport_enterpriseinfo.validstatus
IS
    '有效状态标志';
COMMENT ON COLUMN riskreport_enterpriseinfo.riskfileno
IS
    '风控报告单号';
	
ALTER TABLE riskreport_enterpriseinfo ADD CONSTRAINT "pk_riskreport_enterpriseinfo" PRIMARY KEY ("riskfileno");


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
    '��ҵ����,��ɽ������ҵ����,';
COMMENT ON COLUMN riskreport_enterpriseinfo.companyaddress
IS
    '��˾�ص�,��ɽ�ص�,�������ص�,��˾��ַ';
COMMENT ON COLUMN riskreport_enterpriseinfo.companycorporation
IS
    '���˴���,';
COMMENT ON COLUMN riskreport_enterpriseinfo.postaddress
IS
    '���ʹ��츴�ӳ̶�,�ʱ�';
COMMENT ON COLUMN riskreport_enterpriseinfo.companymanager
IS
    'ˮ�ĵ�������,��Ҫ�����ˣ���ҵ��ȫ������';
COMMENT ON COLUMN riskreport_enterpriseinfo.businessscope
IS
    '��˹�ȼ�,��Ӫ��Χ��';
COMMENT ON COLUMN riskreport_enterpriseinfo.qualificationlevel
IS
    '��Ȼ����������,���ʵȼ�,ע���ַ';
COMMENT ON COLUMN riskreport_enterpriseinfo.registrationcompany
IS
    'ú����ըΣ����,�Ǽǻ���';
COMMENT ON COLUMN riskreport_enterpriseinfo.productaddress
IS
    '�����ѹΣ����,��ҵ������Ӫ��ַ';
COMMENT ON COLUMN riskreport_enterpriseinfo.safetylicense
IS
    '�ɿ�֤����,Ӫҵִ�պ�,ͳһ������ô���';
COMMENT ON COLUMN riskreport_enterpriseinfo.safetycompany
IS
    '��֤����1';
COMMENT ON COLUMN riskreport_enterpriseinfo.mininglicense
IS
    '��ȫ�������֤����';
COMMENT ON COLUMN riskreport_enterpriseinfo.safetyprolicense
IS
    '��֤����2';
COMMENT ON COLUMN riskreport_enterpriseinfo.emailaddress
IS
    '��ɽ����,����������,����';
COMMENT ON COLUMN riskreport_enterpriseinfo.phonenum
IS
    '���ڻ���԰���ڣ�ע����������,�ֻ�����';
COMMENT ON COLUMN riskreport_enterpriseinfo.telephone
IS
    '��ϵ�绰,�̶��绰';
COMMENT ON COLUMN riskreport_enterpriseinfo.designscalendec
IS
    '�˶���������(���/��),��ƿ��ɹ�ģ,�������������,��ƹ�ģ��ע���ʽ�';
COMMENT ON COLUMN riskreport_enterpriseinfo.actualyielddec
IS
    '�����ʵ�ʲ���(���),�����ʵ��������,������������,�����ʵ��������(����)�������ʵ�ʿ������';
COMMENT ON COLUMN riskreport_enterpriseinfo.surplusyielddec
IS
    'ʣ��ɲɴ���(���),��ֵ(��Ԫ/��),�̶��ʲ���ֵ';
COMMENT ON COLUMN riskreport_enterpriseinfo.saleslastydec
IS
    '��������۶�(���),��������۶����Ⱥ�ͬ�ܶ�';
COMMENT ON COLUMN riskreport_enterpriseinfo.profitlastydec
IS
    '����������ܶ�(���),����������ܶ�';
COMMENT ON COLUMN riskreport_enterpriseinfo.investmentlastydec
IS
    '����Ȱ�ȫ����Ͷ��(���),����Ȱ�ȫ����Ͷ��,����Ȱ�ȫ����Ͷ���ܶ�';
COMMENT ON COLUMN riskreport_enterpriseinfo.currentheightdec
IS
    '��ǰ�������(m),�ֿ������߶�,���߿�2(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.miningdepthdec
IS
    '������ȣ�m��,�ڻ�ҩ��(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.designminingdeptdec
IS
    '��ƿ�����ȣ�m��,��������߶�,�����(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.areacovereddec
IS
    '����ռ�����,�������Ͽ�(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.sumcovereddec
IS
    '�����';
COMMENT ON COLUMN riskreport_enterpriseinfo.productioncovereddec
IS
    '�������������,��Ʒ�����';
COMMENT ON COLUMN riskreport_enterpriseinfo.workcovereddec
IS
    '�칫�����,��������ת��2(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.othercovereddec
IS
    '����������̻����,����ҩ��ת��(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.worddaysyeardec
IS
    '������(�깤��X��)';
COMMENT ON COLUMN riskreport_enterpriseinfo.worksumhoursdec
IS
    '����ʱ���ܼ�(h/a)';
COMMENT ON COLUMN riskreport_enterpriseinfo.checkdayesdec
IS
    '����ʱ�䣨��/�꣩';
COMMENT ON COLUMN riskreport_enterpriseinfo.designcapacitydec
IS
    '��������ת��1(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.actualycapacitydec
IS
    '��������ת�� (kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.surpluscapacitydec
IS
    '��ڱ���ת��(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.usedcapacitydec
IS
    '���߿�1(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.designstockdec
IS
    '������1(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.actualystockdec
IS
    '��Ʒ��1(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.surplusstockdec
IS
    '�ڻ�ҩ��ת��(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.usedstockdec
IS
    '������ת��(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.designproductdec
IS
    'װҩ��Ͳ��ת��(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.actualyproductdec
IS
    'װ����ҩ����Ʒ��ת(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.surplusproductdec
IS
    '��װ���Ʒ��ת(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.usednproductdec
IS
    '����ɹ���ͺ淿(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.othercapacitydec
IS
    '����������ת��(kg)';
COMMENT ON COLUMN riskreport_enterpriseinfo.minestoretypesel
IS
    'β��Ѵ淽ʽ';
COMMENT ON COLUMN riskreport_enterpriseinfo.minefloodtypesel
IS
    '�Ƿ�װ���߼��ϵͳ';
COMMENT ON COLUMN riskreport_enterpriseinfo.isonlinesupervisel
IS
    '�Ƿ����ּල';
COMMENT ON COLUMN riskreport_enterpriseinfo.isallonlinesuperviseoksel
IS
    '���߼ල�Ƿ�ȫ����ȫ';
COMMENT ON COLUMN riskreport_enterpriseinfo.operatingstatusel
IS
    '����״̬';
COMMENT ON COLUMN riskreport_enterpriseinfo.extensiondate
IS
    '����������,��֤����1';
COMMENT ON COLUMN riskreport_enterpriseinfo.signdate
IS
    '��Ч����1����֤����2';
COMMENT ON COLUMN riskreport_enterpriseinfo.validitydate
IS
    '��Ч����2';
COMMENT ON COLUMN riskreport_enterpriseinfo.invaliddate
IS
    '����ʱ����';
COMMENT ON COLUMN riskreport_enterpriseinfo.establishmentdate
IS
    '��������';
COMMENT ON COLUMN riskreport_enterpriseinfo.completeddate
IS
    '��������';
COMMENT ON COLUMN riskreport_enterpriseinfo.checkdate
IS
    '��������';
COMMENT ON COLUMN riskreport_enterpriseinfo.inserttimeforhis
IS
    '����ʱ��';
COMMENT ON COLUMN riskreport_enterpriseinfo.operatetimeforhis
IS
    '����ʱ��';
COMMENT ON COLUMN riskreport_enterpriseinfo.sumemployeecount
IS
    'ְ������(��),ְ������,����ְ������,��ҵ��Ա����';
COMMENT ON COLUMN riskreport_enterpriseinfo.prodessionemployeecount
IS
    '�������ֳ���ҵ����(��),ÿ��ƽ���ڸ�����,ÿ��ƽ���ڸ�����,����¶ҩ������λ�������߼�����ʦ����,������ҵ��Ա����';
COMMENT ON COLUMN riskreport_enterpriseinfo.midemployeecount
IS
    'ÿ���¾��������м�����ʦ����';
COMMENT ON COLUMN riskreport_enterpriseinfo.architectcount
IS
    'һ��X�࣬ע�Ὠ��ʦ����';
COMMENT ON COLUMN riskreport_enterpriseinfo.costengineercount
IS
    'ע�����ʦ����';
COMMENT ON COLUMN riskreport_enterpriseinfo.safetyofficercout
IS
    'ע�ᰲȫ����ʦ����';
COMMENT ON COLUMN riskreport_enterpriseinfo.firemancount
IS
    'ע����������ʦ����';
COMMENT ON COLUMN riskreport_enterpriseinfo.safetymanangercount
IS
    '��ȫ������Ա����';
COMMENT ON COLUMN riskreport_enterpriseinfo.asafeconductcount
IS
    '��ȫ����֤��A������';
COMMENT ON COLUMN riskreport_enterpriseinfo.bsafeconductcount
IS
    '��ȫ����֤��B������';
COMMENT ON COLUMN riskreport_enterpriseinfo.asafeconductcounc
IS
    '��ȫ����֤��C������';
COMMENT ON COLUMN riskreport_enterpriseinfo.projectcount
IS
    '�������ʩ��Ŀ����';
COMMENT ON COLUMN riskreport_enterpriseinfo.companytypesel
IS
    '��ҵ���ͣ�A���͡�B���͡�CС�ͣ�';
COMMENT ON COLUMN riskreport_enterpriseinfo.companynaturesel
IS
    '��ҵ���ʣ�A�����ص㡢B�ط����С�C����ú��
,��ɽ���ʣ�A���С�B�ɷݡ�C˽Ӫ��';
COMMENT ON COLUMN riskreport_enterpriseinfo.damtypesel
IS
    '��ɽ���ࣨA������ɽ��B�ǽ�����ɽ ��';
COMMENT ON COLUMN riskreport_enterpriseinfo.exploitationtypesel
IS
    '�������ͣ�A���¿��ɣ�B¶��ת���¿��ɣ�';
COMMENT ON COLUMN riskreport_enterpriseinfo.extensiontypesel
IS
    '���ط�ʽ��Aƽ�Ͽ��� ��Bб�����أ�C�������أ�Dƽ��äб�����Ͽ��� ��Eƽ��ä�������Ͽ��أ�F����б�µ����Ͽ���   ��';
COMMENT ON COLUMN riskreport_enterpriseinfo.composetypesel
IS
    '��ҵ���ɣ�A�ɿ� ,Bѡ��,Cβ��⣩';
COMMENT ON COLUMN riskreport_enterpriseinfo.typeofshippingsel
IS
    '�������䷽ʽ(A��������,B��·����,C����������,D�����ھ������,E���������� )';
COMMENT ON COLUMN riskreport_enterpriseinfo.worktypesel
IS
    '������ҵ��ʽ(A��̨������,B����ʽ��̨������ , Cѹ�½�ʽ���̨������)';
COMMENT ON COLUMN riskreport_enterpriseinfo.dumplevelsel
IS
    '�������ȼ���Aһ��,B����,C����,D�ļ�)';
COMMENT ON COLUMN riskreport_enterpriseinfo.dumpstatesel
IS
    '������״̬(A����,Bͣ��,C�رղ�����,D�ر�δ����,E����)';
COMMENT ON COLUMN riskreport_enterpriseinfo.businesssel
IS
    '��ҵ���ͣ����񾭼���ҵ���ࣩ';
COMMENT ON COLUMN riskreport_enterpriseinfo.issafetysel
IS
    '�Ƿ��ڻ���԰����(A�ǣ�B��),��ȫ�����������(A��B��)';
COMMENT ON COLUMN riskreport_enterpriseinfo.isregistersel
IS
    '�Ƿ�ע�ᰲȫ����ʦ��A��B��';
COMMENT ON COLUMN riskreport_enterpriseinfo.islistsel
IS
    '�Ƿ����й�˾(A��B��)';
COMMENT ON COLUMN riskreport_enterpriseinfo.mineclasslevelsel
IS
    'β���ȱ�';
COMMENT ON COLUMN riskreport_enterpriseinfo.damearlytypesel
IS
    '���ڰ�����';
COMMENT ON COLUMN riskreport_enterpriseinfo.damearlykindsel
IS
    '���ڰӰ���';
COMMENT ON COLUMN riskreport_enterpriseinfo.damfoundationsel
IS
    '�ӻ��������';
COMMENT ON COLUMN riskreport_enterpriseinfo.validstatus
IS
    '��Ч״̬��־';
COMMENT ON COLUMN riskreport_enterpriseinfo.riskfileno
IS
    '��ر��浥��';
	
ALTER TABLE riskreport_enterpriseinfo ADD CONSTRAINT "pk_riskreport_enterpriseinfo" PRIMARY KEY ("riskfileno");


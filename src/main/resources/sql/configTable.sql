CREATE TABLE utifactor(
        riskModel CHAR(3) NOT NULL COMMENT  '风控模板号',
        factorNo CHAR(6) NOT NULL COMMENT  '因子编号',
        dangerType CHAR(2) NOT NULL COMMENT  '灾因',
        factorType CHAR(2) NOT NULL COMMENT  '因子类型',
        fromTable VARCHAR(30) COMMENT  '存储表名',
        fromColumn VARCHAR(30) COMMENT  '存储字段名',
        nullAble VARCHAR(1) COMMENT  '是否允许为空',
        columnType VARCHAR(2) COMMENT  '字段类型',
        columnCname VARCHAR(60) COMMENT  '字段中文名',
        factorExtType CHAR(2) NOT NULL COMMENT  '最值类型',
        factorExt DECIMAL(5,2) COMMENT  '最值',
        validStatus CHAR(1) NOT NULL COMMENT  '有效标志位',
        insertTimeForHis DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '插入时间',
        operateTimeForHis DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '修改时间',
        PRIMARY KEY (riskModel, factorNo, dangerType)
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;
        
    CREATE TABLE  utiformula
    (
        riskModel CHAR(3) NOT NULL COMMENT  '风控模板号' ,
        factorNo CHAR(6) NOT NULL COMMENT  '因子编号',
        dangerType CHAR(2) NOT NULL COMMENT  '灾因',
        content text NOT NULL COMMENT  '计算公式',
        listType CHAR(2) NOT NULL COMMENT  '集合类型',
        validStatus CHAR(1) NOT NULL COMMENT  '有效标志位',
        insertTimeForHis DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '插入时间',
        operateTimeForHis DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '修改时间',
        PRIMARY KEY (riskModel, factorNo, dangerType)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
     CREATE TABLE utiscore (
        riskModel CHAR(3) NOT NULL COMMENT  '风控模板号',
        factorNo CHAR(6) NOT NULL COMMENT  '因子编号',
        dangerType CHAR(2) NOT NULL COMMENT  '灾因',
        factorValue VARCHAR(5) NOT NULL COMMENT  '因子取值',
        factorScore DECIMAL(5,2) NOT NULL COMMENT  '分值',
        validStatus CHAR(1) NOT NULL COMMENT  '有效标志位',
        insertTimeForHis  DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '插入时间',
        operateTimeForHis  DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '修改时间',
        PRIMARY KEY (riskModel, factorNo, dangerType, factorValue) 
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
    
          CREATE TABLE  utihighlightrisk
    (
        riskModel CHAR(3) NOT NULL COMMENT  '风控模板号',
        fromTable VARCHAR(30) COMMENT  '存储表名',
        fromColumn VARCHAR(30) COMMENT  '存储字段名',
        riskValue VARCHAR(5) NOT NULL COMMENT  '取值',
        riskFlag CHAR(1) NOT NULL COMMENT  '取值是否为突出风险',
        riskReminder text COMMENT  '突出风险描述',
        validStatus CHAR(1) NOT NULL COMMENT  '有效标志位',
        insertTimeForHis  DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '插入时间',
        operateTimeForHis  DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '修改时间',
        PRIMARY KEY (riskmodel, fromtable, fromcolumn, riskvalue) 
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;    
    
    
    CREATE TABLE
    utiweight
    (
        id SERIAL NOT NULL COMMENT  'id号',
        riskModel VARCHAR(3) COMMENT  '有效标志位',
        comCode VARCHAR(8) NOT NULL COMMENT  '归属机构',
        operatorCode VARCHAR(10) COMMENT  '维护人代码',
        operatorName VARCHAR(50) COMMENT  '维护人名称',
        fireWeight DECIMAL(5,4) COMMENT  '火灾风险值',
        waterWeight DECIMAL(5,4) COMMENT  '水灾风险值',
        windWeight DECIMAL(5,4) COMMENT  '风灾风险值',
        thunderWeight DECIMAL(5,4) COMMENT  '雷灾风险值',
        snowWeight DECIMAL(5,4) COMMENT  '雪灾风险值',
        theftWeight DECIMAL(5,4) COMMENT  '盗抢风险值',
        earthquakeWeight DECIMAL(5,4) COMMENT  '地震风险值',
        geologyWeight DECIMAL(5,4) COMMENT  '地质灾害风险值',
        validStatus CHAR(1) NOT NULL COMMENT  '有效标志位',
        insertTimeForHis  DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '插入时间',
        operateTimeForHis  DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '修改时间',   
        PRIMARY KEY (id)
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;
  
    
 ------------------------------------------------------------  
    
    CREATE TABLE
    riskreport_main
    (
        riskfileno CHAR(22) NOT NULL,
        classcode CHAR(2) NOT NULL,
        riskcode CHAR(3) NOT NULL,
        comcode CHAR(8) NOT NULL,
        stockrate DECIMAL(5,2),
        riskmodel VARCHAR(3),
        insuredtype VARCHAR(1),
        insuredcode VARCHAR(30),
        insuredname VARCHAR(120),
        addressprovince VARCHAR(30),
        addresscity VARCHAR(40),
        addresscounty VARCHAR(60),
        addressdetail VARCHAR(255),
        postcode VARCHAR(6),
        businesssource VARCHAR(6),
        businessclass VARCHAR(2),
        unitnature VARCHAR(1),
        underwritestatus VARCHAR(1),
        operatorcode VARCHAR(10),
        operatorcode_uni VARCHAR(10),
        historyloseflag VARCHAR(1),
        sumamount DECIMAL(14,4),
        undwrtsubmitdate DATE,
        underwriteflag VARCHAR(1),
        underwritedate DATE,
        underwritecode VARCHAR(10),
        underwritename VARCHAR(120),
        explorecomcode VARCHAR(8),
        explorer VARCHAR(10),
        explorer_uni VARCHAR(10),
        exploredate DATE,
        madedate DATETIME YEAR TO SECOND,
        exploretype VARCHAR(1),
        lastriskfileno VARCHAR(22),
        mobileflag CHAR(1) NOT NULL,
        archivesno VARCHAR(22),
        addrisk VARCHAR(15),
        customerexplain TEXT,
        onceaccidentlosest DECIMAL(14,2),
        riskunitnumber INTEGER,
        riskunitexplain TEXT,
        loserate DECIMAL(5,2),
        highlightrisk TEXT,
        score DECIMAL(5,2),
        supplementappraisal TEXT,
        risksuggest VARCHAR(1),
        othsuggest TEXT,
        addmessage TEXT,
        utiweightid INTEGER,
        inserttimeforhis DATETIME YEAR TO SECOND,
        operatetimeforhis DATETIME YEAR TO SECOND,
        executionid VARCHAR(50),
        repulsesugggest LVARCHAR(1000),
        pointx_2000 DECIMAL(20,15),
        pointy_2000 DECIMAL(20,15),
        pointx_02 DECIMAL(20,15),
        pointy_02 DECIMAL(20,15),
        valuation VARCHAR(1),
        proposalno CHAR(22),
        policyno CHAR(22),
        PRIMARY KEY (riskfileno) 
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
    
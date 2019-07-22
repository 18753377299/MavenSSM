CREATE TABLE
    utifactor
    (
        riskModel CHAR(3) NOT NULL,
        factorNo CHAR(6) NOT NULL,
        dangerType CHAR(2) NOT NULL,
        factorType CHAR(2) NOT NULL,
        fromTable VARCHAR(30),
        fromColumn VARCHAR(30),
        nullAble VARCHAR(1),
        columnType VARCHAR(2),
        columnCname VARCHAR(60),
        factorExtType CHAR(2) NOT NULL,
        factorExt DECIMAL(5,2),
        validStatus CHAR(1) NOT NULL,
        insertTimeForHis DATETIME DEFAULT CURRENT_TIMESTAMP,
        operateTimeForHis DATETIME DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (riskModel, factorNo, dangerType)
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
    
    
    
      CREATE TABLE utiformula
    (
        riskmodel CHAR(3) NOT NULL,
        factorno CHAR(6) NOT NULL,
        dangertype CHAR(2) NOT NULL,
        content TEXT NOT NULL,
        listtype CHAR(2) NOT NULL,
        validstatus CHAR(1) NOT NULL,
        inserttimeforhis DATETIME  default NOW(),
        operatetimeforhis DATETIME default NOW(),
        PRIMARY KEY (riskmodel, factorno, dangertype)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
         CREATE TABLE  utihighlightrisk
    (
        riskmodel CHAR(3) NOT NULL,
        fromtable VARCHAR(30) NOT NULL,
        fromcolumn VARCHAR(30) NOT NULL,
        riskvalue VARCHAR(5) NOT NULL,
        riskflag CHAR(1) NOT NULL,
        riskreminder text,
        validstatus CHAR(1) NOT NULL,
        inserttimeforhis DATETIME  default NOW(),
        operatetimeforhis DATETIME   default NOW(),
        PRIMARY KEY (riskmodel, fromtable, fromcolumn, riskvalue) 
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
    CREATE TABLE
    utiscore
    (
        riskmodel CHAR(3) NOT NULL,
        factorno CHAR(6) NOT NULL,
        dangertype CHAR(2) NOT NULL,
        factorvalue VARCHAR(5) NOT NULL,
        factorscore DECIMAL(5,2) NOT NULL,
        validstatus CHAR(1) NOT NULL,
        inserttimeforhis DATETIME YEAR TO SECOND,
        operatetimeforhis DATETIME YEAR TO SECOND,
        PRIMARY KEY (riskmodel, factorno, dangertype, factorvalue) 
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
    CREATE TABLE
    utiweight
    (
        id SERIAL NOT NULL,
        comcode VARCHAR(8) NOT NULL,
        operatorcode VARCHAR(10),
        operatorname VARCHAR(50),
        fireweight DECIMAL(5,4),
        waterweight DECIMAL(5,4),
        windweight DECIMAL(5,4),
        thunderweight DECIMAL(5,4),
        snowweight DECIMAL(5,4),
        theftweight DECIMAL(5,4),
        earthquakeweight DECIMAL(5,4),
        geologyweight DECIMAL(5,4),
        validstatus CHAR(1) NOT NULL,
        inserttimeforhis DATETIME  default NOW(),
        operatetimeforhis DATETIME  default NOW(),
        riskmodel VARCHAR(3),
        PRIMARY KEY (id) CONSTRAINT pk_utiweight
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
    
    CREATE TABLE
    riskreport_firedanger
    (
        riskfileno CHAR(22) NOT NULL,
        fireproofseparate VARCHAR(1),
        buildstructure VARCHAR(1),
        builduseyear VARCHAR(1),
        buildownershipnature VARCHAR(1),
        fireloaddensity VARCHAR(1),
        mainmaterialburnnature VARCHAR(1),
        explodeproductenviron VARCHAR(1),
        dangerprocesspart VARCHAR(1),
        chargeposition VARCHAR(1),
        lineyear VARCHAR(1),
        storagearealight VARCHAR(1),
        storagesituation VARCHAR(1),
        linedistance VARCHAR(1),
        proirrelevantdevice VARCHAR(1),
        firefacility VARCHAR(1),
        indoorhydrantsystem VARCHAR(1),
        outdoorhydrantsystem VARCHAR(1),
        fireextinguisher VARCHAR(1),
        fireequipmentpassage VARCHAR(1),
        autoextinguishsystem VARCHAR(1),
        autoalarmsystemstatus VARCHAR(1),
        autoalarmsystemwatch VARCHAR(1),
        firewatersupply VARCHAR(1),
        electriclineprotect VARCHAR(1),
        fireseparation VARCHAR(1),
        bodybetweenbuild VARCHAR(1),
        surroundenvironment VARCHAR(1),
        establishfiresafety VARCHAR(1),
        configurefirefighter VARCHAR(1),
        firecheckhappen VARCHAR(1),
        hotfireapproval VARCHAR(1),
        firedrill VARCHAR(1),
        firetrain VARCHAR(1),
        firemaintenance VARCHAR(1),
        nosmokemanage VARCHAR(1),
        firecontrolduty VARCHAR(1),
        rectificatesuggest VARCHAR(1),
        inserttimeforhis DATETIME YEAR TO SECOND,
        operatetimeforhis DATETIME YEAR TO SECOND,
        PRIMARY KEY (riskfileno) CONSTRAINT pk_riskreport_firedanger
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
    
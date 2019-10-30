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
    
 drop table if exists utiweight;   
    CREATE TABLE
    utiweight
    (
        id SERIAL NOT NULL COMMENT  'id号',
        riskModel VARCHAR(3) COMMENT  '有效标志位',
        comCode VARCHAR(8) NOT NULL COMMENT  '归属机构',
        operatorCode VARCHAR(10) COMMENT  '维护人代码',
        operatorName VARCHAR(50) COMMENT  '维护人名称',
        fireDanger DECIMAL(5,4) COMMENT  '火灾风险值',
        waterDanger DECIMAL(5,4) COMMENT  '水灾风险值',
        windDanger DECIMAL(5,4) COMMENT  '风灾风险值',
        thunderDanger DECIMAL(5,4) COMMENT  '雷灾风险值',
        snowDanger DECIMAL(5,4) COMMENT  '雪灾风险值',
        theftDanger DECIMAL(5,4) COMMENT  '盗抢风险值',
        earthQuakeDanger DECIMAL(5,4) COMMENT  '地震风险值',
        geologyDanger DECIMAL(5,4) COMMENT  '地质灾害风险值',
        validStatus CHAR(1) NOT NULL COMMENT  '有效标志位',
        insertTimeForHis  DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '插入时间',
        operateTimeForHis  DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '修改时间',   
        PRIMARY KEY (id)
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;
  
    
 ------------------------------------------------------------  
    
   
    
    
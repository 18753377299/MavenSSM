drop table if exists riskreport_safefactorymain;
CREATE TABLE
    riskreport_safefactorymain
    (
        riskfileno CHARACTER VARYING(22) NOT NULL,
        comcode CHARACTER VARYING(8),
        riskmodel CHARACTER VARYING(3),
        insuredtype CHARACTER VARYING(1),
        insuredcode CHARACTER VARYING(30),
        insuredname CHARACTER VARYING(120),
        businesssource CHARACTER VARYING(6),
        businessclass CHARACTER VARYING(2),
        underwritestatus CHARACTER VARYING(1),
        undwrtsubmitdate DATE,
        underwriteflag CHARACTER VARYING(1),
        underwritedate DATE,
        underwritecode CHARACTER VARYING(10),
        underwritename CHARACTER VARYING(120),
        explorecomcode CHARACTER VARYING(8),
        explorer CHARACTER VARYING(10),
        exploredate DATE,
        mobileflag CHARACTER VARYING(1),
        archivesno CHARACTER VARYING(22),
        score NUMERIC(5,2),
        executionid CHARACTER VARYING(50),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_riskreport_safefactorymain PRIMARY KEY (riskfileno)
    );
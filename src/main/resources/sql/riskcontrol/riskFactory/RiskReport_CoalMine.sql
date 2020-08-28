drop table if exists RiskReport_CoalMine;
CREATE TABLE RiskReport_CoalMine(
        riskfileno CHARACTER VARYING(22) NOT NULL,
        proSafeAccident CHARACTER VARYING(1),
        safeProLevel CHARACTER VARYING(1),
        safeProConDuty CHARACTER VARYING(1),
        safeProConTarSys CHARACTER VARYING(1),
        safeTechApprSys CHARACTER VARYING(1),
        safePutRePuSys CHARACTER VARYING(1),
        safeMeetSys CHARACTER VARYING(1),
        safeTrainSys CHARACTER VARYING(1),
        safeCheckSys CHARACTER VARYING(1),
        safeRiskConSys CHARACTER VARYING(1),
        accidentManageSys CHARACTER VARYING(1),
        specTaskManageSys CHARACTER VARYING(1),
        hotWorkManageSys CHARACTER VARYING(1),
        blastWorkManageSys CHARACTER VARYING(1),
        emergRescManageSys CHARACTER VARYING(1),
        accidentDutySys CHARACTER VARYING(1),
        safeRiskConSetUp CHARACTER VARYING(1),
        safeRiskIdentify CHARACTER VARYING(1),
        signRisk CHARACTER VARYING(1),
        safeRiskConStep CHARACTER VARYING(1),
        hideDanManStep CHARACTER VARYING(1),
        signHideDanRect CHARACTER VARYING(1),
        emergPlan CHARACTER VARYING(1),
        emergRescuPact CHARACTER VARYING(1),
        emergRescuSupp CHARACTER VARYING(1),
        apprProCapact CHARACTER VARYING(1),
        coalMineTech CHARACTER VARYING(20),
        tunnelTech CHARACTER VARYING(20),
        mineBalance CHARACTER VARYING(1),
        gasStand CHARACTER VARYING(1),
        ventEquipIntactRate CHARACTER VARYING(1),
        drainEquipIntactRate CHARACTER VARYING(1),
        transEquipIntactRate CHARACTER VARYING(1),
        electEquipIntactRate CHARACTER VARYING(1),
        roadWayDisReRate CHARACTER VARYING(1),
        sixSysConstruct CHARACTER VARYING(1),
        operateNum CHARACTER VARYING(1),
		enterWellNum CHARACTER VARYING(1),
		eachMineAreaNum CHARACTER VARYING(1),
		personSecuCert CHARACTER VARYING(1),
		leadWorkExper CHARACTER VARYING(1),
		chargeWorkExper CHARACTER VARYING(1),
		operateWorkExper CHARACTER VARYING(1),
		otherWorkExper CHARACTER VARYING(1),
		maxMine CHARACTER VARYING(1),
		geologComplex CHARACTER VARYING(1),
		gasLevel CHARACTER VARYING(1),
		hydrogeType CHARACTER VARYING(1),
		spontFireTend CHARACTER VARYING(1),
		coalDustExpl CHARACTER VARYING(1),
		rockCoalSeam CHARACTER VARYING(1),
		heatDamage CHARACTER VARYING(1),
		judgeStand CHARACTER VARYING(1),
        inserttimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        operatetimeforhis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT pk_RiskReport_CoalMine PRIMARY KEY (riskfileno),
		CONSTRAINT ck_RiskReport_CoalMine1 CHECK (proSafeAccident IN ('','A' ,'B','C','D','E')),
		CONSTRAINT ck_RiskReport_CoalMine2 CHECK (safeProLevel IN ('','A' ,'B','C','D')),
		CONSTRAINT ck_RiskReport_CoalMine3 CHECK (safeProConDuty IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine4 CHECK (safeProConTarSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine5 CHECK (safeTechApprSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine6 CHECK (safePutRePuSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine7 CHECK (safeMeetSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine8 CHECK (safeTrainSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine9 CHECK (safeCheckSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine10 CHECK (safeRiskConSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine11 CHECK (accidentManageSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine12 CHECK (specTaskManageSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine13 CHECK (hotWorkManageSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine14 CHECK (blastWorkManageSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine15 CHECK (emergRescManageSys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine16 CHECK (accidentDutySys IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine17 CHECK (safeRiskConSetUp IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine18 CHECK (safeRiskIdentify IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine19 CHECK (signRisk IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine20 CHECK (safeRiskConStep IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine21 CHECK (hideDanManStep IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine22 CHECK (signHideDanRect IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine23 CHECK (emergPlan IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine24 CHECK (emergRescuPact IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine25 CHECK (emergRescuSupp IN ('','A' ,'B')),	
		CONSTRAINT ck_RiskReport_CoalMine26 CHECK (apprProCapact IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine29 CHECK (mineBalance IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine30 CHECK (gasStand IN ('','A' ,'B')),			
		CONSTRAINT ck_RiskReport_CoalMine31 CHECK (ventEquipIntactRate IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine32 CHECK (drainEquipIntactRate IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine33 CHECK (transEquipIntactRate IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine34 CHECK (electEquipIntactRate IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine35 CHECK (roadWayDisReRate IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine36 CHECK (sixSysConstruct IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine37 CHECK (operateNum IN ('','A' ,'B','C','D','E')),
		CONSTRAINT ck_RiskReport_CoalMine38 CHECK (enterWellNum IN ('','A' ,'B','C','D')),
		CONSTRAINT ck_RiskReport_CoalMine39 CHECK (eachMineAreaNum IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine40 CHECK (personSecuCert IN ('','A' ,'B')),	
		CONSTRAINT ck_RiskReport_CoalMine41 CHECK (leadWorkExper IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine42 CHECK (chargeWorkExper IN ('','A' ,'B')),	
		CONSTRAINT ck_RiskReport_CoalMine43 CHECK (operateWorkExper IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine44 CHECK (otherWorkExper IN ('','A' ,'B')),	
		CONSTRAINT ck_RiskReport_CoalMine45 CHECK (maxMine IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine46 CHECK (geologComplex IN ('','A' ,'B','C','D')),
		CONSTRAINT ck_RiskReport_CoalMine47 CHECK (gasLevel IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine48 CHECK (hydrogeType IN ('','A' ,'B','C','D')),	
		CONSTRAINT ck_RiskReport_CoalMine49 CHECK (spontFireTend IN ('','A' ,'B','C')),
		CONSTRAINT ck_RiskReport_CoalMine50 CHECK (coalDustExpl IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine51 CHECK (rockCoalSeam IN ('','A' ,'B')),	
		CONSTRAINT ck_RiskReport_CoalMine52 CHECK (heatDamage IN ('','A' ,'B')),
		CONSTRAINT ck_RiskReport_CoalMine53 CHECK (judgeStand IN ('','A' ,'B','C'))
    );
	
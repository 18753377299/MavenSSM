drop table if exists RISKREPORT_CHEMICALS;
CREATE TABLE RISKREPORT_CHEMICALS (
	riskFileNo  CHARACTER VARYING(22) NOT NULL,
	businessLicense CHARACTER VARYING(1),
	businessInfo CHARACTER VARYING(1),
-- 	businessMainEquipment CHARACTER VARYING(1),
	operatingYears CHARACTER VARYING(1),
	operatingRate CHARACTER VARYING(1),
	businessRisk CHARACTER VARYING(1),
	HSEManagementSys CHARACTER VARYING(1),
	safeProductionManageSys CHARACTER VARYING(1),


	contractorManageSys CHARACTER VARYING(1),
	dangerGovernanceSys CHARACTER VARYING(1),
	safeEducationSys CHARACTER VARYING(1),
	specialOperationManageSys CHARACTER VARYING(1),
	hotWorkManageSys CHARACTER VARYING(1),
	specialSafetyManageSys CHARACTER VARYING(1),
	facilityMaintenanceManageSys CHARACTER VARYING(1),
	noSmokingManageSys CHARACTER VARYING(1),
	emergencyPlanDrillSyshighly CHARACTER VARYING(1),
	emergencyPlanDrillSysgeneral CHARACTER VARYING(1),

	safeProductionInvestment CHARACTER VARYING(1),
	fireManageSys CHARACTER VARYING(1),
	fireFacilities CHARACTER VARYING(1),
	businessSafeTraining CHARACTER VARYING(1),
	safeProductionAccident CHARACTER VARYING(1),
	safeStandardization CHARACTER VARYING(1),

	mainProducts CHARACTER VARYING(1),
	majorDangerSource CHARACTER VARYING(1),
	productionTemperature CHARACTER VARYING(1),
	maximumPressure CHARACTER VARYING(1),
	emergencyEquipment CHARACTER VARYING(1),
	fireWastewaterCollectionSys CHARACTER VARYING(1),
	emergencyDevices CHARACTER VARYING(1),
	generalOperator CHARACTER VARYING(1),
	specialOperators CHARACTER VARYING(1),
	lightningProtectionMeasures CHARACTER VARYING(1),
	antiStaticMeasures CHARACTER VARYING(1),
	explosionProofMeasures CHARACTER VARYING(1),
	monitoringWarningEquipment CHARACTER VARYING(1),
	fireEmbankment CHARACTER VARYING(1),
	loadingOperationManageSys CHARACTER VARYING(1),
	residentialSchoolsHospitals CHARACTER VARYING(10),
	farmlandGrassland CHARACTER VARYING(10),
	chemicalPark CHARACTER VARYING(1),
	
	majorDangers CHARACTER VARYING(1),

	insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,

	CONSTRAINT pk_riskreport_chemicals PRIMARY KEY (riskFileNo),
	CONSTRAINT ck_riskreport_chemicals1 CHECK(businessLicense IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals2 CHECK(businessInfo IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals3 CHECK(operatingYears IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals4 CHECK(operatingRate IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals5 CHECK(businessRisk IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals6 CHECK(HSEManagementSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals7 CHECK(safeProductionManageSys IN ('','A','B')),


	CONSTRAINT ck_riskreport_chemicals8 CHECK(contractorManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals9 CHECK(dangerGovernanceSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals10 CHECK(safeEducationSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals11 CHECK(specialOperationManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals12 CHECK(hotWorkManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals13 CHECK(specialSafetyManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals14 CHECK(facilityMaintenanceManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals15 CHECK(noSmokingManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals16 CHECK(emergencyPlanDrillSyshighly IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals17 CHECK(emergencyPlanDrillSysgeneral IN ('','A','B')),

	CONSTRAINT ck_riskreport_chemicals18 CHECK(safeProductionInvestment IN ('','A','B','C','D')),
	CONSTRAINT ck_riskreport_chemicals19 CHECK(fireManageSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals20 CHECK(fireFacilities IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals21 CHECK(businessSafeTraining IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals22 CHECK(safeProductionAccident IN ('','A','B','C','D')),
	CONSTRAINT ck_riskreport_chemicals23 CHECK(safeStandardization IN ('','A','B','C','D')),

	CONSTRAINT ck_riskreport_chemicals24 CHECK(mainProducts IN ('','A','B','C','D')),
	CONSTRAINT ck_riskreport_chemicals25 CHECK(majorDangerSource IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals26 CHECK(productionTemperature IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals27 CHECK(maximumPressure IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals28 CHECK(emergencyEquipment IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals29 CHECK(fireWastewaterCollectionSys IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals30 CHECK(emergencyDevices IN ('','A','B','C','D')),
	CONSTRAINT ck_riskreport_chemicals31 CHECK(generalOperator IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals32 CHECK(specialOperators IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals33 CHECK(lightningProtectionMeasures IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals34 CHECK(antiStaticMeasures IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals35 CHECK(explosionProofMeasures IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals36 CHECK(monitoringWarningEquipment IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals37 CHECK(fireEmbankment IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_chemicals38 CHECK(loadingOperationManageSys IN ('','A','B','C')),
-- 	CONSTRAINT ck_riskreport_chemicals1 CHECK(residentialSchoolsHospitals IN ('','A','B')),
--  CONSTRAINT ck_riskreport_chemicals1 CHECK(farmlandGrassland IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals39 CHECK(chemicalPark IN ('','A','B')),
	CONSTRAINT ck_riskreport_chemicals40 CHECK(majorDangers IN ('','A','B','C'))


);

comment on column RISKREPORT_CHEMICALS.riskFileNo is '��ر��';
comment on column RISKREPORT_CHEMICALS.businessLicense is '��ҵ֤���Ƿ�ȫ';
comment on column RISKREPORT_CHEMICALS.businessInfo is '��ҵ��������Ƿ�����';
comment on column RISKREPORT_CHEMICALS.operatingYears is '��ҵ��Ҫ�豸��Ӫ����';
comment on column RISKREPORT_CHEMICALS.operatingRate is '�������������������ֵ';
comment on column RISKREPORT_CHEMICALS.businessRisk is '��Ӫ����';
comment on column RISKREPORT_CHEMICALS.HSEManagementSys is '���� HSE ������ϵ';
comment on column RISKREPORT_CHEMICALS.safeProductionManageSys is '��ȫ���������ƶ�,���а�����ȫ���������� ';


comment on column RISKREPORT_CHEMICALS.contractorManageSys is '�а��̹����ƶ�';
comment on column RISKREPORT_CHEMICALS.dangerGovernanceSys is '�����Ų��������ƶ�';
comment on column RISKREPORT_CHEMICALS.safeEducationSys is '��ȫ�����ƶ�';
comment on column RISKREPORT_CHEMICALS.specialOperationManageSys is '������ҵ�����ƶ�';
comment on column RISKREPORT_CHEMICALS.hotWorkManageSys is '������ҵ�����ƶ�';
comment on column RISKREPORT_CHEMICALS.specialSafetyManageSys is '�����豸��ȫ�����ƶ�';
comment on column RISKREPORT_CHEMICALS.facilityMaintenanceManageSys is '��ʩά�ޱ��������ƶ�';
comment on column RISKREPORT_CHEMICALS.noSmokingManageSys is '�����ƶ��������';
comment on column RISKREPORT_CHEMICALS.emergencyPlanDrillSyshighly is 'Ӧ��Ԥ�������ƶȣ��綾��ѧƷ��';
comment on column RISKREPORT_CHEMICALS.emergencyPlanDrillSysgeneral is 'Ӧ��Ԥ�������ƶȣ�һ�㻯ѧƷ��';

comment on column RISKREPORT_CHEMICALS.safeProductionInvestment is '��ȫ����Ͷ��ռ���۶����';
comment on column RISKREPORT_CHEMICALS.fireManageSys is '���������ƶ�';
comment on column RISKREPORT_CHEMICALS.fireFacilities is '������ʩ';
comment on column RISKREPORT_CHEMICALS.businessSafeTraining is '��ҵ��ȫ��ѵ���';
comment on column RISKREPORT_CHEMICALS.safeProductionAccident is '��ȫ�����¹�';
comment on column RISKREPORT_CHEMICALS.safeStandardization is '��ȫ��׼��������׼';

comment on column RISKREPORT_CHEMICALS.mainProducts is '��Ҫԭ�ϡ��м��塢��Ʒ';
comment on column RISKREPORT_CHEMICALS.majorDangerSource is '�Ƿ񹹳��ش�Σ��Դ';
comment on column RISKREPORT_CHEMICALS.productionTemperature is '��������¶�';
comment on column RISKREPORT_CHEMICALS.maximumPressure is '���ѹ��';
comment on column RISKREPORT_CHEMICALS.emergencyEquipment is 'Ӧ���豸��ʩ';
comment on column RISKREPORT_CHEMICALS.fireWastewaterCollectionSys is '������ˮ�ռ�ϵͳ';
comment on column RISKREPORT_CHEMICALS.emergencyDevices is '�¹�Ӧ���豸��װ��';
comment on column RISKREPORT_CHEMICALS.generalOperator is 'һ�������Ա';
comment on column RISKREPORT_CHEMICALS.specialOperators is '�������ֲ��������������繤��';
comment on column RISKREPORT_CHEMICALS.lightningProtectionMeasures is '���״�ʩ';
comment on column RISKREPORT_CHEMICALS.antiStaticMeasures is '�������ʩ';
comment on column RISKREPORT_CHEMICALS.explosionProofMeasures is '������ʩ';
comment on column RISKREPORT_CHEMICALS.monitoringWarningEquipment is '��ء�Ԥ���������豸��ʩ';
comment on column RISKREPORT_CHEMICALS.fireEmbankment is '�洢�����޷����';
comment on column RISKREPORT_CHEMICALS.loadingOperationManageSys is 'װж���������ƶ�';
comment on column RISKREPORT_CHEMICALS.residentialSchoolsHospitals is '���޾�������ѧУ��ҽԺ';
comment on column RISKREPORT_CHEMICALS.farmlandGrassland is '����ũ�����ũ��ݳ����ֳ����к���';

comment on column RISKREPORT_CHEMICALS.chemicalPark is '��ҵ���������Ƿ����ڻ���԰������Χ�Ƿ��������������ҵ';
comment on column RISKREPORT_CHEMICALS.majorDangers is '�Ƿ�����ش�ȫ����';
comment on column RISKREPORT_CHEMICALS.insertTimeForHis is '����ʱ��';
comment on column RISKREPORT_CHEMICALS.operateTimeForHis is '����ʱ��';
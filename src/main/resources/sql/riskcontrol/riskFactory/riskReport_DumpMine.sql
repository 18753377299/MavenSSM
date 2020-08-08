drop table if exists RISKREPORT_DUMPMINE;
CREATE TABLE RISKREPORT_DUMPMINE (
	riskFileNo  CHARACTER VARYING(22) NOT NULL,
	businessLicense CHARACTER VARYING(1),
	businessInfo CHARACTER VARYING(1),
	dumpingLevel CHARACTER VARYING(1),
	dumpingStatus CHARACTER VARYING(1),
	businessRisk CHARACTER VARYING(1),
	safeManageSystem CHARACTER VARYING(1),
	safeManageinstitution CHARACTER VARYING(1),
	contractorManageSys CHARACTER VARYING(1),
	dangerGovernanceSys CHARACTER VARYING(1),
	safeEducationSys CHARACTER VARYING(1),
	specialOperationManageSys CHARACTER VARYING(1),
	specialSafetyManageSys CHARACTER VARYING(1),
	facilityMaintenanceManageSys CHARACTER VARYING(1),
	dangerInvestigationManageSys CHARACTER VARYING(1),
	emergencyPlanDrillSys CHARACTER VARYING(1),


	safeProductionPercentage CHARACTER VARYING(1),
	fireManageSys CHARACTER VARYING(1),
	fireFacilities CHARACTER VARYING(1),
	businessSafeTraining CHARACTER VARYING(1),
	safeProductionAccident CHARACTER VARYING(1),
	safeStandardization CHARACTER VARYING(1),

	dumpingByRequirements CHARACTER VARYING(1),
	safeSignsOtherOperations CHARACTER VARYING(1),
	directDumpingOperation CHARACTER VARYING(1),
	dumpingSiteManagement CHARACTER VARYING(1),
	carGear CHARACTER VARYING(1),
	emergencyEquipmentFacilities CHARACTER VARYING(1),
	monitoringSystem CHARACTER VARYING(1),
	safeClassificationEvaluation CHARACTER VARYING(1),
	dumpingSiteStability CHARACTER VARYING(1),


	floodProtectionFacilities CHARACTER VARYING(1),
	preventMudslides CHARACTER VARYING(1),
	dumpingSafeInspection CHARACTER VARYING(1),
	dumpingMonitoringSystem CHARACTER VARYING(1),
	checkFloodStructures CHARACTER VARYING(1),
	dumpingOutside CHARACTER VARYING(1),
	dumpingInternal CHARACTER VARYING(1),
	majorDangersCriteria CHARACTER VARYING(1),
	insertTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    operateTimeForHis TIMESTAMP(0) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT pk_riskreport_dumpmine PRIMARY KEY (riskFileNo),
	CONSTRAINT ck_riskreport_dumpmine1 CHECK (businessLicense IN ('','A','B')),
	CONSTRAINT ck_riskreport_dumpmine2 CHECK (businessInfo IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_dumpmine3 CHECK (dumpingLevel IN ('','A','B','C','D')),
	CONSTRAINT ck_riskreport_dumpmine4 CHECK (dumpingStatus IN ('','A','B','C')),
	CONSTRAINT ck_riskreport_dumpmine5 CHECK (businessRisk IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine6 CHECK (safeManageSystem IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine7 CHECK (safeManageinstitution IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine8 CHECK (contractorManageSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine9 CHECK (dangerGovernanceSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine10 CHECK (safeEducationSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine11 CHECK (specialOperationManageSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine12 CHECK (specialSafetyManageSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine13 CHECK (facilityMaintenanceManageSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine14 CHECK (dangerInvestigationManageSys IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine15 CHECK (emergencyPlanDrillSys IN ('','A','B','C')),


    CONSTRAINT ck_riskreport_dumpmine16 CHECK (safeProductionPercentage IN ('','A','B','C','D')),
    CONSTRAINT ck_riskreport_dumpmine17 CHECK (fireManageSys IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine18 CHECK (fireFacilities IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine19 CHECK (businessSafeTraining IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine20 CHECK (safeProductionAccident IN ('','A','B','C','D','D')),
    CONSTRAINT ck_riskreport_dumpmine21 CHECK (safeStandardization IN ('','A','B','C','D')),

    CONSTRAINT ck_riskreport_dumpmine22 CHECK (dumpingByRequirements IN ('','A','B','C','D')),
    CONSTRAINT ck_riskreport_dumpmine23 CHECK (safeSignsOtherOperations IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine24 CHECK (directDumpingOperation IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine25 CHECK (dumpingSiteManagement IN ('','A','B','C','D')),
    CONSTRAINT ck_riskreport_dumpmine26 CHECK (carGear IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine27 CHECK (emergencyEquipmentFacilities IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine28 CHECK (monitoringSystem IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine29 CHECK (safeClassificationEvaluation IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine30 CHECK (dumpingSiteStability IN ('','A','B','C','D')),


    CONSTRAINT ck_riskreport_dumpmine31 CHECK (floodProtectionFacilities IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine32 CHECK (preventMudslides IN ('','A','B','C')),
    CONSTRAINT ck_riskreport_dumpmine33 CHECK (dumpingSafeInspection IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine34 CHECK (dumpingMonitoringSystem IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine35 CHECK (checkFloodStructures IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine36 CHECK (dumpingOutside IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine37 CHECK (dumpingInternal IN ('','A','B')),
    CONSTRAINT ck_riskreport_dumpmine38 CHECK (majorDangersCriteria IN ('','A','B','C'))


);

comment on column RISKREPORT_DUMPMINE.riskFileNo is '��ر��';
comment on column RISKREPORT_DUMPMINE.businessLicense is '��ҵ֤���Ƿ�ȫ';
comment on column RISKREPORT_DUMPMINE.businessInfo is '��ҵ��������Ƿ�����';
comment on column RISKREPORT_DUMPMINE.dumpingLevel is '�������ȼ�';
comment on column RISKREPORT_DUMPMINE.dumpingStatus is '������������״̬';
comment on column RISKREPORT_DUMPMINE.businessRisk is '��Ӫ����';
comment on column RISKREPORT_DUMPMINE.safeManageSystem is '���ް�ȫ����������ϵ';
comment on column RISKREPORT_DUMPMINE.safeManageinstitution is '��ȫ���������ƶ�';
comment on column RISKREPORT_DUMPMINE.contractorManageSys is '�а��̹����ƶ�';
comment on column RISKREPORT_DUMPMINE.dangerGovernanceSys is '�����Ų��������ƶ�';
comment on column RISKREPORT_DUMPMINE.safeEducationSys is '��ȫ�����ƶ�';
comment on column RISKREPORT_DUMPMINE.specialOperationManageSys is '������ҵ�����ƶ�';
comment on column RISKREPORT_DUMPMINE.specialSafetyManageSys is '�����豸��ȫ�����ƶ�';
comment on column RISKREPORT_DUMPMINE.facilityMaintenanceManageSys is '��ʩά�ޱ��������ƶ�';
comment on column RISKREPORT_DUMPMINE.dangerInvestigationManageSys is '�����Ų�����ƶ�';
comment on column RISKREPORT_DUMPMINE.emergencyPlanDrillSys is 'Ӧ��Ԥ�������ƶ�';


comment on column RISKREPORT_DUMPMINE.safeProductionPercentage is '��ȫ����Ͷ��ռ���۶����';
comment on column RISKREPORT_DUMPMINE.fireManageSys is '���������ƶ�';
comment on column RISKREPORT_DUMPMINE.fireFacilities is '������ʩ';
comment on column RISKREPORT_DUMPMINE.businessSafeTraining is '��ҵ��ȫ��ѵ���';
comment on column RISKREPORT_DUMPMINE.safeProductionAccident is '��ҵ��������ʷ�¹ʼ�¼';
comment on column RISKREPORT_DUMPMINE.safeStandardization is '��ȫ��׼��������׼';

comment on column RISKREPORT_DUMPMINE.dumpingByRequirements is '�����Ҫ������';
comment on column RISKREPORT_DUMPMINE.safeSignsOtherOperations is '��ȫ��־��������ҵ';
comment on column RISKREPORT_DUMPMINE.directDumpingOperation is '�Ƿ�����ָ��������ҵ';
comment on column RISKREPORT_DUMPMINE.dumpingSiteManagement is '�����ֳ�����';
comment on column RISKREPORT_DUMPMINE.carGear is '����';
comment on column RISKREPORT_DUMPMINE.emergencyEquipmentFacilities is 'Ӧ���豸��ʩ';
comment on column RISKREPORT_DUMPMINE.monitoringSystem is '���ϵͳ';
comment on column RISKREPORT_DUMPMINE.safeClassificationEvaluation is '��ȫ�ȷ���������';
comment on column RISKREPORT_DUMPMINE.dumpingSiteStability is '�������ȶ�';


comment on column RISKREPORT_DUMPMINE.floodProtectionFacilities is '������ʩ';
comment on column RISKREPORT_DUMPMINE.preventMudslides is '����ʯ����ʩ';
comment on column RISKREPORT_DUMPMINE.dumpingSafeInspection is '��������ȫ���';
comment on column RISKREPORT_DUMPMINE.dumpingMonitoringSystem is '���������ϵͳ';
comment on column RISKREPORT_DUMPMINE.checkFloodStructures is '���ڼ����鹹����';
comment on column RISKREPORT_DUMPMINE.dumpingOutside is '�ɳ���������';
comment on column RISKREPORT_DUMPMINE.dumpingInternal is '��������';
comment on column RISKREPORT_DUMPMINE.majorDangersCriteria is '�Ƿ�����ش�ȫ����';
comment on column RISKREPORT_DUMPMINE.insertTimeForHis is '����ʱ��';
comment on column RISKREPORT_DUMPMINE.operateTimeForHis is '����ʱ��';
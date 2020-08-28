delete from utihighlightrisk where riskModel in ('013','014');
ALTER TABLE  "utihighlightrisk" ALTER COLUMN "fromcolumn" TYPE CHARACTER VARYING(50);
INSERT INTO "utihighlightrisk"("riskmodel", "fromtable", "fromcolumn", "riskvalue", "riskflag", "riskreminder", "validstatus", "inserttimeforhis", "operatetimeforhis") VALUES 

('014', 'RiskReportDumpMine', 'businessLicense', 'B', '1', '企业证照不健全', '1', now(), now()),
('014', 'RiskReportDumpMine', 'safeManageSystem', 'B', '1', '无安全生产管理体系', '1', now(), now()),
('014', 'RiskReportDumpMine', 'fireManageSys', 'B', '1', '消防管理制度不健全', '1', now(), now()),
('014', 'RiskReportDumpMine', 'fireFacilities', 'B', '1', '消防设施不完备', '1', now(), now()),
('014', 'RiskReportDumpMine', 'businessSafeTraining', 'B', '1', '无企业安全培训管理制度、培训计划及培训记录', '1', now(), now()),
('014', 'RiskReportDumpMine', 'emergencyEquipmentFacilities', 'B', '1', '应急设备保障不齐全', '1', now(), now()),
('014', 'RiskReportDumpMine', 'monitoringSystem', 'B', '1', '未建立矿山应建立排土场监测系统，定期进行排土场监测', '1', now(), now()),
('014', 'RiskReportDumpMine', 'dumpingSafeInspection', 'B', '1', '洪水过后未对坝体和排洪构筑物进行全面认真的检查与清理，发现问题未及时修复', '1', now(), now()),
('014', 'RiskReportDumpMine', 'dumpingMonitoringSystem', 'B', '1', '矿山未建立排土场监测系统，未定期进行排土场监测', '1', now(), now()),
('014', 'RiskReportDumpMine', 'checkFloodStructures', 'B', '1', '无排土场排水构筑物与防洪安全检查记录', '1', now(), now()),
('014', 'RiskReportDumpMine', 'dumpingOutside', 'B', '1', '未对采场外排土场周围环境应采取有效措施', '1', now(), now()),


('013', 'RiskReportTailingsLibrary', 'companyLicPer', 'B', '1', '企业证照不健全', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'safeProManSetUp', 'B', '1', '无安全生产管理体系', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'fireConManSys', 'B', '1', '消防管理制度不健全', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'fireFacility', 'B', '1', '消防设施不完备', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'safeTrainCondit', 'B', '1', '无企业安全培训管理制度、培训计划及培训记录', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'damSeepLineCon', 'B', '1', '坝体渗润线无排渗体或排渗设施', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'emergEquipFacility', 'B', '1', '应急设备保障不齐全', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'hasShangbaRoad', 'B', '1', '无上坝公路', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'emergeEquipSuppply', 'B', '1', '无事故应急设备和物资', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'tailingPindStaff', 'B', '1', '尾矿库工未持证上岗', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'detectSys', 'B', '1', '未建立尾矿库坝体位移、渗润线、库区水位、干滩长度等监测系统，以及视频监测系统', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'seepageManagementOneRule', 'B', '1', '尾矿库在运行期间渗流控制未满足规程要求', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'seepageManagementTwoRule', 'B', '1', '含有有毒有害、重金属物质的尾矿库无库底防渗工程设施。碾压土石坝、堆积坝无排渗设施。', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'seepageLineObservate', 'B', '1', '尾矿坝渗润线不符合要求', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'floodStorageMeetRequire', 'B', '1', '调洪库容不符合要求', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'overheadLibrary', 'A', '1', '企业下游1Km内有村庄、学校及其他重要设施', '1', now(), now()),
('013', 'RiskReportTailingsLibrary', 'mineDumpAround', 'A', '1', '尾矿库库区四周有采矿、排土场、滑坡等', '1', now(), now());





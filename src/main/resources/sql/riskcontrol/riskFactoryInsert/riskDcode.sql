
delete from riskdcode where codetype='industryInfo';
INSERT INTO "riskdcode"("codetype", "codecode", "comcode", "uppercode", "codecname", "codeename", "introduce", "validstatus", "inserttimeforhis", "operatetimeforhis") VALUES ('industryInfo', '01', NULL, NULL, '矿山', NULL, NULL, '1', '2020-09-04 09:36:00', '2020-09-04 09:36:00');
INSERT INTO "riskdcode"("codetype", "codecode", "comcode", "uppercode", "codecname", "codeename", "introduce", "validstatus", "inserttimeforhis", "operatetimeforhis") VALUES ('industryInfo', '02', NULL, NULL, '危险化学品', NULL, NULL, '1', '2020-09-04 09:36:00', '2020-09-04 09:36:00');
INSERT INTO "riskdcode"("codetype", "codecode", "comcode", "uppercode", "codecname", "codeename", "introduce", "validstatus", "inserttimeforhis", "operatetimeforhis") VALUES ('industryInfo', '03', NULL, NULL, '烟花爆竹', NULL, NULL, '1', '2020-09-04 09:36:00', '2020-09-04 09:36:00');
INSERT INTO "riskdcode"("codetype", "codecode", "comcode", "uppercode", "codecname", "codeename", "introduce", "validstatus", "inserttimeforhis", "operatetimeforhis") VALUES ('industryInfo', '04', NULL, NULL, '交通运输', NULL, NULL, '1', '2020-09-04 09:36:00', '2020-09-04 09:36:00');
INSERT INTO "riskdcode"("codetype", "codecode", "comcode", "uppercode", "codecname", "codeename", "introduce", "validstatus", "inserttimeforhis", "operatetimeforhis") VALUES ('industryInfo', '05', NULL, NULL, '建筑施工', NULL, NULL, '1', '2020-09-04 09:36:00', '2020-09-04 09:36:00');
INSERT INTO "riskdcode"("codetype", "codecode", "comcode", "uppercode", "codecname", "codeename", "introduce", "validstatus", "inserttimeforhis", "operatetimeforhis") VALUES ('industryInfo', '06', NULL, NULL, '民用爆炸物品', NULL, NULL, '1', '2020-09-04 09:36:00', '2020-09-04 09:36:00');
INSERT INTO "riskdcode"("codetype", "codecode", "comcode", "uppercode", "codecname", "codeename", "introduce", "validstatus", "inserttimeforhis", "operatetimeforhis") VALUES ('industryInfo', '07', NULL, NULL, '金属冶炼', NULL, NULL, '1', '2020-09-04 09:36:00', '2020-09-04 09:36:00');
INSERT INTO "riskdcode"("codetype", "codecode", "comcode", "uppercode", "codecname", "codeename", "introduce", "validstatus", "inserttimeforhis", "operatetimeforhis") VALUES ('industryInfo', '08', NULL, NULL, '渔业生产', NULL, NULL, '1', '2020-09-04 09:36:00', '2020-09-04 09:36:00');
INSERT INTO "riskdcode"("codetype", "codecode", "comcode", "uppercode", "codecname", "codeename", "introduce", "validstatus", "inserttimeforhis", "operatetimeforhis") VALUES ('industryInfo', '09', NULL, NULL, '其他', NULL, NULL, '1', '2020-09-04 09:36:00', '2020-09-04 09:36:00');

---对word文档字段翻译的更改---有无历史损失记录
INSERT INTO riskDcode (codetype, comcode, codecode, uppercode, codecname, codeename, introduce, validstatus, inserttimeforhis, operatetimeforhis) VALUES ('historyLoseFlag', null, '0', 'riskReportMainVo', '无', null, null, '1', '2018-07-16 10:20:08', '2018-07-16 10:20:08');
INSERT INTO riskDcode (codetype, comcode, codecode, uppercode, codecname, codeename, introduce, validstatus, inserttimeforhis, operatetimeforhis) VALUES ('historyLoseFlag', null, '1', 'riskReportMainVo', '有', null, null, '1', '2018-07-16 10:20:08', '2018-07-16 10:20:08');




--riskDcode表中增加岗位信息
delete from riskdcode where codeType in ('riskReportAsName');
INSERT INTO riskdcode (codetype, comcode, codecode, uppercode, codecname, codeename, introduce, validstatus)VALUES 
('riskReportAsName', '1', '010', '', '煤矿', '', '暂未说明', '1'),
('riskReportAsName', '1', '011', '', '地下矿山', '', '暂未说明', '1'),
('riskReportAsName', '1', '012', '', '露天矿上', '', '暂未说明', '1'),
('riskReportAsName', '1', '013', '', '尾矿库', '', '暂未说明', '1'),
('riskReportAsName', '1', '014', '', '矿山排土场', '', '暂未说明', '1'),
('riskReportAsName', '1', '015', '', '危险化学品', '', '暂未说明', '1'),
('riskReportAsName', '1', '016', '', '烟花爆竹', '', '暂未说明', '1'),
('riskReportAsName', '1', '017', '', '建筑施工', '', '暂未说明', '1'),
('riskReportAsName', '1', '018', '', '民用爆炸品', '', '暂未说明', '1'),
('riskReportAsName', '1', '019', '', '金属冶炼', '', '暂未说明', '1')
;

delete from riskdcode where codeType in ('riskWisdomAsName');
INSERT INTO riskdcode (codetype, comcode, codecode, uppercode, codecname, codeename, introduce, validstatus)VALUES
('riskWisdomAsName', '1', '020', '', 'RD0', '', '项目初步风险识别和设计风险评估报告', '1'),
('riskWisdomAsName', '1', '021', '', 'RD2', '', '项目过程风险检查报告', '1'),
('riskWisdomAsName', '1', '022', '', 'RD6', '', '竣工风险评估报告', '1'),
('riskWisdomAsName', '1', '023', '', 'RD7', '', '回访检查报告', '1'),
('riskWisdomAsName', '1', '024', '', 'RD9', '', '竣工遗留问题清单', '1'),
('riskWisdomAsName', '1', '025', '', 'RD3', '', '项目专项评估报告', '1')
;
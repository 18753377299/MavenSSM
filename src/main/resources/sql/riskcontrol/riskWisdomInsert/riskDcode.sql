
delete from riskdcode where codetype in ('riskWisdomTree020','riskWisdomTree021','riskWisdomTree022','riskWisdomTree023','riskWisdomTree024');


INSERT INTO riskdcode (codetype, comcode, codecode, uppercode, codecname, codeename, introduce, validstatus)VALUES 
('riskWisdomTree020', '1', '01', null, '项目所处地理位置图', '2.1', '建（构）筑物基本信息中项目所处地理位置图', '1'),
('riskWisdomTree020', '1', '02', null, '项目内楼宇平面布置图', '2.2', '建（构）筑物基本信息中项目内楼宇平面布置图', '1'),

('riskWisdomTree021', '1', '01', null, '形象进度', '1.1', '项目基本概况中形象进度照片', '1'),
('riskWisdomTree021', '1', '02', null, '整改前图片', '3.1', '前期缺陷追踪整改前图片', '1'),
('riskWisdomTree021', '1', '03', null, '整改后图片', '3.2', '前期缺陷追踪整改后图片', '1'),
('riskWisdomTree021', '1', '04', null, '缺陷描述', '6.1', '本次查勘缺陷清单中缺陷描述照片', '1'),

('riskWisdomTree022', '1', '01', null, '项目所处地理位置图', '2.1', '建（构）筑物基本信息中项目所处地理位置图', '1'),
('riskWisdomTree022', '1', '02', null, '项目内楼宇平面布置图', '2.2', '建（构）筑物基本信息中项目内楼宇平面布置图', '1'),

('riskWisdomTree023', '1', '01', null, '项目所处地理位置图', '2.1', '建（构）筑物基本信息中项目所处地理位置图', '1'),
('riskWisdomTree023', '1', '02', null, '项目内楼宇平面布置图', '2.2', '建（构）筑物基本信息中项目内楼宇平面布置图', '1'),

('riskWisdomTree024', '1', '01', null, '项目所处地理位置图', '2.1', '建（构）筑物基本信息中项目所处地理位置图', '1'),
('riskWisdomTree024', '1', '02', null, '项目内楼宇平面布置图', '2.2', '建（构）筑物基本信息中项目内楼宇平面布置图', '1');




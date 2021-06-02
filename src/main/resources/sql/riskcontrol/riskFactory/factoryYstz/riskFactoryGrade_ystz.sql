--验收调整前原数据
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus) VALUES (
'riskFactoryGrade','1','74','grade_safe_city_user','服务评价岗','grade_safe_service_comment','安全工厂地市公司用户岗','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus) VALUES (
'riskFactoryGrade','1','75','grade_safe_province_user','服务评价岗','grade_safe_service_comment','安全工厂省公司用户岗','1');
INSERT INTO riskDcode (codetype,comcode,codecode,uppercode,codecname,codeename,introduce,validstatus) VALUES (
'riskFactoryGrade','1','76','grade_safe_head_user','服务评价岗','grade_safe_service_comment','安全工厂总公司用户岗','1');
--验收调整--删除省市公司的服务评岗位
delete from  riskDcode where codeType = 'riskFactoryGrade' and codeename ='grade_safe_service_comment' and uppercode='grade_safe_city_user';
delete from  riskDcode where codeType = 'riskFactoryGrade' and codeename ='grade_safe_service_comment' and uppercode='grade_safe_province_user';
delete from  riskDcode where codeType = 'riskFactoryGrade' and codeename ='grade_safe_service_comment' and uppercode='grade_safe_head_user';

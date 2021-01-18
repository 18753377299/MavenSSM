--riskDcode表中增加岗位信息
delete from riskdcode where codeType in ('riskFactoryGrade');
INSERT INTO riskdcode (codetype, comcode, codecode, uppercode, codecname, codeename, introduce, validstatus)VALUES 
('riskFactoryGrade', '1', '01', 'grade_safe_riskexpert_user', '风险任务查询岗', 'grade_safe_task_query', '安全工厂风险专家用户岗', '1'),
('riskFactoryGrade', '1', '02', 'grade_safe_riskexpert_user', '现场查勘外部岗', 'grade_safe_report_inputw', '安全工厂风险专家用户岗', '1'),
('riskFactoryGrade', '1', '03', 'grade_safe_riskexpert_user', '风险报告查询岗', 'grade_safe_report_query', '安全工厂风险专家用户岗', '1'),
('riskFactoryGrade', '1', '04', 'grade_safe_riskexpert_user', '隐患清单查询岗', 'grade_safe_danger_query', '安全工厂风险专家用户岗', '1'),
('riskFactoryGrade', '1', '05', 'grade_safe_riskexpert_user', '首页统计岗', 'grade_home_count', '安全工厂风险专家用户岗', '1'),


('riskFactoryGrade', '1', '06', 'grade_safe_county_user', '风险排查申请岗', 'grade_safe_task_create', '安全工厂县支公司用户岗', '1'),
('riskFactoryGrade', '1', '07', 'grade_safe_county_user', '风险任务查询岗', 'grade_safe_task_query', '安全工厂县支公司用户岗', '1'),
('riskFactoryGrade', '1', '09', 'grade_safe_county_user', '现场查勘内部岗', 'grade_safe_report_inputn', '安全工厂县支公司用户岗', '1'),
('riskFactoryGrade', '1', '10', 'grade_safe_county_user', '风险报告查询岗', 'grade_safe_report_query', '安全工厂县支公司用户岗', '1'),
('riskFactoryGrade', '1', '11', 'grade_safe_county_user', '隐患清单查询岗', 'grade_safe_danger_query', '安全工厂县支公司用户岗', '1'),
('riskFactoryGrade', '1', '12', 'grade_safe_county_user', '首页统计岗', 'grade_home_count', '安全工厂县支公司用户岗', '1'),
('riskFactoryGrade', '1', '73', 'grade_safe_county_user', '服务评价岗', 'grade_safe_service_comment', '安全工厂县支公司用户岗', '1'),


('riskFactoryGrade', '1', '13', 'grade_safe_riskcom_user', '风险任务查询岗', 'grade_safe_task_query', '安全工厂风险机构用户岗', '1'),
('riskFactoryGrade', '1', '15', 'grade_safe_riskcom_user', '现场查勘外部岗', 'grade_safe_report_inputw', '安全工厂风险机构用户岗', '1'),
('riskFactoryGrade', '1', '16', 'grade_safe_riskcom_user', '风险报告一级审核岗', 'grade_safe_report_fir_underwrite', '安全工厂风险机构用户岗', '1'),
('riskFactoryGrade', '1', '17', 'grade_safe_riskcom_user', '风险报告查询岗', 'grade_safe_report_query', '安全工厂风险机构用户岗', '1'),
('riskFactoryGrade', '1', '18', 'grade_safe_riskcom_user', '隐患清单查询岗', 'grade_safe_danger_query', '安全工厂风险机构用户岗', '1'),
('riskFactoryGrade', '1', '19', 'grade_safe_riskcom_user', '隐患整改一级审核岗', 'grade_safe_danger_fir_underwrite', '安全工厂风险机构用户岗', '1'),
('riskFactoryGrade', '1', '21', 'grade_safe_riskcom_user', '首页统计岗', 'grade_home_count', '安全工厂风险机构用户岗', '1'),


('riskFactoryGrade', '1', '23', 'grade_safe_city_user', '投保企业用户授权岗', 'grade_safe_insured_authorize', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '24', 'grade_safe_city_user', '风险排查申请岗', 'grade_safe_task_create', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '25', 'grade_safe_city_user', '风险任务查询岗', 'grade_safe_task_query', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '26', 'grade_safe_city_user', '风险任务派发岗', 'grade_safe_task_paifa', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '27', 'grade_safe_city_user', '现场查勘内部岗', 'grade_safe_report_inputn', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '28', 'grade_safe_city_user', '风险报告二级审核岗', 'grade_safe_report_sec_underwrite', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '29', 'grade_safe_city_user', '风险报告查询岗', 'grade_safe_report_query', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '30', 'grade_safe_city_user', '隐患清单查询岗', 'grade_safe_danger_query', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '32', 'grade_safe_city_user', '隐患整改二级审核岗', 'grade_safe_danger_sec_underwrite', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '33', 'grade_safe_city_user', '整改销项岗', 'grade_safe_danger_end', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '35', 'grade_safe_city_user', '首页统计岗', 'grade_home_count', '安全工厂地市公司用户岗', '1'),
('riskFactoryGrade', '1', '74', 'grade_safe_city_user', '服务评价岗', 'grade_safe_service_comment', '安全工厂地市公司用户岗', '1'),


('riskFactoryGrade', '1', '37', 'grade_safe_province_user', '风险专家信息查询岗', 'grade_safe_riskexpert_query', '安全工厂省公司用户岗', '1'),
('riskFactoryGrade', '1', '38', 'grade_safe_province_user', '风险机构信息维护岗', 'grade_safe_riskcom_weihu', '安全工厂省公司用户岗', '1'),
('riskFactoryGrade', '1', '39', 'grade_safe_province_user', '风险专家信息维护岗', 'grade_safe_riskexpert_weihu', '安全工厂省公司用户岗', '1'),
('riskFactoryGrade', '1', '40', 'grade_safe_province_user', '风险用户权限管理岗', 'grade_safe_riskrole_authorize', '安全工厂省公司用户岗', '1'),

('riskFactoryGrade', '1', '41', 'grade_safe_province_user', '风险任务查询岗', 'grade_safe_task_query', '安全工厂省公司用户岗', '1'),
('riskFactoryGrade', '1', '45', 'grade_safe_province_user', '风险报告二级审核岗', 'grade_safe_report_sec_underwrite', '安全工厂省公司用户岗', '1'),
('riskFactoryGrade', '1', '46', 'grade_safe_province_user', '风险报告查询岗', 'grade_safe_report_query', '安全工厂省公司用户岗', '1'),
('riskFactoryGrade', '1', '47', 'grade_safe_province_user', '隐患清单查询岗', 'grade_safe_danger_query', '安全工厂省公司用户岗', '1'),
('riskFactoryGrade', '1', '49', 'grade_safe_province_user', '隐患整改二级审核岗', 'grade_safe_danger_sec_underwrite', '安全工厂省公司用户岗', '1'),
('riskFactoryGrade', '1', '50', 'grade_safe_province_user', '首页统计岗', 'grade_home_count', '安全工厂省公司用户岗', '1'),
('riskFactoryGrade', '1', '75', 'grade_safe_province_user', '服务评价岗', 'grade_safe_service_comment', '安全工厂省公司用户岗', '1'),


('riskFactoryGrade', '1', '51', 'grade_safe_insured_user', '风险排查申请岗', 'grade_safe_task_create', '安全工厂投保企业用户岗', '1'),
('riskFactoryGrade', '1', '52', 'grade_safe_insured_user', '风险任务查询岗', 'grade_safe_task_query', '安全工厂投保企业用户岗', '1'),
('riskFactoryGrade', '1', '53', 'grade_safe_insured_user', '风险报告查询岗', 'grade_safe_report_query', '安全工厂投保企业用户岗', '1'),
('riskFactoryGrade', '1', '54', 'grade_safe_insured_user', '隐患清单查询岗', 'grade_safe_danger_query', '安全工厂投保企业用户岗', '1'),
('riskFactoryGrade', '1', '55', 'grade_safe_insured_user', '隐患清单整改岗', 'grade_safe_danger_resole', '安全工厂投保企业用户岗', '1'),
('riskFactoryGrade', '1', '56', 'grade_safe_insured_user', '服务评价岗', 'grade_safe_service_comment', '安全工厂投保企业用户岗', '1'),
('riskFactoryGrade', '1', '57', 'grade_safe_insured_user', '首页统计岗', 'grade_home_count', '安全工厂投保企业用户岗', '1'),


('riskFactoryGrade', '1', '59', 'grade_safe_head_user', '风险专家信息查询岗', 'grade_safe_riskexpert_query', '安全工厂总公司用户岗', '1'),
('riskFactoryGrade', '1', '60', 'grade_safe_head_user', '风险机构信息维护岗', 'grade_safe_riskcom_weihu', '安全工厂总公司用户岗', '1'),
('riskFactoryGrade', '1', '61', 'grade_safe_head_user', '风险专家信息维护岗', 'grade_safe_riskexpert_weihu', '安全工厂总公司用户岗', '1'),
('riskFactoryGrade', '1', '62', 'grade_safe_head_user', '风险用户权限管理岗', 'grade_safe_riskrole_authorize', '安全工厂总公司用户岗', '1'),
('riskFactoryGrade', '1', '64', 'grade_safe_head_user', '风险报告查询岗', 'grade_safe_report_query', '安全工厂总公司用户岗', '1'),
('riskFactoryGrade', '1', '65', 'grade_safe_head_user', '隐患清单查询岗', 'grade_safe_danger_query', '安全工厂总公司用户岗', '1'),
('riskFactoryGrade', '1', '67', 'grade_safe_head_user', '首页统计岗', 'grade_home_count', '安全工厂总公司用户岗', '1'),
('riskFactoryGrade', '1', '78', 'grade_safe_head_user', '风险任务查询岗', 'grade_safe_task_query', '安全工厂总公司用户岗', '1'),



('riskFactoryGrade', '1', '68', 'grade_safe_riskexpert_in_user', '风险任务查询岗', 'grade_safe_task_query', '安全工厂风险内部专家岗', '1'),
('riskFactoryGrade', '1', '69', 'grade_safe_riskexpert_in_user', '现场查勘内部岗', 'grade_safe_report_inputn', '安全工厂风险内部专家岗', '1'),
('riskFactoryGrade', '1', '70', 'grade_safe_riskexpert_in_user', '风险报告查询岗', 'grade_safe_report_query', '安全工厂风险内部专家岗', '1'),
('riskFactoryGrade', '1', '71', 'grade_safe_riskexpert_in_user', '隐患清单查询岗', 'grade_safe_danger_query', '安全工厂风险内部专家岗', '1'),
('riskFactoryGrade', '1', '72', 'grade_safe_riskexpert_in_user', '首页统计岗', 'grade_home_count', '安全工厂风险内部专家岗', '1'),
('riskFactoryGrade', '1', '77', 'grade_safe_riskexpert_in_user', '服务评价岗', 'grade_safe_service_comment', '安全工厂风险内部专家岗', '1')
;

-- 新增政府用户岗
delete from riskdcode where codeType in ('riskFactoryGrade') and uppercode='grade_safe_government_user';
INSERT INTO riskdcode (codetype, comcode, codecode, uppercode, codecname, codeename, introduce, validstatus) VALUES
('riskFactoryGrade', '1', '79', 'grade_safe_government_user', '风险任务查询岗', 'grade_safe_task_query', '安全工厂政府用户岗', '1'),
('riskFactoryGrade', '1', '80', 'grade_safe_government_user', '风险报告查询岗', 'grade_safe_report_query', '安全工厂政府用户岗', '1'),
('riskFactoryGrade', '1', '81', 'grade_safe_government_user', '隐患清单查询岗', 'grade_safe_danger_query', '安全工厂政府用户岗', '1'),
('riskFactoryGrade', '1', '82', 'grade_safe_government_user', '首页统计岗', 'grade_home_count', '安全工厂政府用户岗', '1')
;





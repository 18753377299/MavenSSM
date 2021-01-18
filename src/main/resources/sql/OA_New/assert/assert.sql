-- 资产表
-- 资产维护表
drop table if exists t_assert_defend;
CREATE TABLE t_assert_defend(
assert_no		 varchar(22)  	NOT NULL	COMMENT '资产编号',
assert_nature		 varchar(1)	NOT NULL	COMMENT '资产性质',
assert_sort		varchar(2)		COMMENT  '资产种类',
assert_amount		decimal(8,2)		COMMENT  '资产金额',
assert_quantity		bigint(4)		COMMENT '资产数量',
assert_status		 varchar(1)		COMMENT '资产状态',
assert_department		 varchar(10)		COMMENT '资产所属部门',
assert_team		 varchar(10)		COMMENT '资产所属团队',
assert_upper_code		 varchar(22)		COMMENT '父级资产编号',
assert_buy_date		datetime  		COMMENT '购买日期',
assert_warranty_period		bigint(4)		COMMENT '保修期限',
assert_use_num		 varchar(1)		COMMENT '使用次数',
assert_back_info		 varchar(255)		COMMENT '信息备注',
insert_time_for_his	 datetime NULL  DEFAULT NOW() 		COMMENT '插入时间',
operate_time_for_his	datetime NULL  DEFAULT NOW()  COMMENT '更新时间',
PRIMARY KEY (assert_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 资产人员关联表
drop table if exists t_assert_person;
CREATE TABLE t_assert_person(
    assert_no	 varchar(22)  	NOT NULL	COMMENT'资产编号',
    assert_department	 varchar(10)		COMMENT'资产所属部门',
    assert_team	 varchar(10)		COMMENT'资产使用团队',
    assert_project	 varchar(10)		COMMENT'资产使用项目组',
    assert_staff_code	 varchar(10)	  	NOT NULL	COMMENT'资产使用员工工号',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (assert_no,assert_staff_code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 资产轨迹表
drop table if exists t_assert_track;
CREATE TABLE t_assert_track(
    assert_no	 varchar(22)  	NOT NULL	COMMENT'资产编号',
    assert_sort	varchar(2)		COMMENT'资产种类',
    assert_department	 varchar(10)		COMMENT'资产所属部门',
    assert_team	 varchar(10)		COMMENT'资产所属团队',
    assert_project	 varchar(10)		COMMENT'资产所属项目组',
    assert_staff_code	 varchar(10)	NOT NULL	COMMENT'资产使用员工工号',
    assert_status	 varchar(1)		COMMENT'资产状态',
    operate_date	 datetime		COMMENT'操作时间',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (assert_no,assert_staff_code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 资产申请表
drop table if exists t_assert_apply;
CREATE TABLE  t_assert_apply(						
    assert_apply_no	 varchar(22)  	NOT NULL	COMMENT'申请任务编号',
    assert_apply_type	 varchar(1)		COMMENT'申请类型',
    assert_apply_reason	 varchar(1)		COMMENT'申请原因',
    assert_apply_staff_code	 varchar(10)		COMMENT'资产申请人员工号',
    assert_apply_staff_name	 varchar(30)		COMMENT'资产申请人员名称',
    assert_total_amount	decimal(8,2)		COMMENT'资产总金额',
    assert_underwrite_status	 varchar(1)		COMMENT'审核状态',
    assert_deal_date	datetime		COMMENT'处理日期',
    assert_execute_id	 varchar(10)		COMMENT'审核流程id',
    assert_staff_code	 varchar(10)		COMMENT'操作人员工号',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (assert_apply_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 资产申请清单表
drop table if exists t_assert_apply_list;
CREATE TABLE  t_assert_apply_list(
    assert_apply_no	 varchar(22)  	NOT NULL	COMMENT'申请任务编号',
    assert_apply_staff_code	 varchar(10)	NOT NULL	COMMENT'资产使用员工工号',
    assert_nature	 varchar(1)		COMMENT'资产性质',
    assert_sort	varchar(2)		COMMENT'资产种类',
    assert_quantity	bigint(4)		COMMENT'资产数量',
    assert_config	 varchar(255)		COMMENT'资产配置',
    assert_buy_way	 varchar(255)		COMMENT'资产采买途径',
    assert_price_reference	 decimal(8,2)		COMMENT'价格参考',
    assert_remark	 varchar(255)		COMMENT'资产备注',
    assert_order_info	 varchar(255)		COMMENT'订单信息',
    assert_order_cut_info	 varchar(255)		COMMENT'订单截图信息',
    assert_no	 varchar(22)		COMMENT'资产编号',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (assert_apply_no,assert_apply_staff_code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;						

-- 审批规则配置表
drop table if exists t_assert_appr_rule_config;
CREATE TABLE  t_assert_appr_rule_config(						
    assert_check_type	 varchar(1)  	NOT NULL	COMMENT'审核类型',
    assert_check_person_code	 varchar(10)	NOT NULL	COMMENT'审核人员代码',
    assert_check_person_name	 varchar(30)		COMMENT'审核人员名称',
    assert_min_amount	 decimal(8,2)		COMMENT'最小金额',
    assert_max_amount	 decimal(8,2)		COMMENT'最大金额',
    assert_check_rule	 varchar(1)  		COMMENT'审核规则',
    is_validate_flag	 varchar(1)  		COMMENT'审核是否有效标志',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (assert_check_type,assert_check_person_code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;						
						
-- 标准字段表
drop table if exists t_assert_stand_field;
CREATE TABLE  t_assert_stand_field(						
    assert_sort	varchar(2)	NOT NULL	COMMENT'资产类型',
    assert_no	varchar(22)	NOT NULL	COMMENT'资产编码',
    assert_no_name	varchar(255)		COMMENT'资产编码名称',
    assert_introduce	varchar(255)		COMMENT'资产介绍',
    is_validate_flag	varchar(1)		COMMENT'资产是否有效',
    expand_field_one	varchar(255)		COMMENT'扩展字段1',
    expand_field_two	varchar(255)		COMMENT'扩展字段2',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (assert_sort,assert_no)						
)ENGINE=InnoDB DEFAULT CHARSET=utf8;





-- 资产表
-- 资产维护表
drop table if exists t_asset_defend;
CREATE TABLE t_asset_defend(
asset_no		 varchar(22)  	NOT NULL	COMMENT '资产编号',
asset_nature		 varchar(1)	NOT NULL	COMMENT '资产性质',
asset_sort		varchar(2)		COMMENT  '资产种类',
asset_amount		decimal(8,2)		COMMENT  '资产金额',
asset_quantity		bigint(4)		COMMENT '资产数量',
asset_status		 varchar(1)		COMMENT '资产状态',
asset_department		 varchar(10)		COMMENT '资产所属部门',
asset_team		 varchar(10)		COMMENT '资产所属团队',
asset_project		 varchar(10)		COMMENT '资产所属项目组',
asset_upper_code		 varchar(22)		COMMENT '父级资产编号',
asset_buy_date		datetime  		COMMENT '购买日期',
asset_warranty_period		bigint(4)		COMMENT '有效期限',
asset_use_num		 varchar(1)		COMMENT '使用次数',
asset_back_info		 varchar(255)		COMMENT '信息备注',
insert_time_for_his	 datetime NULL  DEFAULT NOW() 		COMMENT '插入时间',
operate_time_for_his	datetime NULL  DEFAULT NOW()  COMMENT '更新时间',
PRIMARY KEY (asset_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8  COMMENT '资产维护表';

-- 资产人员关联表
drop table if exists t_asset_person;
CREATE TABLE t_asset_person(
    asset_no	 varchar(22)  	NOT NULL	COMMENT'资产编号',
    asset_staff_code	 varchar(10)	  	NOT NULL	COMMENT'资产使用员工工号',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (asset_no,asset_staff_code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '资产人员关联表';

-- 资产轨迹表
drop table if exists t_asset_track;
CREATE TABLE t_asset_track(
    asset_id     int            NOT NULL	COMMENT'资产轨迹id',
    asset_no	 varchar(22)  	NOT NULL	COMMENT'资产编号',
    asset_staff_code	 varchar(10)	NOT NULL	COMMENT'资产使用员工工号',
    asset_status	 varchar(1)		COMMENT'资产状态',
    operate_date	 datetime		COMMENT'操作时间',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (asset_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '资产轨迹表';

-- 资产申请表
drop table if exists t_asset_apply;
CREATE TABLE  t_asset_apply(
    asset_apply_no	 varchar(22)  	NOT NULL	COMMENT'申请任务编号',
    asset_apply_type	 varchar(1)		COMMENT'申请类型',
    asset_apply_reason	 varchar(1)		COMMENT'申请原因',

    asset_apply_staff_code	 varchar(10)		COMMENT'资产申请人员工号',
    asset_apply_staff_name	 varchar(30)		COMMENT'资产申请人员名称',
    asset_total_amount	decimal(8,2)		COMMENT'资产总金额',
    asset_underwrite_status	 varchar(1)		COMMENT'审核状态',
    asset_submit_date	datetime		COMMENT '提交申请日期',
    asset_deal_date	datetime		COMMENT '办结日期',
    asset_execute_id	 varchar(10)		COMMENT'审核流程id',
    asset_staff_code	 varchar(10)		COMMENT'操作人员工号',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (asset_apply_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '资产申请表';


-- 资产申请清单表
drop table if exists t_asset_apply_list;
CREATE TABLE  t_asset_apply_list(
    asset_apply_no	 varchar(22)  	NOT NULL	COMMENT'申请任务编号',
    asset_apply_staff_code	 varchar(10)	NOT NULL	COMMENT'资产使用员工工号',
    asset_nature	 varchar(1)		COMMENT'资产性质',
    asset_sort	varchar(2)		COMMENT'资产种类',
    asset_quantity	bigint(4)		COMMENT'资产数量',
    asset_config	 varchar(255)		COMMENT'资产配置',
    asset_buy_way	 varchar(255)		COMMENT'资产采买途径',
    asset_price_reference	 decimal(8,2)		COMMENT'价格参考',
    asset_remark	 varchar(255)		COMMENT'资产备注',
    asset_order_info	 varchar(255)		COMMENT'订单信息',
    asset_order_cut_info	 varchar(255)		COMMENT'订单截图信息',
    asset_no	 varchar(22)		COMMENT'资产编号',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (asset_apply_no,asset_apply_staff_code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '资产申请清单表';

-- 审批规则配置表
drop table if exists t_asset_appr_rule_config;
CREATE TABLE  t_asset_appr_rule_config(
    asset_check_type	 varchar(1)  	NOT NULL	COMMENT'审核类型',
    asset_check_person_code	 varchar(10)	NOT NULL	COMMENT'审核人员代码',
    asset_check_person_name	 varchar(30)		COMMENT'审核人员名称',

    asset_nature	 varchar(1)		COMMENT'资产性质',

    asset_min_amount	 decimal(8,2)		COMMENT'最小金额',
    asset_max_amount	 decimal(8,2)		COMMENT'最大金额',
    asset_check_rule	 varchar(1)  		COMMENT'审核规则',

    asset_defend_code	 varchar(10)  		COMMENT'维护人员',

    is_validate_flag	 varchar(1)  		COMMENT'审核是否有效标志',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (asset_check_type,asset_check_person_code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '审批规则配置表';

-- 标准字段表
drop table if exists t_asset_stand_field;
CREATE TABLE  t_asset_stand_field(
    asset_sort	varchar(2)	NOT NULL	COMMENT'业务类型',
    asset_no	varchar(22)	NOT NULL	COMMENT'字段代码',
    asset_no_name	varchar(255)		COMMENT'字段名称',
    asset_introduce	varchar(255)		COMMENT'字段说明',
    is_validate_flag	varchar(1)		COMMENT'是否有效',

    asset_defend_code	varchar(10)		COMMENT'维护人员',

    expand_field_one	varchar(255)		COMMENT'扩展字段1',
    expand_field_two	varchar(255)		COMMENT'扩展字段2',
    insert_time_for_his	 datetime	NULL  DEFAULT NOW()	COMMENT'插入时间',
    operate_time_for_his	datetime	NULL  DEFAULT NOW()	COMMENT'更新时间',
    PRIMARY KEY (asset_sort,asset_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '标准字段表';





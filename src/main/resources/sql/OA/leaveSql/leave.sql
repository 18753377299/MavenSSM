---请假基础表     
 CREATE TABLE Leave_basic(
	id	int AUTO_INCREMENT Primary key COMMENT 'id',
	job_num	VARCHAR(6) NOT NULL COMMENT '工号',	
	employee_name	VARCHAR(60) NOT NULL COMMENT '员工姓名',
	team_code	VARCHAR (6) COMMENT '所属团队代码',	
	team_name	VARCHAR(120) COMMENT '所属团队名称',	
	project_code	VARCHAR (6) COMMENT '所属项目代码',	
	project_name	VARCHAR(120) COMMENT '所属项目名称',	
	annual_day	TINYINT COMMENT '年假总天数',	
	used_annual_day	TINYINT COMMENT '已用年假天数',	
	retreat_day	TINYINT COMMENT '倒休总天数',	
	used_retreat_day	TINYINT COMMENT '已用倒休天数',	
	sick_day	TINYINT COMMENT '病假总天数',	
	used_sick_day	TINYINT COMMENT '已用病假天数',	
	insert_time_for_his	datetime NULL DEFAULT NOW() COMMENT '插入时间',	
	operate_time_for_his	datetime NULL DEFAULT NOW() COMMENT '更新时间'	
)ENGINE=InnoDB DEFAULT CHARSET=utf8; 

 
CREATE TABLE Leave_main(
	id	int AUTO_INCREMENT Primary key COMMENT 'id',	--**
	job_num	VARCHAR(6) NOT NULL COMMENT '工号',	--**
	employee_name	VARCHAR(60) NOT NULL COMMENT '员工姓名',	--**
	team_code	VARCHAR (6) COMMENT '所属团队代码',	--**
	team_name	VARCHAR(120) COMMENT '所属团队名称',	--**
	project_code	VARCHAR (6) COMMENT '所属项目代码',	--**
	project_name	VARCHAR(120) COMMENT '所属项目名称',	--**
	leave_type	VARCHAR(1) NOT NULL COMMENT '--**请假类型:A倒休
	--**B倒休（本月）
	--**C年假
	--**D病假
	--**E事假
	--**F婚假
	--**G丧假
	--**H产假
	--**I陪产假
	--**J旷工',	
	detail_desc	text COMMENT '详细说明',	--**
	start_time	DATE COMMENT '请假开始时间',	--**
	end_time	DATE COMMENT '请假结束时间',	--**
	sum_day	INT COMMENT '请假天数',	--**
	insert_time_for_his	datetime NULL DEFAULT NOW() COMMENT '插入时间',	
	operate_time_for_his	datetime NULL DEFAULT NOW() COMMENT '更新时间'	
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
CREATE TABLE
    leave_person
    (
        id INT NOT NULL AUTO_INCREMENT,
        usercode VARCHAR(10),
        username VARCHAR(255) NOT NULL,
        annual_leave INT,
        flag VARCHAR(255) NOT NULL,
        department_id INT,
        department_name VARCHAR(255) NOT NULL,
        team_id INT,
        team_name VARCHAR(255) NOT NULL,
        leavedate DATE,
        insertTimeForHis DATETIME DEFAULT CURRENT_TIMESTAMP,
        operateTimeForHis DATETIME DEFAULT CURRENT_TIMESTAMP,
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
  
    CREATE TABLE leave_travel(
		id	int AUTO_INCREMENT Primary key COMMENT  'id',	--**id
		job_num	VARCHAR(6) NOT NULL COMMENT  '工号',	--**工号
		employee_name	VARCHAR(60) NOT NULL COMMENT  '员工姓名',	--**员工姓名
		team_code	VARCHAR (6) COMMENT  '所属团队代码',	--**所属团队代码
		team_name	VARCHAR(120) COMMENT  '所属团队名称',	--**所属团队名称
		project_code	VARCHAR (6) COMMENT  '所属项目代码',	--**所属项目代码
		project_name	VARCHAR(120) COMMENT  '所属项目名称',	--**所属项目名称
		travel_type	VARCHAR(1) NOT NULL COMMENT  '出差类型',	--**出差类型
		travel_site	VARCHAR(120) COMMENT  '出差地点',	--**出差地点
		travel_desc	VARCHAR(250) COMMENT  '出差说明',	--**出差说明
		start_time	DATE COMMENT  '出差开始时间',	--**出差开始时间
		end_time	DATE COMMENT  '出差结束时间',	--**出差结束时间
		travel_day	INT COMMENT  '出差天数',	--**出差天数
		insert_time_for_his	datetime NULL DEFAULT NOW() COMMENT  '插入时间',	--**插入时间
		operate_time_for_his	datetime NULL DEFAULT NOW() COMMENT  '更新时间'	--**
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
  
CREATE TABLE  leave_special_date
    (
        id CHAR(4) NOT NULL COMMENT  '特殊节假日Id',
        date_type VARCHAR(30) COMMENT  '特殊节假日类型,0:本来该工作变成休息日,1:本来休息变成工作日,2:本来休息变成节日正日三薪日',
        date DATE COMMENT  '特殊节假日日期',
        insert_time_for_his  DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '插入时间',
        operate_time_for_his  DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT  '修改时间',
        PRIMARY KEY (id) 
    )ENGINE=InnoDB DEFAULT CHARSET=utf8; 
    
    
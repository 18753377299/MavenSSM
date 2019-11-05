----用户权限表
CREATE TABLE  user_role(
	user_code  VARCHAR(10) not null COMMENT '用户代码',
	lever_code VARCHAR(10)  not null COMMENT '用户级别代码',
	lever_name VARCHAR(10)   COMMENT '用户岗位名称',
	super_lever_code VARCHAR(10)  COMMENT '父级岗位代码', 
	PRIMARY KEY (user_code,lever_code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
----用户表
CREATE TABLE user(
        user_code  VARCHAR(10) not null COMMENT '用户代码',
        user_name VARCHAR(30) COMMENT '用户名称',
		pass_word VARCHAR(30) not null COMMENT '用户密码',
        age INT COMMENT '年龄',
		email VARCHAR(20) COMMENT '邮箱',
		identity_number VARCHAR(18) COMMENT '身份证号',
        PRIMARY KEY (user_code,pass_word)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
    
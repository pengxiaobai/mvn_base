1.创建数据库
create database test
2.删除数据库
drop database test
3.创建数据库表  AUTO_INCREMENT:自动增长   COMMENT：添加注释  ENGINE：表使用的引擎 
CHARSET：表的字符编码

用户表
create table user(
	id INT AUTO_INCREMENT COMMENT '主键',
	name VARCHAR(20) NOT NULL COMMENT '姓名',
	age INT DEFAULT 0 COMMENT '年龄',
	createTime TIMESTAMP DEFAULT now() COMMENT '创建时间',
	PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO user1(name,age)values
     ('张宇','17') ,                                                                                          
     ('李晓明','18'),                                                                                          
     ('方世玉','16'),                                                                                         
     ('张瑜愉','17');     
课程表
create table project(
    -> id INT AUTO_INCREMENT COMMENT '主键',                                                                    
    -> name VARCHAR(30) NOT NULL COMMENT '课程名',                                                              
    -> createTime TIMESTAMP DEFAULT now() COMMENT '创建时间',                                                   
    -> PRIMARY KEY(id)
    -> )ENGINE=InnoDB DEFAULT CHARSET=utf8;

   INSERT INTO project(name)values
   ('语文'),('数学'),('英语'),('化学');  
   
 //选课表
  create table choose_project(
  	id INT AUTO_INCREMENT COMMENT '主键',
  	u_id INT NOT NULL COMMENT '用户id',
  	p_id INT NOT NULL COMMENT '课程id',
  	createTime TIMESTAMP DEFAULT now() COMMENT '创建时间',
  	PRIMARY KEY(id),
  	CONSTRAINT fk_userId FOREIGN KEY(u_id) REFERENCES user(id),
  	CONSTRAINT fk_projectId FOREIGN KEY(p_id) REFERENCES project(id)
  )ENGINE=InnoDB DEFAULT CHARSET=utf8;
4.删除表
DROP TABLE user;

5.清楚表数据
delete from table_name
truncate table_name

6.将多张表连接成一张表
union 没有重复数据
union all 有重复数据

7.分组 group by



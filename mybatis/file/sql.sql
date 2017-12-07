//创建数据库
create databases test;

//创建表

//用户表
create table user(
	id int auto_increment comment "主键",
	name varchar(20) not null  comment "姓名",
	age int default 0 comment "年龄",
	address varchar(50) default "" comment "地址",
	createTime timestamp default now() comment "创建时间",
	
	primary key(id)
)engine=innodb auto_increment=1000 default charset=utf8

//插入用户数据
insert into user(name,age,address)values
('张宇',35,'上海松江'),
('钱明',26,'上海浦东'),
('宋人',27,'北京胡同'),
('王宇',29,'安徽合肥'),
('王辉',30,'东北黑龙江')



//创建admin表
create table admin(
	id int auto_increment comment "主键",
	name varchar(200) not null comment "姓名",
	createTime timestamp default comment "创建时间",
	
	primary key(id)
)engine=innodb auto_increment=1000 default charset=utf8



//创建订单表
create table orderInfo(
	id bigint auto_increment comment "主键",
	userId int not null comment "用户id",
	shoppName varchar(100) not null comment "店铺名称",
	commodity varchar(50) not null comment "商品名称",
	price decimal(5,2)  comment "总价",
	createTime timestamp default now() comment "创建时间",
	primary key(id),
	constraint fk_userId foreign key(userId) references user(id)
)engine=innodb auto_increment=1000001 default charset=utf8

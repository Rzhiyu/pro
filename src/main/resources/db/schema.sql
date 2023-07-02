DROP TABLE IF EXISTS sys_user;
DROP TABLE IF EXISTS user_order_goods;
DROP TABLE IF EXISTS goods;
DROP TABLE IF EXISTS user_order;

CREATE TABLE sys_user
(
	id BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	age INT NULL DEFAULT NULL COMMENT '年龄',
	email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
	PRIMARY KEY (id)
);


CREATE TABLE goods
(
	id BIGINT NOT NULL primary key auto_increment COMMENT '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	price FLOAT4
);


CREATE TABLE user_order
(
	id BIGINT NOT NULL primary key AUTO_INCREMENT COMMENT '主键ID',
	date date,
	uid BIGINT
);

CREATE TABLE user_order_goods
(
	order_id BIGINT not null,
	item_id BIGINT not null
);

ALTER TABLE user_order_goods ADD CONSTRAINT K1 FOREIGN KEY(order_id) REFERENCES user_order(id);
ALTER TABLE user_order_goods ADD CONSTRAINT K2 FOREIGN KEY(item_id) REFERENCES goods(id);
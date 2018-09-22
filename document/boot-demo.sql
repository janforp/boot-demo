DROP TABLE IF EXISTS `user`;
create table user
(
   user_id VARCHAR(36) NOT NULL,
   user_name VARCHAR(40) DEFAULT NULL,
   gender TINYINT(1) DEFAULT NULL,
   remark VARCHAR(500) DEFAULT NULL,
   PRIMARY KEY(`user_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';
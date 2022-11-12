```sql

CREATE DATABASE `fzujump` 

USE `fzujump`;

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `roleCode` varchar(15) DEFAULT NULL COMMENT '角色编码',
  `roleName` varchar(15) DEFAULT NULL COMMENT '角色名称',
  `createdBy` bigint DEFAULT NULL COMMENT '创建者',
  `modifyBy` bigint DEFAULT NULL COMMENT '修改者',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `role` */

/*Table structure for table `score` */

DROP TABLE IF EXISTS `score`;

CREATE TABLE `score` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `userName` varchar(15) DEFAULT NULL COMMENT '用户名称',
  `userRole` bigint DEFAULT NULL COMMENT '用户角色（取自角色表-角色id）',
  `JumpFrequency` bigint DEFAULT NULL COMMENT '跳跃次数',
  `Item number` bigint DEFAULT NULL COMMENT '道具数',
  `createdBy` bigint DEFAULT NULL COMMENT '创建者',
  `modifyBy` bigint DEFAULT NULL COMMENT '修改者',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `score` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `userCode` varchar(15) DEFAULT NULL COMMENT '用户编码(token)',
  `userName` varchar(15) DEFAULT NULL COMMENT '用户名称',
  `userPassword` varchar(15) DEFAULT NULL COMMENT '用户密码',
  `userRole` bigint DEFAULT NULL COMMENT '用户角色（取自角色表-角色id）',
  `createdBy` bigint DEFAULT NULL COMMENT '创建者',
  `modifyBy` bigint DEFAULT NULL COMMENT '修改者',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `code` INT(11) NOT NULL COMMENT '编号',
  `permissionName` VARCHAR(32) DEFAULT NULL COMMENT '权限名',
  PRIMARY KEY (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `role_permission`;

CREATE TABLE `role_permission` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `roleId` INT(11) NOT NULL COMMENT '角色id',
  `permissionId` INT(11) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8

```


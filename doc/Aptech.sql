/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.15-log : Database - aptech
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`aptech` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `aptech`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `Id` int(11) DEFAULT NULL COMMENT '编号',
  `name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名',
  `pass` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '密码',
  `role` int(50) DEFAULT NULL COMMENT '权限'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `admin` */

insert  into `admin`(`Id`,`name`,`pass`,`role`) values (1,'admin','admin',1);

/*Table structure for table `classes` */

DROP TABLE IF EXISTS `classes`;

CREATE TABLE `classes` (
  `classId` int(11) NOT NULL COMMENT '班级编号',
  `className` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '班级名称',
  PRIMARY KEY (`classId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `classes` */

insert  into `classes`(`classId`,`className`) values (1,'脱产1班'),(2,'脱产3班'),(3,'脱产6班'),(4,'脱产7班'),(5,'脱产32班');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学员编号',
  `username` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '学员用户名',
  `password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '学员密码',
  `email` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '电子邮件',
  `userinfo` varchar(4000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '学员信息',
  `creationdate` date DEFAULT NULL COMMENT '创建日期',
  `modifydate` date DEFAULT NULL COMMENT '修改日期',
  `admissiondate` date DEFAULT NULL COMMENT '入学日期',
  `cardno` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '学员学号',
  `pic` varchar(4000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '学员照片',
  `borndate` date DEFAULT NULL COMMENT '学员年龄',
  `sex` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '性别',
  `address` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
  `phone` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系电话',
  `classId` int(5) DEFAULT NULL COMMENT '班级编号',
  `qq` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'QQ号',
  PRIMARY KEY (`id`),
  KEY `FK_student` (`classId`),
  CONSTRAINT `FK_student` FOREIGN KEY (`classId`) REFERENCES `classes` (`classId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `student` */

insert  into `student`(`id`,`username`,`password`,`email`,`userinfo`,`creationdate`,`modifydate`,`admissiondate`,`cardno`,`pic`,`borndate`,`sex`,`address`,`phone`,`classId`,`qq`) values (1,'尹成龙','123456','sadf@163.com','哈尔滨','2010-03-04',NULL,'2009-05-03','1','201709071118001.jpg','1993-03-06','男','黑龙江省','13804578400',5,'1234567');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

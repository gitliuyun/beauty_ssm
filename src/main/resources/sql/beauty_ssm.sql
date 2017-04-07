/*
Navicat MySQL Data Transfer

Source Server         : localhost1
Source Server Version : 50520
Source Host           : 127.0.0.1:3306
Source Database       : beauty_ssm

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2017-04-07 16:47:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for biwhitecardinfotb
-- ----------------------------
DROP TABLE IF EXISTS `biwhitecardinfotb`;
CREATE TABLE `biwhitecardinfotb` (
  `biwhitecardinfotb_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cardno` varchar(20) NOT NULL,
  `kktype` varchar(2) NOT NULL,
  `unitcode` varchar(4) NOT NULL,
  `mobileno` varchar(20) DEFAULT NULL,
  `productcompany` varchar(20) NOT NULL,
  `productmodel` varchar(20) NOT NULL,
  `rsvd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`biwhitecardinfotb_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of biwhitecardinfotb
-- ----------------------------
INSERT INTO `biwhitecardinfotb` VALUES ('1', '1000751160000000', 'KY', '2000', '15010680971', 'samsung', 'SM-N9150', '20150526233039');
INSERT INTO `biwhitecardinfotb` VALUES ('2', '1000751160000001', 'KY', '2000', '18210121406', 'samsung', 'SM-N9150', '20150508112504');

-- ----------------------------
-- Table structure for dictbmacunitcodetb
-- ----------------------------
DROP TABLE IF EXISTS `dictbmacunitcodetb`;
CREATE TABLE `dictbmacunitcodetb` (
  `dictbmacunitcodetb_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `unitid` varchar(4) NOT NULL,
  `unitname` varchar(100) NOT NULL,
  `rsvd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`dictbmacunitcodetb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictbmacunitcodetb
-- ----------------------------

-- ----------------------------
-- Table structure for dictshopcodetb
-- ----------------------------
DROP TABLE IF EXISTS `dictshopcodetb`;
CREATE TABLE `dictshopcodetb` (
  `dictshopcodetb_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shopno` varchar(12) NOT NULL,
  `shopname` varchar(100) NOT NULL,
  `rsvd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`dictshopcodetb_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictshopcodetb
-- ----------------------------
INSERT INTO `dictshopcodetb` VALUES ('1', '000010000001', '北京联华快客便利超市有限公司', '75111005');
INSERT INTO `dictshopcodetb` VALUES ('2', '000010000002', '北京金凤成祥食品有限责任公司', '75111005');

-- ----------------------------
-- Table structure for dicttsmunitcodetb
-- ----------------------------
DROP TABLE IF EXISTS `dicttsmunitcodetb`;
CREATE TABLE `dicttsmunitcodetb` (
  `dicttsmunitcodetb_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `unitid` varchar(4) NOT NULL,
  `unitname` varchar(100) NOT NULL,
  `rsvd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`dicttsmunitcodetb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dicttsmunitcodetb
-- ----------------------------

-- ----------------------------
-- Table structure for machineinfo
-- ----------------------------
DROP TABLE IF EXISTS `machineinfo`;
CREATE TABLE `machineinfo` (
  `machineInfoId` bigint(20) NOT NULL,
  `deviceType` varchar(50) DEFAULT NULL,
  `deviceCompany` varchar(50) DEFAULT NULL,
  `recordTime` datetime DEFAULT NULL,
  `cardNumber` int(11) DEFAULT NULL,
  `busNumber` int(11) DEFAULT NULL,
  `subwayNumber` int(11) DEFAULT NULL,
  `usedInOtherIndustry` varchar(5) DEFAULT NULL,
  `hasComplain` varchar(5) DEFAULT NULL,
  `isFormal` varchar(5) DEFAULT NULL,
  `resv` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`machineInfoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of machineinfo
-- ----------------------------

-- ----------------------------
-- Table structure for mngoprlogtb
-- ----------------------------
DROP TABLE IF EXISTS `mngoprlogtb`;
CREATE TABLE `mngoprlogtb` (
  `mngoprlogtb_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `logseq` int(9) NOT NULL,
  `logtest` varchar(50) NOT NULL,
  `userid` varchar(20) NOT NULL,
  `sessionid` varchar(30) DEFAULT NULL,
  `funcid` varchar(50) NOT NULL,
  `funcname` varchar(50) NOT NULL,
  `opertype` varchar(3) DEFAULT NULL,
  `begtime` varchar(14) NOT NULL,
  `endtime` varchar(14) NOT NULL,
  `status` varchar(3) DEFAULT NULL,
  `rsvd` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`mngoprlogtb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mngoprlogtb
-- ----------------------------

-- ----------------------------
-- Table structure for mngusertb
-- ----------------------------
DROP TABLE IF EXISTS `mngusertb`;
CREATE TABLE `mngusertb` (
  `mngusertb_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `systemid` varchar(10) NOT NULL,
  `userid` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `garde` int(2) NOT NULL,
  `stat` int(2) NOT NULL,
  `rsvd` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`mngusertb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mngusertb
-- ----------------------------

-- ----------------------------
-- Table structure for tjtsmcardtxnjrltb
-- ----------------------------
DROP TABLE IF EXISTS `tjtsmcardtxnjrltb`;
CREATE TABLE `tjtsmcardtxnjrltb` (
  `tjtsmcardtxnjrltb_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fileid` varchar(40) NOT NULL,
  `fileno` varchar(5) NOT NULL,
  `unitno` varchar(4) NOT NULL,
  `filever` varchar(2) NOT NULL,
  `birthdate` varchar(8) NOT NULL,
  `cardno` varchar(20) NOT NULL,
  `cardtype` varchar(2) NOT NULL,
  `transdate` varchar(8) NOT NULL,
  `transtype` varchar(2) NOT NULL,
  `totalnum` int(8) NOT NULL,
  `totalsum` int(8) NOT NULL,
  `industrycode` varchar(4) DEFAULT NULL,
  `unitid` varchar(8) NOT NULL,
  `shopno` varchar(12) DEFAULT NULL,
  `kktype` varchar(2) DEFAULT NULL,
  `unitcode` varchar(4) DEFAULT NULL,
  `mobileno` varchar(20) DEFAULT NULL,
  `productcompany` varchar(20) DEFAULT NULL,
  `productmodel` varchar(20) DEFAULT NULL,
  `rsvd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`tjtsmcardtxnjrltb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tjtsmcardtxnjrltb
-- ----------------------------

-- ----------------------------
-- Table structure for _goods
-- ----------------------------
DROP TABLE IF EXISTS `_goods`;
CREATE TABLE `_goods` (
  `goods_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `title` varchar(120) NOT NULL COMMENT '商品名称',
  `state` int(11) NOT NULL COMMENT '商品状态',
  `price` float NOT NULL COMMENT '商品价格',
  `number` int(11) NOT NULL COMMENT '商品数量',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` time DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8 COMMENT='商品表';

-- ----------------------------
-- Records of _goods
-- ----------------------------
INSERT INTO `_goods` VALUES ('1000', 'iphone7', '1', '3999', '99', '2017-04-05 09:34:39', null);
INSERT INTO `_goods` VALUES ('1001', 'ipad3', '1', '1999', '2000', '2017-04-05 09:34:39', null);

-- ----------------------------
-- Table structure for _order
-- ----------------------------
DROP TABLE IF EXISTS `_order`;
CREATE TABLE `_order` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `user_id` bigint(20) NOT NULL COMMENT '用户ID',
  `goods_id` bigint(20) NOT NULL COMMENT '商品ID',
  `title` varchar(120) NOT NULL COMMENT '订单名称',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`order_id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_goods_id` (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Records of _order
-- ----------------------------

-- ----------------------------
-- Table structure for _user
-- ----------------------------
DROP TABLE IF EXISTS `_user`;
CREATE TABLE `_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(50) NOT NULL COMMENT '用户名',
  `user_phone` bigint(20) NOT NULL COMMENT '手机号',
  `score` int(11) NOT NULL COMMENT '积分',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`user_id`),
  KEY `idx_user_phone` (`user_phone`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of _user
-- ----------------------------
INSERT INTO `_user` VALUES ('1000', '阿坚', '18768128888', '7120', '2017-04-05 09:34:39');
INSERT INTO `_user` VALUES ('1001', '小明', '18968129999', '7120', '2017-04-05 09:34:39');

-- ----------------------------
-- Procedure structure for execute_buy
-- ----------------------------
DROP PROCEDURE IF EXISTS `execute_buy`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `execute_buy`(IN  v_user_id BIGINT, 
 IN  v_goods_id BIGINT,
 IN  v_title VARCHAR(120), 
 OUT r_result INT)
BEGIN
		DECLARE insert_count INT DEFAULT 0;
		START TRANSACTION;
		INSERT INTO _order (user_id, goods_id, title)
		VALUES(v_user_id, v_goods_id, v_title);
		SELECT ROW_COUNT() INTO insert_count;
		IF (insert_count = 0) THEN
			ROLLBACK;
			SET r_result = -1;
		ELSEIF (insert_count < 0) THEN
			ROLLBACK ;
			SET r_result = -2;
		ELSE
			UPDATE _goods SET number = number - 1
			WHERE goods_id = v_goods_id 
			AND number > 0;
			SELECT ROW_COUNT() INTO insert_count;
			IF (insert_count = 0) THEN
				ROLLBACK;
				SET r_result = 0;
			ELSEIF (insert_count < 0) THEN
				ROLLBACK;
				SET r_result = -2; 
			ELSE
				COMMIT;
			SET r_result = 1;
			END IF;
		END IF;
	END
;;
DELIMITER ;

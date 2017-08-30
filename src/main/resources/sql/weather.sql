/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : weather

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-08-30 15:36:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for weather
-- ----------------------------
DROP TABLE IF EXISTS `weather`;
CREATE TABLE `weather` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `citycode` varchar(100) DEFAULT NULL,
  `code_d` varchar(100) DEFAULT NULL,
  `code_n` varchar(100) DEFAULT NULL,
  `txt_d` varchar(100) DEFAULT NULL,
  `txt_n` varchar(100) DEFAULT NULL,
  `max` varchar(100) DEFAULT NULL,
  `min` varchar(100) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of weather
-- ----------------------------
INSERT INTO `weather` VALUES ('1', 'hz', '100', '104', '晴', '阴', '37', '25', '2017-08-27');
INSERT INTO `weather` VALUES ('2', 'hz', '100', '104', '晴', '阴', '37', '20', '2017-08-26');
INSERT INTO `weather` VALUES ('3', 'hz', '100', '100', '晴', '晴', '39', '20', '2017-08-25');
INSERT INTO `weather` VALUES ('4', 'hz', '100', '100', '晴22222', '晴666', '39', '20', '2017-08-25');
INSERT INTO `weather` VALUES ('5', 'hz', '100', '100', '晴', '晴', '37', '30', '2017-08-09');
INSERT INTO `weather` VALUES ('6', 'hz', '100', '100', '晴', '晴', '37', '30', '2017-08-09');
INSERT INTO `weather` VALUES ('7', 'hz', '100', '100', '晴', '晴', '37', '30', '2017-08-01');
INSERT INTO `weather` VALUES ('8', 'hz', '100', '100', '晴', '晴', '37', '30', '2017-08-01');
INSERT INTO `weather` VALUES ('103', '杭州', '100', '100', '晴', '晴', '', '0', '2017-08-01');
INSERT INTO `weather` VALUES ('104', '杭州', '100', '100', '晴', '晴', '37', '27', '2017-08-01');
INSERT INTO `weather` VALUES ('105', '杭州', '100', '100', '晴', '晴', '37', '27', '2017-08-28');
INSERT INTO `weather` VALUES ('106', '杭州', '100', '100', '晴', '晴', '37', '27', '2017-08-28');
INSERT INTO `weather` VALUES ('107', '杭州', '302', '101', '雷阵雨', '多云', '34', '26', '2017-08-29');
INSERT INTO `weather` VALUES ('108', '杭州', '302', '101', '雷阵雨', '多云', '34', '26', '2017-08-29');
INSERT INTO `weather` VALUES ('109', '杭州', '302', '101', '雷阵雨', '多云', '34', '26', '2017-08-29');
INSERT INTO `weather` VALUES ('110', '杭州', '302', '101', '雷阵雨', '多云', '34', '26', '2017-08-29');
INSERT INTO `weather` VALUES ('111', '杭州', '302', '101', '雷阵雨', '多云', '34', '26', '2017-08-29');
INSERT INTO `weather` VALUES ('112', '杭州', '302', '101', '雷阵雨', '多云', '34', '26', '2017-08-29');
INSERT INTO `weather` VALUES ('113', '杭州', '302', '101', '雷阵雨', '多云', '34', '26', '2017-08-29');
INSERT INTO `weather` VALUES ('114', 'CN101210101', '101', '104', '多云', '阴', '32', '25', '2017-08-30');

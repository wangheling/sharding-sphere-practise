/*
 Navicat Premium Data Transfer

 Source Server         : dev
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : 192.168.1.83:3306
 Source Schema         : sharding0

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : 65001

 Date: 24/12/2019 17:41:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_201910
-- ----------------------------
DROP TABLE IF EXISTS `user_201910`;
CREATE TABLE `user_201910`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` bigint(22) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user_201911
-- ----------------------------
DROP TABLE IF EXISTS `user_201911`;
CREATE TABLE `user_201911`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` bigint(22) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user_201912
-- ----------------------------
DROP TABLE IF EXISTS `user_201912`;
CREATE TABLE `user_201912`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` bigint(22) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;

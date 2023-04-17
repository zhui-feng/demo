# 题目一见测试类

# 题目二sql


DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
`id` int   NOT NULL AUTO_INCREMENT COMMENT '学生学号',
`name` varchar(20) COMMENT '学生姓名' ,
`gender` enum('M','F') DEFAULT NULL COMMENT '性别',
`age` int    COMMENT '年龄',
`class_id` int    COMMENT '学生所在班级id',
`native_place` varchar(20)   COMMENT '学生籍贯',
PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


# 题目三sql

DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
`id` int   NOT NULL AUTO_INCREMENT COMMENT '班级id',
`class_name` varchar(20) COMMENT '班级姓名' ,

PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci




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



DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
`id` int   NOT NULL AUTO_INCREMENT COMMENT '用户编号',
`name` varchar(20) COMMENT '用户姓名' ,
`nickname`  varchar(20) COMMENT '用户昵称',
`image_path` varchar(20)    COMMENT '头像路径',
`status` int    COMMENT '账号状态 0封禁 1正常 2删除',
`user_signature` varchar(20)   COMMENT '用户个性签名',
PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
`id` int   NOT NULL AUTO_INCREMENT COMMENT '物品编号',
`article_name` varchar(20) COMMENT '物品名称' ,
`article_type`  int COMMENT '物品所属类别',
`article_path` varchar(20)    COMMENT '物品图片路径',
`link_phone` varchar(20)   COMMENT   '物品联系方式',
`article_from` int  COMMENT '物品来源 1失物 2拾物',
`article_text` text COLLATE utf8mb4_unicode_ci  COMMENT '物品备注',
`article_day`  datetime COMMENT '物品时间',
PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
`id` int   NOT NULL AUTO_INCREMENT COMMENT '物品类别编号',
`type_name` varchar(20) COMMENT '物品类别名称' ,
PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


DROP TABLE IF EXISTS `image`;
CREATE TABLE `image` (
`id` int   NOT NULL AUTO_INCREMENT COMMENT '图片编号',
`image_id` varchar(20) COMMENT '生成的图片编号' ,
`image_type`  int COMMENT '图片类型 1头像图片  2物品图片',
`image_path` varchar(20)    COMMENT '物品图片路径',
PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;




DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
`id` int   NOT NULL AUTO_INCREMENT COMMENT '班级id',
`class_name` varchar(20) COMMENT '班级姓名' ,

PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci
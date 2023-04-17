package com.example.demo.api.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author guosheng
 * @Version 1.0
 */
@Data
@TableName(value = "student")
public class Student {


    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    private String name;


    private int age;

    @TableField(value = "gender")
    private SexEnum sexEnum;

    private int classId;

    private String nativePlace;
}

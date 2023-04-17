package com.example.demo.api.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author guosheng
 * @Version 1.0
 */
@Data
@TableName(value = "user")
public class User {


    @TableField(value = "id")
    private String id;


    @TableField(value = "name")
    private String name;


    @TableField(value = "email")
    private String email;
}

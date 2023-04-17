package com.example.demo.api.pojo;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @Author guosheng
 * @Version 1.0
 */
public enum SexEnum {

    MALE("M", "男"),
    FEMALE("F", "女");

    SexEnum(String gender, String value) {
        this.gender = gender;
        this.value = value;
    }

    /**
     * 标记数据库存的值是gender
     */
    @EnumValue
    @JsonValue
    private final String gender;

    /**
     * 要返回的值
     */


    private final String value;

    public String getGender() {
        return gender;
    }

    public String getValue() {
        return value;
    }


}

package com.example.demo.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.api.pojo.Class;

import java.util.Map;

/**
* @author sheng
* @description 针对表【class】的数据库操作Service
*/
public interface ClassService extends IService<Class> {

    int linkStudent(Map<String,String> map);

    int delLinkStudent(Map<String,String> map);
}

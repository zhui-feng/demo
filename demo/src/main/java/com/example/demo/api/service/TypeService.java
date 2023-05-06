package com.example.demo.api.service;

import com.example.demo.api.pojo.Type;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author sheng
* @description 针对表【type】的数据库操作Service
* @createDate 2023-05-06 11:56:33
*/
public interface TypeService extends IService<Type> {

    List<Type> getTypeList();

}

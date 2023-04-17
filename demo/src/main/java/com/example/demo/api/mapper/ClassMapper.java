package com.example.demo.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.api.pojo.Class;

/**
* @author sheng
* @description 针对表【class】的数据库操作Mapper
* @createDate 2023-04-17 10:30:38
* @Entity generator.api.Class
*/
public interface ClassMapper extends BaseMapper<Class> {

    int updateByClassId(String classId, String[] ids);

    int updateClassId(String[] idArray);
}





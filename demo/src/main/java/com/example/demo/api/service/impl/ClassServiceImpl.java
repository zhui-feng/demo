package com.example.demo.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.api.mapper.ClassMapper;
import com.example.demo.api.pojo.Class;
import com.example.demo.api.service.ClassService;
import com.example.demo.common.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;


/**
* @author sheng
* @description 针对表【class】的数据库操作Service实现
*/
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class>
    implements ClassService {

    @Resource
    private  ClassMapper classMapper;

    @Override
    public int linkStudent(Map<String,String> map) {

        String classId=map.get("classId");
        String[] ids=map.get("ids").split(",");


        int count = classMapper.updateByClassId(classId,ids);

       return  count;
    }

    @Override
    public int delLinkStudent(Map<String,String> map) {
        String[] idArray=map.get("ids").split(",");


        int count = classMapper.updateClassId(idArray);

        return  count;
    }
}





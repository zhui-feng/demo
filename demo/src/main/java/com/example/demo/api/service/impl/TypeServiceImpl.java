package com.example.demo.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.api.pojo.Student;
import com.example.demo.api.pojo.Type;
import com.example.demo.api.pojo.User;
import com.example.demo.api.service.TypeService;
import com.example.demo.api.mapper.TypeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author sheng
* @description 针对表【type】的数据库操作Service实现
* @createDate 2023-05-06 11:56:33
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<Type> getTypeList() {

        QueryWrapper<Type> queryWrapper=new QueryWrapper<>();
        List<Type> typeList=typeMapper.selectList(queryWrapper);
        return typeList;
    }
}





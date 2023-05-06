package com.example.demo.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.api.mapper.StudentMapper;
import com.example.demo.api.pojo.Student;
import com.example.demo.api.pojo.User;
import com.example.demo.api.mapper.UserMapper;
import com.example.demo.api.service.UserService;
import com.example.demo.common.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author sheng
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-05-05 16:14:27
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public Result<User> registerUser(User user) {

        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();
        userQueryWrapper.eq("nickname",user.getNickname());


        Long count=userMapper.selectCount(userQueryWrapper);
        if(count.intValue()>0){
            return Result.failure(Result.ADD_FAIL, "该用户名已被注册");
        }


        int insertCount = userMapper.insert(user);
        if(insertCount>0){
            return Result.failure(Result.OK, "注册成功");
        }else{
            return Result.failure(Result.NO, "注册失败");
        }

    }

    @Override
    public Result loginUser(User user) {
        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();
        userQueryWrapper.eq("nickname",user.getNickname());
        userQueryWrapper.eq("password",user.getPassword());


        Long count=userMapper.selectCount(userQueryWrapper);
        if(count.intValue()>0){
            return Result.failure(Result.OK, "登录成功");
        } else{
            return Result.failure(Result.NO, "登录失败");
        }
    }
}





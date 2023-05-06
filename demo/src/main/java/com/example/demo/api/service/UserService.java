package com.example.demo.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.api.pojo.User;
import com.example.demo.common.Result;

/**
* @author sheng
* @description 针对表【user】的数据库操作Service
* @createDate 2023-05-05 16:14:27
*/
public interface UserService extends IService<User> {

    Result<User> registerUser(User user);

    Result loginUser(User user);
}

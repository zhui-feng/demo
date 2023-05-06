package com.example.demo.api.controller;

import com.example.demo.api.pojo.Student;
import com.example.demo.api.pojo.User;
import com.example.demo.api.service.StudentService;
import com.example.demo.api.service.UserService;
import com.example.demo.common.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author guosheng
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    /**
     * 注册用户
     */

    @PostMapping(value = "/addUser")
    public Result registerUser(@RequestBody User user) {
        try {




            return userService.registerUser(user);

        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(Result.ADD_FAIL, "注册异常");
        }

    }


    /**
     * 用户登录
     */

    @PostMapping(value = "/loginUser")
    public Result loginUser(@RequestBody User user) {
        try {




            return userService.loginUser(user);

        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(Result.ADD_FAIL, "登录异常");
        }

    }
}

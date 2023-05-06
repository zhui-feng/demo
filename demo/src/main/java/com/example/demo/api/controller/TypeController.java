package com.example.demo.api.controller;

import com.example.demo.api.pojo.Student;
import com.example.demo.api.pojo.Type;
import com.example.demo.api.pojo.User;
import com.example.demo.api.service.TypeService;
import com.example.demo.api.service.UserService;
import com.example.demo.common.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author guosheng
 * @Version 1.0
 */
@RestController
@RequestMapping("/type")
public class TypeController {



    @Resource
    private TypeService typeService;

    /**
     * 获取图标列表
     */

    @PostMapping(value = "/getTypeList")
    public Result getTypeList() {
        try {

            List<Type>  typeList;

            typeList = typeService.getTypeList();

            return Result.failure(Result.ADD_FAIL, "查询成功",typeList);

        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(Result.ADD_FAIL, "查询异常");
        }


    }
}

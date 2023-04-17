package com.example.demo.api.controller;

import com.example.demo.api.pojo.Student;
import com.example.demo.api.service.ClassService;
import com.example.demo.common.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author guosheng
 * @Version 1.0
 */
@RestController
@RequestMapping("/class")
public class ClassController {

    @Resource
    private ClassService classService;


    /**
     * 班级关联学生
     */

    @PostMapping(value = "/linkStudent")
    public Result linkStudent(@RequestBody Map<String,String> map) {
        try {
            int code = classService.linkStudent(map);

            if (code >0) {
                return Result.failure(Result.OK, "关联成功");
            }else{
                return Result.failure("关联失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(Result.ADD_FAIL, "关联失败");
        }

    }


    /**
     * 班级去除关联
     */

    @PostMapping(value = "/delLinkStudent")
    public Result delLinkStudent(@RequestBody Map<String,String> map) {
        try {
            int code = classService.delLinkStudent(map);

            if (code >0) {
                return Result.failure(Result.OK, "去除关联成功");
            }else{
                return Result.failure("去除关联失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(Result.ADD_FAIL, "去除关联失败");
        }

    }
}

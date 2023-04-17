package com.example.demo.api.controller;

import com.example.demo.api.pojo.Student;
import com.example.demo.api.service.StudentService;
import com.example.demo.common.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author guosheng
 * @Version 1.0
 */
@RestController
@RequestMapping("/student")
public class StudentController {


    @Resource
    private StudentService studentService;


    /**
     * 添加学生
     */

    @PostMapping(value = "/addStudent")
    public Result addUser(@RequestBody Student student) {
        try {
            int userAddResult = studentService.addStudent(student);


            if (userAddResult != 1) {
                return Result.failure(Result.ADD_FAIL, "添加失败");
            }
            return Result.success(Result.OK, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(Result.ADD_FAIL, "添加失败");
        }

    }


    /**
     * 删除学生
     */

    @GetMapping(value = "/delStudent")
    public Result delStudent(int id) {
        try {
            int userAddResult = studentService.delStudent(id);


            if (userAddResult != 1) {
                return Result.failure(Result.ADD_FAIL, "删除失败");
            }
            return Result.success(Result.OK, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(Result.ADD_FAIL, "删除失败");
        }

    }


    /**
     * 修改学生
     */

    @PostMapping(value = "/editStudent")
    public Result editStudent(@RequestBody Student student) {
        try {
            int userAddResult = studentService.editStudent(student);


            if (userAddResult != 1) {
                return Result.failure(Result.ADD_FAIL, "修改失败");
            }
            return Result.success(Result.OK, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(Result.ADD_FAIL, "修改失败");
        }

    }



    /**
     * 查询学生列表
     */

    @PostMapping(value = "/getStudentList")
    public Result getStudentList(@RequestBody Map map) {
        List<Student> studentList;
        try {
            studentList = studentService.getStudentList(map);


            return Result.failure(Result.ADD_FAIL, "查询成功",studentList);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(Result.ADD_FAIL, "查询失败");
        }

    }
}

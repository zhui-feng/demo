package com.example.demo.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.api.pojo.Student;

import java.util.List;
import java.util.Map;

/**
* @author sheng
* @description 针对表【student】的数据库操作Service
*/
public interface StudentService extends IService<Student> {

    int addStudent(Student student);

    int delStudent(int id);

    int editStudent(Student student);

    List<Student> getStudentList(Map map);
}

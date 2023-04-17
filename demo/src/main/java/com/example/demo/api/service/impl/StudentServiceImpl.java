package com.example.demo.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.api.mapper.StudentMapper;
import com.example.demo.api.pojo.SexEnum;
import com.example.demo.api.pojo.Student;
import com.example.demo.api.service.StudentService;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @author sheng
* @description 针对表【student】的数据库操作Service实现
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public int addStudent(Student student) {

//        student.setName("小红");
//        student.setAge(20);
//
//        student.setNativePlace("安徽");

        int insert = studentMapper.insert(student);


        return insert;
    }

    @Override
    public int delStudent(int id) {
        int result = studentMapper.deleteById(id);


        return result;
    }

    @Override
    public int editStudent(Student student) {
        int result = studentMapper.updateById(student);

        return result;
    }

    @Override
    public List<Student> getStudentList(Map map) {
        List<Student> studentList=studentMapper.selectByMap(map);
        return studentList;
    }
}





package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Student;

import java.util.List;

/**
 * 学员表(Student)表服务接口
 *
 * @author makejava
 * @since 2021-06-03 19:50:17
 */
public interface StudentService {

    Student queryById(Integer studentId);

    List<Student> queryAllByLimit(int offset, int limit);

    Student insert(Student student);

    Student update(Student student);

    boolean deleteById(Integer studentId);

}

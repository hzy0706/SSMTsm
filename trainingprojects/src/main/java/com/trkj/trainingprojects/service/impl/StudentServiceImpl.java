package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.StudentDao;
import com.trkj.trainingprojects.entity.Student;
import com.trkj.trainingprojects.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryById(Integer studentId) {
        return null;
    }

    @Override
    public List<Student> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Student insert(Student student) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public boolean deleteById(Integer studentId) {
        return false;
    }
}

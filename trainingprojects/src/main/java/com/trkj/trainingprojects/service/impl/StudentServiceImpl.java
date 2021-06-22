package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.StudentDao;
import com.trkj.trainingprojects.dao.StudentstatusDao;
import com.trkj.trainingprojects.entity.Student;
import com.trkj.trainingprojects.service.StudentService;
import com.trkj.trainingprojects.vo.CourseDetailsVo;
import com.trkj.trainingprojects.vo.StudentVo;
import com.trkj.trainingprojects.vo.StudentstatusVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Resource
    private StudentstatusDao studentstatusDao;

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

    @Override
    public List<StudentVo> SelectStudentByClassId(int classId) {
        return studentDao.SelectStudentByClassId(classId);
    }

    @Override
    public List<StudentVo> SelectStudentByState() {
        return studentDao.SelectStudentByState();
    }
    @Override
    public List<StudentVo> selectAllStudent() {
        return studentDao.selectAllStudent();
    }

    @Override
    public List<StudentVo> SelectStudentByState2(Integer classesId) {
        return studentDao.SelectStudentByState2(classesId);
    }

    @Override
    public int updateByStudent(StudentVo studentVo) {
        return studentDao.updateByStudent(studentVo);
    }

    @Override
    @Transactional
    public int addStudents(StudentVo studentVo) {
        studentDao.insert(studentVo);
        Date date = new Date();
        StudentstatusVo studentstatusVo = new StudentstatusVo();
        studentstatusVo.setStudentId(studentVo.getStudentId());
        studentstatusVo.setStatus(0);
        studentstatusVo.setAllottype("初次分班");
        studentstatusVo.setApproval(0);
        studentstatusVo.setAddtime(date);
        studentstatusVo.setTimeliness(0);
        studentstatusVo.setCourseId(Integer.valueOf(studentVo.getDeletename()));
        studentstatusVo.setAddname(studentVo.getAddname());
        studentstatusDao.insert(studentstatusVo);
        studentDao.updateByStudentDelName(studentVo);
        return 0;
    }
}

package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.StudentstatusDao;
import com.trkj.trainingprojects.entity.Studentstatus;
import com.trkj.trainingprojects.service.StudentstatusService;
import com.trkj.trainingprojects.vo.StudentstatusVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class StudentstatusServiceImpl implements StudentstatusService {
    @Resource
    private StudentstatusDao studentstatusDao;
    @Override
    public List<StudentstatusVo> selectStudentStatusByStudentId(Integer studentstatusId) {
        return studentstatusDao.selectStudentStatusByStudentId(studentstatusId);
    }

    @Override
    public List<Studentstatus> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Studentstatus insert(Studentstatus studentstatus) {
        return null;
    }

    @Override
    public Studentstatus update(Studentstatus studentstatus) {
        return null;
    }

    @Override
    public boolean deleteById(Integer studentstatusId) {
        return false;
    }

    @Override
    public List<StudentstatusVo> selectAllStudentStatus() {
        return studentstatusDao.selectAllStudentStatus();
    }

    @Override
    public void addStudentStatus(StudentstatusVo studentstatusVo) {
        studentstatusDao.insert(studentstatusVo);
    }

    @Override
    public int updateByStudentStatus(StudentstatusVo studentstatusVo) {
        return studentstatusDao.updateByStudentStatus(studentstatusVo);
    }

    @Override
    public int updateByStudentRemarks(StudentstatusVo studentstatusVo) {
        return studentstatusDao.updateByStudentRemarks(studentstatusVo);
    }

    @Override
    public int updateByStudentStateOne(StudentstatusVo studentstatusVo) {
        return studentstatusDao.updateByStudentStateOne(studentstatusVo);
    }

    @Override
    public List<StudentstatusVo> selectStudentStatusByClassesId(Integer classesId) {
        return studentstatusDao.selectStudentStatusByClassesId(classesId);
    }
}

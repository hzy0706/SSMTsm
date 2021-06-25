package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.StudentstatusDao;
import com.trkj.trainingprojects.entity.Studentstatus;
import com.trkj.trainingprojects.service.StudentstatusService;
import com.trkj.trainingprojects.vo.ShiftVo;
import com.trkj.trainingprojects.vo.StudentstatusVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public int updateByStudentStateTwo(StudentstatusVo record) {
        return studentstatusDao.updateByStudentStateTwo(record);
    }

    @Override
    public List<StudentstatusVo> selectStudentStatusByClassesId(Integer classesId) {
        return studentstatusDao.selectStudentStatusByClassesId(classesId);
    }

    @Override
    public List<StudentstatusVo> selectStudentStatusByClassesId2(Integer classesId) {
        return studentstatusDao.selectStudentStatusByClassesId2(classesId);
    }

    @Override
    public int updateByClassesIdOnState(StudentstatusVo studentstatusVo) {
        return studentstatusDao.updateByClassesIdOnState(studentstatusVo);
    }

    @Override
    public List<StudentstatusVo> queryByStudentId(int studentId) {
        return studentstatusDao.queryByStudentId(studentId);
    }
    @Transactional
    @Override
    public int appByClassesIdOnClassesId(Integer classesId, Integer studentId, Integer classesId2,Integer status) {
        return studentstatusDao.updateByClassesIdOnClassesId(classesId,studentId,classesId2,status);
    }

    @Override
    public StudentstatusVo selectByClassesIdOnClassesId(Integer classesId, Integer studentId) {
        return studentstatusDao.selectByClassesIdOnClassesId(classesId,studentId);
    }

    @Transactional
    @Override
    public int updateByClassesIdAndStudentIdOnState(Integer classesId, Integer studentId,Integer status) {
        return studentstatusDao.updateByClassesIdAndStudentIdOnState(classesId,studentId,status);
    }
}

package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.StudentoutstandingDao;
import com.trkj.trainingprojects.entity.Studentoutstanding;
import com.trkj.trainingprojects.service.StudentoutstandingService;
import com.trkj.trainingprojects.vo.StudentoutstandingVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class StudentoutstandingServiceImpl implements StudentoutstandingService {
    @Resource
    private StudentoutstandingDao studentoutstandingDao;
    @Override
    public Studentoutstanding queryById(Integer outstandingId) {
        return null;
    }

    @Override
    public List<Studentoutstanding> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public int insert(StudentoutstandingVo studentoutstandingVo) {
        return studentoutstandingDao.insert(studentoutstandingVo);
    }

    @Override
    public Studentoutstanding update(Studentoutstanding studentoutstanding) {
        return null;
    }

    @Override
    public boolean deleteById(Integer outstandingId) {
        return false;
    }

    @Override
    public List<StudentoutstandingVo> selectAllStudentOutStanding() {
        return studentoutstandingDao.selectAllStudentOutStanding();
    }

    @Override
    public void addStudentoutstanding(StudentoutstandingVo studentoutstandingVo) {
        studentoutstandingDao.insert(studentoutstandingVo);
    }
}

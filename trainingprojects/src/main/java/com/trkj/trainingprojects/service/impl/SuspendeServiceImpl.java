package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.BackDao;
import com.trkj.trainingprojects.dao.StudentstatusDao;
import com.trkj.trainingprojects.dao.SuspendeDao;
import com.trkj.trainingprojects.service.SuspendeService;
import com.trkj.trainingprojects.vo.BackVo;
import com.trkj.trainingprojects.vo.StudentstatusVo;
import com.trkj.trainingprojects.vo.SuspendeVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SuspendeServiceImpl implements SuspendeService {
    @Resource
    private SuspendeDao suspendeDao;
    @Resource
    private StudentstatusDao studentstatusDao;
    @Resource
    private BackDao backDao;

    @Transactional
    @Override
    public int addSuspende(SuspendeVo record) {
        System.out.println("________---------++++++++++-=============="+record.toString());
         suspendeDao.addSuspende(record);
        System.out.println("________---------++++++++++-=============="+record.toString());
        return 0;
    }

    @Override
    public SuspendeVo selectBySuspendeKey(Integer suspendeId) {
        return suspendeDao.selectBySuspendeKey(suspendeId);
    }

    @Transactional
    @Override
    public int updateBySuspendeKeySelective(SuspendeVo record) {
        return suspendeDao.updateBySuspendeKeySelective(record);
    }

    @Transactional
    @Override
    public int deleteBySuspendeKey(SuspendeVo record) {
        return suspendeDao.updateBySuspendeKey(record);
    }

    @Override
    public List<SuspendeVo> selectBySuspendeKeyClasses(Integer classesId) {
        return suspendeDao.selectBySuspendeKeyClasses(classesId);
    }

    @Override
    public List<SuspendeVo> selectBySuspendeKeyStudent(Integer studentId) {
        return suspendeDao.selectBySuspendeKeyStudent(studentId);
    }

    @Override
    public List<SuspendeVo> selectBySuspendeKeyCourse(Integer courseId) {
        return suspendeDao.selectBySuspendeKeyCourse(courseId);
    }

    @Override
    public List<SuspendeVo> selectBySuspendeKeyCoursedetails(Integer coursedetailsId) {
        return suspendeDao.selectBySuspendeKeyCoursedetails(coursedetailsId);
    }

    @Override
    public List<SuspendeVo> selectBySuspendeKeyStudentStatus(Integer studentstatusId) {
        return suspendeDao.selectBySuspendeKeyStudentStatus(studentstatusId);
    }

    @Override
    public List<SuspendeVo> selectBySuspendeKeyStudents() {
        return suspendeDao.selectBySuspendeKeyStudents();
    }

    @Override
    public SuspendeVo selectBySuspendeId(Integer suspendeId) {
        return suspendeDao.selectBySuspendeId(suspendeId);
    }

    @Transactional
    @Override
    public int appBySuspende(SuspendeVo record) {
        StudentstatusVo studentstatusVo=studentstatusDao.selectByClassesIdOnClassesId(record.getClassesId(),record.getStudentId());
        int a = studentstatusDao.OnupdateByClassesIdAndStudentIdOnState(record.getClassesId(),record.getStudentId(),3);
        return suspendeDao.appBySuspende(record);
    }

    @Transactional
    @Override
    public int NoAppBySuspende(SuspendeVo record) {
        return suspendeDao.NoAppBySuspende(record);
    }

    @Transactional
    @Override
    public int deleteOneBySuspendeKey(SuspendeVo record) {
        return suspendeDao.updateOneBySuspendeKey(record);
    }

    @Transactional
    @Override
    public int OnUpdateBackState(SuspendeVo record) {
        SuspendeVo suspendeVo = suspendeDao.selectBySuspendeId(record.getSuspendeId());
        BackVo backVo = new BackVo();
        backVo.setAbsent(1);
        backVo.setClassalreadyon(20);
        backVo.setAddname(record.getAddname());
        backVo.setBackTime(record.getDeletetime());
        backVo.setStudentId(record.getStudentId());
        backVo.setSuspendeId(record.getSuspendeId());
        backVo.setClassesId(record.getClassesId());
        int a = backDao.addBack(backVo);
        return suspendeDao.OnUpdateBackState(record);
    }
}

package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ClassesDao;
import com.trkj.trainingprojects.dao.ShiftDao;
import com.trkj.trainingprojects.dao.StudentstatusDao;
import com.trkj.trainingprojects.service.ShiftService;
import com.trkj.trainingprojects.vo.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Service
public class ShiftServiceImpl implements ShiftService {
    @Resource
    private ShiftDao shiftDao;

    @Resource
    private StudentstatusDao studentstatusDao;

    @Resource
    private ClassesDao classesDao;


    @Override
    @Transactional
    public int addShift(ShiftVo record) {
        StudentstatusVo studentstatusVo=studentstatusDao.selectByClassesIdOnClassesId(record.getClassesId(),record.getStudentId());
        int b=studentstatusDao.updateByClassesIdAndStudentIdOnState(studentstatusVo.getClassesId(),studentstatusVo.getStudentId(),5);

        return shiftDao.addShift(record);
    }

    @Override
    public ShiftVo selectByShiftKey(Integer shiftId) {
        return shiftDao.selectByShiftKey(shiftId);
    }

    @Override
    @Transactional
    public int updateByShiftKeySelective(ShiftVo record) {
        return shiftDao.updateByShiftKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByShiftKey(ShiftVo record) {
        return shiftDao.updateByShiftKey(record);
    }

    @Override
    public List<ShiftVo> selectAllShifts() {
        return shiftDao.selectAllShifts();
    }

    @Override
    public List<ShiftVo> selectByShiftStudentId(Integer studentId) {
        return shiftDao.selectByShiftStudentId(studentId);
    }

    @Override
    public List<ShiftVo> selectByShiftstudentstatusId(Integer studentstatusId) {
        return shiftDao.selectByShiftstudentstatusId(studentstatusId);
    }

    @Override
    public List<ShiftVo> selectByShiftClassesId(Integer classesId) {
        return shiftDao.selectByShiftClassesId(classesId);
    }

    @Override
    @Transactional
    public int appByTypeShiftKey2(ShiftVo record) {
        StudentstatusVo studentstatusVo=studentstatusDao.selectByClassesIdOnClassesId(record.getClassesId(),record.getStudentId());
        int a = studentstatusDao.updateByClassesIdOnClassesId(studentstatusVo.getClassesId(),studentstatusVo.getStudentId(),record.getClassesId2(),2);
        ClassesVo classesVo=classesDao.queryById2(record.getClassesId());
        classesVo.setClassestudents(classesVo.getClassestudents()-1);
        classesDao.updateClassesIdOnClasseStudents(classesVo);
        ClassesVo classesVo2=classesDao.queryById2(record.getClassesId2());
        classesVo2.setClassestudents(classesVo2.getClassestudents()+1);
        classesDao.updateClassesIdOnClasseStudents(classesVo2);
        return shiftDao.appByTypeShiftKey2(record);
    }

    @PutMapping("/updateByStudentStateTwo")
    public AjaxResponse updateByStudentStateTwo(@RequestBody @Valid StudentstatusVo studentstatusVo){
        studentstatusDao.updateByStudentStateTwo(studentstatusVo);
        return AjaxResponse.success(studentstatusVo);
    }


    @Override
    @Transactional
    public int updateByTypeShiftKey3(ShiftVo record) {
        return shiftDao.updateByTypeShiftKey3(record);
    }

    @Override
    @Transactional
    public int deleteByTypeShiftKey5(ShiftVo record) {
        return shiftDao.updateByTypeShiftKey5(record);
    }
}

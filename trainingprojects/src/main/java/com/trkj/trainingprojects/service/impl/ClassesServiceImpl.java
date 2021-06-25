package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ClassesDao;
import com.trkj.trainingprojects.entity.Classes;
import com.trkj.trainingprojects.service.ClassesService;
import com.trkj.trainingprojects.vo.ClassesVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class ClassesServiceImpl implements ClassesService {
    @Resource
    private ClassesDao classesDao;
    @Override
    public Classes queryById(Integer classesId) {
        return null;
    }

    @Override
    public List<Classes> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Classes insert(Classes classes) {
        return null;
    }

    @Override
    public Classes update(Classes classes) {
        return null;
    }

    @Override
    public boolean deleteById(Integer classesId) {
        return false;
    }

    @Override
    public List<ClassesVo> selectAllClasses() {
        return classesDao.selectAllClasses();
    }

    @Override
    @Transactional
    public void addClasses(ClassesVo classesVo) {
        classesDao.insert(classesVo);
    }

    @Override
    @Transactional
    public int deleteByClasses(ClassesVo classesVo) {
        return classesDao.deleteByClasses(classesVo);
    }

    @Override
    @Transactional
    public int updateClassesKey(ClassesVo classesVo) {
        return classesDao.updateClassesKey(classesVo);
    }

    @Override
    public List<ClassesVo> selectAllClassesByState() {
        return classesDao.selectAllClassesByState();
    }

    @Override
    public List<ClassesVo> selectAllClassesByNumber() {
        return classesDao.selectAllClassesByNumber();
    }

    @Override
    public List<ClassesVo> selectAllClassesByState2() {
        return classesDao.selectAllClassesByState2();
    }

    @Override
    public int deleteByOpenClasses(ClassesVo classesVo) {
        return classesDao.deleteByOpenClasses(classesVo);
    }

    @Override
    public List<ClassesVo> selectClassesById(Integer courseId) {
        return classesDao.queryById(courseId);
    }

    @Override
    public ClassesVo selectClassesNumber(Integer classesId) {
        return classesDao.queryById2(classesId);
    }

    @Override
    public int UpdateAddClassesStudentNumber(ClassesVo classesVo) {
        return classesDao.UpdateAddClassesStudentNumber(classesVo);
    }
}

package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ClassTypeDao;
import com.trkj.trainingprojects.entity.ClassType;
import com.trkj.trainingprojects.service.ClassTypeService;
import com.trkj.trainingprojects.vo.ClassTypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ClassTypeServiceImpl implements ClassTypeService {
    @Resource
    private ClassTypeDao classtypeDao;

    @Override
    public ClassType queryById(Integer classtypeId) {
        return null;
    }

    @Override
    public List<ClassType> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    @Transactional
    public void addClassType(ClassTypeVo classtypeVo) {
        classtypeDao.insert(classtypeVo);
    }

    @Override
    @Transactional
    public int updateByClassTypeKey(ClassTypeVo classTypeVo) {
        return classtypeDao.updateByClassTypeKey(classTypeVo);
    }

    @Override
    @Transactional
    public int deleteByClassType(ClassTypeVo classTypeVo) {
        return  classtypeDao.deleteByClassType(classTypeVo);
    }

    @Override
    public boolean deleteById(Integer classtypeId) {
        return false;
    }

    @Override
    public List<ClassTypeVo> selectAllClassTypes() {
        return classtypeDao.selectAllClassTypes();
    }
}

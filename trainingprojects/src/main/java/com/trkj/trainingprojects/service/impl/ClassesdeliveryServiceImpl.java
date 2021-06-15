package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ClassesdeliveryDao;
import com.trkj.trainingprojects.service.ClassesdeliveryService;
import com.trkj.trainingprojects.vo.ClassesdeliveryVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassesdeliveryServiceImpl implements ClassesdeliveryService {
    @Resource
    private ClassesdeliveryDao classesdeliveryDao;
    @Override
    @Transactional
    public int addClassesdelivery(ClassesdeliveryVo record) {
        return classesdeliveryDao.addClassesdelivery(record);
    }

    @Override
    public ClassesdeliveryVo selectByClassesdeliveryKey(Integer classesdeliveryId) {
        return classesdeliveryDao.selectByClassesdeliveryKey(classesdeliveryId);
    }

    @Override
    public List<ClassesdeliveryVo> selectAllClassesdeliverys(Integer approval, String value) {
        return classesdeliveryDao.selectAllClassesdeliverys(approval,value);
    }

    @Override
    @Transactional
    public int updateByClassesdeliveryKeySelective(ClassesdeliveryVo record) {
        return classesdeliveryDao.updateByClassesdeliveryKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByClassesdeliveryKey(ClassesdeliveryVo record) {
        return classesdeliveryDao.updateByClassesdeliveryKey(record);
    }

    @Override
    @Transactional
    public int appByClassesdeliveryKey(ClassesdeliveryVo record) {
        return classesdeliveryDao.appByClassesdeliveryKey(record);
    }
}

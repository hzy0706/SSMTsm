package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.ClassesdeliveryVo;

import java.util.List;

public interface ClassesdeliveryService {
    int addClassesdelivery(ClassesdeliveryVo record);

    ClassesdeliveryVo selectByClassesdeliveryKey(Integer classesdeliveryId);

    List<ClassesdeliveryVo> selectAllClassesdeliverys(Integer approval, String value);

    int updateByClassesdeliveryKeySelective(ClassesdeliveryVo record);

    int deleteByClassesdeliveryKey(ClassesdeliveryVo record);

    void appByClassesdeliveryKey(ClassesdeliveryVo record);
}

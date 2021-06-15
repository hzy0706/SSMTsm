package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.ClassesdeliveryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassesdeliveryDao {

    int addClassesdelivery(ClassesdeliveryVo record);

    ClassesdeliveryVo selectByClassesdeliveryKey(Integer classesdeliveryId);

    List<ClassesdeliveryVo> selectAllClassesdeliverys(Integer approval,String value);

    int updateByClassesdeliveryKeySelective(ClassesdeliveryVo record);

    int updateByClassesdeliveryKey(ClassesdeliveryVo record);

    int appByClassesdeliveryKey(ClassesdeliveryVo record);
}
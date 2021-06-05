package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.ClassType;
import com.trkj.trainingprojects.vo.ClassTypeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClassTypeDao {

    ClassType queryById(Integer classtypeId);

    List<ClassType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<ClassType> queryAll(ClassType classtype);

    int insert(ClassTypeVo classtypeVo);

    int insertBatch(@Param("entities") List<ClassType> entities);

    int insertOrUpdateBatch(@Param("entities") List<ClassType> entities);

    int updateByClassTypeKey(ClassTypeVo classTypeVo);
    int deleteById(Integer classTypeId);
    List<ClassTypeVo> selectAllClassTypes();
    int deleteByClassType(ClassTypeVo classTypeVo);
}


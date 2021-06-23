package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Classes;
import com.trkj.trainingprojects.vo.ClassesVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 班级表(Classes)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-02 12:42:36
 */
@Mapper
public interface ClassesDao {

    List<ClassesVo> queryById(Integer courseId);
    ClassesVo queryById2(Integer classesId);

    List<Classes> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Classes> queryAll(Classes classes);

    int insert(ClassesVo classesVo);

    int insertBatch(@Param("entities") List<Classes> entities);

    int insertOrUpdateBatch(@Param("entities") List<Classes> entities);

    int updateClassesKey(ClassesVo classesVo);

    int deleteById(Integer classesId);

    List<ClassesVo> selectAllClasses();
    int deleteByClasses(ClassesVo classesVo);
    List<ClassesVo> selectAllClassesByState();
    List<ClassesVo> selectAllClassesByState2();
    int deleteByOpenClasses(ClassesVo classesVo);
    int UpdateAddClassesStudentNumber(ClassesVo classesVo);
}


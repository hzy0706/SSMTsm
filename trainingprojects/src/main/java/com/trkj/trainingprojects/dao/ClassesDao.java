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

    Classes queryById(Integer classesId);

    List<Classes> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Classes> queryAll(Classes classes);

    int insert(ClassesVo classesVo);

    int insertBatch(@Param("entities") List<Classes> entities);

    int insertOrUpdateBatch(@Param("entities") List<Classes> entities);

    int updateClassesKey(ClassesVo classesVo);

    int deleteById(Integer classesId);

    List<ClassesVo> selectAllClasses();

    //查询所有开办状态为0或者1的班级信息（胡志远）
    List<ClassesVo> selectAllClassesByState();

    int deleteByClasses(ClassesVo classesVo);
}


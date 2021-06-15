package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Student;
import com.trkj.trainingprojects.vo.StudentVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学员表(Student)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-03 19:50:16
 */
@Mapper
public interface StudentDao {

    Student queryById(Integer studentId);

    List<Student> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Student> queryAll(Student student);

    int insert(Student student);

    int insertBatch(@Param("entities") List<Student> entities);

    int insertOrUpdateBatch(@Param("entities") List<Student> entities);

    int update(Student student);

    int deleteById(Integer studentId);

    List<StudentVo> SelectStudentByClassId(int classId);

}


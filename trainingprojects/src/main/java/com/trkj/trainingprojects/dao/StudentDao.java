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

    List<Student> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Student> queryAll(Student student);

    int insert(StudentVo studentVo);

    int insertBatch(@Param("entities") List<Student> entities);

    int insertOrUpdateBatch(@Param("entities") List<Student> entities);

    int updateByStudentKey(StudentVo studentVo);

    int deleteById(Integer studentId);

    List<StudentVo> SelectStudentByClassId(int classId);

    List<StudentVo> SelectStudentByState();

    List<StudentVo> selectAllStudent();

    List<StudentVo> SelectStudentByState2(Integer classesId);

    int updateByStudentDelName(StudentVo studentVo);
    int updateByStudent(StudentVo studentVo);
    StudentVo queryById(int registerId);
    /**
     * 根据生源查学员
     * @return
     */
    List<StudentVo> selectStudentCource(Integer SourceId);
    int updateByStudentImg(StudentVo studentVo);
}


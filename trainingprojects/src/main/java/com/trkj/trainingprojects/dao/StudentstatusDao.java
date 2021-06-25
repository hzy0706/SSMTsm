package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Studentstatus;
import com.trkj.trainingprojects.vo.StudentstatusVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学员分班表(Studentstatus)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-17 16:44:44
 */
@Mapper
public interface StudentstatusDao {

    List<StudentstatusVo> selectStudentStatusByStudentId(Integer studentstatusId);

    List<Studentstatus> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Studentstatus> queryAll(Studentstatus studentstatus);

    int insert(StudentstatusVo studentstatusVo);

    int insertBatch(@Param("entities") List<Studentstatus> entities);

    int insertOrUpdateBatch(@Param("entities") List<Studentstatus> entities);

    int update(Studentstatus studentstatus);

    int deleteById(@Param("courseId") int courseId,@Param("studentId") int studentId);

    List<StudentstatusVo> selectAllStudentStatus();
    int updateByStudentStatus(StudentstatusVo studentstatusVo);
    int updateByStudentRemarks(StudentstatusVo studentstatusVo);
    int updateByStudentStateOne(StudentstatusVo studentstatusVo);

    int updateByStudentStateTwo(StudentstatusVo record);

    List<StudentstatusVo> selectStudentStatusByClassesId(Integer classesId);
    List<StudentstatusVo> selectStudentStatusByClassesId2(Integer classesId);
    int updateByClassesIdOnState(StudentstatusVo studentstatusVo);
    List<StudentstatusVo> queryByStudentId(int studentId);
    int updateByClassesIdOnClassesId(@Param("classesId") Integer classesId,@Param("studentId") Integer studentId,@Param("classesId2") Integer classesId2, @Param("status") Integer status );
    StudentstatusVo selectByClassesIdOnClassesId(@Param("classesId") Integer classesId,@Param("studentId") Integer studentId);

    int updateByClassesIdAndStudentIdOnState(@Param("classesId") Integer classesId,@Param("studentId") Integer studentId, @Param("status") Integer status );


}


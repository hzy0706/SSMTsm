package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Studentstatus;
import com.trkj.trainingprojects.vo.StudentstatusVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学员分班表(Studentstatus)表服务接口
 *
 * @author makejava
 * @since 2021-06-17 16:44:45
 */
public interface StudentstatusService {

    List<StudentstatusVo> selectStudentStatusByStudentId(Integer studentstatusId);

    List<Studentstatus> queryAllByLimit(int offset, int limit);

    Studentstatus insert(Studentstatus studentstatus);

    Studentstatus update(Studentstatus studentstatus);

    boolean deleteById(Integer studentstatusId);

    public List<StudentstatusVo> selectAllStudentStatus();
    public void addStudentStatus(StudentstatusVo studentstatusVo);
    public int updateByStudentStatus(StudentstatusVo studentstatusVo);
    public int updateByStudentRemarks(StudentstatusVo studentstatusVo);
    public int updateByStudentStateOne(StudentstatusVo studentstatusVo);
    int updateByStudentStateTwo(StudentstatusVo record);
    public List<StudentstatusVo> selectStudentStatusByClassesId(Integer classesId);
    public List<StudentstatusVo> selectStudentStatusByClassesId2(Integer classesId);
    public int updateByClassesIdOnState(StudentstatusVo studentstatusVo);
    public List<StudentstatusVo> queryByStudentId(int studentId);

    int appByClassesIdOnClassesId(Integer classesId,Integer studentId,Integer classesId2 ,Integer status);
    StudentstatusVo selectByClassesIdOnClassesId(Integer classesId,Integer studentId);
    int OnupdateByClassesIdAndStudentIdOnState(Integer classesId,Integer studentId,Integer status);
    List<StudentstatusVo> selectStudentAllotType();

    int updateByApprovedStu(StudentstatusVo studentstatusVo);
    int selectStudentStateByStudentIdAndCouresId(int a,int b);
}

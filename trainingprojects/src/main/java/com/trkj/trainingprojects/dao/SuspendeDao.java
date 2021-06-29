package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.SuspendeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SuspendeDao {

    int addSuspende(SuspendeVo record);

    SuspendeVo selectBySuspendeKey(Integer suspendeId);

    int updateBySuspendeKeySelective(SuspendeVo record);

    int updateBySuspendeKey(SuspendeVo record);

    List<SuspendeVo> selectBySuspendeKeyClasses(Integer classesId);

    List<SuspendeVo> selectBySuspendeKeyStudent(Integer studentId);

    List<SuspendeVo> selectBySuspendeKeyCourse(Integer courseId);

    List<SuspendeVo> selectBySuspendeKeyCoursedetails(Integer coursedetailsId);

    List<SuspendeVo> selectBySuspendeKeyStudentStatus(Integer studentstatusId);

    List<SuspendeVo> selectBySuspendeKeyStudents();

    int appBySuspende(SuspendeVo record);

    int NoAppBySuspende(SuspendeVo record);

    int updateOneBySuspendeKey(SuspendeVo record);


}
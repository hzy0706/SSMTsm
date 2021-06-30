package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.SuspendeVo;

import java.util.List;

public interface SuspendeService {

    int addSuspende(SuspendeVo record);

    SuspendeVo selectBySuspendeKey(Integer suspendeId);

    int updateBySuspendeKeySelective(SuspendeVo record);

    int deleteBySuspendeKey(SuspendeVo record);

    List<SuspendeVo> selectBySuspendeKeyClasses(Integer classesId);

    List<SuspendeVo> selectBySuspendeKeyStudent(Integer studentId);

    List<SuspendeVo> selectBySuspendeKeyCourse(Integer courseId);

    List<SuspendeVo> selectBySuspendeKeyCoursedetails(Integer coursedetailsId);

    List<SuspendeVo> selectBySuspendeKeyStudentStatus(Integer studentstatusId);

    List<SuspendeVo> selectBySuspendeKeyStudents();

    SuspendeVo selectBySuspendeId(Integer suspendeId);

    int appBySuspende(SuspendeVo record);

    int NoAppBySuspende(SuspendeVo record);

    int deleteOneBySuspendeKey(SuspendeVo record);

    int OnUpdateBackState(SuspendeVo record);

    int OnUpdateRefundState(SuspendeVo record);

}

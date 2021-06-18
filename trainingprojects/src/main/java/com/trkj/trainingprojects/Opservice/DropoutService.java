package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.DeptVo;
import com.trkj.trainingprojects.vo.DropoutVo;

import java.util.List;

public interface DropoutService {
    int addDropout(DropoutVo record);

    DropoutVo selectByDropoutKey(Integer dropId);

    int updateByDropoutKeySelective(DropoutVo record);

    int deleteByDropoutKey(DropoutVo record);

    List<DropoutVo> selectByDropoutStudentId(Integer studentId);

    List<DropoutVo> selectByDropoutCourseId(Integer courseId);

    List<DropoutVo> selectByDropoutCoursedetailsId(Integer coursedetailsId);

    List<DropoutVo> selectByDropoutClassesId(Integer classesId);

    List<DropoutVo> selectAllDropouts();
}

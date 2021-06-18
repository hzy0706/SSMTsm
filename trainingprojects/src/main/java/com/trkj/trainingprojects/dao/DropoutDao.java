package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.DropoutVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DropoutDao {

    int addDropout(DropoutVo record);

    DropoutVo selectByDropoutKey(Integer dropId);

    int updateByDropoutKeySelective(DropoutVo record);

    int updateByDropoutKey(DropoutVo record);

    List<DropoutVo> selectByDropoutStudentId(Integer studentId);

    List<DropoutVo> selectByDropoutCourseId(Integer courseId);

    List<DropoutVo> selectByDropoutCoursedetailsId(Integer coursedetailsId);

    List<DropoutVo> selectByDropoutClassesId(Integer classesId);

    List<DropoutVo> selectAllDropouts();
}
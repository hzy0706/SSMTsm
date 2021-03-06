package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.BackVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BackDao {

    int addBack(BackVo record);

    BackVo selectByBackKey(Integer backId);

    List<BackVo>selectByBackKeyClasses(Integer classesId);

    List<BackVo>selectByBackKeyStudent(Integer studentId);

    List<BackVo>selectByBackKeyCourse(Integer courseId);

    List<BackVo>selectByBackKeyCoursedetails(Integer coursedetailsId);

    List<BackVo>selectByBackKeySuspende(Integer suspendeId);

    List<BackVo>selectAllBacks();//分页查询

    int updateByBackKeySelective(BackVo record);

    int updateByBackKey(BackVo record);
}
package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.CourseVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseDao {
    int deleteByCourseKey(Integer courseId);

    int insert(CourseVo record);

    int insertSelective(CourseVo record);

    CourseVo selectByCourseKey(Integer courseId);

    List<CourseVo> selectAllCourse();

    int updateByCourseKeySelective(CourseVo record);

    int updateByCourseKey(CourseVo record);
}
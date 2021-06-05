package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.CourseDetails;
import com.trkj.trainingprojects.vo.CourseDetailsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 课程详细表(CourseDetails)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-02 11:02:47
 */
@Mapper
public interface CourseDetailsDao {

    CourseDetails queryById(Integer coursedetailsId);

    List<CourseDetails> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<CourseDetails> queryAll(CourseDetails coursedetails);

    int insert(CourseDetailsVo courseDetailsVo);

    int insertBatch(@Param("entities") List<CourseDetails> entities);

    int insertOrUpdateBatch(@Param("entities") List<CourseDetails> entities);

    int updateCourseDetailsKey(CourseDetailsVo courseDetailsVo);

    int deleteById(Integer courseDetailsId);

    List<CourseDetailsVo> selectAllCourseDetails();
    int deleteByCourseDetails(CourseDetailsVo courseDetailsVo);
}


package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.CourseDetails;
import com.trkj.trainingprojects.vo.CourseDetailsVo;

import java.util.List;

/**
 * 课程详细表(CourseDetails)表服务接口
 *
 * @author makejava
 * @since 2021-06-02 11:02:48
 */
public interface CourseDetailsService {
    CourseDetails queryById(Integer coursedetailsId);
    List<CourseDetails> queryAllByLimit(int offset, int limit);
    CourseDetails insert(CourseDetails coursedetails);
    CourseDetails update(CourseDetails coursedetails);
    boolean deleteById(Integer coursedetailsId);

    public List<CourseDetailsVo> selectAllCourseDetails();
    public void addCourseDetailsService(CourseDetailsVo coursedetailsVo);
    public int updateByCourseDetailsKey(CourseDetailsVo coursedetailsVo);
    public int deleteByCourseDetails(CourseDetailsVo coursedetailsVo);
    public List<CourseDetailsVo> selectAllCourseDetails2();
}

package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Course;
import com.trkj.trainingprojects.vo.CourseVo;

import java.util.List;

/**
 * 课程表(Course)表服务接口
 *
 * @author makejava
 * @since 2021-06-01 13:56:08
 */
public interface CourseService {
    Course queryById(Integer courseId);
    List<Course> queryAllByLimit(int offset, int limit);
    Course insert(Course course);
    Course update(Course course);
    boolean deleteById(Integer courseId);

    public List<CourseVo> selectAllCourses();
    public void addCourse(CourseVo courseVo);
    public int updateByCourseKey(CourseVo courseVo);
    public int deleteByCourse(CourseVo courseVo);
    public int updateByCoursePel(CourseVo courseVo);
    List<CourseVo> selectAllCourses2();
}

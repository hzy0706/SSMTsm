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
    CourseVo selectOneBycourseId(Integer courseId);
    List<Course> queryAllByLimit(int offset, int limit);
    Course insert(Course course);
    Course update(Course course);
    boolean deleteById(Integer courseId);

    public List<CourseVo> selectAllCourses();
    public void addCourse(CourseVo courseVo);
    public int updateByCourseKey(CourseVo courseVo);
    public int deleteByCourse(CourseVo courseVo);
    public int updateByCoursePel(CourseVo courseVo);
    public List<CourseVo> selectAllCourses2();
    public int updateByCourseHouse(CourseVo courseVo);
    public int updateByCourseHouse2(CourseVo courseVo);
    public int selectCourseDelectOne(int classtypeid);
    public int updateByCourseHouse3(int courseid);//根据id修改课程课时[减少]批量
}

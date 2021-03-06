package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.CourseDao;
import com.trkj.trainingprojects.entity.Course;
import com.trkj.trainingprojects.service.CourseService;
import com.trkj.trainingprojects.vo.CourseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDao courseDao;
    @Override
    public CourseVo selectOneBycourseId(Integer courseId) {
        return courseDao.queryById(courseId);
    }

    @Override
    public List<Course> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Course insert(Course course) {
        return null;
    }

    @Override
    public Course update(Course course) {
        return null;
    }

    @Override
    public boolean deleteById(Integer courseId) {
        return false;
    }

    @Override
    public List<CourseVo> selectAllCourses() {
        return courseDao.selectAllCourses();
    }

    @Override
    @Transactional
    public void addCourse(CourseVo courseVo) {
        courseDao.insert(courseVo);
    }

    @Override
    @Transactional
    public int updateByCourseKey(CourseVo courseVo) {
        return courseDao.updateByCourseKey(courseVo);
    }

    @Override
    @Transactional
    public int deleteByCourse(CourseVo courseVo) {
        return courseDao.deleteByCourse(courseVo);
    }

    @Override
    @Transactional
    public int updateByCoursePel(CourseVo courseVo) {
        return courseDao.updateByCoursePel(courseVo);
    }

    @Override
    public List<CourseVo> selectAllCourses2() {
        return courseDao.selectAllCourses2();
    }

    @Override
    @Transactional
    public int updateByCourseHouse(CourseVo courseVo) {
        return courseDao.updateByCourseHouse(courseVo);
    }

    @Override
    @Transactional
    public int updateByCourseHouse2(CourseVo courseVo) {
        return courseDao.updateByCourseHouse2(courseVo);
    }

    @Override
    public int selectCourseDelectOne(int classtypeid) {
        return courseDao.selectCourseDelectOne(classtypeid);
    }

    @Override
    @Transactional
    public int updateByCourseHouse3(int courseid) {
        return courseDao.updateByCourseHouse3(courseid);
    }
}

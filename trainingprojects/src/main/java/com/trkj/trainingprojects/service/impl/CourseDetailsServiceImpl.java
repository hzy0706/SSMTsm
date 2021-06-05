package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.CourseDetailsDao;
import com.trkj.trainingprojects.entity.CourseDetails;
import com.trkj.trainingprojects.service.CourseDetailsService;
import com.trkj.trainingprojects.vo.CourseDetailsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class CourseDetailsServiceImpl implements CourseDetailsService {
    @Resource
    private CourseDetailsDao coursedetailsDao;
    @Override
    public CourseDetails queryById(Integer coursedetailsId) {
        return null;
    }

    @Override
    public List<CourseDetails> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public CourseDetails insert(CourseDetails coursedetails) {
        return null;
    }

    @Override
    public CourseDetails update(CourseDetails coursedetails) {
        return null;
    }

    @Override
    public boolean deleteById(Integer coursedetailsId) {
        return false;
    }

    @Override
    public List<CourseDetailsVo> selectAllCourseDetails() {
        return coursedetailsDao.selectAllCourseDetails();
    }

    @Override
    @Transactional
    public void addCourseDetailsService(CourseDetailsVo coursedetailsVo) {
        coursedetailsDao.insert(coursedetailsVo);
    }

    @Override
    @Transactional
    public int updateByCourseDetailsKey(CourseDetailsVo coursedetailsVo) {
        return coursedetailsDao.updateCourseDetailsKey(coursedetailsVo);
    }

    @Override
    @Transactional
    public int deleteByCourseDetails(CourseDetailsVo coursedetailsVo) {
        return coursedetailsDao.deleteByCourseDetails(coursedetailsVo);
    }
}

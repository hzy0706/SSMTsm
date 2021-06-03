package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.dao.CourseDao;
import com.trkj.trainingprojects.vo.CourseVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDao courseDao;
    @Override
    public List<CourseVo> selectAllCourse() {
        return courseDao.selectAllCourse();
    }
}

package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.CourseVo;

import java.util.List;

public interface CourseService {
    List<CourseVo> selectAllCourse();
}

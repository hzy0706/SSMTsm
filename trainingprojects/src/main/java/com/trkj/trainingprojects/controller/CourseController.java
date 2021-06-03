package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.service.CourseService;
import com.trkj.trainingprojects.vo.CourseVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CourseController {
    @Resource
    private CourseService courseService;
    @GetMapping("/selectAllCourse")
    public List<CourseVo> selectAllCourse(){
        return courseService.selectAllCourse();
    }
}

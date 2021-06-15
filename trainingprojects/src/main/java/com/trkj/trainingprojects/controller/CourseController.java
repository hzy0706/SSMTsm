package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.CourseService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.CourseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 课程表(Course)表控制层
 *
 * @author makejava
 * @since 2021-06-01 13:56:11
 */
@RestController
@Slf4j
public class CourseController {
    @Resource
    private CourseService courseService;

    @GetMapping("/selectAllCourses")
    public PageInfo<CourseVo> selectAllCourses(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<CourseVo> list = courseService.selectAllCourses();
        PageInfo<CourseVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addCourses")
    public AjaxResponse addCourse(@RequestBody @Valid CourseVo courseVo){
        Date date = new Date();
        courseVo.setAddtime(date);
        courseVo.setCourseState(0);
        courseVo.setTimeliness(0);
        courseVo.setStopname(null);
        courseService.addCourse(courseVo);
        return AjaxResponse.success(courseVo);
    }

    @PutMapping("/updateByCourseKey")
    public AjaxResponse updateByCourseKey(@RequestBody @Valid CourseVo courseVo){
        Date date = new Date();
        courseVo.setUpdatetime(date);
        courseService.updateByCourseKey(courseVo);
        return  AjaxResponse.success(courseVo);
    }

    @PutMapping("/deleteByCourse")
    public AjaxResponse deleteByCourse(@RequestBody @Valid CourseVo courseVo){
        Date date = new Date();
        courseVo.setDeletetime(date);
        courseVo.setTimeliness(1);
        courseService.deleteByCourse(courseVo);
        return AjaxResponse.success(courseVo);
    }

    @PutMapping("/updateByCoursePel")
    public AjaxResponse updateByCoursePel(@RequestBody @Valid CourseVo courseVo){
        if (courseVo.getStoptime()!=null){
            Date date = new Date();
            courseVo.setStoptime(date);
            courseService.updateByCoursePel(courseVo);
        } else if (courseVo.getStoptime()==null){
            courseService.updateByCoursePel(courseVo);
        }
        return  AjaxResponse.success(courseVo);
    }

    @GetMapping("/selectAllCourseList")
    public List<CourseVo> selectAllCourseList(){
        List<CourseVo> list = courseService.selectAllCourses2();
        return list;
    }

}

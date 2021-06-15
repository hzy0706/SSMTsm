package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.CourseDetailsService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.CourseDetailsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 课程详细表(CourseDetails)表控制层
 *
 * @author makejava
 * @since 2021-06-02 11:02:49
 */
@RestController
@Slf4j
public class CourseDetailsController {
    @Resource
    private CourseDetailsService coursedetailsService;

    @GetMapping("/selectAllCourseDetails")
    public PageInfo<CourseDetailsVo> selectAllCourseDetails(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<CourseDetailsVo> list = coursedetailsService.selectAllCourseDetails();
        PageInfo<CourseDetailsVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addCourseDetailsService")
    public AjaxResponse addCourseDetailsService(@RequestBody @Valid CourseDetailsVo coursedetailsVo){
        coursedetailsService.addCourseDetailsService(coursedetailsVo);
        return AjaxResponse.success(coursedetailsVo);
    }

    @PutMapping("/updateByCourseDetailsKey")
    public AjaxResponse updateByCourseDetailsKey(@RequestBody @Valid CourseDetailsVo courseDetailsVo){
        Date date = new Date();
        courseDetailsVo.setUpdatetime(date);
        coursedetailsService.updateByCourseDetailsKey(courseDetailsVo);
        return  AjaxResponse.success(courseDetailsVo);
    }

    @PutMapping("/deleteByCourseDetails")
    public AjaxResponse deleteByCourseDetails(@RequestBody @Valid CourseDetailsVo courseDetailsVo){
        Date date = new Date();
        courseDetailsVo.setDeletetime(date);
        courseDetailsVo.setTimeliness(1);
        coursedetailsService.deleteByCourseDetails(courseDetailsVo);
        return AjaxResponse.success(courseDetailsVo);
    }

    @GetMapping("/selectAllCourseDetailList")
    public List<CourseDetailsVo> selectAllCourseDetailList(){
        List<CourseDetailsVo> list = coursedetailsService.selectAllCourseDetails();
        return list;
    }

    @PutMapping("/deleteByCourseDetailsKey/{ids}/{deleteName}")
    public AjaxResponse deleteByDeptKey(@PathVariable("ids") String ids, @PathVariable("deleteName") String deleteName){
        Date date = new Date();
        String[] id= ids.split(",");
        for (String s:id){
            CourseDetailsVo courseDetailsVo = new CourseDetailsVo();
            courseDetailsVo.setDeletename(deleteName);
            courseDetailsVo.setDeletetime(date);
            courseDetailsVo.setTimeliness(1);
            courseDetailsVo.setCoursedetailsId(Integer.parseInt(s));
            coursedetailsService.deleteByCourseDetails(courseDetailsVo);
        }
        return  AjaxResponse.success(id);
    }

}

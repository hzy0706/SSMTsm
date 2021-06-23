package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.dao.CourseDao;
import com.trkj.trainingprojects.service.CourseDetailsService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.CourseDetailsVo;
import com.trkj.trainingprojects.vo.CourseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
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
    @Resource
    private CourseDao courseDao;
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

    @GetMapping("/selectAllCourseDetails3/{courseId}")
    public List<CourseDetailsVo> selectAllCourseDetails3(@PathVariable("courseId") String courseId){
        List<CourseDetailsVo> list = coursedetailsService.selectAllCourseDetails3(Integer.parseInt(courseId));
        return list;
    }

    @PutMapping("/deleteByCourseDetailsKey/{ids}/{deleteName}")
    public AjaxResponse deleteByDeptKey(@PathVariable("ids") String ids, @PathVariable("deleteName") String deleteName){
        try {
            Date date = new Date();
            String[] id= ids.split(",");
            for (String s:id) {
                //删除课程详细
                CourseDetailsVo courseDetailsVo = coursedetailsService.queryById(Integer.parseInt(s));
                courseDetailsVo.setDeletename(deleteName);
                courseDetailsVo.setDeletetime(date);
                courseDetailsVo.setTimeliness(1);
                //修改当前课程详细表对应课程表的课时量
                courseDao.updateByCourseHouse3(courseDetailsVo.getCourseId());
                coursedetailsService.deleteByCourseDetails(courseDetailsVo);
            }
        } catch (Exception e) {
            log.error("操作异常",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//contoller中增加事务
        }
        return  AjaxResponse.success();
    }

    @GetMapping("/selectCourseDetailsDeleteOne/{id}")
    public int selectCourseDetailsDeleteOne(@PathVariable("id") int id){
        int a = coursedetailsService.selectCourseDetailsDeleteOne(id);
        return a;
    }

}

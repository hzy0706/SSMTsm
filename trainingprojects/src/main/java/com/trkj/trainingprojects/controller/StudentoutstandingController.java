package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.entity.Studentoutstanding;
import com.trkj.trainingprojects.service.StudentoutstandingService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ClassTypeVo;
import com.trkj.trainingprojects.vo.StudentoutstandingVo;
import com.trkj.trainingprojects.vo.StudentstatusVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 学员欠费补缴表(Studentoutstanding)表控制层
 *
 * @author makejava
 * @since 2021-06-18 23:11:37
 */
@RestController
@Slf4j
public class StudentoutstandingController {

    @Resource
    private StudentoutstandingService studentoutstandingService;

    @GetMapping("/selectAllStudentOutStanding")
    public PageInfo<StudentoutstandingVo> selectAllStudentOutStanding(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<StudentoutstandingVo> list = studentoutstandingService.selectAllStudentOutStanding();
        PageInfo<StudentoutstandingVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addStudentoutstanding")
    public AjaxResponse addStudentoutstanding(@RequestBody @Valid StudentoutstandingVo studentoutstandingVo){
        Date date = new Date();
        studentoutstandingVo.setAddtime(date);
        studentoutstandingVo.setTimeliness(0);
        studentoutstandingService.addStudentoutstanding(studentoutstandingVo);
        return AjaxResponse.success(studentoutstandingVo);
    }

}

package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.entity.Studentstatus;
import com.trkj.trainingprojects.service.StudentstatusService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ClassesVo;
import com.trkj.trainingprojects.vo.ItemBankVo;
import com.trkj.trainingprojects.vo.StudentstatusVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * 学员分班表(Studentstatus)表控制层
 *
 * @author makejava
 * @since 2021-06-17 16:44:45
 */
@RestController
@Slf4j
public class StudentstatusController {

    @Resource
    private StudentstatusService studentstatusService;

    @GetMapping("/selectAllStudentStatus")
    public PageInfo<StudentstatusVo> selectAllStudentStatus(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<StudentstatusVo> list = studentstatusService.selectAllStudentStatus();
        PageInfo<StudentstatusVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /*@PostMapping("/addStudentStatus")
    public AjaxResponse addStudentStatus(@RequestBody @Valid StudentstatusVo studentstatusVo){
        studentstatusService.addStudentStatus(studentstatusVo);
        return AjaxResponse.success(studentstatusVo);
    }*/

}

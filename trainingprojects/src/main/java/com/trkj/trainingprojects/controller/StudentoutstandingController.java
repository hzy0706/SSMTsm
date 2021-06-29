package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.entity.Studentoutstanding;
import com.trkj.trainingprojects.service.StudentoutstandingService;
import com.trkj.trainingprojects.util.RandomNumber;
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
        studentoutstandingVo.setOutstandingDate(date);
        studentoutstandingVo.setTimeliness(0);
        RandomNumber randomNumber = new RandomNumber();
        studentoutstandingVo.setOutstandingNumber("CW"+randomNumber.getLocalTrmSeqNum());
        studentoutstandingService.addStudentoutstanding(studentoutstandingVo);
        return AjaxResponse.success(studentoutstandingVo);
    }

    @DeleteMapping("/updateByStudentOutStanding")
    public AjaxResponse updateByStudentOutStanding(@RequestParam("ids") String ids,@RequestParam("updatename") String updatename){
        Date date = new Date();
        String[] id= ids.split(",");
        for (String s:id){
            StudentoutstandingVo studentoutstandingVo = new StudentoutstandingVo();
            studentoutstandingVo.setOutstandingId(Integer.valueOf(s));
            studentoutstandingVo.setApprovalname(updatename);
            studentoutstandingVo.setApprovaltime(date);
            studentoutstandingVo.setOutstandingState(1);
            studentoutstandingVo.setUpdatename(updatename);
            studentoutstandingVo.setUpdatetime(date);
            studentoutstandingVo.setRevokeappname(null);
            studentoutstandingVo.setRevokeapptime(null);
            studentoutstandingService.updateByStudentOutStanding(studentoutstandingVo);
        }
        return  AjaxResponse.success(id);
    }

    @DeleteMapping("/updateByStudentOutStanding2")
    public AjaxResponse updateByStudentOutStanding2(@RequestParam("ids") String ids,@RequestParam("updatename") String updatename){
        String[] id= ids.split(",");
        for (String s:id){
            Date date = new Date();
            StudentoutstandingVo studentoutstandingVo = new StudentoutstandingVo();
            studentoutstandingVo.setOutstandingId(Integer.valueOf(s));
            studentoutstandingVo.setRevokeappname(updatename);
            studentoutstandingVo.setRevokeapptime(date);
            studentoutstandingVo.setOutstandingState(0);
            studentoutstandingVo.setUpdatename(updatename);
            studentoutstandingVo.setUpdatetime(date);
            studentoutstandingVo.setApprovalname(null);
            studentoutstandingVo.setApprovaltime(null);
            studentoutstandingService.updateByStudentOutStanding(studentoutstandingVo);
        }
        return  AjaxResponse.success(id);
    }

}

package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.entity.Attendance;
import com.trkj.trainingprojects.service.AttendanceService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.AttendanceVo;
import com.trkj.trainingprojects.vo.ClassTypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 学员考勤表(Attendance)表控制层
 *
 * @author makejava
 * @since 2021-06-25 14:30:27
 */
@RestController
@Slf4j
public class AttendanceController {

    @Resource
    private AttendanceService attendanceService;

    @GetMapping("/selectAllAttenDance")
    public PageInfo<AttendanceVo> selectAllAttenDance(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<AttendanceVo> list = attendanceService.selectAllAttenDance();
        PageInfo<AttendanceVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectAllAttenDanceList")
    public List<AttendanceVo> selectAllAttenDanceList(){
        List<AttendanceVo> list = attendanceService.selectAllAttenDance();
        return list;
    }

    @PostMapping("/addAttenDance")
    public AjaxResponse addAttenDance(@RequestBody @Valid AttendanceVo attendanceVo){
        attendanceService.addAttenDance(attendanceVo);
        return AjaxResponse.success(attendanceVo);
    }

    @PutMapping("/updateByAttenDanceKey")
    public AjaxResponse updateByAttenDanceKey(@RequestBody @Valid AttendanceVo attendanceVo){
        Date date = new Date();
        attendanceVo.setUpdatetime(date);
        attendanceService.updateByAttenDanceKey(attendanceVo);
        return  AjaxResponse.success(attendanceVo);
    }

    @PutMapping("/deleteByClassType")
    public AjaxResponse deleteByClassType(@RequestBody @Valid AttendanceVo attendanceVo){
        Date date = new Date();
        attendanceVo.setDeletetime(date);
        attendanceVo.setTimeliness(1);
        attendanceService.deleteByAttenDance(attendanceVo);
        return AjaxResponse.success(attendanceVo);
    }

}

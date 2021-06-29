package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.entity.Studentstatus;
import com.trkj.trainingprojects.service.StudentstatusService;
import com.trkj.trainingprojects.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
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

    @GetMapping("/selectStudentStatusByStudentId")
    public PageInfo<StudentstatusVo> SelectStudentByClassId(@RequestParam("id") int id, @RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<StudentstatusVo> list = studentstatusService.selectStudentStatusByStudentId(id);
        PageInfo<StudentstatusVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /*@PostMapping("/addStudentStatus")
    public AjaxResponse addStudentStatus(@RequestBody @Valid StudentstatusVo studentstatusVo){
        studentstatusService.addStudentStatus(studentstatusVo);
        return AjaxResponse.success(studentstatusVo);
    }*/

    @PutMapping("/updateByStudentStatus")
    public AjaxResponse updateByStudentStatus(@RequestBody @Valid StudentstatusVo studentstatusVo){
        studentstatusVo.setStatus(1);//修改为已分班
        studentstatusVo.setAllottype("初次分班");//修改为分班信息
        studentstatusService.updateByStudentStatus(studentstatusVo);
        return  AjaxResponse.success(studentstatusVo);
    }

    @PutMapping("/updateByStudentRemarks")
    public AjaxResponse updateByStudentRemarks(@RequestBody @Valid StudentstatusVo studentstatusVo){
        studentstatusService.updateByStudentRemarks(studentstatusVo);
        return  AjaxResponse.success(studentstatusVo);
    }

    /*
     * 根据学员分班id修改学员分班状态
     * 0:未分班；1：已分班；2:读书中;3：已停课；4：已复课；5：已转班；6:已退学；7：已毕业
     * */
    @PutMapping("/updateByStudentStateOne")
    public AjaxResponse updateByStudentStateOne(@RequestBody @Valid StudentstatusVo studentstatusVo){
        studentstatusService.updateByStudentStateOne(studentstatusVo);
        return  AjaxResponse.success(studentstatusVo);
    }

    @GetMapping("/selectStudentStatusByClassesId")
    public PageInfo<StudentstatusVo> selectStudentStatusByClassesId(@RequestParam("id") int id, @RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<StudentstatusVo> list = studentstatusService.selectStudentStatusByClassesId(id);
        PageInfo<StudentstatusVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectStudentStatusByClassesId2")
    public AjaxResponse selectStudentStatusByClassesId2(@RequestParam("classesId") int classesId){
        List<StudentstatusVo> list = studentstatusService.selectStudentStatusByClassesId2(classesId);
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i).toString());
        }
        return AjaxResponse.success(list);
    }

    /*
     * 根据班级id修改学员状态[学习中]
     * */
    @PutMapping("/updateByClassesIdOnState")
    public AjaxResponse updateByClassesIdOnState(@RequestBody @Valid StudentstatusVo studentstatusVo){
        studentstatusService.updateByClassesIdOnState(studentstatusVo);
        return  AjaxResponse.success(studentstatusVo);
    }

    @GetMapping("/queryByStudentId")
    public AjaxResponse queryByStudentId(@RequestParam("studentId") int studentId){
        List<StudentstatusVo> list = studentstatusService.queryByStudentId(studentId);
        return AjaxResponse.success(list);
    }

    @GetMapping("/selectStudentAllotType")
    public PageInfo<StudentstatusVo> selectStudentAllotType(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<StudentstatusVo> list = studentstatusService.selectStudentAllotType();
        PageInfo<StudentstatusVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @DeleteMapping("/updateByApprovedStu")
    public AjaxResponse updateByApprovedStu(@RequestParam("ids") String ids,@RequestParam("updatename") String updatename){
        Date date = new Date();
        String[] id= ids.split(",");
        for (String s:id){
            StudentstatusVo studentstatusVo = new StudentstatusVo();
            studentstatusVo.setStudentstatusId(Integer.parseInt(s));
            studentstatusVo.setAppname(updatename);
            studentstatusVo.setApptime(date);
            studentstatusVo.setAddtime(date);
            studentstatusVo.setApproval(1);
            studentstatusVo.setRevokeappname(null);
            studentstatusVo.setRevokeapptime(null);
            studentstatusVo.setUpdatename(updatename);
            studentstatusVo.setUpdatetime(date);
            studentstatusVo.setTimeliness(0);
            studentstatusService.updateByApprovedStu(studentstatusVo);
        }
        return  AjaxResponse.success(id);
    }

    @DeleteMapping("/updateByApprovedStu2")
    public AjaxResponse updateByApprovedStu2(@RequestParam("ids") String ids,@RequestParam("updatename") String updatename){
        Date date = new Date();
        String[] id= ids.split(",");
        for (String s:id){
            StudentstatusVo studentstatusVo = new StudentstatusVo();
            studentstatusVo.setStudentstatusId(Integer.parseInt(s));
            studentstatusVo.setAppname(null);
            studentstatusVo.setApptime(null);
            studentstatusVo.setApproval(0);
            studentstatusVo.setRevokeappname(updatename);
            studentstatusVo.setRevokeapptime(date);
            studentstatusVo.setUpdatename(updatename);
            studentstatusVo.setUpdatetime(date);
            studentstatusVo.setTimeliness(1);
            studentstatusService.updateByApprovedStu(studentstatusVo);
        }
        return  AjaxResponse.success(id);
    }

    @PostMapping("/addStudentStatus")
    public AjaxResponse addStudentStatus(@RequestBody @Valid StudentstatusVo studentstatusVo){
        Date date = new Date();
        studentstatusVo.setAddtime(date);
        studentstatusService.addStudentStatus(studentstatusVo);
        return AjaxResponse.success(studentstatusVo);
    }

}

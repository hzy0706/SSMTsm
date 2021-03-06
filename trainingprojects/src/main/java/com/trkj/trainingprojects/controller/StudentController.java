package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.StudentService;
import com.trkj.trainingprojects.service.StudentstatusService;
import com.trkj.trainingprojects.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 学员表(Student)表控制层
 *
 * @author makejava
 * @since 2021-06-03 19:50:19
 */
@RestController
@Slf4j
public class StudentController {

    @Resource
    private StudentService studentService;
    @Resource
    private StudentstatusService studentstatusService;

    @GetMapping("/SelectStudentByClassId")
    public PageInfo<StudentVo> SelectStudentByClassId(@RequestParam("id") int id, @RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<StudentVo> list = studentService.SelectStudentByClassId(id);
        PageInfo<StudentVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/SelectStudentByClassId2")
    public AjaxResponse SelectStudentByClassId2(@RequestParam("id") int id){
        List<StudentVo> list = studentService.SelectStudentByClassId(id);
        return AjaxResponse.success(id);
    }

    @GetMapping("/SelectStudentByState")
    public List<StudentVo> SelectStudentByState(){
        List<StudentVo> list = studentService.SelectStudentByState();
        return list;
    }

    @GetMapping("/SelectStudentByState2")
    public List<StudentVo> SelectStudentByState2(@RequestParam("classesId") int classesId){
        List<StudentVo> list = studentService.SelectStudentByState2(classesId);
        return list;
    }

    @GetMapping("/selectAllStudent")
    public PageInfo<StudentVo> selectAllStudent(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<StudentVo> list = studentService.selectAllStudent();
        PageInfo<StudentVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectAllStudent2")
    public List<StudentVo> selectAllStudent2(){
        List<StudentVo> list = studentService.selectAllStudent();
        return list;
    }

    @PostMapping("/addStudents")
    public AjaxResponse addStudents(@RequestBody @Valid StudentVo studentVo){
        Date date = new Date();
        studentVo.setStudytime(date);
        studentVo.setAddtime(date);
        studentVo.setStudentState(0);
        studentVo.setTimeliness(0);
        studentService.addStudents(studentVo);
        return AjaxResponse.success(studentVo);
    }

    @PutMapping("/updateByStudent")
    public AjaxResponse updateByStudent(@RequestBody @Valid StudentVo studentVo){
        studentService.updateByStudent(studentVo);
        return  AjaxResponse.success(studentVo);
    }

    @PutMapping("/updateByStudentKey")
    public AjaxResponse updateByStudentKey(@RequestBody @Valid StudentVo studentVo){
        Date date = new Date();
        studentVo.setUpdatetime(date);
        studentService.updateByStudentKey(studentVo);
        return  AjaxResponse.success(studentVo);
    }

    @GetMapping("/selectStudentCource")
    public AjaxResponse selectStudentCource(@RequestParam("sourceId") Integer sourceId){
        List<StudentVo> student=studentService.selectStudentCource(sourceId);
        return AjaxResponse.success(student);
    }

    @PutMapping("/updateByStudentImg")
    public AjaxResponse updateByStudentImg(@RequestBody @Valid StudentVo studentVo){
        studentService.updateByStudentImg(studentVo);
        return  AjaxResponse.success(studentVo);
    }

}

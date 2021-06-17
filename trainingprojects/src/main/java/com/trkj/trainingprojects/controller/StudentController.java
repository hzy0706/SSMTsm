package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.StudentService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ClassTypeVo;
import com.trkj.trainingprojects.vo.ClassesVo;
import com.trkj.trainingprojects.vo.StudentVo;
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

    @GetMapping("/SelectStudentByClassId/{id}")
    public PageInfo<StudentVo> SelectStudentByClassId(@PathVariable("id") int id, @RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<StudentVo> list = studentService.SelectStudentByClassId(id);
        PageInfo<StudentVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/SelectStudentByState")
    public List<StudentVo> SelectStudentByState(){
        List<StudentVo> list = studentService.SelectStudentByState();
        return list;
    }

    @GetMapping("/selectAllStudent")
    public PageInfo<StudentVo> selectAllStudent(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<StudentVo> list = studentService.selectAllStudent();
        PageInfo<StudentVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addStudents")
    public AjaxResponse addStudents(@RequestBody @Valid StudentVo studentVo){
        Date date = new Date();
        studentVo.setStudytime(date);
        studentVo.setStudentState(0);
        studentVo.setTimeliness(0);
        studentService.addStudents(studentVo);
        return AjaxResponse.success(studentVo);
    }

}

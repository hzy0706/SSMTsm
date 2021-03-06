package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.ClassesService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ClassesVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 班级表(Classes)表控制层
 *
 * @author makejava
 * @since 2021-06-02 12:42:38
 */
@RestController
@Slf4j
public class ClassesController {

    @Resource
    private ClassesService classesService;

    @GetMapping("/selectAllClasses")
    public PageInfo<ClassesVo> selectAllClasses(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<ClassesVo> list = classesService.selectAllClasses();
        /*for(ClassesVo classesVo:list){
            System.out.println("----------------"+classesVo.toString());
        }*/
        PageInfo<ClassesVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addClasses")
    public AjaxResponse addClasses(@RequestBody @Valid ClassesVo classesVo){
        Date date = new Date();
        classesVo.setAddtime(date);
        classesService.addClasses(classesVo);
        return AjaxResponse.success(classesVo);
    }

    @PutMapping("/updateClassesKey")
    public AjaxResponse updateClassesKey(@RequestBody @Valid ClassesVo classesVo){
        Date date = new Date();
        classesVo.setUpdatetime(date);
        classesService.updateClassesKey(classesVo);
        return  AjaxResponse.success(classesVo);
    }

    @PutMapping("/deleteByClasses")
    public AjaxResponse deleteByClasses(@RequestBody @Valid ClassesVo classesVo){
        Date date = new Date();
        classesVo.setDeletetime(date);
        classesVo.setTimeliness(1);
        classesService.deleteByClasses(classesVo);
        return AjaxResponse.success(classesVo);
    }

    @GetMapping("/selectAllClassesByState")
    public List<ClassesVo> selectAllClassesByState(){
        List<ClassesVo> list = classesService.selectAllClassesByState();
        return list;
    }

    @GetMapping("/selectAllClassesByNumber")
    public List<ClassesVo> selectAllClassesByNumber(@RequestParam("id") int id){
       List<ClassesVo> list = classesService.selectAllClassesByNumber(id);
        return list;
    }

    @GetMapping("/selectAllClassesByState2")
    public List<ClassesVo> selectAllClassesByState2(){
        List<ClassesVo> list = classesService.selectAllClassesByState2();
        return list;
    }


    @PutMapping("/deleteByOpenClasses")
    public AjaxResponse deleteByOpenClasses(@RequestBody @Valid ClassesVo classesVo){
        classesService.deleteByOpenClasses(classesVo);
        return AjaxResponse.success(classesVo);
    }

    @GetMapping("/selectAllClassesByState3")
    public List<ClassesVo> selectClassesById(@RequestParam("id") int id){
        List<ClassesVo> list = classesService.selectClassesById(id);
        return list;
    }

    @GetMapping("/selectClassesNumbers")
    public ClassesVo selectClassesNumber(@RequestParam("id") int id){
        ClassesVo list = classesService.selectClassesNumber(id);
        return list;
    }

    @PutMapping("/UpdateAddClassesStudentNumber")
    public AjaxResponse UpdateAddClassesStudentNumber(@RequestBody @Valid ClassesVo classesVo){
        classesService.UpdateAddClassesStudentNumber(classesVo);
        return  AjaxResponse.success(classesVo);
    }

}

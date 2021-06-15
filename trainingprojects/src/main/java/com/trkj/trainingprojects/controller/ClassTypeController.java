package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.ClassTypeService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ClassTypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 课类表(ClassTypeVo)表控制层
 *
 * @author makejava
 * @since 2021-05-29 09:20:37
 */
@RestController
@Slf4j
public class ClassTypeController {
    @Resource
    private ClassTypeService classtypeService;

    @GetMapping("/selectAllClassTypes")
    public PageInfo<ClassTypeVo> selectAllFaqs(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<ClassTypeVo> list = classtypeService.selectAllClassTypes();
        PageInfo<ClassTypeVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectAllClassTypesByList")
    public List<ClassTypeVo> selectAllClassTypesByList(){
        List<ClassTypeVo> list = classtypeService.selectAllClassTypes2();
        return list;
    }

    @PostMapping("/addClassType")
    public AjaxResponse addClassType(@RequestBody @Valid ClassTypeVo classtypeVo){
        classtypeService.addClassType(classtypeVo);
        return AjaxResponse.success(classtypeVo);
    }

    @PutMapping("/updateClassType")
    public AjaxResponse updateClassType(@RequestBody @Valid ClassTypeVo classTypeVo){
        /*System.out.println(classTypeVo+"-------------------");*/
        Date date = new Date();
        classTypeVo.setUpdatetime(date);
        classtypeService.updateByClassTypeKey(classTypeVo);
        return  AjaxResponse.success(classTypeVo);
    }

    @PutMapping("/deleteByClassType")
    public AjaxResponse deleteByClassType(@RequestBody @Valid ClassTypeVo classTypeVo){
        Date date = new Date();
        classTypeVo.setDeletetime(date);
        classTypeVo.setTimeliness(1);
        classtypeService.deleteByClassType(classTypeVo);
        return AjaxResponse.success(classTypeVo);
    }

}

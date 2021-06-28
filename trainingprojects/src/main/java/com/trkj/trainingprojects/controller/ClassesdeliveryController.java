package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.ClassesdeliveryService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.BookstorageVo;
import com.trkj.trainingprojects.vo.ClassesdeliveryVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class ClassesdeliveryController {
    @Resource
    private ClassesdeliveryService classesdeliveryService;

    @GetMapping("/selectByClassesdeliveryKey")
    public ClassesdeliveryVo selectByClassesdeliveryKey(@RequestParam("id") int id){
        return classesdeliveryService.selectByClassesdeliveryKey(id);
    }

    @GetMapping("/selectAllClassesdeliverys")
    public PageInfo<ClassesdeliveryVo> selectAllClassesdeliverys(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize, @RequestParam("approval")String approval, @RequestParam("value")String value){
        PageHelper.startPage(currentPage,pageSize);
        List<ClassesdeliveryVo> list = classesdeliveryService.selectAllClassesdeliverys(Integer.parseInt(approval),"%"+value+"%");
        PageInfo<ClassesdeliveryVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addClassesdelivery")
    public AjaxResponse addClassesdelivery(@RequestBody @Valid ClassesdeliveryVo classesdeliveryVo){
        classesdeliveryService.addClassesdelivery(classesdeliveryVo);
        return AjaxResponse.success(classesdeliveryVo);
    }

    @PutMapping("/updateByClassesdeliveryKeySelective")
    public AjaxResponse updateByClassesdeliveryKeySelective(@RequestBody @Valid ClassesdeliveryVo classesdeliveryVo){
        classesdeliveryVo.setUpdatetime(new Date());
        classesdeliveryService.updateByClassesdeliveryKeySelective(classesdeliveryVo);
        return AjaxResponse.success(classesdeliveryVo);
    }

    @PutMapping("/deleteByClassesdeliveryKey")
    public AjaxResponse deleteByClassesdeliveryKey(@RequestBody @Valid ClassesdeliveryVo classesdeliveryVo){
        classesdeliveryVo.setDeletetime(new Date());
        classesdeliveryVo.setTimeliness(1);
        classesdeliveryService.deleteByClassesdeliveryKey(classesdeliveryVo);
        return AjaxResponse.success(classesdeliveryVo);
    }

    @PutMapping("/appByClassesdeliveryKey")
    public AjaxResponse appByClassesdeliveryKey(@RequestBody @Valid ClassesdeliveryVo classesdeliveryVo){
        classesdeliveryVo.setApptime(new Date());
        classesdeliveryVo.setApproval(1);
        classesdeliveryService.appByClassesdeliveryKey(classesdeliveryVo);
        return AjaxResponse.success(classesdeliveryVo);
    }
}

package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.SourceService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.SourceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class SourceController {
    @Autowired
    private SourceService sourceService;
//    查询
    @GetMapping("/selectfindSource")
    public PageInfo<SourceVo> findFaqQuestions(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize) {
        PageInfo<SourceVo> sourcevo = sourceService.selectAllSource(currentPage, pagesize);
        return sourcevo;

    }
//    外键查询
    @GetMapping("/selectfindSourceKey")
    public List<SourceVo> findSourceKey(){
        List<SourceVo> list = sourceService.findSourceKey();
        return list;
    }

//    增加
    @PostMapping("/addSource")
    public AjaxResponse addSource(@RequestBody @Valid SourceVo sourceVo){
        sourceVo.setTimeliness(0);
        Date date= new Date();
        sourceVo.setAddtime(date);
        sourceVo.setAlready(0);
        sourceVo.setPotential(0);
        sourceService.addSource(sourceVo);
        return AjaxResponse.success();
    }
//    修改
    @PutMapping("/updateSource")
    public AjaxResponse updateSource(@RequestBody @Valid SourceVo sourceVo){
        Date date=new Date();
        sourceVo.setUpdatetime(date);
        sourceService.updateSource(sourceVo);
        return AjaxResponse.success();
    }
    //    删除
    @PutMapping("/delSource")
    public AjaxResponse delSource(@RequestBody @Valid SourceVo sourceVo){
        sourceVo.setTimeliness(1);
        Date date=new Date();
        sourceVo.setDeletetime(date);
        sourceService.delSource(sourceVo);
        return AjaxResponse.success();
    }
    //模糊查询
    @GetMapping("/mohuSource/{sourceId}")
    public AjaxResponse mohuSource(@PathVariable("sourceId" ) Integer sourceId){
        sourceService.mohuSource(sourceId);
        return AjaxResponse.success();
    }
}

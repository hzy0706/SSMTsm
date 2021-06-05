package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.ExaminationsCoreService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ExaminationScoreVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 成绩表(ExaminationScore)表控制层
 *
 * @author makejava
 * @since 2021-06-03 15:18:09
 */
@RestController
@Slf4j
public class ExaminationsCoreController {
   
    @Resource
    private ExaminationsCoreService examinationscoreService;

    @GetMapping("/examinationscoreService")
    public PageInfo<ExaminationScoreVo> examinationscoreService(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<ExaminationScoreVo> list = examinationscoreService.selectAllExaminationScore();
        PageInfo<ExaminationScoreVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addExaminationScore")
    public AjaxResponse addExaminationScore(@RequestBody @Valid ExaminationScoreVo examinationScoreVo){
        examinationscoreService.addExaminationScore(examinationScoreVo);
        return AjaxResponse.success(examinationScoreVo);
    }

    @PutMapping("/updateByExaminationScoreKey")
    public AjaxResponse updateByExaminationScoreKey(@RequestBody @Valid ExaminationScoreVo examinationScoreVo){
        Date date = new Date();
        examinationScoreVo.setUpdatetime(date);
        examinationscoreService.updateByExaminationScoreKey(examinationScoreVo);
        return  AjaxResponse.success(examinationScoreVo);
    }

    @PutMapping("/deleteByExaminationScore")
    public AjaxResponse deleteByExaminationScore(@RequestBody @Valid ExaminationScoreVo examinationScoreVo){
        Date date = new Date();
        examinationScoreVo.setDeletetime(date);
        examinationScoreVo.setTimeliness(1);
        examinationscoreService.deleteByExaminationScore(examinationScoreVo);
        return AjaxResponse.success(examinationScoreVo);
    }
    
}

package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.ExaminationService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ExaminationVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 考试总表(Examination)表控制层
 *
 * @author makejava
 * @since 2021-06-03 14:31:41
 */
@RestController
@Slf4j
public class ExaminationController {

    @Resource
    private ExaminationService examinationService;


    @GetMapping("/selectAllExamination")
    public PageInfo<ExaminationVo> selectAllExamination(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<ExaminationVo> list = examinationService.selectAllExamination();
        PageInfo<ExaminationVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addExamination")
    public AjaxResponse addExamination(@RequestBody @Valid ExaminationVo examinationVo){
        examinationService.addExamination(examinationVo);
        return AjaxResponse.success(examinationVo);
    }

    @PutMapping("/updateByExaminationKey")
    public AjaxResponse updateByExaminationKey(@RequestBody @Valid ExaminationVo examinationVo){
        /*System.out.println(classTypeVo+"-------------------");*/
        Date date = new Date();
        examinationVo.setUpdatetime(date);
        examinationService.updateByExaminationKey(examinationVo);
        return  AjaxResponse.success(examinationVo);
    }

    @PutMapping("/deleteByExamination")
    public AjaxResponse deleteByExamination(@RequestBody @Valid ExaminationVo examinationVo){
        Date date = new Date();
        examinationVo.setDeletetime(date);
        examinationVo.setTimeliness(1);
        examinationService.deleteByExamination(examinationVo);
        return AjaxResponse.success(examinationVo);
    }

}

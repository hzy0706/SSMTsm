package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.ExaminationContentService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ExaminationContentVo;
import com.trkj.trainingprojects.vo.ItemBankVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 考试内容表(ExaminationContent)表控制层
 *
 * @author makejava
 * @since 2021-06-03 15:17:45
 */
@RestController
@Slf4j
public class ExaminationContentController {
   
    @Resource
    private ExaminationContentService examinationcontentService;

    @GetMapping("/selectAllExaminationContent")
    public PageInfo<ExaminationContentVo> selectAllExaminationContent(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<ExaminationContentVo> list = examinationcontentService.selectAllExaminationContent();
        PageInfo<ExaminationContentVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addExaminationContent")
    public AjaxResponse addExaminationContent(@RequestBody @Valid ExaminationContentVo examinationContentVo){
        examinationcontentService.addExaminationContent(examinationContentVo);
        return AjaxResponse.success(examinationContentVo);
    }

    @PutMapping("/updateByExaminationContentKey")
    public AjaxResponse updateByExaminationContentKey(@RequestBody @Valid ExaminationContentVo examinationContentVo){
        Date date = new Date();
        examinationContentVo.setUpdatetime(date);
        examinationcontentService.updateByExaminationContentKey(examinationContentVo);
        return  AjaxResponse.success(examinationContentVo);
    }

    @PutMapping("/deleteByExaminationContent")
    public AjaxResponse deleteByExaminationContent(@RequestBody @Valid ExaminationContentVo examinationContentVo){
        Date date = new Date();
        examinationContentVo.setDeletetime(date);
        examinationContentVo.setTimeliness(1);
        examinationcontentService.deleteByExaminationContent(examinationContentVo);
        return AjaxResponse.success(examinationContentVo);
    }

    @GetMapping("/selectAllExaminationContentByCode")
    public AjaxResponse selectAllExaminationContentByCode(@RequestParam("id") int id){
        System.out.println(id);
        ExaminationContentVo examinationContentVo = examinationcontentService.selectAllExaminationContentByCode(id);
        return AjaxResponse.success(examinationContentVo);
    }

    @GetMapping("/selectAllExaminationContentByCode1")
    public Map<Integer, List<?>> findById(@RequestParam("paperId") Integer paperId) {
        List<ExaminationContentVo> multiQuestionRes = examinationcontentService.selectAllExaminationContentByCodeOne(paperId);   //选择题题库 1
        List<ExaminationContentVo> fillQuestionsRes = examinationcontentService.selectAllExaminationContentByCodeTwo(paperId);     //填空题题库 2
        List<ExaminationContentVo> judgeQuestionRes = examinationcontentService.selectAllExaminationContentByCodeThree(paperId);   //判断题题库 3
        Map<Integer, List<?>> map = new HashMap<>();
        map.put(1,multiQuestionRes);
        map.put(2,fillQuestionsRes);
        map.put(3,judgeQuestionRes);
        return  map;
    }

}

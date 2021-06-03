package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.FaqService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.FaqVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class FaqController {
    @Resource
    private FaqService faqService;
    @PostMapping("/addFaq")
    public AjaxResponse addFaq(@RequestBody @Valid FaqVo faqVo){
        faqService.addFaq(faqVo);
        return  AjaxResponse.success(faqVo);
    }

    @GetMapping("/selectAllFaqs")
    public PageInfo<FaqVo> selectAllFaqs(@RequestParam("currentPage")int currentPage,@RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<FaqVo> list = faqService.selectAllFaqs();
        PageInfo<FaqVo> pageInfo = new PageInfo<>(list);
        return  pageInfo;
    }
    @GetMapping("/selectAllFaqsPrerequisite")
    public PageInfo<FaqVo> selectAllFaqsPrerequisite(@RequestParam("selectType")String selectType,@RequestParam("input")String input,
                                                    @RequestParam("currentPage")int currentPage,@RequestParam("pagesize")int pageSize){
        if(input.equals("")){
            PageHelper.startPage(currentPage,pageSize);
            List<FaqVo> list = faqService.selectAllFaqs();
            PageInfo<FaqVo> pageInfo = new PageInfo<>(list);
            return  pageInfo;
        }else if(selectType.equals("按问题查询")){
            PageHelper.startPage(currentPage,pageSize);
            List<FaqVo> list = faqService.selectByFaqProblem("%"+input+"%");
            PageInfo<FaqVo> pageInfo = new PageInfo<>(list);
            return  pageInfo;
        }else{
            PageHelper.startPage(currentPage,pageSize);
            List<FaqVo> list = faqService.selectByFaqAnswer("%"+input+"%");
            PageInfo<FaqVo> pageInfo = new PageInfo<>(list);
            return  pageInfo;
        }

    }
    @GetMapping("/selectByFaqKey/{faqId}")
    public AjaxResponse selectByFaqKey(@PathVariable("faqId")  int faqId){
        FaqVo faqVo= faqService.selectByFaqKey(faqId);
        return  AjaxResponse.success(faqVo);
    }

    @PutMapping("/updateFaq")
    public AjaxResponse updateFaq(@RequestBody @Valid FaqVo faqVo){
        Date date = new Date();
        faqVo.setUpdatetime(date);
        faqService.updateByFaqKeySelective(faqVo);
        return  AjaxResponse.success(faqVo);
    }
    @PutMapping("/deleteByFaqKey")
    public AjaxResponse deleteByFaqKey(@RequestBody @Valid FaqVo faqVo){
        Date date = new Date();
        faqVo.setDeletetime(date);
        faqVo.setTimeliness(1);
        faqService.deleteByFaqKey(faqVo);
        return  AjaxResponse.success(faqVo);
    }
}

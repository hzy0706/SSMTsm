package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.FaqService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.FaqQuestionsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class FaqQuestionsController {
    @Autowired
    private FaqService faqService;
//    查询
    @GetMapping("/findFaq")
    public PageInfo<FaqQuestionsVo> findFaqQuestions(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize) {
//       分页
        PageHelper.startPage(currentPage,pagesize);
        List<FaqQuestionsVo> list = faqService.selectAllFaq();
        PageInfo<FaqQuestionsVo> pageInfo= new PageInfo<>(list);
        return pageInfo;
    }

    //增加，@ResponseBody @Valid把前端数据封装成vo对象
    @PostMapping("/addFaq")
    public AjaxResponse addFaqquestions(@RequestBody @Valid FaqQuestionsVo faqQuestionsVo){
        faqQuestionsVo.setTimeliness(0);
        faqService.addFaq(faqQuestionsVo);
        return AjaxResponse.success(faqQuestionsVo);
    }
//    修改
    @PutMapping("/updateFaq")
    public AjaxResponse updateFaqquestions(@RequestBody @Valid FaqQuestionsVo faqQuestionsVo){
        Date date=new Date();
        faqQuestionsVo.setUpdatetime(date);
        faqService.updateByFaqQuestionsKey(faqQuestionsVo);
        return AjaxResponse.success(faqQuestionsVo);
    }
    //    删除
    @PutMapping("/delFaq")
    public AjaxResponse delFaqquestions(@RequestBody @Valid FaqQuestionsVo faqQuestionsVo){
        Date date=new Date();
        faqQuestionsVo.setDeletetime(date);
        faqQuestionsVo.setTimeliness(1);
        faqService.delFaqQuestions(faqQuestionsVo);
        return AjaxResponse.success(faqQuestionsVo);
    }


}
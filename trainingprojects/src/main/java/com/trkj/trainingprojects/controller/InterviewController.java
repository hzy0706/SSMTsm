package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.InterviewService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.InterviewVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 在读生访谈表(Interview)表控制层
 *
 * @author makejava
 * @since 2021-06-04 11:33:14
 */
@RestController
@Slf4j
public class InterviewController {

    @Resource
    private InterviewService interviewService;

    @GetMapping("/selectAllInterview")
    public PageInfo<InterviewVo> selectAllInterview(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<InterviewVo> list = interviewService.selectAllInterview();
        PageInfo<InterviewVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addInterview")
    public AjaxResponse addInterview(@RequestBody @Valid InterviewVo interviewVo){
        interviewService.addInterview(interviewVo);
        return AjaxResponse.success(interviewVo);
    }

    @PutMapping("/updateByInterviewKey")
    public AjaxResponse updateByInterviewKey(@RequestBody @Valid InterviewVo interviewVo){
        Date date = new Date();
        interviewVo.setUpdatetime(date);
        interviewService.updateByInterviewKey(interviewVo);
        return  AjaxResponse.success(interviewVo);
    }

    @PutMapping("/deleteByInterview")
    public AjaxResponse deleteByInterview(@RequestBody @Valid InterviewVo interviewVo){
        Date date = new Date();
        interviewVo.setDeletetime(date);
        interviewVo.setTimeliness(1);
        interviewService.deleteByInterview(interviewVo);
        return AjaxResponse.success(interviewVo);
    }

}

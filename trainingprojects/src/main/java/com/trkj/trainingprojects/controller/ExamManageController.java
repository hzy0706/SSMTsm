package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.entity.ExamManage;
import com.trkj.trainingprojects.service.ExamManageService;
import com.trkj.trainingprojects.vo.CourseVo;
import com.trkj.trainingprojects.vo.ExamManageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 试卷表(ExamManage)表控制层
 *
 * @author makejava
 * @since 2021-06-24 19:01:33
 */
@RestController
@Slf4j
public class ExamManageController {

    @Resource
    private ExamManageService examManageService;

    @GetMapping("/selectAllExamManage")
    public PageInfo<ExamManageVo> selectAllExamManage(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<ExamManageVo> list = examManageService.selectAllExamManage();
        PageInfo<ExamManageVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}

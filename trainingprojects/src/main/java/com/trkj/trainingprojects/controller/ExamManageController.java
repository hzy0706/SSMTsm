package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.entity.ExamManage;
import com.trkj.trainingprojects.service.ExamManageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 试卷表(ExamManage)表控制层
 *
 * @author makejava
 * @since 2021-06-24 19:01:33
 */
@RestController
@Slf4j
public class ExamManageController {
    /**
     * 服务对象
     */
    @Resource
    private ExamManageService examManageService;


}

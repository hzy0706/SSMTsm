package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.entity.Studentstatus;
import com.trkj.trainingprojects.service.StudentstatusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 学员分班表(Studentstatus)表控制层
 *
 * @author makejava
 * @since 2021-06-17 16:44:45
 */
@RestController
@Slf4j
public class StudentstatusController {

    @Resource
    private StudentstatusService studentstatusService;


}

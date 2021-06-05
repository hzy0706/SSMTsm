package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 学员表(Student)表控制层
 *
 * @author makejava
 * @since 2021-06-03 19:50:19
 */
@RestController
@Slf4j
public class StudentController {

    @Resource
    private StudentService studentService;

}

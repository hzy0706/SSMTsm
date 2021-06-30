package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.entity.System;
import com.trkj.trainingprojects.service.SystemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 规章制度表(System)表控制层
 *
 * @author makejava
 * @since 2021-06-30 23:12:04
 */
@RestController
@RequestMapping("system")
public class SystemController {
    /**
     * 服务对象
     */
    @Resource
    private SystemService systemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public System selectOne(Integer id) {
        return this.systemService.queryById(id);
    }

}
package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.entity.Announcement;
import com.trkj.trainingprojects.service.AnnouncementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 公告表(Announcement)表控制层
 *
 * @author makejava
 * @since 2021-06-29 20:08:27
 */
@RestController
@RequestMapping("announcement")
public class AnnouncementController {
    /**
     * 服务对象
     */
    @Resource
    private AnnouncementService announcementService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Announcement selectOne(Integer id) {
        return this.announcementService.queryById(id);
    }

}
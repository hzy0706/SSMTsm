package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.entity.Announcementselect;
import com.trkj.trainingprojects.service.AnnouncementselectService;
import com.trkj.trainingprojects.vo.AnnouncementselectVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公告允许查看表(Announcementselect)表控制层
 *
 * @author makejava
 * @since 2021-06-30 15:24:36
 */
@RestController
public class AnnouncementselectController {
    /**
     * 服务对象
     */
    @Resource
    private AnnouncementselectService announcementselectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Announcementselect selectOne(Integer id) {
        return this.announcementselectService.queryById(id);
    }

    @GetMapping("/selectByEmpId")
    public List<AnnouncementselectVo> selectByEmpId(int empId){
        System.out.println(empId+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       List<AnnouncementselectVo> list=announcementselectService.selectByEmpId(empId);

       return list;
    }
}
package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.SessionService;
import com.trkj.trainingprojects.vo.SessionVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 年届表(Session)表控制层
 *
 * @author makejava
 * @since 2021-06-02 18:52:09
 */
@RestController
@RequestMapping("session")
public class SessionController {
    /**
     * 服务对象
     */
    @Resource
    private SessionService sessionService;

    /**
     * 查询所有可用
     *
     *
     * @return 单条数据
     */
    @GetMapping("selectall")
    public PageInfo<SessionVo> selectall(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        System.out.println(currentPage+"-----"+pageSize);
        PageHelper.startPage(currentPage,pageSize);
        List<SessionVo> list=this.sessionService.selectAll();
        PageInfo<SessionVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
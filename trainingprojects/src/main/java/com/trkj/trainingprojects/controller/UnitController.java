package com.trkj.trainingprojects.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.UnitService;
import com.trkj.trainingprojects.vo.UnitVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单位表(Unit)表控制层
 *
 * @author makejava
 * @since 2021-06-03 16:30:39
 */
@RestController
@RequestMapping("unit")
public class UnitController {
    /**
     * 服务对象
     */
    @Resource
    private UnitService unitService;

    /**
     * 查询所有
     *
     */
    @GetMapping("selectall")
    public PageInfo<UnitVo> selectall(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        System.out.println(currentPage+"-----"+pageSize);
        PageHelper.startPage(currentPage,pageSize);
        List<UnitVo> list=this.unitService.selectAll();
        PageInfo<UnitVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
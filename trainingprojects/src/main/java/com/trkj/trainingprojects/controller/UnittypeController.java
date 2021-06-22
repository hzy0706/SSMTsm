package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.UnittypeService;
import com.trkj.trainingprojects.vo.UnittypeVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单位类型表(Unittype)表控制层
 *
 * @author makejava
 * @since 2021-06-21 10:32:38
 */
@RestController
@RequestMapping("unittype")
public class UnittypeController {
    /**
     * 服务对象
     */
    @Resource
    private UnittypeService unittypeService;
    /**
     * 查询所有
     *
     */
    @GetMapping("selectAllUnitType")
    public PageInfo<UnittypeVo> selectAllUnit(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<UnittypeVo> list=this.unittypeService.selectAllUnitType();
        PageInfo<UnittypeVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
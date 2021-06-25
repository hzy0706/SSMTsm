package com.trkj.trainingprojects.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.UnitService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.UnitVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
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
    @GetMapping("selectAllUnit")
    public PageInfo<UnitVo> selectAllUnit(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<UnitVo> list=this.unitService.selectAllUnit();
        PageInfo<UnitVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    /**
     * 新增
     * @param unitVo
     * @return
     */
    @PostMapping("/addUnitALL")
    public AjaxResponse addUnitALL(@RequestBody @Valid UnitVo unitVo){
        unitService.addUnit(unitVo);
        return AjaxResponse.success(unitVo);
    }

    /**
     * 修改
     * @param unitVo
     * @return
     */
    @PutMapping("/updateUnitById")
    public  AjaxResponse updateUnitById(@RequestBody @Valid UnitVo unitVo){
        unitService.updateUnit(unitVo);
        return AjaxResponse.success(unitVo);
    }
    /**
     * 删除
     */
    @PutMapping("/delUnitById")
    public AjaxResponse delSemesterById(@RequestBody @Valid UnitVo unitVo){
        unitService.delUnitById(unitVo);
        return AjaxResponse.success(unitVo);
    }
}
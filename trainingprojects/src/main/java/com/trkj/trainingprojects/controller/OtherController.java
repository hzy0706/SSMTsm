package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.OtherService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.OtherVo;
import com.trkj.trainingprojects.vo.UnitVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * 其他开销表(Other)表控制层
 *
 * @author makejava
 * @since 2021-06-24 14:09:08
 */
@RestController
public class OtherController {
    /**
     * 服务对象
     */
    @Resource
    private OtherService otherService;
    /**
     * 查询所有可用
     *
     *
     * @return
     */
    @GetMapping("selectAllOther")
    public PageInfo<OtherVo> selectall(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        System.out.println(currentPage+"-----"+pageSize);
        PageHelper.startPage(currentPage,pageSize);
        List<OtherVo> list=this.otherService.selectOtherAll();
        PageInfo<OtherVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    /**
     * 新增
     * @param
     * @return
     */
    @PostMapping("/addOther")
    public AjaxResponse addUnitALL(@RequestBody @Valid OtherVo otherVo){
        otherService.addOther(otherVo);
        return AjaxResponse.success(otherVo);
    }

}
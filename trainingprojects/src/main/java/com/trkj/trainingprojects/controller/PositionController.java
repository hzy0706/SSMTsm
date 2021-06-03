package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.PositionService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.PositionVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class PositionController {
    @Resource
    private PositionService positionService;

    @GetMapping("/selectAllPositions")
    public PageInfo<PositionVo> selectAllPositions(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<PositionVo> list = positionService.selectAllPositions();
        PageInfo<PositionVo> pageInfo = new PageInfo<>(list);
        return  pageInfo;
    }

    @PostMapping("addPosition")
    public AjaxResponse addPosition(@RequestBody @Valid PositionVo positionVo){
        positionService.addPosition(positionVo);
        return AjaxResponse.success(positionVo);
    }

    @PutMapping("updateByPositionKeySelective")
    public AjaxResponse updateByPositionKeySelective(@RequestBody @Valid PositionVo positionVo){
        Date date = new Date();
        positionVo.setUpdatetime(date);
        positionService.updateByPositionKeySelective(positionVo);
        return AjaxResponse.success(positionVo);
    }

    @PutMapping("deleteByPositionKey")
    public AjaxResponse deleteByPositionKey(@RequestBody @Valid PositionVo positionVo){
        Date date = new Date();
        positionVo.setDeletetime(date);
        positionVo.setTimeliness(1);
        positionService.deleteByPositionKey(positionVo);
        return AjaxResponse.success(positionVo);
    }
}

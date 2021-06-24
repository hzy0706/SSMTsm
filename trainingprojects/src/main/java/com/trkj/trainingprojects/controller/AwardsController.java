package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.AwardsService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.AwardsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 奖项表(Awards)表控制层
 *
 * @author makejava
 * @since 2021-06-04 10:50:39
 */
@RestController
@Slf4j
public class AwardsController {

    @Resource
    private AwardsService awardsService;

    @GetMapping("/selectAllAwards")
    public PageInfo<AwardsVo> selectAllAwards(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<AwardsVo> list = awardsService.selectAllAwards();
        PageInfo<AwardsVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addAwards")
    public AjaxResponse addAwards(@RequestBody @Valid AwardsVo awardsVo){
        awardsService.addAwards(awardsVo);
        return AjaxResponse.success(awardsVo);
    }

    @PutMapping("/updateByAwardsKey")
    public AjaxResponse updateByAwardsKey(@RequestBody @Valid AwardsVo awardsVo){
        Date date = new Date();
        awardsVo.setUpdatetime(date);
        awardsService.updateByAwardsKey(awardsVo);
        return  AjaxResponse.success(awardsVo);
    }

    @PutMapping("/deleteByAwards")
    public AjaxResponse deleteByAwards(@RequestBody @Valid AwardsVo awardsVo){
        Date date = new Date();
        awardsVo.setDeletetime(date);
        awardsVo.setTimeliness(1);
        awardsService.deleteByAwards(awardsVo);
        return AjaxResponse.success(awardsVo);
    }

}

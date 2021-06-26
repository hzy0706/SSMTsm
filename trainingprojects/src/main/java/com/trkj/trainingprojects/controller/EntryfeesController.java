package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.entity.Entryfees;
import com.trkj.trainingprojects.service.EntryfeesService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ClassTypeVo;
import com.trkj.trainingprojects.vo.EntryfeesVo;
import com.trkj.trainingprojects.vo.ExaminationContentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 报班缴费表(Entryfees)表控制层
 *
 * @author makejava
 * @since 2021-06-18 21:53:30
 */
@RestController
@Slf4j
public class EntryfeesController {

    @Resource
    private EntryfeesService entryfeesService;

    @GetMapping("/selectAllEntryFees")
    public PageInfo<EntryfeesVo> selectAllEntryFees(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<EntryfeesVo> list = entryfeesService.selectAllEntryFees();
        PageInfo<EntryfeesVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PutMapping("/updateEntryFees")
    public AjaxResponse updateEntryFees(@RequestBody @Valid EntryfeesVo entryfeesVo){
        Date date = new Date();
        entryfeesVo.setUpdatetime(date);
        entryfeesService.updateEntryFees(entryfeesVo);
        return  AjaxResponse.success(entryfeesVo);
    }

}

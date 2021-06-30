package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.entity.Entryfees;
import com.trkj.trainingprojects.service.EntryfeesService;
import com.trkj.trainingprojects.service.StudentoutstandingService;
import com.trkj.trainingprojects.util.RandomNumber;
import com.trkj.trainingprojects.vo.*;
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
    @Resource
    private StudentoutstandingService studentoutstandingService;

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

    @PutMapping("/updateByEntryFeeState")
    public AjaxResponse updateByEntryFeeState(@RequestBody @Valid EntryfeesVo entryfeesVo){
        Date date = new Date();
        entryfeesVo.setApprovaltime(date);
        entryfeesVo.setFeesState(1);//修改为已缴费
        entryfeesService.updateByEntryFeeState(entryfeesVo);
        return  AjaxResponse.success(entryfeesVo);
    }

    @PutMapping("/updateByEntryFeeState2")
    public AjaxResponse updateByEntryFeeState2(@RequestBody @Valid EntryfeesVo entryfeesVo){
        Date date = new Date();
        entryfeesVo.setRevokeapptime(date);
        entryfeesVo.setFeesState(0);//修改为未缴费
        entryfeesService.updateByEntryFeeState(entryfeesVo);
        return  AjaxResponse.success(entryfeesVo);
    }

    @PutMapping("/deleteByEntryFees")
    public AjaxResponse deleteByEntryFees(@RequestBody @Valid EntryfeesVo entryfeesVo){
        Date date = new Date();
        entryfeesVo.setDeletetime(date);
        entryfeesVo.setTimeliness(1);
        entryfeesService.deleteByEntryFees(entryfeesVo);
        return  AjaxResponse.success(entryfeesVo);
    }

    @PostMapping("/addEntryfees")
    public AjaxResponse addEntryfees(@RequestBody @Valid EntryfeesVo entryfeesVo){
        Date date = new Date();
        entryfeesVo.setAddtime(date);
        RandomNumber randomNumber = new RandomNumber();
        entryfeesVo.setFeesNumber("CW"+randomNumber.getLocalTrmSeqNum());//缴费编号
        entryfeesService.addEntryfees(entryfeesVo);
        return AjaxResponse.success(entryfeesVo);
    }

    @PostMapping("/addEntryfees2")
    public AjaxResponse addEntryfees2(@RequestBody @Valid EntryfeesVo entryfeesVo){
        entryfeesService.addEntryfees2(entryfeesVo);
        return AjaxResponse.success(entryfeesVo);
    }

    /*
    * 修改实收和累计欠费
    * */
    @PutMapping("/updateByEntryFeeStateByAccumulated")
    public AjaxResponse updateByEntryFeeStateByAccumulated(@RequestBody @Valid EntryfeesVo entryfeesVo){
        Date date = new Date();
        entryfeesVo.setUpdatetime(date);
        entryfeesService.updateByEntryFeeStateByAccumulated(entryfeesVo);
        return  AjaxResponse.success(entryfeesVo);
    }

    /*
    * 查询已经审核的缴费金额
    * */
    @GetMapping("/selectSumOnSheng")
    public AjaxResponse selectSumOnSheng(){
        int a = entryfeesService.selectSumOnSheng();
        return AjaxResponse.success(a);
    }

    /*
     * 查询还没有审核的缴费金额
     * */
    @GetMapping("/selectSumOnChe")
    public AjaxResponse selectSumOnChe(){
        int a = entryfeesService.selectSumOnChe();
        return AjaxResponse.success(a);
    }

    /*
     * 查询所有缴费金额
     * */
    @GetMapping("/selectSumOnAll")
    public AjaxResponse selectSumOnAll(){
        int a = entryfeesService.selectSumOnAll();
        return AjaxResponse.success(a);
    }

}

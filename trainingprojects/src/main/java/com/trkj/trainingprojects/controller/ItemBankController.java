package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.ItemBankService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ItemBankVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 考试题库表(ItemBank)表控制层
 *
 * @author makejava
 * @since 2021-06-02 12:54:43
 */
@RestController
@Slf4j
public class ItemBankController {

    @Resource
    private ItemBankService itembankService;

    @GetMapping("/selectAllItemBanks")
    public PageInfo<ItemBankVo> selectAllItemBanks(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<ItemBankVo> list = itembankService.selectAllItemBanks();
        PageInfo<ItemBankVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addItemBank")
    public AjaxResponse addItemBank(@RequestBody @Valid ItemBankVo itemBankVo){
        itembankService.addItemBank(itemBankVo);
        return AjaxResponse.success(itemBankVo);
    }

    @PutMapping("/updateByItemBankKey")
    public AjaxResponse updateByItemBankKey(@RequestBody @Valid ItemBankVo itemBankVo){
        Date date = new Date();
        itemBankVo.setUpdatetime(date);
        itembankService.updateByItemBankKey(itemBankVo);
        return  AjaxResponse.success(itemBankVo);
    }

    @PutMapping("/deleteByItemBank")
    public AjaxResponse deleteByItemBank(@RequestBody @Valid ItemBankVo itemBankVo){
        Date date = new Date();
        itemBankVo.setDeletetime(date);
        itemBankVo.setTimeliness(1);
        itembankService.deleteByItemBank(itemBankVo);
        return AjaxResponse.success(itemBankVo);
    }

    @GetMapping("/selectAllItemBankList")
    public AjaxResponse selectAllItemBankList(){
        List<ItemBankVo> list = itembankService.selectAllItemBanks();
        return AjaxResponse.success(list);
    }

    @GetMapping("/selectSumOnXuan1")
    public AjaxResponse selectSumOnXuan(){
        int a = itembankService.selectSumOnXuan();
        return AjaxResponse.success(a);
    }

    @GetMapping("/selectSumPan2")
    public AjaxResponse selectSumPan(){
        int a = itembankService.selectSumPan();
        return AjaxResponse.success(a);
    }

    @GetMapping("/selectSumOnWen3")
    public AjaxResponse selectSumOnWen(){
        int a = itembankService.selectSumOnWen();
        return AjaxResponse.success(a);
    }

    @GetMapping("/selectSumOnAll4")
    public AjaxResponse selectSumOnAll(){
        int a = itembankService.selectSumOnAll();
        return AjaxResponse.success(a);
    }

}

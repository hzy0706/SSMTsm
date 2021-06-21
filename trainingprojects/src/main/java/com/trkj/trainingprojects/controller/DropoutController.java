package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.DropoutService;
import com.trkj.trainingprojects.vo.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class DropoutController {
    @Resource
    private DropoutService dropoutService;

    @PostMapping("/addDropout")
    public AjaxResponse addDropout(@RequestBody @Valid DropoutVo dropoutVo){
        dropoutService.addDropout(dropoutVo);
        return AjaxResponse.success(dropoutVo);
    }

    @GetMapping("/selectByDropoutKey/{id}")
    public DropoutVo selectByDropoutKey(@PathVariable("id") Integer id){
        return dropoutService.selectByDropoutKey(id);
    }

    @GetMapping("/selectAllDropouts")
    public PageInfo<DropoutVo> selectAllDropouts(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<DropoutVo> list = dropoutService.selectAllDropouts();
        PageInfo<DropoutVo> pageInfo = new PageInfo<>(list);
        return  pageInfo;
    }

    @PutMapping("/updateByDropoutKeySelective")
    public AjaxResponse updateByDropoutKeySelective(@RequestBody @Valid DropoutVo dropoutVo){
        dropoutService.updateByDropoutKeySelective(dropoutVo);
        return AjaxResponse.success(dropoutVo);
    }

    @PutMapping("/deleteByDropoutKey/{id}/{deleteName}")
    public AjaxResponse deleteByDropoutKey(@PathVariable("id") String id,@PathVariable("deleteName") String deleteName){
        Date date = new Date();
        String[] ids= id.split(",");
        for (String s:ids){
            DropoutVo dropoutVo = new DropoutVo();
            dropoutVo.setDeletename(deleteName);
            dropoutVo.setDeletetime(date);
            dropoutVo.setTimeliness(1);
            dropoutVo.setDropId(Integer.parseInt(s));
            dropoutService.deleteByDropoutKey(dropoutVo);
        }
        return AjaxResponse.success(ids);
    }

    @PutMapping("/updateByJwApprovalDropoutKey")
    public AjaxResponse updateByJwApprovalDropoutKey(@RequestBody @Valid DropoutVo dropoutVo){
        dropoutVo.setJwApptime(new Date());
        dropoutService.updateByJwApprovalDropoutKey(dropoutVo);
        return AjaxResponse.success(dropoutVo);
    }

    @PutMapping("/updateByJwApprovalDropoutKey2")
    public AjaxResponse updateByJwApprovalDropoutKey2(@RequestBody @Valid DropoutVo dropoutVo){
        dropoutVo.setJwDroptimeapp(new Date());
        dropoutService.updateByJwApprovalDropoutKey2(dropoutVo);
        return AjaxResponse.success(dropoutVo);
    }

    @PutMapping("/updateByJwApprovalDropoutKey3")
    public AjaxResponse updateByJwApprovalDropoutKey3(@RequestBody @Valid DropoutVo dropoutVo){
        dropoutVo.setDropDate(new Date());
        dropoutService.updateByJwApprovalDropoutKey3(dropoutVo);
        return AjaxResponse.success(dropoutVo);
    }

    @PutMapping("/updateByJwApprovalDropoutKey4")
    public AjaxResponse updateByJwApprovalDropoutKey4(@RequestBody @Valid DropoutVo dropoutVo){
        dropoutVo.setDeletetime(new Date());
        dropoutService.updateByJwApprovalDropoutKey4(dropoutVo);
        return AjaxResponse.success(dropoutVo);
    }


}

















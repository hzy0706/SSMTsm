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
        System.out.println("-----------我在这"+dropoutVo.toString());
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

    @PutMapping("/deleteByDropoutKey/{ids}")
    public AjaxResponse deleteByDropoutKey(@PathVariable("ids") String ids){
        Date date = new Date();
        String[] id= ids.split(",");
        for (String s:id){
            DropoutVo dropoutVo = new DropoutVo();
            dropoutVo.setDeletetime(date);
            dropoutVo.setTimeliness(1);
            dropoutVo.setDropId(Integer.parseInt(s));
            dropoutService.deleteByDropoutKey(dropoutVo);
        }
        return AjaxResponse.success(id);
    }


}

















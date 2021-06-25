package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.SuspendeService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ShiftVo;
import com.trkj.trainingprojects.vo.SuspendeVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class SuspendeController {
    @Resource
    private SuspendeService suspendeService;

    @PostMapping("/addSuspende")
    public AjaxResponse addSuspende(@RequestBody @Valid SuspendeVo suspendeVo){
        suspendeService.addSuspende(suspendeVo);
        return AjaxResponse.success(suspendeVo);
    }

    @GetMapping("/selectBySuspendeKey/{id}")
    public SuspendeVo selectBySuspendeKey(@PathVariable("id") Integer id){
        return suspendeService.selectBySuspendeKey(id);
    }


    @PutMapping("/updateBySuspendeKeySelective")
    public AjaxResponse updateBySuspendeKeySelective(@RequestBody @Valid SuspendeVo suspendeVo){
        suspendeService.updateBySuspendeKeySelective(suspendeVo);
        return AjaxResponse.success(suspendeVo);
    }

    @PutMapping("/deleteBySuspendeKey{ids}")
    public AjaxResponse deleteBySuspendeKey(@PathVariable("ids") String ids){
        Date date = new Date();
        String[] id= ids.split(",");
        for (String s:id){
            SuspendeVo suspendeVo = new SuspendeVo();
            suspendeVo.setDeletetime(date);
            suspendeVo.setTimeliness(1);
            suspendeVo.setSuspendeId(Integer.parseInt(s));
            suspendeService.deleteBySuspendeKey(suspendeVo);
        }
        return AjaxResponse.success(id);
    }

    @GetMapping("/selectBySuspendeKeyStudents")
    public PageInfo<SuspendeVo> selectBySuspendeKeyStudents(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<SuspendeVo> list = suspendeService.selectBySuspendeKeyStudents();
        PageInfo<SuspendeVo> pageInfo = new PageInfo<>(list);
        return  pageInfo;
    }



}

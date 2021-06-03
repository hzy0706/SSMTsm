package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.MemorandumService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.MemorandumVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class MemorandumController {
    @Resource
    private MemorandumService memorandumService;

    @PostMapping("/addMemorandum")
    public AjaxResponse addMemorandum(@RequestBody @Valid MemorandumVo memorandumVo){
        memorandumService.addMemorandum(memorandumVo);
        return AjaxResponse.success(memorandumVo);
    }

    @GetMapping("/selectByMemorandumKey/{id}")
    public MemorandumVo selectByMemorandumKey(@PathVariable("id") Integer id){
        return memorandumService.selectByMemorandumKey(id);
    }

    @GetMapping("/selectByMemorandumEmpId")
    public PageInfo<MemorandumVo> selectByMemorandumEmpId(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize,@RequestParam("empId")int empId){
        PageHelper.startPage(currentPage,pageSize);
        List<MemorandumVo> list = memorandumService.selectByMemorandumEmpId(empId);
        PageInfo<MemorandumVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PutMapping("/updateByMemorandumKeySelective")
    public AjaxResponse updateByMemorandumKeySelective(@RequestBody @Valid MemorandumVo memorandumVo){
        memorandumService.updateByMemorandumKeySelective(memorandumVo);
        return AjaxResponse.success(memorandumVo);
    }

    @PutMapping("/deleteByMemorandumKey")
    public AjaxResponse deleteByMemorandumKey(@RequestBody @Valid MemorandumVo memorandumVo){
        memorandumService.deleteByMemorandumKey(memorandumVo);
        return AjaxResponse.success(memorandumVo);
    }
}

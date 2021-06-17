package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.DaillogService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.DaillogVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class DaillogController {
    @Resource
    private DaillogService daillogService;

   @PostMapping("/addDaillog")
    public AjaxResponse addDaillog(@RequestBody @Valid DaillogVo daillogVo){
       System.out.println("==================我在这"+daillogVo.toString());
       daillogService.addDaillog(daillogVo);
       return AjaxResponse.success(daillogVo);
   }

    @GetMapping("/selectByDaillogKey/{id}")
    public DaillogVo selectByDaillogKey(@PathVariable("id") Integer id){
        return daillogService.selectByDaillogKey(id);
    }

    @GetMapping("/selectByDaillogEmpId")
    public PageInfo<DaillogVo> selectByDaillogEmpId(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize, @RequestParam("empId")int empId){
        PageHelper.startPage(currentPage,pageSize);
        List<DaillogVo> list = daillogService.selectByDaillogEmpId(empId);
        PageInfo<DaillogVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }


    @PutMapping("/updateByDaillogKeySelective")
    public AjaxResponse updateByDaillogKeySelective(@RequestBody @Valid DaillogVo daillogVo){
        daillogVo.setUpdatetime(new Date());
        daillogService.updateByDaillogKeySelective(daillogVo);
        return AjaxResponse.success(daillogVo);
    }

    @PutMapping("/deleteByDaillogKey")
    public AjaxResponse deleteByDaillogKey(@RequestBody @Valid DaillogVo daillogVo){
        daillogVo.setDeletetime(new Date());
        daillogService.deleteByDaillogKey(daillogVo);
        return AjaxResponse.success(daillogVo);
    }

    @PutMapping("/updateStateByKey")
    public AjaxResponse updateStateByKey(@RequestBody @Valid DaillogVo daillogVo){
       daillogVo.setEndtime(new Date());
        daillogService.updateStateByKey(daillogVo);
        return AjaxResponse.success(daillogVo);
    }

    @PutMapping("/updateConductTypeByKey")
    public AjaxResponse updateConductTypeByKey(@RequestBody @Valid DaillogVo daillogVo){
        daillogVo.setBegintime(new Date());
        daillogService.updateConductTypeByKey(daillogVo);
        return AjaxResponse.success(daillogVo);
    }
}

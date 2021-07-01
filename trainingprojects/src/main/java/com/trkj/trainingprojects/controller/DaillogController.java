package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.DaillogService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.DaillogVo;
import com.trkj.trainingprojects.vo.MemorandumVo;
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
       daillogService.addDaillog(daillogVo);
       return AjaxResponse.success(daillogVo);
   }

    @GetMapping("/selectByDaillogKey")
    public DaillogVo selectByDaillogKey(@RequestParam("id") Integer id){
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
    public AjaxResponse deleteByDaillogKey(@RequestParam("id") String id,@RequestParam("deleteName") String deleteName){
        Date date = new Date();
        String[] ids= id.split(",");
        for (String s:ids){
            DaillogVo daillogVo = new DaillogVo();
            daillogVo.setDeletename(deleteName);
            daillogVo.setDeletetime(date);
            daillogVo.setTimeliness(1);
            daillogVo.setDaillogId(Integer.parseInt(s));
            daillogService.deleteByDaillogKey(daillogVo);
        }
        return AjaxResponse.success(ids);
    }

    @PutMapping("/OnUpdateStateByKey")
    public AjaxResponse OnUpdateStateByKey(@RequestBody @Valid DaillogVo daillogVo){
       daillogVo.setEndtime(new Date());
        daillogService.OnUpdateStateByKey(daillogVo);
        return AjaxResponse.success(daillogVo);
    }

    @PutMapping("/OnUpdateConductTypeByKey")
    public AjaxResponse OnUpdateConductTypeByKey(@RequestBody @Valid DaillogVo daillogVo){
        daillogVo.setBegintime(new Date());
        daillogService.OnUpdateConductTypeByKey(daillogVo);
        return AjaxResponse.success(daillogVo);
    }
}

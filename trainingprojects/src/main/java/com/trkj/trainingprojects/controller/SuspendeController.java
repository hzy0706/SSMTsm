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
        System.out.println("_-----------+++++++=我在这");
        System.out.println(suspendeVo.toString());
        return AjaxResponse.success(suspendeVo);
    }

    @GetMapping("/selectBySuspendeKey")
    public SuspendeVo selectBySuspendeKey(@RequestParam("id") Integer id){
        return suspendeService.selectBySuspendeKey(id);
    }


    @PutMapping("/updateBySuspendeKeySelective")
    public AjaxResponse updateBySuspendeKeySelective(@RequestBody @Valid SuspendeVo suspendeVo){
        suspendeService.updateBySuspendeKeySelective(suspendeVo);
        return AjaxResponse.success(suspendeVo);
    }

    @PutMapping("/deleteBySuspendeKey")
    public AjaxResponse deleteBySuspendeKey(@RequestParam("ids") String ids){
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
    //审批停课
    @PutMapping("/appBySuspende")
    public AjaxResponse appBySuspende(@RequestBody @Valid SuspendeVo suspendeVo){
        suspendeVo.setSuspendeapptime(new Date());
        suspendeService.appBySuspende(suspendeVo );
        return AjaxResponse.success(suspendeVo);
    }
    //驳回审批停课
    @PutMapping("/NoAppBySuspende")
    public AjaxResponse NoAppBySuspende(@RequestBody @Valid SuspendeVo suspendeVo){
        suspendeVo.setRevokeapptime(new Date());
        suspendeService.NoAppBySuspende(suspendeVo);
        return AjaxResponse.success(suspendeVo);
    }

    //删除单行
    @PutMapping("/deleteOneBySuspendeKey")
    public AjaxResponse deleteOneBySuspendeKey(@RequestBody @Valid SuspendeVo suspendeVo){
        suspendeVo.setDeletetime(new Date());
        suspendeService.deleteOneBySuspendeKey(suspendeVo);
        return AjaxResponse.success(suspendeVo);
    }

    //改变状态为3
    @PutMapping("/OnUpdateBackState")
    public AjaxResponse OnUpdateBackState(@RequestBody @Valid SuspendeVo suspendeVo){
        suspendeService.OnUpdateBackState(suspendeVo);
        return AjaxResponse.success(suspendeVo);
    }

    //改变状态为4
    @PutMapping("/OnUpdateRefundState")
    public AjaxResponse OnUpdateRefundState(@RequestBody @Valid SuspendeVo suspendeVo){
        suspendeService.OnUpdateRefundState(suspendeVo);
        return AjaxResponse.success(suspendeVo);
    }

}

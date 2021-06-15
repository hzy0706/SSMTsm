package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.ReturnvisitService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ReturnvisitVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class ReturnvisitController {
    @Resource
//    查询
    private ReturnvisitService returnvisitService;

    @GetMapping("/findReturnvisit")
    public PageInfo<ReturnvisitVo> findReturnvisit(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<ReturnvisitVo> list = returnvisitService.selectAllReturnvisit();
        for(ReturnvisitVo returnvisitVo:list){
            System.out.println("---------------"+returnvisitVo.toString());
        }
        PageInfo<ReturnvisitVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
//    增加
    @PostMapping("/addReturnvisit")
    public AjaxResponse addReturnvisit(@RequestBody @Valid ReturnvisitVo returnvisitVo){
        //有时间的
        Date date=new Date();
        returnvisitVo.setReturnvisitdate(date);
        returnvisitVo.setTimeliness(0);
        returnvisitService.addReturnvisit(returnvisitVo);
        return AjaxResponse.success(returnvisitVo);
    }
//    修改
    @PutMapping("/updateReturnvisit")
    public AjaxResponse updateReturnvisit(@RequestBody @Valid ReturnvisitVo returnvisitVo){
        returnvisitVo.setTimeliness(1);
        returnvisitService.updateReturnvisit(returnvisitVo);
        return AjaxResponse.success(returnvisitVo);
    }
//    删除
    @PutMapping("/delReturnvisit")
    public AjaxResponse delReturnvisit(@RequestBody @Valid ReturnvisitVo returnvisitVo){
//        时效性为1才可以删除
        returnvisitVo.setTimeliness(1);
        Date data=new Date();
//        删除人
        returnvisitVo.setDeletename("kkk");
//        删除时间
        returnvisitVo.setDeletetime(data);
        returnvisitVo.setReturnvisitdate(data);
        returnvisitService.delReturnVisit(returnvisitVo);
        return AjaxResponse.success(returnvisitVo);
    }
}

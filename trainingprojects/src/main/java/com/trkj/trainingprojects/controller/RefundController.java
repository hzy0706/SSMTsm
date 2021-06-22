package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.RefundService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.RefundVo;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class RefundController {
    @Resource
    private RefundService refundService;
    @GetMapping("/findRefund")
    public PageInfo<RefundVo> findRefund (@RequestParam("currentPage") int currentPage,@RequestParam("pagesize") int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<RefundVo> list=refundService.findRefund();
        PageInfo<RefundVo> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
    @PostMapping("/addRefund")
    public AjaxResponse addRefund(@RequestBody @Valid RefundVo refundVo){
        Date date=new Date();
        refundVo.setAddtime(date);
        refundVo.setTimeliness(0);
        refundService.addRefund(refundVo);
        return AjaxResponse.success(refundVo);
    }
    @PutMapping("/updateRefund")
    public AjaxResponse updateRefund(@RequestBody @Valid RefundVo refundVo){
        Date date= new Date();
        refundVo.setCwApptime(date);
        refundVo.setTimeliness(1);
        refundService.updateRefund(refundVo);
        return AjaxResponse.success(refundVo);
    }
    @PutMapping("/deleteRefund")
    public  AjaxResponse delete(@RequestBody @Valid RefundVo refundVo){
        Date date= new Date();
        refundVo.setCwDropapptime(date);
        refundVo.setTimeliness(1);
        refundService.deleteRefund(refundVo);
        return AjaxResponse.success(refundVo);
    }

}

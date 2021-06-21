package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.RefundService;
import com.trkj.trainingprojects.vo.RefundVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
}

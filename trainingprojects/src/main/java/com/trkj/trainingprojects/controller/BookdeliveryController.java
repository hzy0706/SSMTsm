package com.trkj.trainingprojects.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.BookdeliveryService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ArrVo;
import com.trkj.trainingprojects.vo.BookdeliveryVo;
import com.trkj.trainingprojects.vo.DeliveryddetailsVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class BookdeliveryController {
    @Resource
    private BookdeliveryService bookdeliveryService;

    @PostMapping("/addBookdelivery")
    public AjaxResponse addBookdelivery(@RequestBody @Valid List<ArrVo> list){
        BookdeliveryVo bookdeliveryVo = new BookdeliveryVo();
        bookdeliveryVo.setEmpId(list.get(0).getEmpId());
        bookdeliveryVo.setDeliverytype("学员购买支出");
        bookdeliveryVo.setTotal(list.get(0).getTotal());
        bookdeliveryVo.setAddname(list.get(0).getAddname());
        bookdeliveryService.addBookdelivery(bookdeliveryVo,list);
        return AjaxResponse.success(list);
    }


    @GetMapping("/selectAllBookdeliverysByState")
    public PageInfo<BookdeliveryVo> selectAllBookdeliverysByState(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize,
                                                           @RequestParam("state")String state, @RequestParam("value")String value){
        PageHelper.startPage(currentPage,pageSize);
        List<BookdeliveryVo> list = bookdeliveryService.selectAllBookdeliverysByState(Integer.parseInt(state),value);
        PageInfo<BookdeliveryVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PutMapping("/appBookdelivery")
    public AjaxResponse appBookdelivery(@RequestBody @Valid BookdeliveryVo bookdeliveryVo) {
        bookdeliveryVo.setApproval(1);
        bookdeliveryVo.setApptime(new Date());
        bookdeliveryService.appBookdelivery(bookdeliveryVo);
        return AjaxResponse.success(bookdeliveryVo);

    }

    @PutMapping("/updateBookdelivery")
    public AjaxResponse updateBookdelivery(@RequestBody @Valid BookdeliveryVo bookdeliveryVo){
        Date date = new Date();
        bookdeliveryService.updateByBookdeliveryKeySelective(bookdeliveryVo);
        return AjaxResponse.success(bookdeliveryVo);
    }

    @PutMapping("/deleteByBookdeliveryKey")
    public AjaxResponse deleteByBookdeliveryKey(@RequestBody @Valid BookdeliveryVo bookdeliveryVo){
        Date date = new Date();
        bookdeliveryVo.setDeletetime(date);
        bookdeliveryVo.setTimeliness(1);
        bookdeliveryService.deleteByBookdeliveryKey(bookdeliveryVo);
        return AjaxResponse.success(bookdeliveryVo);
    }
}

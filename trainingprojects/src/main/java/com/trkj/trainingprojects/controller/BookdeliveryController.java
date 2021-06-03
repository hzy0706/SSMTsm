package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.BookdeliveryService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.BookdeliveryVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class BookdeliveryController {
    @Resource
    private BookdeliveryService bookdeliveryService;
    @PostMapping("/addBookdelivery")
    public AjaxResponse addBookdelivery(@RequestBody @Valid BookdeliveryVo bookdeliveryVo){
        bookdeliveryService.addBookdelivery(bookdeliveryVo);
        return AjaxResponse.success(bookdeliveryVo);
    }

    @GetMapping("/selectAllBookdeliverys")
    public PageInfo<BookdeliveryVo> selectAllBookdeliverys(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<BookdeliveryVo> list = bookdeliveryService.selectAllBookdeliverys();
        PageInfo<BookdeliveryVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @GetMapping("/selectAllBookdelivery")
    public List<BookdeliveryVo> selectAllBookdelivery(){
        List<BookdeliveryVo> list = bookdeliveryService.selectAllBookdeliverys();
        return list;
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

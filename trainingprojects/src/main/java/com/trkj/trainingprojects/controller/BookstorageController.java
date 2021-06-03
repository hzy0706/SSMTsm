package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.BookstorageService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.BookstorageVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class  BookstorageController {
    @Resource
    private BookstorageService bookstorageService;

    @PostMapping("/addBookstorage")
    public AjaxResponse addBookstorage(@RequestBody @Valid BookstorageVo bookstorageVo){
        bookstorageService.addBookstorage(bookstorageVo);
        return AjaxResponse.success(bookstorageVo);
    }

    @GetMapping("/selectAllBookstorages")
    public PageInfo<BookstorageVo> selectAllBookstorages(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<BookstorageVo> list = bookstorageService.selectAllBookstorages();
        PageInfo<BookstorageVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @GetMapping("/selectAllBookstorage")
    public List<BookstorageVo> selectAllBookstorage(){
        List<BookstorageVo> list = bookstorageService.selectAllBookstorages();
        return list;
    }

    @PutMapping("/updateBookstorage")
    public AjaxResponse updateBookstorage(@RequestBody @Valid BookstorageVo bookstorageVo){
        Date date = new Date();
        bookstorageVo.setUpdatetime(date);
        bookstorageService.updateByBookstorageKeySelective(bookstorageVo);
        return AjaxResponse.success(bookstorageVo);
    }

    @PutMapping("/deleteByBookstorageKey")
    public AjaxResponse deleteByBookstorageKey(@RequestBody @Valid BookstorageVo bookstorageVo){
        Date date = new Date();
        bookstorageVo.setDeletetime(date);
        bookstorageVo.setTimeliness(1);
        bookstorageService.deleteByBookstorageKey(bookstorageVo);
        return AjaxResponse.success(bookstorageVo);
    }
}

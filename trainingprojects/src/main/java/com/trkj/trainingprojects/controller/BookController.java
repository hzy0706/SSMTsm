package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.BookService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.BookVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {
    @Resource
    private BookService bookService;

    @PostMapping("/addBook")
    public AjaxResponse addBook(@RequestBody @Valid BookVo bookVo){
        bookService.addBook(bookVo);
        return AjaxResponse.success(bookVo);
    }

    @GetMapping("/selectAllBooks")
    public PageInfo<BookVo> selectAllBooks(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<BookVo> list = bookService.selectAllBooks();
        PageInfo<BookVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @GetMapping("/selectAllBook")
    public List<BookVo> selectAllBook(){
        List<BookVo> list = bookService.selectAllBooks();
        return list;
    }

    @PutMapping("/updateBook")
    public AjaxResponse updateBook(@RequestBody @Valid BookVo bookVo){
        Date date = new Date();
        bookVo.setUpdatetime(date);
        bookService.updateByBookKeySelective(bookVo);
        return AjaxResponse.success(bookVo);
    }

    @PutMapping("/deleteByBookKey")
    public AjaxResponse deleteByBookKey(@RequestBody @Valid BookVo bookVo){
        Date date = new Date();
        bookVo.setDeletetime(date);
        bookVo.setTimeliness(1);
        bookService.deleteByBookKey(bookVo);
        return AjaxResponse.success(bookVo);
    }
}

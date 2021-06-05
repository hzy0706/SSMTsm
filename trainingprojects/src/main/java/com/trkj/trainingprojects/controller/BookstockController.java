package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.BookstockService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.BookstockVo;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class BookstockController {
    @Resource
    private BookstockService bookstockService;

    @PostMapping("/addBookstock")
    public AjaxResponse addBookstock(@RequestBody @Valid BookstockVo bookstockVo) {
        bookstockVo.setAddtime(new Date());
        bookstockService.addBookstock(bookstockVo);
        return AjaxResponse.success(bookstockVo);

    }

    @GetMapping("/selectByBookstockKey/{stockId}")
    public BookstockVo selectByBookstockKey(@PathVariable("stockId") Integer stockId) {
        return bookstockService.selectByBookstockKey(stockId);
    }

    @GetMapping("/selectByBookstockCheckedBy")
    public PageInfo<BookstockVo> selectByBookstockCheckedBy(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize,@RequestParam("checkedBy")int checkedBy) {
        PageHelper.startPage(currentPage,pageSize);
        List<BookstockVo> list = bookstockService.selectByBookstockCheckedBy(checkedBy);
        PageInfo<BookstockVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PutMapping("/updateByBookstockKeySelective")
    public int updateByBookstockKeySelective(BookstockVo bookstockVo) {
        bookstockVo.setUpdatetime(new Date());
        return bookstockService.updateByBookstockKeySelective(bookstockVo);
    }

    @PutMapping("/deleteByBookstockKey")
    public int deleteByBookstockKey(BookstockVo bookstockVo) {
        bookstockVo.setDeletetime(new Date());
        return bookstockService.deleteByBookstockKey(bookstockVo);
    }
}

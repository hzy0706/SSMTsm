package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.BookbackService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.BookbackVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class BookbackController {
    @Resource
    private BookbackService bookbackService;
    @PostMapping("/addBookback")
    public AjaxResponse addBookback(@RequestBody @Valid BookbackVo bookbackVo){
        bookbackService.addBookback(bookbackVo);
        return AjaxResponse.success(bookbackVo);
    }

    @GetMapping("/selectAllBookBackByFind")
    public PageInfo<BookbackVo> selectAllBookBackByFind(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize
                                                    , @RequestParam("status")String status, @RequestParam("value")String value){
        PageHelper.startPage(currentPage,pageSize);
        List<BookbackVo> list = bookbackService.selectAllBookBackByFind(Integer.parseInt(status),"%"+value+"%");
        PageInfo<BookbackVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @GetMapping("/selectAllBookback")
    public List<BookbackVo> selectAllBookback(){
        List<BookbackVo> list = bookbackService.selectAllBookbacks();
        return list;
    }

    @PutMapping("/updateBookback")
    public AjaxResponse updateBookback(@RequestBody @Valid BookbackVo bookbackVo){
        Date date = new Date();
        bookbackVo.setUpdatetime(date);
        bookbackService.updateByBookbackKeySelective(bookbackVo);
        return AjaxResponse.success(bookbackVo);
    }
    @PutMapping("/appBookback")
    public AjaxResponse appBookback(@RequestBody @Valid BookbackVo bookbackVo){
        bookbackService.appBookback(bookbackVo);
        return AjaxResponse.success(bookbackVo);
    }
    @PutMapping("/deleteByBookbackKey")
    public AjaxResponse deleteByBookbackKey(@RequestBody @Valid BookbackVo bookbackVo){
        Date date = new Date();
        bookbackVo.setDeletetime(date);
        bookbackVo.setTimeliness(1);
        bookbackService.deleteByBookbackKey(bookbackVo);
        return AjaxResponse.success(bookbackVo);
    }
}

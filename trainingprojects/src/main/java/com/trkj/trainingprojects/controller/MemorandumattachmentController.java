package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.MemorandumattachmentService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.MemorandumattachmentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class MemorandumattachmentController {
    @Resource
    private MemorandumattachmentService memorandumattachmentService;
//    查询
    @GetMapping("/findMemorandumattachment")
    public PageInfo<MemorandumattachmentVo> findMemorandumattachment(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<MemorandumattachmentVo> list=memorandumattachmentService.selectAllMemorandumattachment();
        PageInfo<MemorandumattachmentVo> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
//    增加
    @PostMapping("/addMemorandumattachment")
    public AjaxResponse addMemorandumattachment(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        memorandumattachmentService.addMemorandumattachment(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }
    //    修改
    @PutMapping("/updateMemorandumattachment")
    public AjaxResponse updateMemorandumattachment(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        memorandumattachmentService.updateMemorandumattachment(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }
//    删除
    @PutMapping("/delMemorandumattachment")
    public AjaxResponse delMemorandumattachment(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        memorandumattachmentService.delMemorandumattachment(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }
}

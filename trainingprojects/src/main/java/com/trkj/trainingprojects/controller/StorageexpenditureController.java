package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.StorageexpenditureService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.StorageexpenditureVo;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class StorageexpenditureController {
    @Resource
    private StorageexpenditureService storageexpenditureService;
    @PostMapping("/addStorageexpenditure")
    public int addStorageexpenditure(@RequestBody @Valid StorageexpenditureVo storageexpenditureVo) {
        storageexpenditureVo.setAddtime(new Date());
        return storageexpenditureService.addStorageexpenditure(storageexpenditureVo);
    }

    @GetMapping("/selectByStorageexpenditureKey/{storageexpenditureId}")
    public StorageexpenditureVo selectByStorageexpenditureKey(@PathVariable("storageexpenditureId") Integer storageexpenditureId) {
        return storageexpenditureService.selectByStorageexpenditureKey(storageexpenditureId);
    }

    @GetMapping("/selectByStorageexpenditureApproval")
    public PageInfo<StorageexpenditureVo> selectByStorageexpenditureApproval(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize,@RequestParam("checkedBy")int approval) {
        PageHelper.startPage(currentPage,pageSize);
        List<StorageexpenditureVo> list = storageexpenditureService.selectByStorageexpenditureApproval(approval);
        PageInfo<StorageexpenditureVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PutMapping("/updateByStorageexpenditureKeySelective")
    public int updateByStorageexpenditureKeySelective(@RequestBody @Valid StorageexpenditureVo storageexpenditureVo) {
        storageexpenditureVo.setUpdatetime(new Date());
        return storageexpenditureService.updateByStorageexpenditureKeySelective(storageexpenditureVo);
    }

    @PutMapping("/deleteByStorageexpenditureKey")
    public int deleteByStorageexpenditureKey(@RequestBody @Valid StorageexpenditureVo storageexpenditureVo) {
        storageexpenditureVo.setDeletetime(new Date());
        return storageexpenditureService.deleteByStorageexpenditureKey(storageexpenditureVo);
    }
    @PutMapping("/appStorageexpenditure")
    public AjaxResponse appStorageexpenditure(@RequestBody @Valid StorageexpenditureVo storageexpenditureVo){
        storageexpenditureService.appStorageexpenditure(storageexpenditureVo);
        return AjaxResponse.success();
    }
}

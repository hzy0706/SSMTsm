package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.OpJournalService;
import com.trkj.trainingprojects.vo.OpjournalVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class OpJournalController {
    @Resource
    private OpJournalService opJournalService;
    @GetMapping("/selectAllOpjournal")
    public PageInfo<OpjournalVo> selectAllOpjournal(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<OpjournalVo> list = opJournalService.selectAllOpjournal();
        PageInfo<OpjournalVo> pageInfo = new PageInfo<>(list);
        return  pageInfo;
    }
    @GetMapping("/selectAllOpjournalByType")
    public PageInfo<OpjournalVo> selectAllOpjournalByType(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize,@RequestParam("choice")String choice){
        PageHelper.startPage(currentPage,pageSize);
        List<OpjournalVo> list = opJournalService.selectAllOpjournalByType("%"+choice+"%");
        PageInfo<OpjournalVo> pageInfo = new PageInfo<>(list);
        return  pageInfo;
    }
}

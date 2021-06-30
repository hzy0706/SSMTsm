package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.LoginjournalService;
import com.trkj.trainingprojects.vo.LoginjournalVo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LoginjournalController {
    @Resource
    private LoginjournalService loginjournalService;
    @GetMapping("/selectAllLoginjournals")
    public PageInfo<LoginjournalVo> selectAllLoginjournals(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize,
                                                           @RequestParam("value")String value){
        PageHelper.startPage(currentPage,pageSize);
        List<LoginjournalVo> list = loginjournalService.selectAllLoginjournals("%"+value+"%");
        PageInfo<LoginjournalVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}

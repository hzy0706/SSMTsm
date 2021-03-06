package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.OpJournalService;
import com.trkj.trainingprojects.util.GetTime;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.OpjournalVo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class OpJournalController {
    @Resource
    private OpJournalService opJournalService;
    @GetMapping("/selectAllOpjournalByType")
    public PageInfo<OpjournalVo> selectAllOpjournalByType(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize,
                                                          @RequestParam("value")String value,@RequestParam("type")String type){
        if(type.equals("所有方式")){
            PageHelper.startPage(currentPage,pageSize);
            List<OpjournalVo> list = opJournalService.selectAllOpjournalByType("%"+value+"%");
            PageInfo<OpjournalVo> pageInfo = new PageInfo<>(list);
            return  pageInfo;
        }else{
            PageHelper.startPage(currentPage,pageSize);
            List<OpjournalVo> list = opJournalService.selectAllOpjournalByType2("%"+value+"%","%"+type+"%");
            PageInfo<OpjournalVo> pageInfo = new PageInfo<>(list);
            return  pageInfo;
        }

    }

    @DeleteMapping("/deleteOpjournalByTime")
    public AjaxResponse deleteOpjournalByTime(@RequestParam("deleteType")int deleteType){
        if(deleteType==0){
            opJournalService.deleteAllOpjournal();
        }else{
            GetTime getTime = new GetTime();
            String time = getTime.getTime(deleteType);
            opJournalService.deleteOpjournalByTime(time);
        }
        return AjaxResponse.success();
    }
}

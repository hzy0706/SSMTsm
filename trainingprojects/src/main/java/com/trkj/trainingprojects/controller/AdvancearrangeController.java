package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.Opservice.AdvancearrangeService;
import com.trkj.trainingprojects.vo.AdvancearrangeVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdvancearrangeController {
    @Resource
    private AdvancearrangeService advancearrangeService;
    @GetMapping("selectAllAdvancearrange")
    public List<AdvancearrangeVo> selectAllAdvancearrange(){
        List<AdvancearrangeVo> advancearrangeVoList = advancearrangeService.selectAllAdvancearrange();
        return advancearrangeVoList;
    }
}

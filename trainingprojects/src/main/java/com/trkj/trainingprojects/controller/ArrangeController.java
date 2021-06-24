package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.service.ArrangeService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.ArrangeFormVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class ArrangeController {
    @Resource
    private ArrangeService arrangeService;
    @PostMapping("checkedArrange")
    public AjaxResponse checkedArrange(@RequestBody @Valid List<ArrangeFormVo> arrangeFormVoList){
        for (ArrangeFormVo arrangeFormVo:arrangeFormVoList){
            System.out.println(arrangeFormVo.toString());
        }
        return AjaxResponse.success();
    }
}

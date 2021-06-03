package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.service.EnterpriseService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.EnterpriseVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;

@RestController
public class EnterpriseController {
    @Resource
    private EnterpriseService enterpriseService;

    @GetMapping("/selectByEnterpriseKey")
    public EnterpriseVo selectByEnterpriseKey(){
        return  enterpriseService.selectByEnterpriseKey();
    }

    @PutMapping("/updateByEnterpriseKeySelective")
    public AjaxResponse updateByEnterpriseKeySelective(@RequestBody @Valid EnterpriseVo enterpriseVo){
        Date date = new Date();
        enterpriseVo.setUpdatetime(date);
        enterpriseService.updateByEnterpriseKeySelective(enterpriseVo);
        return AjaxResponse.success(enterpriseVo);
    }
}

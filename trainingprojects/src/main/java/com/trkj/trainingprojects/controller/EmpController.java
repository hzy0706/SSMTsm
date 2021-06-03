package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.service.EmpService;
import com.trkj.trainingprojects.vo.EmpVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {
    @Resource
    private EmpService empService;
    @GetMapping("/selectAllIncumbencyEmp")
    public List<EmpVo> selectAllIncumbencyEmp(){
        List<EmpVo> list = empService.selectAllIncumbencyEmps();
        return list;
    }
}

package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.EmpService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.EmpVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class EmpController {
    @Resource
    private EmpService empService;
    @GetMapping("/selectAllEmpList")
    public List<EmpVo> selectAllIncumbencyEmp(){
        List<EmpVo> list = empService.selectAllIncumbencyEmps();
        return list;
    }
    @GetMapping("/selectAllEmp")
    public PageInfo<EmpVo> selectAllUnit(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<EmpVo> list=this.empService.selectAllEmps();
        PageInfo<EmpVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @PostMapping("/addEmp")
    public AjaxResponse addUnitALL(@RequestBody @Valid  EmpVo empVo){
//        char i = empVo.getBirthday().toString().charAt(9);
//        System.out.println(i+"............");
//        int num = Integer.parseInt(String.valueOf(i));
//        System.out.println("-----------"+num);
//        num=num+1;
//        String as=String.valueOf(num);
//        StringBuilder sb=new StringBuilder(as);
//        String time=empVo.getBirthday().toString().substring(0,9);
//        System.out.println("--------------"+time);
//        sb.insert(0,time);
//        time=sb.toString();
//        empVo.setBirthday(new Date(time));
        empService.addEmp(empVo);
        return AjaxResponse.success(empVo);
    }

}

package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.EmpService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.EmpVo;
import com.trkj.trainingprojects.vo.ShiftVo;
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

    @GetMapping("/selectEmpByEmpId")
    public EmpVo selectEmpByEmpId(@RequestParam("id") Integer id){
        return empService.selectEmpByEmpId(id);
    }

    @GetMapping("/selectAllEmp")
    public PageInfo<EmpVo> selectAllUnit(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<EmpVo> list=this.empService.selectAllEmps();
        PageInfo<EmpVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectAllEmpByName")
    public PageInfo<EmpVo> selectAllEmpByName(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize,
                                                @RequestParam("value")String value) {
        PageHelper.startPage(currentPage,pageSize);
        List<EmpVo> list=empService.selectAllEmpByName("%"+value+"%");
        PageInfo<EmpVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @PostMapping("/addEmp")
    public AjaxResponse addUnitALL(@RequestBody @Valid  EmpVo empVo){
        empService.addEmp(empVo);
        return AjaxResponse.success(empVo);
    }

}

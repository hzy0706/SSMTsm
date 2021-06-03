package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.DeptService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.DeptVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class DeptController {
    @Resource
    private DeptService deptService;

    @PostMapping("/addDept")
    public AjaxResponse addDept(@RequestBody @Valid DeptVo deptVo){
        deptService.addDept(deptVo);
        return  AjaxResponse.success(deptVo);
    }

    @GetMapping("/selectAllDept")
    public AjaxResponse selectAll(){
        List<DeptVo> list =deptService.selectAllDepts();
        return  AjaxResponse.success(list);
    }

    @GetMapping("/selectAllDepts")
    public PageInfo<DeptVo> selectAllDepts(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<DeptVo> list = deptService.selectAllDepts();
        PageInfo<DeptVo> pageInfo = new PageInfo<>(list);
        return  pageInfo;
    }

    @PutMapping("/updateDept")
    public AjaxResponse updateDept(@RequestBody @Valid DeptVo deptVo){
        Date date = new Date();
        deptVo.setUpdatetime(date);
        deptService.updateByDeptKeySelective(deptVo);
        return  AjaxResponse.success(deptVo);
    }

    @PutMapping("/deleteByDeptKey/{ids}/{deleteName}")
    public AjaxResponse deleteByDeptKey(@PathVariable("ids") String ids,@PathVariable("deleteName") String deleteName){
        Date date = new Date();
        String[] id= ids.split(",");
        for (String s:id){
            DeptVo deptVo = new DeptVo();
            deptVo.setDeletename(deleteName);
            deptVo.setDeletetime(date);
            deptVo.setTimeliness(1);
            deptVo.setDeptId(Integer.parseInt(s));
            deptService.deleteByDeptKey(deptVo);
        }

        return  AjaxResponse.success(id);
    }

}

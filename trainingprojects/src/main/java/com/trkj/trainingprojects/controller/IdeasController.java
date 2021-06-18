package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.IdeasService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.DeptVo;
import com.trkj.trainingprojects.vo.IdeasVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class IdeasController {
    @Resource
    private IdeasService ideasService;

    @PostMapping("/addIdeas")
    public AjaxResponse addIdeas(@RequestBody @Valid IdeasVo ideasVo){
        ideasService.addIdeas(ideasVo);
        return AjaxResponse.success(ideasVo);
    }

    @GetMapping("/selectByIdeasKey/{id}")
    public IdeasVo selectByIdeasKey(  @PathVariable("id") Integer id){
        return ideasService.selectByIdeasKey(id);
    }

    @GetMapping("/selectByIdeasEmpId")
    public PageInfo<IdeasVo> selectByIdeasEmpId(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize, @RequestParam("empId")int empId){
        PageHelper.startPage(currentPage,pageSize);
        List<IdeasVo> list = ideasService.selectByIdeasEmpId(empId);
        PageInfo<IdeasVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }


    @PutMapping("/updateByIdeasKeySelective")
    public AjaxResponse updateByIdeasKeySelective(@RequestBody @Valid IdeasVo ideasVo){
        ideasService.updateByIdeasKeySelective(ideasVo);
        return AjaxResponse.success(ideasVo);
    }

    @PutMapping("/deleteByIdeasKey/{id}/{deleteName}")
    public AjaxResponse deleteByIdeasKey(@PathVariable("id") String id,@PathVariable("deleteName") String deleteName){
        Date date = new Date();
        String[] ids= id.split(",");
        for (String s:ids){
            IdeasVo ideasVo = new IdeasVo();
            ideasVo.setDeletename(deleteName);
            ideasVo.setDeletetime(date);
            ideasVo.setTimeliness(1);
            ideasVo.setIdeasId(Integer.parseInt(s));
            ideasService.deleteByIdeasKey(ideasVo);
        }

        return  AjaxResponse.success(ids);
    }

}























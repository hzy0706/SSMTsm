package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.Opservice.IdeasService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.IdeasVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;

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
    public IdeasVo selectByIdeasKey(@PathVariable("id") Integer id){
        return ideasService.selectByIdeasKey(id);
    }

    @PutMapping("/updateByIdeasKeySelective")
    public AjaxResponse updateByIdeasKeySelective(@RequestBody @Valid IdeasVo ideasVo){
        ideasService.updateByIdeasKeySelective(ideasVo);
        return AjaxResponse.success(ideasVo);
    }

    @PutMapping("/deleteByIdeasKey")
    public AjaxResponse deleteByIdeasKey(@RequestBody @Valid IdeasVo ideasVo){
        ideasVo.setDeletetime(new Date());
        ideasService.deleteByIdeasKey(ideasVo);
        return AjaxResponse.success(ideasVo);
    }


}























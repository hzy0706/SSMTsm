package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.BackService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.BackVo;
import com.trkj.trainingprojects.vo.ShiftVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class BackController {
    @Resource
    private BackService backService;

    @PostMapping("/addBack")
    public AjaxResponse addBack(@RequestBody @Valid BackVo backVo){
        backService.addBack(backVo);
        return AjaxResponse.success(backVo);
    }

    @GetMapping("/selectByBackKey")
    public BackVo selectByBackKey(@RequestParam("id") Integer id){
        return backService.selectByBackKey(id);
    }

    @GetMapping("/selectAllBacks")
    public PageInfo<BackVo> selectAllBacks(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<BackVo> list = backService.selectAllBacks();
        PageInfo<BackVo> pageInfo = new PageInfo<>(list);
        return  pageInfo;
    }


    @PutMapping("/updateByBackKeySelective")
    public AjaxResponse updateByBackKeySelective(@RequestBody @Valid BackVo backVo){
        backVo.setUpdatetime(new Date());
        backService.updateByBackKeySelective(backVo);
        return AjaxResponse.success(backVo);
    }

    @DeleteMapping("/deleteByBackKey")
    public AjaxResponse deleteByBackKey(@RequestParam("ids") String ids , @RequestParam("deletename") String deletename){
        Date date = new Date();
        String[] id= ids.split(",");
        for (String s:id){
            BackVo backVo = new BackVo();
            backVo.setDeletetime(date);
            backVo.setDeletename(deletename);
            backVo.setTimeliness(1);
            backVo.setBackId(Integer.parseInt(s));
            backService.deleteByBackKey(backVo);
        }
        return AjaxResponse.success("成功删除");
    }
}

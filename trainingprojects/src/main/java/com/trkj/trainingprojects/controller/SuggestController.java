package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.SuggestService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.EmpVo;
import com.trkj.trainingprojects.vo.SuggestVo;
import com.trkj.trainingprojects.vo.UnitVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * 意见箱表(Suggest)表控制层
 *
 * @author makejava
 * @since 2021-06-04 17:11:12
 */
@RestController
@RequestMapping("suggest")
public class SuggestController {
    /**
     * 服务对象
     */
    @Resource
    private SuggestService suggestService;


    /**
     * 查询所有
     *
     */
    @GetMapping("selectall")
    public PageInfo<SuggestVo> selectall(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        System.out.println(currentPage+"-----"+pageSize);
        PageHelper.startPage(currentPage,pageSize);
        List<SuggestVo> list=this.suggestService.selectAll();
        PageInfo<SuggestVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @PostMapping("/addSuggest")
    public AjaxResponse addUnitALL(@RequestBody @Valid SuggestVo suggestVo){
        suggestService.addSuggest(suggestVo);
        return AjaxResponse.success(suggestVo);
    }
    /**
     * 修改
     * @param suggestVo
     * @return
     */
    @PutMapping("/updateSuggest")
    public  AjaxResponse updateUnitById(@RequestBody @Valid SuggestVo suggestVo){
        suggestService.updateSuggest(suggestVo);
        return AjaxResponse.success(suggestVo);
    }
    @PutMapping("/delSuggest")
    public  AjaxResponse delUnitById(@RequestBody @Valid SuggestVo suggestVo){
        suggestService.delSuggestById(suggestVo);
        return AjaxResponse.success(suggestVo);
    }
}
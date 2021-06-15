package com.trkj.trainingprojects.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.SemesterService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.SemesterVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * 学期表(Semester)表控制层
 *
 * @author makejava
 * @since 2021-06-02 16:24:12
 */
@RestController
@RequestMapping("semester")
public class SemesterController {
    /**
     * 服务对象
     */
    @Resource
    private SemesterService semesterService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/selectall")
    public PageInfo<SemesterVo> selectall(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        System.out.println(currentPage+"-----"+pageSize);
        PageHelper.startPage(currentPage,pageSize);
        List <SemesterVo> list=this.semesterService.selectALL();
        PageInfo<SemesterVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
//    public PageInfo<SessionVo> selectall(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
//        System.out.println(currentPage+"-----"+pageSize);
//        PageHelper.startPage(currentPage,pageSize);
//        List<SessionVo> list=this.sessionService.selectAll();
//        PageInfo<SessionVo> pageInfo = new PageInfo<>(list);
//        return pageInfo;
//    }
    /**
     * 根据id查询单条
     * @return
     */
    @GetMapping("/selectById")
    public AjaxResponse selectById(@RequestParam("id")int id){
        return AjaxResponse.success(id);
    }

    /**
     * 新增
     * @param semesterVo
     * @return
     */
    @PostMapping("/addSemesterALL")
    public AjaxResponse addSemesterALL(@RequestBody @Valid SemesterVo semesterVo){
        semesterService.addSemesterALL(semesterVo);
        return AjaxResponse.success(semesterVo);
    }

    /**
     * 修改
     * @param semesterVo
     * @return
     */
    @PutMapping("/updateSemesterById")
    public  AjaxResponse updateSemesterById(@RequestBody @Valid SemesterVo semesterVo){
        semesterService.updateSemesterById(semesterVo);
        return AjaxResponse.success(semesterVo);
    }
    /**
     * 删除
     */
    @PutMapping("/delSemesterById")
    public AjaxResponse delSemesterById(@RequestBody @Valid SemesterVo semesterVo){

        semesterService.delSemesterById(semesterVo);
        return AjaxResponse.success(semesterVo);
    }
}
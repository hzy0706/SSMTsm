package com.trkj.trainingprojects.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trkj.trainingprojects.entity.Semester;
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
    public AjaxResponse selectall(){
        List <SemesterVo> list=this.semesterService.selectALL();
        return AjaxResponse.success(list);
    }
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
    public AjaxResponse addSemesterALL(@RequestBody String semesterVo){
        JSONObject jsonObject = JSON.parseObject(semesterVo);
        System.out.println("json::"+jsonObject);
        String one = jsonObject.getString("semesterVo");
        System.out.println(one);
        SemesterVo a = JSON.parseObject(one,SemesterVo.class);
        a.setAddname("军");
        System.out.println("aaa::"+a.getSemesterName());
        this.semesterService.addSemesterALL(a);
        return AjaxResponse.success("新增成功");
    }

    @PostMapping("/add")
    public AjaxResponse add(@RequestBody String semesterVo){
        JSONObject jsonObject = JSON.parseObject(semesterVo);
        System.out.println("json::"+jsonObject);
        String one = jsonObject.getString("semesterVo");
        System.out.println(one);
        SemesterVo a = JSON.parseObject(one,SemesterVo.class);
        a.setAddname("军");
        System.out.println("aaa::"+a.getSemesterName());
        String uname=a.getSemesterName();
        String adname=a.getAddname();
        this.semesterService.add(uname,adname);
        return AjaxResponse.success("新增成功");
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
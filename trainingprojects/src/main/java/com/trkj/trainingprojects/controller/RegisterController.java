package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.service.RegisterService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.RegisterVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class RegisterController {
    @Resource
    private RegisterService registerService;
//    查询
    @GetMapping("/findRegister")
    public PageInfo<RegisterVo> findRegister(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
//       分页
        PageHelper.startPage(currentPage,pageSize);
        List<RegisterVo> list = registerService.selectAllRegister();
        PageInfo<RegisterVo> pageInfo= new PageInfo<>(list);
        return pageInfo;
    }
//    增加
    @PostMapping("/addRegister")
    public AjaxResponse addRegister(@RequestBody @Valid RegisterVo registerVo){
        Date date=new Date();
        registerVo.setAddtime(date);
        registerVo.setTimeliness(0);
        registerService.addRegister(registerVo);
        return AjaxResponse.success(registerVo);
    }
//    修改
    @PutMapping("/updateRegister")
    public AjaxResponse updateRegister(@RequestBody @Valid RegisterVo registerVo){
        Date date=new Date();
        registerVo.setUpdatetime(date);
        registerVo.setTimeliness(1);
        registerService.updateRegister(registerVo);
        return AjaxResponse.success(registerVo);
    }
//    删除
    @PutMapping("/delRegister")
    public AjaxResponse delRegister(@RequestBody @Valid RegisterVo registerVo){
        Date date=new Date();
        registerVo.setDeletetime(date);
        registerVo.setTimeliness(1);
        registerService.delRegister(registerVo);
        return AjaxResponse.success(registerVo);
    }
//    外键查询
    @GetMapping("/findRegisterList")
    public List<RegisterVo> findRegisterList() {
        List<RegisterVo> list = registerService.selectAllRegister();
        return list;
    }
//    模糊查询
    @GetMapping("/mohuRegister/{value}")
    public List<RegisterVo> mohuRegister(@PathVariable("value") String value){
       List<RegisterVo> list=registerService.mohuRegister(value);
        return list;
    }
    @PutMapping("/updateShRegister/{id}/{name}")
    public AjaxResponse updateShRegister(@PathVariable ("id") int id,@PathVariable ("name") String name,@RequestBody @Valid RegisterVo registerVo){
        Date date=new Date();
        registerVo.setUpdatetime(date);
        registerVo.setUpdatename(name);
        registerVo.setAttentstate(2);
        registerService.updateShRegister(registerVo);
        return AjaxResponse.success(registerVo);
    }
    /**
     * 修改缴费状态，并自动生成一条缴费记录
     */
    @PutMapping("/updateRegisterState")
    public AjaxResponse updateRegisterState(@RequestBody @Valid RegisterVo registerVo){
        registerService.updateRegisterState(registerVo);
        return AjaxResponse.success(registerVo);
    }
}

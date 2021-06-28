package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.TestService.RoleService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.SysRoleVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RoleController {
    @Resource
    private RoleService roleService;

    @GetMapping("/selectAllrole")
    public PageInfo<SysRoleVo> selectAllrole(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize) {
        PageHelper.startPage(currentPage, pagesize);
        List<SysRoleVo> roleVos=roleService.selectAllRole();
        PageInfo<SysRoleVo> roleVoPageInfo = new PageInfo<>(roleVos);
        return roleVoPageInfo;
    }

    @PostMapping("/insertrole")
    public AjaxResponse insertUnit(@RequestBody SysRoleVo roleVo){
        roleService.addRole(roleVo);
        return AjaxResponse.success();
    }

    @GetMapping("/selectArole")
    public List<SysRoleVo> selectArole() {
        List<SysRoleVo> roleVos=roleService.selectAllRole();
        return roleVos;
    }
}

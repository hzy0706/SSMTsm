package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.TestService.RoleService;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.SysRoleVo;
import com.trkj.trainingprojects.vo.SysUserRoleVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
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

    @PutMapping("/updateByRoleKeySelective")
    public AjaxResponse updateByRoleKeySelective(@RequestBody @Valid SysRoleVo roleVo){
        roleVo.setUpdatetime(new Date());
        roleService.updateByRoleKeySelective(roleVo);
        return AjaxResponse.success();
    }

    @GetMapping("/selectArole")
    public List<SysRoleVo> selectArole() {
        List<SysRoleVo> roleVos=roleService.selectAllRole();
        return roleVos;
    }
    @GetMapping("/selectAllRoleByEmpId")
    public List<SysUserRoleVo> selectAllRoleByEmpId(@RequestParam("empId") Integer empId) {
        List<SysUserRoleVo> sysRoleVos=roleService.selectAllRoleByEmpId(empId);
        return sysRoleVos;
    }

    @DeleteMapping("/deluserRoleByroleid")
    public AjaxResponse delAuthorByroleid(@RequestParam("empId") int empId, @RequestParam("Authors")String Authors) {
        roleService.deleteByUserIdKey(empId);
        String [] strs=Authors.split("&");
        List<Integer> arrayList=new ArrayList<>();
        for(int i=0,len=strs.length;i<len;i++){
            String[] a=strs[i].split("=");
            System.out.println(Integer.valueOf(a[1]));
            arrayList.add(Integer.valueOf(a[1]));
        }
        roleService.addUserRoleSelectives(arrayList,empId);
        return AjaxResponse.success("修改角色"+empId+"权限");
    }
}

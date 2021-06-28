package com.trkj.trainingprojects.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.trainingprojects.TestService.MenuService;
import com.trkj.trainingprojects.TestService.RoleMenuService;
import com.trkj.trainingprojects.entity.SysMenu;
import com.trkj.trainingprojects.util.MenuUtil;
import com.trkj.trainingprojects.vo.AjaxResponse;
import com.trkj.trainingprojects.vo.SysMenuVo;
import com.trkj.trainingprojects.vo.SysRoleVo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RoleMenuController {
    @Resource
    private RoleMenuService roleMenuService;
    @Resource
    private MenuService menuService;

    @DeleteMapping("/delAuthorByroleid")
    public AjaxResponse delAuthorByroleid(@RequestParam("roleid") int roleid, @RequestParam("Authors")String SAuthors) {
        roleMenuService.deleteByPrimaryKey(roleid);
        String [] strs=SAuthors.split("&");
        List<Integer> Authors=new ArrayList<>();
        for(int i=0,len=strs.length;i<len;i++){
            String[] a=strs[i].split("=");
            Authors.add(Integer.valueOf(a[1]));
        }
        roleMenuService.insertSelectives(Authors,roleid);
        return AjaxResponse.success("修改角色"+roleid+"权限");
    }

    @GetMapping("/selectMenuByroleid")
    public AjaxResponse selectMenuByroleid(@RequestParam("roleid") int roleid) {
        List<SysMenuVo>  sysMenus= menuService.findMenusByRoleid(roleid);
        return AjaxResponse.success(sysMenus);
    }
    @GetMapping("/selectMenus")
    public AjaxResponse selectMenus() {
        List<SysMenuVo>  sysMenus= menuService.findMenus();
        List<SysMenuVo>  sysMenuList= MenuUtil.assemberMenus2(sysMenus);
        return AjaxResponse.success(sysMenuList);
    }
}

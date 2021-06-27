package com.trkj.trainingprojects.controller;

import com.trkj.trainingprojects.Opservice.LoginjournalService;
import com.trkj.trainingprojects.TestService.JwtAuthService;
import com.trkj.trainingprojects.TestService.SysPermissionService;
import com.trkj.trainingprojects.TestService.UserService;
import com.trkj.trainingprojects.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SysLoginController {
    @Autowired
    private JwtAuthService jwtAuthService;
    @Autowired
    private SysPermissionService permissionService;
    @Autowired
    private UserService userService;
    @Autowired
    private LoginjournalService loginjournalService;
    @PostMapping("/signout")
    public AjaxResponse signout(){
        log.debug("开始退出操作");
        AjaxResponse ajaxResponse= AjaxResponse.success("已退出");
        SecurityContextHolder.clearContext();
        return ajaxResponse;
    }
    @PostMapping("/login")
    public AjaxResponse login(@RequestBody LoginVo loginVo){
        log.debug("开始验证,{}",loginVo);
        String token=jwtAuthService.login(loginVo.getUsername(),loginVo.getPassword());
        List<SysMenuVo> menus=permissionService.getMenuByUname(loginVo.getUsername());
        UserVo userVo = userService.findByUsername(loginVo.getUsername());
        userVo.setUsername(loginVo.getUsername());
        userVo.setValidate(true);
        userVo.setMenus(menus);
        userVo.setToken(token);
        System.out.println(userVo.toString());
        log.debug(menus.toString());
        //添加登录日志
        LoginjournalVo loginjournalVo = new LoginjournalVo();
        loginjournalVo.setEmpId(userVo.getEmpId());
        loginjournalService.addLoginjournal(loginjournalVo);
        return AjaxResponse.success(userVo);
    }
}

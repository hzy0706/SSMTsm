package com.trkj.trainingprojects.vo;

import lombok.Data;

import java.util.List;

@Data
public class UserVo {
    private int id;
    private String username;
    private int deptId;
    private String password;
    private String token;
    private boolean isValidate;
    private List<SysMenuVo> menus;
}

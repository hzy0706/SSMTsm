package com.trkj.trainingprojects.vo;

import lombok.Data;

import java.util.List;

@Data
public class UserVo {
    private int empId;
    private String username;
    private String empName;
    private int deptId;
    private String password;
    private String token;
    private boolean isValidate;
    private List<SysMenuVo> menus;
}

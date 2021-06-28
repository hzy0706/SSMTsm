package com.trkj.trainingprojects.TestService;

import com.trkj.trainingprojects.vo.SysRoleVo;

import java.util.List;

public interface RoleService {
    List<SysRoleVo> selectAllRole();

    int addRole(SysRoleVo record);
}

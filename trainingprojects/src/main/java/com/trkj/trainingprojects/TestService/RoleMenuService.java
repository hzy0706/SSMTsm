package com.trkj.trainingprojects.TestService;

import com.trkj.trainingprojects.vo.SysRoleMenuVo;

import java.util.List;

public interface RoleMenuService {
    SysRoleMenuVo selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insertSelectives(List<Integer> Authors,Integer roleid);
}

package com.trkj.trainingprojects.TestService;


import com.trkj.trainingprojects.vo.SysMenuVo;

import java.util.List;

public interface SysPermissionService {
    public List<SysMenuVo> getMenuByUname(String userName);
}

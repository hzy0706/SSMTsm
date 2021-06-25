package com.trkj.trainingprojects.TestService;


import com.trkj.trainingprojects.vo.SysMenuVo;

import java.util.List;

/***
 * @author 大熊
 * @date 2020-07-03
 * @Description:菜单（权限）业务接口
 * @version 1.0
 */
public interface MenuService {
    public List<SysMenuVo> findMenuByPidAndLevel(int pid, byte level);

}

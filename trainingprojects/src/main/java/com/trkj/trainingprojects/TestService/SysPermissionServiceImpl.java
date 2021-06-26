package com.trkj.trainingprojects.TestService;

import com.trkj.trainingprojects.dao.SysMenuDao;
import com.trkj.trainingprojects.dao.SysRoleDao;
import com.trkj.trainingprojects.util.MenuUtil;
import com.trkj.trainingprojects.vo.SysMenuVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Resource
    private SysRoleDao roleDao;
    @Resource
    private SysMenuDao menuDao;
    @Override
    public List<SysMenuVo> getMenuByUname(String userName) {
        List<SysMenuVo> list=menuDao.findMenusByRoleCodes( this.getRoleCodesByUname(userName));
        return MenuUtil.assemberMenus(list);
    }
    private List<String> getRoleCodesByUname(String userName){
        return roleDao.findRoleByUserName(userName);
    }
}

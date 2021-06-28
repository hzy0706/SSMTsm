package com.trkj.trainingprojects.TestService;

import com.trkj.trainingprojects.dao.SysRoleDao;
import com.trkj.trainingprojects.vo.SysRoleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private SysRoleDao sysRoleDao;
    @Override
    public List<SysRoleVo> selectAllRole() {
        return sysRoleDao.selectAllRole();
    }

    @Override
    public int addRole(SysRoleVo record) {
        return sysRoleDao.insert(record);
    }
}

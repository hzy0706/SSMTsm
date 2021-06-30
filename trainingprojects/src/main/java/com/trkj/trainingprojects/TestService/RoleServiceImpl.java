package com.trkj.trainingprojects.TestService;

import com.trkj.trainingprojects.dao.SysRoleDao;
import com.trkj.trainingprojects.dao.SysUserRoleDao;
import com.trkj.trainingprojects.vo.SysRoleVo;
import com.trkj.trainingprojects.vo.SysUserRoleVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private SysRoleDao sysRoleDao;
    @Resource
    private SysUserRoleDao sysUserRoleDao;
    @Override
    public List<SysRoleVo> selectAllRole() {
        return sysRoleDao.selectAllRole();
    }

    @Override
    @Transactional
    public int updateByRoleKeySelective(SysRoleVo record) {
        return sysRoleDao.updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional
    public int addRole(SysRoleVo record) {
        return sysRoleDao.insert(record);
    }

    @Override
    public List<SysUserRoleVo> selectAllRoleByEmpId(Integer emopId) {
        return sysUserRoleDao.selectAllRoleByEmpId(emopId);
    }

    @Override
    @Transactional
    public int deleteByUserIdKey(Integer id) {
        return sysUserRoleDao.deleteByUserIdKey(id);
    }

    @Override
    @Transactional
    public int addUserRoleSelectives(List<Integer> Authors, Integer userId) {
        return sysUserRoleDao.addUserRoleSelectives(Authors,userId);
    }
}

package com.trkj.trainingprojects.TestService;

import com.trkj.trainingprojects.dao.SysRoleMenuDao;
import com.trkj.trainingprojects.vo.SysRoleMenuVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RoleMenuServiceImpl implements RoleMenuService {
    @Resource
    private SysRoleMenuDao sysRoleMenuDao;
    @Override
    public SysRoleMenuVo selectByPrimaryKey(Integer id) {
        return sysRoleMenuDao.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int deleteByPrimaryKey(Integer id) {
        return sysRoleMenuDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelectives(List<Integer> Authors, Integer roleid) {
        return sysRoleMenuDao.insertSelectives(Authors,roleid);
    }
}

package com.trkj.trainingprojects.TestService;

import com.trkj.trainingprojects.vo.SysRoleVo;
import com.trkj.trainingprojects.vo.SysUserRoleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleService {
    List<SysRoleVo> selectAllRole();
    int updateByRoleKeySelective(SysRoleVo record);
    int addRole(SysRoleVo record);
    List<SysUserRoleVo> selectAllRoleByEmpId(Integer emopId);
    int deleteByUserIdKey(Integer id);
    int addUserRoleSelectives(@Param("Authors") List<Integer> Authors, @Param("userId") Integer userId);
}

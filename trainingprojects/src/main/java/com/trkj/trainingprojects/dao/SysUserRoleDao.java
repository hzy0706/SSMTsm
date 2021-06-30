package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.SysRoleVo;
import com.trkj.trainingprojects.vo.SysUserRoleVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserRoleDao {
    int deleteByUserIdKey(Integer id);

    int insert(SysUserRoleVo record);

    int insertSelective(SysUserRoleVo record);

    SysUserRoleVo selectByPrimaryKey(Integer id);

    List<SysUserRoleVo> selectAllRoleByEmpId(Integer emopId);

    int addUserRoleSelectives(@Param("Authors") List<Integer> Authors, @Param("userId") Integer userId);

    int updateByPrimaryKeySelective(SysUserRoleVo record);

    int updateByPrimaryKey(SysUserRoleVo record);
}
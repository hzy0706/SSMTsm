package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.SysUserRoleVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRoleVo record);

    int insertSelective(SysUserRoleVo record);

    SysUserRoleVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserRoleVo record);

    int updateByPrimaryKey(SysUserRoleVo record);
}
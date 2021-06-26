package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.SysRoleMenuVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleMenuDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleMenuVo record);

    int insertSelective(SysRoleMenuVo record);

    SysRoleMenuVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleMenuVo record);

    int updateByPrimaryKey(SysRoleMenuVo record);
}
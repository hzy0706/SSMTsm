package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.SysRoleMenuVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysRoleMenuDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleMenuVo record);

    int insertSelective(SysRoleMenuVo record);

    SysRoleMenuVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleMenuVo record);

    int insertSelectives(@Param("Authors") List<Integer> Authors,@Param("roleid") Integer roleid);

    int updateByPrimaryKey(SysRoleMenuVo record);
}
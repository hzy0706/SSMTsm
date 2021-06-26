package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.SysRoleVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleVo record);

    int insertSelective(SysRoleVo record);

    SysRoleVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleVo record);

    int updateByPrimaryKey(SysRoleVo record);

    List<String> findRoleByUserName(String username);
}
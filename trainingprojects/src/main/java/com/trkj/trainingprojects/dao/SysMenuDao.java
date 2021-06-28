package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.SysMenu;
import com.trkj.trainingprojects.vo.SysMenuVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysMenuDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMenuVo record);

    int insertSelective(SysMenuVo record);

    SysMenuVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMenuVo record);

    int updateByPrimaryKey(SysMenuVo record);

    List<SysMenuVo>  findMenusByRoleid(Integer roleId);
    List<SysMenuVo>  findMenus();

    List<String> findAuthorityByRoleCodes(@Param("roleCodes") List<String> roleCodes);
    List<SysMenuVo> findMenusByRoleCodes(@Param("roleCodes") List<String> roleCodes);
}
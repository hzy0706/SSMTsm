package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.DeptVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DeptDao {
    int deleteByDeptKey(Integer deptId);

    int insert(DeptVo record);

    int insertSelective(DeptVo record);

    List<DeptVo> selectAllDepts();

    DeptVo selectByDeptKey(Integer deptId);

    int updateByDeptKeySelective(DeptVo record);

    int updateByDeptKey(DeptVo deptVo);
}
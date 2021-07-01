package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.DeptVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DeptDao {
    void deleteByDeptKey(Integer deptId);

    void insert(DeptVo record);

    void insertSelective(DeptVo record);

    List<DeptVo> selectAllDepts();

    DeptVo selectByDeptKey(Integer deptId);

    void updateByDeptKeySelective(DeptVo record);

    void updateByDeptKey(DeptVo deptVo);
}
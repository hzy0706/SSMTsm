package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.DeptVo;

import java.util.List;

public interface DeptService {
    List<DeptVo> selectAllDepts();
    int addDept(DeptVo record);
    int deleteByDeptKey(DeptVo deptVo);
    DeptVo selectByDeptKey(Integer deptId);
    int updateByDeptKeySelective(DeptVo record);
}

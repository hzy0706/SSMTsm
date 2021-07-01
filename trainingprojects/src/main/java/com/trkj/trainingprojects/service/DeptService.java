package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.DeptVo;

import java.util.List;

public interface DeptService {
    List<DeptVo> selectAllDepts();
    void addDept(DeptVo record);
    void deleteByDeptKey(DeptVo deptVo);
    DeptVo selectByDeptKey(Integer deptId);
    void updateByDeptKeySelective(DeptVo record);
}

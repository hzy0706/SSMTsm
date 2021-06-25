package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.EmpVo;

import java.util.List;

public interface EmpService {
    int addEmp(EmpVo record);

    EmpVo selectByEmpKey(EmpVo empVo);

    List<EmpVo> selectAllEmps();

    int updateByEmpKeySelective(EmpVo record);

    int updateByEmpKey(EmpVo record);
    List<EmpVo> selectAllEmpsByPositionId(Integer positionId);

    List<EmpVo> selectAllIncumbencyEmps();
}

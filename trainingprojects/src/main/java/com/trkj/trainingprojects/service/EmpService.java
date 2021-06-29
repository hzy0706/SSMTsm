package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.EmpVo;

import java.util.List;

public interface EmpService {


    EmpVo selectByEmpKey(EmpVo empVo);

    List<EmpVo> selectAllEmps();

    List<EmpVo> selectAllIncumbencyEmps();

    public EmpVo findByUsername(String username);

    int addEmp(EmpVo empVo);
}

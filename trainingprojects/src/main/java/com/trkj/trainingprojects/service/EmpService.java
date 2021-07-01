package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.EmpVo;

import java.util.List;

public interface EmpService {


    EmpVo selectByEmpKey(EmpVo empVo);

    EmpVo selectEmpByEmpId(Integer empId);

    List<EmpVo> selectAllEmps();

    List<EmpVo> selectAllIncumbencyEmps();

    List<EmpVo> selectAllEmpByName(String value);

    public EmpVo findByUsername(String username);

    int addEmp(EmpVo empVo);

    int updateEmp(EmpVo empVo);

    int updateWorkersState(EmpVo empVo);

    int updateWorkersStatebyid(EmpVo empVo);
}

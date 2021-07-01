package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Emp;
import com.trkj.trainingprojects.vo.EmpVo;
import com.trkj.trainingprojects.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDao {


    EmpVo selectByEmpKey(EmpVo empVo);

    EmpVo selectEmpByEmpId(Integer empId);

    List<EmpVo> selectAllEmps();

    /**
     * 查询所有在职职工
     * @return
     */
    List<EmpVo> selectAllIncumbencyEmps();
    List<EmpVo> selectAllEmpByName(String value);

    public EmpVo findByUsername(String username);

    /**
     *
     */
    int addEmp(EmpVo empVo);
}
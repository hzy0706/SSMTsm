package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Emp;
import com.trkj.trainingprojects.vo.EmpVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDao {

    int insert(EmpVo record);

    EmpVo selectByEmpKey(EmpVo empVo);

    List<EmpVo> selectAllEmps();

    /**
     * 查询所有在职职工
     * @return
     */
    List<EmpVo> selectAllIncumbencyEmps();

    int updateByEmpKeySelective(EmpVo record);

    int updateByEmpKey(EmpVo record);
}
package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.MemorandumVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemorandumDao {

    int addMemorandum(MemorandumVo record);

    MemorandumVo selectByMemorandumKey(Integer memorandumId);

    int updateByMemorandumKeySelective(MemorandumVo record);

    int updateByMemorandumKey(MemorandumVo record);

    List<MemorandumVo> selectByMemorandumEmpId(Integer empId);
}
package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.MemorandumVo;

import java.util.List;

public interface MemorandumService {
    int addMemorandum(MemorandumVo record);

    MemorandumVo selectByMemorandumKey(Integer memorandumId);

    int updateByMemorandumKeySelective(MemorandumVo record);

    int deleteByMemorandumKey(MemorandumVo record);

    List<MemorandumVo> selectByMemorandumEmpId(Integer empId);
}

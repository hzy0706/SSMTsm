package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.DaillogVo;

import java.util.List;

public interface DaillogService {

    int addDaillog(DaillogVo record);

    DaillogVo selectByDaillogKey(Integer daillogId);

    int updateByDaillogKeySelective(DaillogVo record);

    int deleteByDaillogKey(DaillogVo record);

    int OnUpdateStateByKey (DaillogVo record);

    int OnUpdateConductTypeByKey (DaillogVo record);

    List<DaillogVo> selectByDaillogEmpId(Integer empId);
}

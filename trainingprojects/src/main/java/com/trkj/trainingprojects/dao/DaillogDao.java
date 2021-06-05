package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.DaillogVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DaillogDao {

    int addDaillog(DaillogVo record);

    DaillogVo selectByDaillogKey(Integer daillogId);

    int updateByDaillogKeySelective(DaillogVo record);

    int updateByDaillogKey(DaillogVo record);

    List<DaillogVo> selectByDaillogEmpId(Integer empId);
}
package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.ReturnvisitVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReturnvisitDao {
    int delByReturnvisitKey(Integer returnvisitId);

    int insert(ReturnvisitVo record);

    int insertSelective(ReturnvisitVo record);

    ReturnvisitVo selectByReturnvisitKey(Integer returnvisitId);

    int updateByReturnvisitKey(ReturnvisitVo record);

    int delByReturnvisitKey2(ReturnvisitVo record);
//    查询
    List<ReturnvisitVo> findReturnvisit();
}
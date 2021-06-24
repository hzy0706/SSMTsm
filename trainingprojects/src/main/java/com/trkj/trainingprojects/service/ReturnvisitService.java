package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.ReturnvisitVo;

import java.util.List;

public interface ReturnvisitService {
//    查询
    public List<ReturnvisitVo> selectAllReturnvisit();
//    增加
    public void addReturnvisit(ReturnvisitVo returnvisitVo);
//    修改
    public int updateReturnvisit(ReturnvisitVo returnvisitVo);
//    删除
    public int delReturnVisit(ReturnvisitVo returnvisitVo);

    public int updateReturnVisitState( Integer registerId, Integer attentstate);

}

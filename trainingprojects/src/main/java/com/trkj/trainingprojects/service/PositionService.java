package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.PositionVo;

import java.util.List;

public interface PositionService {
    public int addPosition(PositionVo positionVo);
    public PositionVo selectByPositionKey(Integer positionId);
    public List<PositionVo> selectAllPositions();
    public int updateByPositionKeySelective(PositionVo positionVo);
    public int deleteByPositionKey(PositionVo positionVo);
}

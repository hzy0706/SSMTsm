package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Position;
import com.trkj.trainingprojects.vo.PositionVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PositionDao {
    int deleteByPositionKey(Integer positionId);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPositionKey(Integer positionId);

    List<PositionVo> selectAllPositions();

    int updateByPositionKeySelective(Position record);

    int updateByPositionKey(Position record);
}
package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.DaillogreplyVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DaillogreplyDao {

    int addDaillogreply(DaillogreplyVo record);

    DaillogreplyVo selectByDaillogreplyKey(Integer daillogreplyId);

    List<DaillogreplyVo> selectByDaillogreplyDaillogId(Integer daillogId);
}
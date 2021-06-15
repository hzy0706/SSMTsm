package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.SourceVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SourceDao {
    int deleteByPrimaryKey(Integer sourceId);

    int insert(SourceVo record);

    int insertSelective(SourceVo record);

    SourceVo selectByPrimaryKey(Integer sourceId);

    int updateBySourceKey(SourceVo record);

    int delBySourceKey(SourceVo record);
//    查询
    List<SourceVo> findSource();
//    模糊查询
    SourceVo mohuSource(Integer sourceId);
}
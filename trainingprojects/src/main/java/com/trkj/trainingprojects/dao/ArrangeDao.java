package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.ArrangeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArrangeDao {
    int deleteByArrangeKey(Integer arrangeId);

    int addArrange(ArrangeVo record);

    List<ArrangeVo> selectAllArranges();

    int insertSelective(ArrangeVo record);

    ArrangeVo selectByArrangeKey(Integer arrangeId);

    int updateByArrangeKeySelective(ArrangeVo record);

    int updateByArrangeKey(ArrangeVo record);
}
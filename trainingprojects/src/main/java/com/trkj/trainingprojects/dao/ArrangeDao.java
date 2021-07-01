package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.ArrangeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArrangeDao {
    void deleteByArrangeKey(Integer arrangeId);

    void addArrange(ArrangeVo record);

    List<ArrangeVo> selectAllArranges();

    void insertSelective(ArrangeVo record);

    ArrangeVo selectByArrangeKey(Integer arrangeId);

    void updateByArrangeKeySelective(ArrangeVo record);

    void updateByArrangeKey(ArrangeVo record);
}
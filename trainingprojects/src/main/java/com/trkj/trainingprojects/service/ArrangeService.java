package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.ArrangeVo;

import java.util.List;

public interface ArrangeService {
    int deleteByArrangeKey(Integer arrangeId);

    int addArrange(ArrangeVo record);

    List<ArrangeVo> selectAllArranges();

    int insertSelective(ArrangeVo record);

    ArrangeVo selectByArrangeKey(Integer arrangeId);

    int updateByArrangeKeySelective(ArrangeVo record);

    int updateByArrangeKey(ArrangeVo record);
}

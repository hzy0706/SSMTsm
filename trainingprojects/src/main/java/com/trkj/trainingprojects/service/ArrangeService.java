package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.ArrangeVo;

import java.util.List;

public interface ArrangeService {
    void deleteByArrangeKey(Integer arrangeId);

    void addArrange(ArrangeVo record);

    List<ArrangeVo> selectAllArranges();

    void insertSelective(ArrangeVo record);

    ArrangeVo selectByArrangeKey(Integer arrangeId);

    void updateByArrangeKeySelective(ArrangeVo record);

    void updateByArrangeKey(ArrangeVo record);
}

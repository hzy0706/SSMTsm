package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.AdvancearrangeVo;

import java.util.List;

public interface AdvancearrangeService {
    int addAdvancearrange(AdvancearrangeVo record);
    List<AdvancearrangeVo> selectAllAdvancearrange();
    int updateByAdvancearrangeKey(AdvancearrangeVo record);
}

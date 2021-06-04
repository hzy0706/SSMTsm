package com.trkj.trainingprojects.Opservice;


import com.trkj.trainingprojects.vo.DaillogreplyVo;

import java.util.List;

public interface DaillogreplyService {

    int addDaillogreply(DaillogreplyVo record);

    DaillogreplyVo selectByDaillogreplyKey(Integer daillogreplyId);

    List<DaillogreplyVo> selectByDaillogreplyDaillogId(Integer daillogId);
}

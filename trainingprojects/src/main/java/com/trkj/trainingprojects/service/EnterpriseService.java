package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.EnterpriseVo;

public interface EnterpriseService {
    public EnterpriseVo selectByEnterpriseKey();
    public int updateByEnterpriseKeySelective(EnterpriseVo enterpriseVo);
}

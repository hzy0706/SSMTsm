package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.dao.EnterpriseDao;
import com.trkj.trainingprojects.entity.Enterprise;
import com.trkj.trainingprojects.util.BeanCopyUtil;
import com.trkj.trainingprojects.vo.EnterpriseVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
    @Resource
    private EnterpriseDao enterpriseDao;
    @Override
    public EnterpriseVo selectByEnterpriseKey() {
        EnterpriseVo enterpriseVo = new EnterpriseVo();
        BeanCopyUtil.copyProperties(enterpriseDao.selectByEnterpriseKey(),enterpriseVo);
        return enterpriseVo;
    }

    @Override
    @Transactional
    public int updateByEnterpriseKeySelective(EnterpriseVo enterpriseVo) {
        Enterprise enterprise = new Enterprise();
        BeanCopyUtil.copyProperties(enterpriseVo,enterprise);
        return enterpriseDao.updateByEnterpriseKeySelective(enterprise);
    }
}

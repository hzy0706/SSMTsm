package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.DaillogDao;
import com.trkj.trainingprojects.service.DaillogService;
import com.trkj.trainingprojects.vo.DaillogVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DaillogServiceImpl implements DaillogService {
    @Resource
    private DaillogDao daillogDao;
    @Override
    @Transactional
    public int addDaillog(DaillogVo record) {
        return daillogDao.addDaillog(record);
    }

    @Override
    public DaillogVo selectByDaillogKey(Integer daillogId) {
        return daillogDao.selectByDaillogKey(daillogId);
    }

    @Override
    @Transactional
    public int updateByDaillogKeySelective(DaillogVo record) {
        return daillogDao.updateByDaillogKeySelective(record);
    }

    @Override
    public int deleteByDaillogKey(DaillogVo record) {
        return daillogDao.updateByDaillogKey(record);
    }

    @Override
    public List<DaillogVo> selectByDaillogEmpId(Integer empId) {
        return daillogDao.selectByDaillogEmpId(empId);
    }
}

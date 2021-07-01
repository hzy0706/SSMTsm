package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ArrangeDao;
import com.trkj.trainingprojects.service.ArrangeService;
import com.trkj.trainingprojects.vo.ArrangeVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ArrangeServiceImpl implements ArrangeService {
    @Resource
    private ArrangeDao arrangeDao;
    @Override
    @Transactional
    public void deleteByArrangeKey(Integer arrangeId) {
        arrangeDao.deleteByArrangeKey(arrangeId);
    }

    @Override
    @Transactional
    public void addArrange(ArrangeVo record) {
        arrangeDao.addArrange(record);
    }

    @Override
    public List<ArrangeVo> selectAllArranges() {
        return arrangeDao.selectAllArranges();
    }

    @Override
    @Transactional
    public void insertSelective(ArrangeVo record) {
        arrangeDao.insertSelective(record);
    }

    @Override
    public ArrangeVo selectByArrangeKey(Integer arrangeId) {
        return arrangeDao.selectByArrangeKey(arrangeId);
    }

    @Override
    @Transactional
    public void updateByArrangeKeySelective(ArrangeVo record) {
        arrangeDao.updateByArrangeKeySelective(record);
    }

    @Override
    @Transactional
    public void updateByArrangeKey(ArrangeVo record) {
        arrangeDao.updateByArrangeKey(record);
    }
}

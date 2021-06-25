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
    public int deleteByArrangeKey(Integer arrangeId) {
        return arrangeDao.deleteByArrangeKey(arrangeId);
    }

    @Override
    @Transactional
    public int addArrange(ArrangeVo record) {
        return arrangeDao.addArrange(record);
    }

    @Override
    public List<ArrangeVo> selectAllArranges() {
        return arrangeDao.selectAllArranges();
    }

    @Override
    @Transactional
    public int insertSelective(ArrangeVo record) {
        return arrangeDao.insertSelective(record);
    }

    @Override
    public ArrangeVo selectByArrangeKey(Integer arrangeId) {
        return arrangeDao.selectByArrangeKey(arrangeId);
    }

    @Override
    @Transactional
    public int updateByArrangeKeySelective(ArrangeVo record) {
        return arrangeDao.updateByArrangeKeySelective(record);
    }

    @Override
    @Transactional
    public int updateByArrangeKey(ArrangeVo record) {
        return arrangeDao.updateByArrangeKey(record);
    }
}

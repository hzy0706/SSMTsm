package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.AwardsDao;
import com.trkj.trainingprojects.entity.Awards;
import com.trkj.trainingprojects.service.AwardsService;
import com.trkj.trainingprojects.vo.AwardsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class AwardsServiceImpl implements AwardsService {
    @Resource
    private AwardsDao awardsDao;

    @Override
    public Awards queryById(Integer awardsId) {
        return null;
    }

    @Override
    public List<Awards> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    @Transactional
    public Awards insert(Awards awards) {
        return null;
    }

    @Override
    public Awards update(Awards awards) {
        return null;
    }

    @Override
    public boolean deleteById(Integer awardsId) {
        return false;
    }

    @Override
    public List<AwardsVo> selectAllAwards() {
        return awardsDao.selectAllAwards();
    }

    @Override
    @Transactional
    public void addAwards(AwardsVo awardsVo) {
        awardsDao.insert(awardsVo);
    }

    @Override
    @Transactional
    public int updateByAwardsKey(AwardsVo awardsVo) {
        return awardsDao.updateByAwardsKey(awardsVo);
    }

    @Override
    @Transactional
    public int deleteByAwards(AwardsVo awardsVo) {
        return awardsDao.deleteByAwards(awardsVo);
    }
}

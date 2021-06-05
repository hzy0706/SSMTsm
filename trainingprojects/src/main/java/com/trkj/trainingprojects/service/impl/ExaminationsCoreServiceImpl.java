package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ExaminationsCoreDao;
import com.trkj.trainingprojects.entity.ExaminationScore;
import com.trkj.trainingprojects.service.ExaminationsCoreService;
import com.trkj.trainingprojects.vo.ExaminationScoreVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class ExaminationsCoreServiceImpl implements ExaminationsCoreService {
    @Resource
    private ExaminationsCoreDao examinationsCoreDao;
    @Override
    public ExaminationScore queryById(Integer examinationscoreId) {
        return null;
    }

    @Override
    public List<ExaminationScore> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public ExaminationScore insert(ExaminationScore examinationscore) {
        return null;
    }

    @Override
    public ExaminationScore update(ExaminationScore examinationscore) {
        return null;
    }

    @Override
    public boolean deleteById(Integer examinationscoreId) {
        return false;
    }

    @Override
    public List<ExaminationScoreVo> selectAllExaminationScore() {
        return examinationsCoreDao.selectAllExaminationScore();
    }

    @Override
    @Transactional
    public void addExaminationScore(ExaminationScoreVo examinationScoreVo) {
        examinationsCoreDao.insert(examinationScoreVo);
    }

    @Override
    @Transactional
    public int updateByExaminationScoreKey(ExaminationScoreVo examinationScoreVo) {
        return examinationsCoreDao.updateByExaminationScoreKey(examinationScoreVo);
    }

    @Override
    @Transactional
    public int deleteByExaminationScore(ExaminationScoreVo examinationScoreVo) {
        return examinationsCoreDao.deleteByExaminationScore(examinationScoreVo);
    }
}

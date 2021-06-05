package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ExaminationDao;
import com.trkj.trainingprojects.entity.Examination;
import com.trkj.trainingprojects.service.ExaminationService;
import com.trkj.trainingprojects.vo.ExaminationVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class ExaminationServiceImpl implements ExaminationService {
    @Resource
    private ExaminationDao examinationDao;
    @Override
    public Examination queryById(Integer examinationId) {
        return null;
    }

    @Override
    public List<Examination> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Examination insert(Examination examination) {
        return null;
    }

    @Override
    public Examination update(Examination examination) {
        return null;
    }

    @Override
    public boolean deleteById(Integer examinationId) {
        return false;
    }

    @Override
    public List<ExaminationVo> selectAllExamination() {
        return examinationDao.selectAllExamination();
    }

    @Override
    @Transactional
    public void addExamination(ExaminationVo examinationVo) {
        examinationDao.insert(examinationVo);
    }

    @Override
    @Transactional
    public int deleteByExamination(ExaminationVo examinationVo) {
        return examinationDao.deleteByExamination(examinationVo);
    }

    @Override
    @Transactional
    public int updateByExaminationKey(ExaminationVo examinationVo) {
        return examinationDao.updateByExaminationKey(examinationVo);
    }
}

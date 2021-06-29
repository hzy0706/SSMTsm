package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ExaminationContentDao;
import com.trkj.trainingprojects.entity.ExaminationContent;
import com.trkj.trainingprojects.service.ExaminationContentService;
import com.trkj.trainingprojects.vo.ExaminationContentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class ExaminationContentServiceImpl implements ExaminationContentService {
    @Resource
    private ExaminationContentDao examinationContentDao;
    @Override
    public ExaminationContent queryById(Integer examinationcId) {
        return null;
    }

    @Override
    public List<ExaminationContent> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public ExaminationContent insert(ExaminationContent examinationcontent) {
        return null;
    }

    @Override
    public ExaminationContent update(ExaminationContent examinationcontent) {
        return null;
    }

    @Override
    public boolean deleteById(Integer examinationcId) {
        return false;
    }

    @Override
    public List<ExaminationContentVo> selectAllExaminationContent() {
        return examinationContentDao.selectAllExaminationContent();
    }

    @Override
    @Transactional
    public void addExaminationContent(ExaminationContentVo examinationContentVo) {
        examinationContentDao.insert(examinationContentVo);
    }

    @Override
    @Transactional
    public int updateByExaminationContentKey(ExaminationContentVo examinationContentVo) {
        return examinationContentDao.updateByExaminationContentKey(examinationContentVo);
    }

    @Override
    @Transactional
    public int deleteByExaminationContent(ExaminationContentVo examinationContentVo) {
        return examinationContentDao.deleteByExaminationContent(examinationContentVo);
    }

    @Override
    public ExaminationContentVo selectAllExaminationContentByCode(int examCode) {
        return examinationContentDao.selectAllExaminationContentByCode(examCode);
    }

    @Override
    public List<ExaminationContentVo> selectAllExaminationContentByCodeOne(int examCode) {
        return examinationContentDao.selectAllExaminationContentByCodeOne(examCode);
    }

    @Override
    public List<ExaminationContentVo> selectAllExaminationContentByCodeTwo(int examCode) {
        return examinationContentDao.selectAllExaminationContentByCodeTwo(examCode);
    }

    @Override
    public List<ExaminationContentVo> selectAllExaminationContentByCodeThree(int examCode) {
        return examinationContentDao.selectAllExaminationContentByCodeThree(examCode);
    }
}

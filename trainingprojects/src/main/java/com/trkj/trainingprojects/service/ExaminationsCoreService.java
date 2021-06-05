package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.ExaminationScore;
import com.trkj.trainingprojects.vo.ExaminationScoreVo;

import java.util.List;

/**
 * 成绩表(ExaminationScore)表服务接口
 *
 * @author makejava
 * @since 2021-06-03 15:18:08
 */
public interface ExaminationsCoreService {

    ExaminationScore queryById(Integer examinationscoreId);

    List<ExaminationScore> queryAllByLimit(int offset, int limit);

    ExaminationScore insert(ExaminationScore examinationscore);

    ExaminationScore update(ExaminationScore examinationscore);

    boolean deleteById(Integer examinationscoreId);

    public List<ExaminationScoreVo> selectAllExaminationScore();
    public void addExaminationScore(ExaminationScoreVo examinationScoreVo);
    public int updateByExaminationScoreKey(ExaminationScoreVo examinationScoreVo);
    public int deleteByExaminationScore(ExaminationScoreVo examinationScoreVo);
}

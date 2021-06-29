package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.ExaminationContent;
import com.trkj.trainingprojects.vo.ExaminationContentVo;

import java.util.List;

/**
 * 考试内容表(ExaminationContent)表服务接口
 *
 * @author makejava
 * @since 2021-06-03 15:17:44
 */
public interface ExaminationContentService {

    ExaminationContent queryById(Integer examinationcId);

    List<ExaminationContent> queryAllByLimit(int offset, int limit);

    ExaminationContent insert(ExaminationContent examinationcontent);

    ExaminationContent update(ExaminationContent examinationcontent);

    boolean deleteById(Integer examinationcId);

    public List<ExaminationContentVo> selectAllExaminationContent();
    public void addExaminationContent(ExaminationContentVo examinationContentVo);
    public int updateByExaminationContentKey(ExaminationContentVo examinationContentVo);
    public int deleteByExaminationContent(ExaminationContentVo examinationContentVo);
    public ExaminationContentVo selectAllExaminationContentByCode(int examCode);
    List<ExaminationContentVo> selectAllExaminationContentByCodeOne(int examCode);
    List<ExaminationContentVo> selectAllExaminationContentByCodeTwo(int examCode);
    List<ExaminationContentVo> selectAllExaminationContentByCodeThree(int examCode);
}

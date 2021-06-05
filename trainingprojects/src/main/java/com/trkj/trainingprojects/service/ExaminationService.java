package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Examination;
import com.trkj.trainingprojects.vo.ExaminationVo;

import java.util.List;

/**
 * 考试总表(Examination)表服务接口
 *
 * @author makejava
 * @since 2021-06-03 14:31:39
 */
public interface ExaminationService {

    Examination queryById(Integer examinationId);

    List<Examination> queryAllByLimit(int offset, int limit);

    Examination insert(Examination examination);

    Examination update(Examination examination);

    boolean deleteById(Integer examinationId);
    
    public List<ExaminationVo> selectAllExamination();
    public void addExamination(ExaminationVo examinationVo);
    public int deleteByExamination(ExaminationVo examinationVo);
    public int updateByExaminationKey(ExaminationVo examinationVo);

}

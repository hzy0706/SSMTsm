package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.TrainingPeriod;
import com.trkj.trainingprojects.vo.TrainingPeriodVo;

import java.util.List;

/**
 * 培训时段表(TrainingPeriod)表服务接口
 *
 * @author makejava
 * @since 2021-06-04 11:33:34
 */
public interface TrainingPeriodService {

    TrainingPeriod queryById(Integer periodId);

    List<TrainingPeriod> queryAllByLimit(int offset, int limit);

    TrainingPeriod insert(TrainingPeriod trainingperiod);

    TrainingPeriod update(TrainingPeriod trainingperiod);

    boolean deleteById(Integer periodId);

    public List<TrainingPeriodVo> selectAllTrainingPeriod();
    public void addTrainingPeriod(TrainingPeriodVo trainingPeriodVo);
    public int deleteByTrainingPeriod(TrainingPeriodVo trainingPeriodVo);
    public int updateByTrainingPeriodKey(TrainingPeriodVo trainingPeriodVo);
}

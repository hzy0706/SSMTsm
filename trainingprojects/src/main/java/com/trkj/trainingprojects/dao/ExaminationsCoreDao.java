package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.ExaminationScore;
import com.trkj.trainingprojects.vo.ExaminationScoreVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 成绩表(ExaminationScore)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-03 15:18:07
 */
@Mapper
public interface ExaminationsCoreDao {

    ExaminationScore queryById(Integer examinationscoreId);

    List<ExaminationScore> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<ExaminationScore> queryAll(ExaminationScore examinationscore);

    int insert(ExaminationScoreVo examinationScoreVo);

    int insertBatch(@Param("entities") List<ExaminationScore> entities);

    int insertOrUpdateBatch(@Param("entities") List<ExaminationScore> entities);

    int updateByExaminationScoreKey(ExaminationScoreVo examinationScoreVo);

    int deleteById(Integer examinationscoreId);

    List<ExaminationScoreVo> selectAllExaminationScore();
    int deleteByExaminationScore(ExaminationScoreVo examinationScoreVo);
}


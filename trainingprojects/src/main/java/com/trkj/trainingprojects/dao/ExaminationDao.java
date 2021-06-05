package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Examination;
import com.trkj.trainingprojects.vo.ExaminationVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 考试总表(Examination)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-03 14:31:39
 */
@Mapper
public interface ExaminationDao {

    Examination queryById(Integer examinationId);

    List<Examination> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Examination> queryAll(Examination examination);

    int insert(ExaminationVo examinationVo);

    int insertBatch(@Param("entities") List<Examination> entities);

    int insertOrUpdateBatch(@Param("entities") List<Examination> entities);

    int updateByExaminationKey(ExaminationVo examinationVo);

    int deleteById(Integer examinationId);
    
    List<ExaminationVo> selectAllExamination();
    int deleteByExamination(ExaminationVo examinationVo);
}


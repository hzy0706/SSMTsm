package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.ExaminationContent;
import com.trkj.trainingprojects.vo.ExaminationContentVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 考试内容表(ExaminationContent)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-03 15:17:44
 */
@Mapper
public interface ExaminationContentDao {

    ExaminationContent queryById(Integer examinationcId);

    List<ExaminationContent> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<ExaminationContent> queryAll(ExaminationContent examinationcontent);

    int insert(ExaminationContentVo examinationContentVo);

    int insertBatch(@Param("entities") List<ExaminationContent> entities);

    int insertOrUpdateBatch(@Param("entities") List<ExaminationContent> entities);

    int updateByExaminationContentKey(ExaminationContentVo examinationContentVo);

    int deleteById(Integer examinationcId);

    List<ExaminationContentVo> selectAllExaminationContent();
    int deleteByExaminationContent(ExaminationContentVo examinationContentVo);
    ExaminationContentVo selectAllExaminationContentByCode(int examCode);
}


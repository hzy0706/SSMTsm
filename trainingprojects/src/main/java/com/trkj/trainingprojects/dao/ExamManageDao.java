package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.ExamManage;
import com.trkj.trainingprojects.vo.ExamManageVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 试卷表(ExamManage)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-24 19:01:32
 */
@Mapper
public interface ExamManageDao {

    ExamManage queryById(Integer examcode);

    List<ExamManage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<ExamManage> queryAll(ExamManage examManage);

    int insert(ExamManageVo examManageVo);

    int insertBatch(@Param("entities") List<ExamManage> entities);

    int insertOrUpdateBatch(@Param("entities") List<ExamManage> entities);

    int update(ExamManage examManage);

    int deleteById(Integer examcode);

    List<ExamManageVo> selectAllExamManage(String choice);
}


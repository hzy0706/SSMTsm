package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Interview;
import com.trkj.trainingprojects.vo.InterviewVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 在读生访谈表(Interview)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-04 11:33:12
 */
@Mapper
public interface InterviewDao {

    Interview queryById(Integer interviewId);

    List<Interview> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Interview> queryAll(Interview interview);

    int insert(InterviewVo interviewVo);

    int insertBatch(@Param("entities") List<Interview> entities);

    int insertOrUpdateBatch(@Param("entities") List<Interview> entities);

    int updateByInterviewKey(InterviewVo interviewVo);

    int deleteById(Integer interviewId);

    List<InterviewVo> selectAllInterview();
    int deleteByInterview(InterviewVo interviewVo);
}


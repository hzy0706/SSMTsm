package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.FaqQuestions;
import com.trkj.trainingprojects.vo.FaqQuestionsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FaqQuestionsDao {
    int deleteByPrimaryKey(Integer faqId);

    int insert(FaqQuestionsVo record);

    int insertSelective(FaqQuestionsVo record);

    FaqQuestions selectByPrimaryKey(Integer faqId);

    int delFaqQuestions(FaqQuestionsVo record);

    int updateByFaqQuestionsKey(FaqQuestionsVo record);
//    查询
    List<FaqQuestionsVo> findFaqQuestions();
}
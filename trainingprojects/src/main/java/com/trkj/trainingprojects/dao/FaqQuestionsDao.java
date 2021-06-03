package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.FaqQuestions;
import com.trkj.trainingprojects.vo.FaqVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FaqQuestionsDao {

    int insert(FaqQuestions record);

    int insertSelective(FaqQuestions record);

    FaqQuestions selectByFaqKey(Integer faqId);

    List<FaqVo> selectAllFaqs();
    List<FaqVo> selectByFaqProblem(String problem);
    List<FaqVo> selectByFaqAnswer(String answer);
    int updateByFaqKeySelective(FaqQuestions record);
    int deleteByFaqKey(FaqQuestions record);
    int updateByFaqKey(FaqQuestions record);
}
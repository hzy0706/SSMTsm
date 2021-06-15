package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.FaqQuestionsVo;

import java.util.List;

public interface FaqService {
//    查询
    public List<FaqQuestionsVo> selectAllFaq();
//    增加
    public void addFaq(FaqQuestionsVo faqQuestionsVo);
//    修改
    public int updateByFaqQuestionsKey(FaqQuestionsVo faqQuestionsVo);
//    删除
    public int delFaqQuestions(FaqQuestionsVo faqQuestionsVo);
}

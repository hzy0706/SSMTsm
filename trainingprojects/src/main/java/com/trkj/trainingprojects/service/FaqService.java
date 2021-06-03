package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.FaqVo;

import java.util.List;

public interface FaqService {
    public void addFaq(FaqVo faqVo);
    public List<FaqVo> selectAllFaqs();
    public void updateByFaqKeySelective(FaqVo faqVo);
    public FaqVo selectByFaqKey(Integer faqId);
    public List<FaqVo> selectByFaqProblem(String Problem);
    public List<FaqVo> selectByFaqAnswer(String Answer);
    public void deleteByFaqKey(FaqVo faqVo);
}

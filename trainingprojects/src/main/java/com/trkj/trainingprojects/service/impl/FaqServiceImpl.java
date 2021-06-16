package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.FaqQuestionsDao;
import com.trkj.trainingprojects.service.FaqService;
import com.trkj.trainingprojects.vo.FaqQuestionsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class FaqServiceImpl implements FaqService {
    @Resource
    private FaqQuestionsDao faqQuestionsDao;
    //    查询
    @Override
    public List<FaqQuestionsVo> selectAllFaq() {
        return faqQuestionsDao.findFaqQuestions();
    }
//增加
    @Override
    @Transactional
    public void addFaq(FaqQuestionsVo faqQuestionsVo) {
        faqQuestionsDao.insert(faqQuestionsVo);
    }
//修改
    @Override
    @Transactional
    public int updateByFaqQuestionsKey(FaqQuestionsVo faqQuestionsVo) {
        return faqQuestionsDao.updateByFaqQuestionsKey(faqQuestionsVo);
    }
//删除
    @Override
    @Transactional
    public int delFaqQuestions(FaqQuestionsVo faqQuestionsVo) {
        return faqQuestionsDao.delFaqQuestions(faqQuestionsVo);
    }
}

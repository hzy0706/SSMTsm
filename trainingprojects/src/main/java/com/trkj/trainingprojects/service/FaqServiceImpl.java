package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.dao.FaqQuestionsDao;
import com.trkj.trainingprojects.entity.FaqQuestions;
import com.trkj.trainingprojects.util.BeanCopyUtil;
import com.trkj.trainingprojects.vo.FaqVo;
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

    @Override
    @Transactional
    /*@Caching(evict = {
            @CacheEvict( value = "selectAllFaqs",allEntries = true),
            @CacheEvict( value = "selectByFaqKey",allEntries = true)})*/
    public void addFaq(FaqVo faqVo) {
        FaqQuestions faqQuestions = new FaqQuestions();
        BeanCopyUtil.copyProperties(faqVo,faqQuestions);
        faqQuestionsDao.insert(faqQuestions);
    }

    @Override
    //@Cacheable(cacheNames = "selectAllFaqs")
    public List<FaqVo> selectAllFaqs() {
        return faqQuestionsDao.selectAllFaqs();
    }

    @Override
    @Transactional
    /*@Caching(evict = {
            @CacheEvict( value = "selectAllFaqs",allEntries = true),
            @CacheEvict( value = "selectByFaqKey",allEntries = true)})*/
    public void updateByFaqKeySelective(FaqVo faqVo) {
        FaqQuestions faqQuestions = new FaqQuestions();
        BeanCopyUtil.copyProperties(faqVo,faqQuestions);
        System.out.println(faqQuestions+"************************************************");
        faqQuestionsDao.updateByFaqKeySelective(faqQuestions);
    }

    @Override
    /*@Cacheable(cacheNames = "selectByFaqKey")*/
    public FaqVo selectByFaqKey(Integer faqId) {
        FaqVo faqVo = new FaqVo();
        FaqQuestions faqQuestions = faqQuestionsDao.selectByFaqKey(faqId);
        BeanCopyUtil.copyProperties(faqQuestions,faqVo);
        return faqVo;
    }

    @Override
    public List<FaqVo> selectByFaqProblem(String problem) {
        return faqQuestionsDao.selectByFaqProblem(problem);
    }

    @Override
    public List<FaqVo> selectByFaqAnswer(String answer) {
        return faqQuestionsDao.selectByFaqAnswer(answer);
    }

    @Override
    @Transactional
    /*@Caching(evict = {
            @CacheEvict( value = "selectAllFaqs",allEntries = true),
            @CacheEvict( value = "selectByFaqKey",allEntries = true)})*/
    public void deleteByFaqKey(FaqVo faqVo) {
        FaqQuestions faqQuestions = new FaqQuestions();
        BeanCopyUtil.copyProperties(faqVo,faqQuestions);
        faqQuestionsDao.deleteByFaqKey(faqQuestions);
    }
}

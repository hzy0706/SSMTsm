package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.InterviewDao;
import com.trkj.trainingprojects.entity.Interview;
import com.trkj.trainingprojects.service.InterviewService;
import com.trkj.trainingprojects.vo.InterviewVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class InterviewServiceImpl implements InterviewService {
    @Resource
    private InterviewDao interviewDao;

    @Override
    public Interview queryById(Integer interviewId) {
        return null;
    }

    @Override
    public List<Interview> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Interview insert(Interview interview) {
        return null;
    }

    @Override
    public Interview update(Interview interview) {
        return null;
    }

    @Override
    public boolean deleteById(Integer interviewId) {
        return false;
    }

    @Override
    public List<InterviewVo> selectAllInterview() {
        return interviewDao.selectAllInterview();
    }

    @Override
    @Transactional
    public void addInterview(InterviewVo interviewVo) {
        interviewDao.insert(interviewVo);
    }

    @Override
    @Transactional
    public int deleteByInterview(InterviewVo interviewVo) {
        return interviewDao.deleteByInterview(interviewVo);
    }

    @Override
    @Transactional
    public int updateByInterviewKey(InterviewVo interviewVo) {
        return interviewDao.updateByInterviewKey(interviewVo);
    }
}

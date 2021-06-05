package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Interview;
import com.trkj.trainingprojects.vo.InterviewVo;

import java.util.List;

/**
 * 在读生访谈表(Interview)表服务接口
 *
 * @author makejava
 * @since 2021-06-04 11:33:12
 */
public interface InterviewService {

    Interview queryById(Integer interviewId);

    List<Interview> queryAllByLimit(int offset, int limit);

    Interview insert(Interview interview);

    Interview update(Interview interview);

    boolean deleteById(Integer interviewId);

    public List<InterviewVo> selectAllInterview();
    public void addInterview(InterviewVo interviewVo);
    public int deleteByInterview(InterviewVo interviewVo);
    public int updateByInterviewKey(InterviewVo interviewVo);
}

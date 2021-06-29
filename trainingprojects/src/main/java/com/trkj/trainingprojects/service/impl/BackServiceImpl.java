package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.BackDao;
import com.trkj.trainingprojects.service.BackService;
import com.trkj.trainingprojects.vo.BackVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BackServiceImpl implements BackService {
    @Resource
    private BackDao backDao;

    @Transactional
    @Override
    public int addBack(BackVo record) {
        return backDao.addBack(record);
    }

    @Override
    public BackVo selectByBackKey(Integer backId) {
        return backDao.selectByBackKey(backId);
    }

    @Override
    public List<BackVo> selectByBackKeyClasses(Integer classesId) {
        return backDao.selectByBackKeyClasses(classesId);
    }

    @Override
    public List<BackVo> selectByBackKeyStudent(Integer studentId) {
        return backDao.selectByBackKeyStudent(studentId);
    }

    @Override
    public List<BackVo> selectByBackKeyCourse(Integer courseId) {
        return backDao.selectByBackKeyCourse(courseId);
    }

    @Override
    public List<BackVo> selectByBackKeyCoursedetails(Integer coursedetailsId) {
        return backDao.selectByBackKeyCoursedetails(coursedetailsId);
    }

    @Override
    public List<BackVo> selectByBackKeySuspende(Integer suspendeId) {
        return backDao.selectByBackKeySuspende(suspendeId);
    }

    @Override
    public List<BackVo> selectAllBacks() {
        return backDao.selectAllBacks();
    }

    @Transactional
    @Override
    public int updateByBackKeySelective(BackVo record) {
        return backDao.updateByBackKeySelective(record);
    }

    @Transactional
    @Override
    public int deleteByBackKey(BackVo record) {
        return backDao.updateByBackKey(record);
    }
}

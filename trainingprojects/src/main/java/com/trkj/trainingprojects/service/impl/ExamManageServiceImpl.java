package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ExamManageDao;
import com.trkj.trainingprojects.entity.ExamManage;
import com.trkj.trainingprojects.service.ExamManageService;
import com.trkj.trainingprojects.vo.ExamManageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ExamManageServiceImpl implements ExamManageService {
    @Resource
    private ExamManageDao examManageDao;
    @Override
    public ExamManage queryById(Integer examcode) {
        return null;
    }

    @Override
    public List<ExamManage> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public ExamManage insert(ExamManage examManage) {
        return null;
    }

    @Override
    public ExamManage update(ExamManage examManage) {
        return null;
    }

    @Override
    public boolean deleteById(Integer examcode) {
        return false;
    }

    @Override
    public List<ExamManageVo> selectAllExamManage() {
        return examManageDao.selectAllExamManage();
    }

}

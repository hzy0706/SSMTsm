package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.ExamManageDao;
import com.trkj.trainingprojects.entity.ExamManage;
import com.trkj.trainingprojects.service.ExamManageService;
import com.trkj.trainingprojects.service.ExaminationContentService;
import com.trkj.trainingprojects.vo.CourseDetailsVo;
import com.trkj.trainingprojects.vo.ExamManageVo;
import com.trkj.trainingprojects.vo.ExaminationContentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ExamManageServiceImpl implements ExamManageService {
    @Resource
    private ExamManageDao examManageDao;
    @Resource
    private ExaminationContentService examinationContentService;
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

    @Override
    @Transactional
    public void addExamManage(ExamManageVo examManageVo) {
        Date date = new Date();
        examManageVo.setAddtime(date);
        examManageDao.insert(examManageVo);
        String[] id= examManageVo.deletename.split(",");
        System.out.println("-----------------"+examManageVo.toString());
        int a = examManageVo.getExamCode();
        for (String s:id) {
            //删除课程详细
            ExaminationContentVo examinationContentVo = new ExaminationContentVo();
            examinationContentVo.setItembankId(Integer.parseInt(s));
            examinationContentVo.setExamCode(a);
            examinationContentVo.setAddname(examManageVo.getAddname());
            examinationContentVo.setAddtime(date);
            examinationContentVo.setTimeliness(0);
            examinationContentService.addExaminationContent(examinationContentVo);
        }
    }

}

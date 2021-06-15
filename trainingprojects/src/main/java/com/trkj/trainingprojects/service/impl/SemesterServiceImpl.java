package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.SemesterDao;
import com.trkj.trainingprojects.service.SemesterService;
import com.trkj.trainingprojects.vo.SemesterVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class SemesterServiceImpl implements SemesterService {
    @Resource
    private SemesterDao semesterDao;


    @Override
    @Transactional
    public SemesterVo selectById(SemesterVo semester) {
        return this.semesterDao.selectById(semester);
    }


    @Override
    @Transactional
    public void addSemesterALL(SemesterVo semester) {
        semesterDao.addSemesterALL(semester);
    }

    @Override
    @Transactional
    public int updateSemesterById(SemesterVo semester) {
        return this.semesterDao.updateSemesterById(semester);
    }

    @Override
    @Transactional
    public List<SemesterVo> selectALL() {
        return this.semesterDao.selectALL();
    }

    @Override
    @Transactional
    public int delSemesterById(SemesterVo semesterVo) {
        return semesterDao.delSemesterById(semesterVo);
    }
}

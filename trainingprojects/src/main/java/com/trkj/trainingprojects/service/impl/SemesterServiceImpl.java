package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.SemesterDao;
import com.trkj.trainingprojects.service.SemesterService;
import com.trkj.trainingprojects.vo.SemesterVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SemesterServiceImpl implements SemesterService {
    @Resource
    private SemesterDao semesterDao;


    @Override
    public SemesterVo selectById(SemesterVo semester) {
        return this.semesterDao.selectById(semester);
    }

    @Override
    public int addSemesterALL(SemesterVo semester) {
        return this.semesterDao.addSemesterALL(semester);
    }

    @Override
    public int updateSemesterById(SemesterVo semester) {
        return this.semesterDao.updateSemesterById(semester);
    }

    @Override
    public List<SemesterVo> selectALL() {
        return this.semesterDao.selectALL();
    }

    @Override
    public int delSemesterById(SemesterVo semesterVo) {
        return semesterDao.delSemesterById(semesterVo);
    }
}

package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.SemesterDao;
import com.trkj.trainingprojects.entity.Semester;
import com.trkj.trainingprojects.service.SemesterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("SemesterService")
public class SemesterServiceImpl implements SemesterService {
    @Resource
    private SemesterDao semesterDao;
    @Override
    public Semester selectById(Integer semesterId) {
        return null;
    }

    @Override
    public Semester addsemester(Semester semester) {
        return null;
    }

    @Override
    public Semester update(Semester semester) {
        return null;
    }

    @Override
    public List<Semester> selectALL() {
        return this.semesterDao.selectALL();
    }
}

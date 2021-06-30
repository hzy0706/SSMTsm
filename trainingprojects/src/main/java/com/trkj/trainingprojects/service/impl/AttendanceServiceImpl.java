package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.AttendanceDao;
import com.trkj.trainingprojects.entity.Attendance;
import com.trkj.trainingprojects.service.AttendanceService;
import com.trkj.trainingprojects.vo.AttendanceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class AttendanceServiceImpl implements AttendanceService {
    @Resource
    private AttendanceDao attendanceDao;
    @Override
    public Attendance queryById(Integer attendanceId) {
        return null;
    }

    @Override
    public List<Attendance> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Attendance insert(Attendance attendance) {
        return null;
    }

    @Override
    public Attendance update(Attendance attendance) {
        return null;
    }

    @Override
    public boolean deleteById(Integer attendanceId) {
        return false;
    }

    @Override
    public List<AttendanceVo> selectAllAttenDance() {
        return attendanceDao.selectAllAttenDance();
    }

    @Override
    public int deleteByAttenDance(AttendanceVo attendanceVo) {
        return attendanceDao.deleteByAttenDance(attendanceVo);
    }

    @Override
    public int updateByAttenDanceKey(AttendanceVo attendanceVo) {
        return attendanceDao.updateByAttenDanceKey(attendanceVo);
    }

    @Override
    public int addAttenDance(AttendanceVo attendanceVo) {
        return attendanceDao.insert(attendanceVo);
    }

    @Override
    public List<AttendanceVo> selectAllAttenDanceByStudentId(Integer attendanceId) {
        return attendanceDao.queryById(attendanceId);
    }
}

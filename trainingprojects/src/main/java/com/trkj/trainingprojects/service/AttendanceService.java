package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Attendance;
import com.trkj.trainingprojects.vo.AttendanceVo;

import java.util.List;

/**
 * 学员考勤表(Attendance)表服务接口
 *
 * @author makejava
 * @since 2021-06-25 14:30:26
 */
public interface AttendanceService {

    Attendance queryById(Integer attendanceId);

    List<Attendance> queryAllByLimit(int offset, int limit);

    Attendance insert(Attendance attendance);

    Attendance update(Attendance attendance);

    boolean deleteById(Integer attendanceId);

    List<AttendanceVo> selectAllAttenDance();
    int deleteByAttenDance(AttendanceVo attendanceVo);
    int updateByAttenDanceKey(AttendanceVo attendanceVo);
    int addAttenDance(AttendanceVo attendanceVo);
}

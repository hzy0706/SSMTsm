package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Attendance;
import com.trkj.trainingprojects.vo.AttendanceVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学员考勤表(Attendance)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-25 14:30:26
 */
@Mapper
public interface AttendanceDao {

    Attendance queryById(Integer attendanceId);

    List<Attendance> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Attendance> queryAll(Attendance attendance);

    int insert(AttendanceVo attendanceVo);

    int insertBatch(@Param("entities") List<Attendance> entities);

    int insertOrUpdateBatch(@Param("entities") List<Attendance> entities);

    int updateByAttenDanceKey(AttendanceVo attendanceVo);

    int deleteById(Integer attendanceId);

    List<AttendanceVo> selectAllAttenDance();
    int deleteByAttenDance(AttendanceVo attendanceVo);
}


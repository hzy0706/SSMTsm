package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.ShiftVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShiftDao {

    int addShift(ShiftVo record);

    ShiftVo selectByShiftKey(Integer shiftId);

    int updateByShiftKeySelective(ShiftVo record);

    int updateByShiftKey(ShiftVo record);

    List<ShiftVo> selectByShiftStudentId(Integer studentId);

    List<ShiftVo> selectByShiftClassesId(Integer classesId);
}
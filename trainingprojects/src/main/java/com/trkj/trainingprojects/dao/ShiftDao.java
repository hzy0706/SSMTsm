package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.DropoutVo;
import com.trkj.trainingprojects.vo.ShiftVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShiftDao {

    int addShift(ShiftVo record);

    ShiftVo selectByShiftKey(Integer shiftId);

    int updateByShiftKeySelective(ShiftVo record);

    int updateByShiftKey(ShiftVo record);

    List<ShiftVo> selectAllShifts();

    List<ShiftVo> selectByShiftStudentId(Integer studentId);

    List<ShiftVo> selectByShiftstudentstatusId(Integer studentstatusId);

    List<ShiftVo> selectByShiftClassesId(Integer classesId);

    int updateByTypeShiftKey2(ShiftVo record);

    int updateByTypeShiftKey3(ShiftVo record);

    int updateByTypeShiftKey5(ShiftVo record);

}
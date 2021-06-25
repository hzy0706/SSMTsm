package com.trkj.trainingprojects.service;


import com.trkj.trainingprojects.vo.ShiftVo;

import java.util.List;

public interface ShiftService {

    int addShift(ShiftVo record);

    ShiftVo selectByShiftKey(Integer shiftId);

    int updateByShiftKeySelective(ShiftVo record);

    int deleteByShiftKey(ShiftVo record);

    List<ShiftVo> selectAllShifts();

    List<ShiftVo> selectByShiftStudentId(Integer studentId);

    List<ShiftVo> selectByShiftstudentstatusId(Integer studentstatusId);

    List<ShiftVo> selectByShiftClassesId(Integer classesId);

    int appByTypeShiftKey2(ShiftVo record);

    int updateByTypeShiftKey3(ShiftVo record);

    int deleteByTypeShiftKey5(ShiftVo record);

}

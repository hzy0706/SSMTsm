package com.trkj.trainingprojects.Opservice;


import com.trkj.trainingprojects.vo.ShiftVo;

import java.util.List;

public interface ShiftService {

    int addShift(ShiftVo record);

    ShiftVo selectByShiftKey(Integer shiftId);

    int updateByShiftKeySelective(ShiftVo record);

    int deleteByShiftKey(ShiftVo record);

    List<ShiftVo> selectAllShifts();

    List<ShiftVo> selectByShiftStudentId(Integer studentId);

    List<ShiftVo> selectByShiftClassesId(Integer classesId);

    int updateByTypeShiftKey2(ShiftVo record);

    int updateByTypeShiftKey3(ShiftVo record);
}

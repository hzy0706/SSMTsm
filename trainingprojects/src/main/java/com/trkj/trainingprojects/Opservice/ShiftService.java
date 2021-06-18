package com.trkj.trainingprojects.Opservice;


import com.trkj.trainingprojects.vo.ShiftVo;

import java.util.List;

public interface ShiftService {

    int addShift(ShiftVo record);

    ShiftVo selectByShiftKey(Integer shiftId);

    int updateByShiftKeySelective(ShiftVo record);

    int deleteByShiftKey(ShiftVo record);

    List<ShiftVo> selectByShiftStudentId(Integer studentId);

    List<ShiftVo> selectByShiftClassesId(Integer classesId);
}

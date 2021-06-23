package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.ShiftDao;
import com.trkj.trainingprojects.vo.DropoutVo;
import com.trkj.trainingprojects.vo.ShiftVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShiftServiceImpl implements ShiftService {
    @Resource
    private ShiftDao shiftDao;

    @Override
    @Transactional
    public int addShift(ShiftVo record) {
        return shiftDao.addShift(record);
    }

    @Override
    public ShiftVo selectByShiftKey(Integer shiftId) {
        return shiftDao.selectByShiftKey(shiftId);
    }

    @Override
    @Transactional
    public int updateByShiftKeySelective(ShiftVo record) {
        return shiftDao.updateByShiftKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByShiftKey(ShiftVo record) {
        return shiftDao.updateByShiftKey(record);
    }

    @Override
    public List<ShiftVo> selectAllShifts() {
        return shiftDao.selectAllShifts();
    }

    @Override
    public List<ShiftVo> selectByShiftStudentId(Integer studentId) {
        return shiftDao.selectByShiftStudentId(studentId);
    }

    @Override
    public List<ShiftVo> selectByShiftstudentstatusId(Integer studentstatusId) {
        return shiftDao.selectByShiftstudentstatusId(studentstatusId);
    }

    @Override
    public List<ShiftVo> selectByShiftClassesId(Integer classesId) {
        return shiftDao.selectByShiftClassesId(classesId);
    }

    @Override
    @Transactional
    public int updateByTypeShiftKey2(ShiftVo record) {
        return shiftDao.updateByTypeShiftKey2(record);
    }

    @Override
    @Transactional
    public int updateByTypeShiftKey3(ShiftVo record) {
        return shiftDao.updateByTypeShiftKey3(record);
    }

    @Override
    public int updateByTypeShiftKey4(ShiftVo record) {
        return shiftDao.updateByTypeShiftKey4(record);
    }

    @Override
    public int updateByTypeShiftKey5(ShiftVo record) {
        return shiftDao.updateByTypeShiftKey5(record);
    }
}

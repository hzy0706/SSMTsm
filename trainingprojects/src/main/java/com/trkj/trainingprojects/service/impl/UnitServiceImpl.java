package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.UnitDao;
import com.trkj.trainingprojects.service.UnitService;
import com.trkj.trainingprojects.vo.UnitVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {
    @Resource
    private UnitDao dao;
    @Override
    public UnitVo selectById(Integer unitId) {
        return dao.selectById(unitId);
    }

    @Override
    @Transactional
    public int addUnit(UnitVo unit) {
        return dao.addUnit(unit);
    }

    @Override
    @Transactional
    public int updateUnit(UnitVo unit) {
        return dao.updateUnit(unit);
    }

    @Override
    public List<UnitVo> selectAllUnit() {
        return dao.selectAllUnit();
    }

    @Override
    @Transactional
    public int delUnitById(UnitVo unitVo) {
        return dao.delUnitById(unitVo);
    }
}

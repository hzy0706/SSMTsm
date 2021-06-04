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
    public int update(UnitVo unit) {
        return dao.update(unit);
    }

    @Override
    public List<UnitVo> selectAll() {
        return dao.selectAll();
    }
}

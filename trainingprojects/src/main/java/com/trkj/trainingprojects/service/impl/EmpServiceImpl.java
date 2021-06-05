package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.EmpDao;
import com.trkj.trainingprojects.service.EmpService;
import com.trkj.trainingprojects.vo.EmpVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;
    @Override
    @Transactional
    public int addEmp(EmpVo record) {
        return empDao.insert(record);
    }

    @Override
    public EmpVo selectByEmpKey(EmpVo empVo) {
        return empDao.selectByEmpKey(empVo);
    }

    @Override
    public List<EmpVo> selectAllEmps() {
        return empDao.selectAllEmps();
    }

    @Override
    @Transactional
    public int updateByEmpKeySelective(EmpVo record) {
        return empDao.updateByEmpKeySelective(record);
    }

    @Override
    @Transactional
    public int updateByEmpKey(EmpVo record) {
        return empDao.updateByEmpKey(record);
    }

    @Override
    public List<EmpVo> selectAllIncumbencyEmps() {
        return empDao.selectAllIncumbencyEmps();
    }
}

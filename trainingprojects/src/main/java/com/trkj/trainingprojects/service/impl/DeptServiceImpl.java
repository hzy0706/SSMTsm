package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.DeptDao;
import com.trkj.trainingprojects.service.DeptService;
import com.trkj.trainingprojects.vo.DeptVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    @Override
    public List<DeptVo> selectAllDepts() {
        return deptDao.selectAllDepts();
    }

    @Override
    @Transactional
    public void addDept(DeptVo deptVo) {
        deptDao.insert(deptVo);
    }

    @Override
    @Transactional
    public void deleteByDeptKey(DeptVo deptVo) {
        deptDao.updateByDeptKey(deptVo);
    }

    @Override
    public DeptVo selectByDeptKey(Integer deptId) {
        return deptDao.selectByDeptKey(deptId);
    }

    @Override
    @Transactional
    public void updateByDeptKeySelective(DeptVo deptVo) {
        deptDao.updateByDeptKeySelective(deptVo);
    }
}

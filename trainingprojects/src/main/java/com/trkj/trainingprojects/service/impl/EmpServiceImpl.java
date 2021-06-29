package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.EmpDao;
import com.trkj.trainingprojects.service.EmpService;
import com.trkj.trainingprojects.vo.EmpVo;
import com.trkj.trainingprojects.vo.UserVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;


    @Override
    public EmpVo selectByEmpKey(EmpVo empVo) {
        return empDao.selectByEmpKey(empVo);
    }

    @Override
    public List<EmpVo> selectAllEmps() {
        return empDao.selectAllEmps();
    }



    @Override
    public List<EmpVo> selectAllIncumbencyEmps() {
        return empDao.selectAllIncumbencyEmps();
    }

    @Override
    public EmpVo findByUsername(String username) {
        EmpVo empVo=empDao.findByUsername(username);
        return empVo;
    }

    @Override
    @Transactional
    public int addEmp(EmpVo empVo) {
       System.out.println(empVo.getEMail()+"1323123123123");
        return empDao.addEmp(empVo);
    }
}

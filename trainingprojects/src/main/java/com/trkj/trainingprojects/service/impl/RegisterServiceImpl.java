package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.RegisterDao;
import com.trkj.trainingprojects.service.RegisterService;
import com.trkj.trainingprojects.vo.RegisterVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private RegisterDao registerDao;
//查询
    @Override
    public List<RegisterVo> selectAllRegister() {
        return registerDao.findRegister();
    }
//    增加
    @Override
    @Transactional
    public void addRegister(RegisterVo registerVo){
        registerDao.insert(registerVo);
    }
//修改
    @Override
    @Transactional
    public int updateRegister(RegisterVo registerVo) {
        return registerDao.updateByRegisterKey(registerVo);
    }
//删除
    @Override
    @Transactional
    public int delRegister(RegisterVo registerVo) {
        return registerDao.delByRegisterKey(registerVo);
    }

//    外键查询
    @Override
    public List<RegisterVo> selectAllRegister2() {
        return registerDao.findRegister2();
    }
//模糊查询
    @Override
    public List<RegisterVo> mohuRegister(String registerName) {
        return registerDao.mohuRegister(registerName);
    }
}

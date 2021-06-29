package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.EntryfeesDao;
import com.trkj.trainingprojects.entity.Entryfees;
import com.trkj.trainingprojects.service.EntryfeesService;
import com.trkj.trainingprojects.util.RandomNumber;
import com.trkj.trainingprojects.vo.EntryfeesVo;
import com.trkj.trainingprojects.vo.StudentoutstandingVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class EntryfeesServiceImpl implements EntryfeesService {
    @Resource
    private EntryfeesDao entryfeesDao;
    @Override
    public Entryfees queryById(Integer feesId) {
        return null;
    }

    @Override
    public List<Entryfees> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public int addEntryfees(EntryfeesVo entryfeesVo) {
        return entryfeesDao.insert(entryfeesVo);
    }

    @Override
    @Transactional
    public int addEntryfees2(EntryfeesVo entryfeesVo) {
        Date date = new Date();
        entryfeesVo.setAddtime(date);
        RandomNumber randomNumber = new RandomNumber();
        entryfeesVo.setFeesNumber("CW"+randomNumber.getLocalTrmSeqNum());//缴费编号
        //添加欠费补缴
        StudentoutstandingVo studentoutstandingVo = new StudentoutstandingVo();
        studentoutstandingVo.setFeesId(entryfeesVo.getFeesId());
        studentoutstandingVo.setStudentId(entryfeesVo.getStudentId());
        studentoutstandingVo.setOutstandingNumber("CW"+randomNumber.getLocalTrmSeqNum());
        studentoutstandingVo.setOutstandingDate(date);
        studentoutstandingVo.setAddname(entryfeesVo.getAddname());
       /* studentoutstandingVo.setAlongmoney();*/
        return entryfeesDao.insert(entryfeesVo);
    }

    @Override
    public Entryfees update(Entryfees entryfees) {
        return null;
    }

    @Override
    public boolean deleteById(Integer feesId) {
        return false;
    }

    @Override
    public List<EntryfeesVo> selectAllEntryFees() {
        return entryfeesDao.selectAllEntryFees();
    }

    @Override
    public int updateEntryFees(EntryfeesVo entryfeesVo) {
        return entryfeesDao.update(entryfeesVo);
    }

    @Override
    public int updateByEntryFeeState(EntryfeesVo entryfeesVo) {
        return entryfeesDao.updateByEntryFeeState(entryfeesVo);
    }

    @Override
    public int deleteByEntryFees(EntryfeesVo entryfeesVo) {
        return entryfeesDao.deleteByEntryFees(entryfeesVo);
    }
}

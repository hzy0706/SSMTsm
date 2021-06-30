package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.EntryfeesDao;
import com.trkj.trainingprojects.entity.Entryfees;
import com.trkj.trainingprojects.service.EntryfeesService;
import com.trkj.trainingprojects.service.StudentoutstandingService;
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
    @Resource
    private StudentoutstandingService studentoutstandingService;
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
        RandomNumber randomNumber = new RandomNumber();
        entryfeesVo.setFeesNumber("CW"+randomNumber.getLocalTrmSeqNum());//缴费编号
        Date date = new Date();
        entryfeesVo.setAddtime(date);
        entryfeesDao.insert(entryfeesVo);
        //添加欠费补缴
        StudentoutstandingVo studentoutstandingVo = new StudentoutstandingVo();
        studentoutstandingVo.setFeesId(entryfeesVo.getFeesId());
        studentoutstandingVo.setStudentId(entryfeesVo.getStudentId());
        studentoutstandingVo.setOutstandingNumber(entryfeesVo.getFeesNumber());
        studentoutstandingVo.setOutstandingDate(date);
        studentoutstandingVo.setAddname(entryfeesVo.getAddname());
        studentoutstandingVo.setAddtime(date);
        studentoutstandingVo.setAlongmoney(entryfeesVo.getReceipts());
        studentoutstandingVo.setOutstandingState(0);
        studentoutstandingVo.setTimeliness(0);
        studentoutstandingService.insert(studentoutstandingVo);
        return 0;
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

    @Override
    public int updateByEntryFeeStateByAccumulated(EntryfeesVo entryfeesVo) {
        return entryfeesDao.updateByEntryFeeStateByAccumulated(entryfeesVo);
    }

    @Override
    public int selectSumOnSheng() {
        return entryfeesDao.selectSumOnSheng();
    }

    @Override
    public int selectSumOnChe() {
        return entryfeesDao.selectSumOnChe();
    }

    @Override
    public int selectSumOnAll() {
        return entryfeesDao.selectSumOnAll();
    }
}

package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.EntryfeesDao;
import com.trkj.trainingprojects.entity.Entryfees;
import com.trkj.trainingprojects.service.EntryfeesService;
import com.trkj.trainingprojects.vo.EntryfeesVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public Entryfees insert(Entryfees entryfees) {
        return null;
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
}

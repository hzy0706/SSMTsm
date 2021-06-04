package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.StorageexpenditureDao;
import com.trkj.trainingprojects.service.StorageexpenditureService;
import com.trkj.trainingprojects.vo.StorageexpenditureVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StorageexpenditureServiceImpl implements StorageexpenditureService {
    @Resource
    private StorageexpenditureDao storageexpenditureDao;
    @Override
    @Transactional
    public int addStorageexpenditure(StorageexpenditureVo record) {
        return storageexpenditureDao.addStorageexpenditure(record);
    }

    @Override
    public StorageexpenditureVo selectByStorageexpenditureKey(Integer storageexpenditureId) {
        return storageexpenditureDao.selectByStorageexpenditureKey(storageexpenditureId);
    }

    @Override
    public StorageexpenditureVo selectByStorageexpenditureApproval(Integer approval) {
        return storageexpenditureDao.selectByStorageexpenditureApproval(approval);
    }

    @Override
    @Transactional
    public int updateByStorageexpenditureKeySelective(StorageexpenditureVo record) {
        return storageexpenditureDao.updateByStorageexpenditureKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByStorageexpenditureKey(StorageexpenditureVo record) {
        return storageexpenditureDao.updateByStorageexpenditureKey(record);
    }
}

package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.StorageexpenditureVo;

public interface StorageexpenditureService {
    int addStorageexpenditure(StorageexpenditureVo record);

    StorageexpenditureVo selectByStorageexpenditureKey(Integer storageexpenditureId);

    StorageexpenditureVo selectByStorageexpenditureApproval(Integer approval);

    int updateByStorageexpenditureKeySelective(StorageexpenditureVo record);

    int deleteByStorageexpenditureKey(StorageexpenditureVo record);
}

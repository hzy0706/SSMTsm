package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.StorageexpenditureVo;

import java.util.List;

public interface StorageexpenditureService {
    void addStorageexpenditure(StorageexpenditureVo record);

    StorageexpenditureVo selectByStorageexpenditureKey(Integer storageexpenditureId);

    List<StorageexpenditureVo> selectByStorageexpenditureApproval(Integer approval);

    void updateByStorageexpenditureKeySelective(StorageexpenditureVo record);

    void deleteByStorageexpenditureKey(StorageexpenditureVo record);

    void appStorageexpenditure(StorageexpenditureVo record);
}

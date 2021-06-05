package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.StorageexpenditureVo;

import java.util.List;

public interface StorageexpenditureService {
    int addStorageexpenditure(StorageexpenditureVo record);

    StorageexpenditureVo selectByStorageexpenditureKey(Integer storageexpenditureId);

    List<StorageexpenditureVo> selectByStorageexpenditureApproval(Integer approval);

    int updateByStorageexpenditureKeySelective(StorageexpenditureVo record);

    int deleteByStorageexpenditureKey(StorageexpenditureVo record);
}

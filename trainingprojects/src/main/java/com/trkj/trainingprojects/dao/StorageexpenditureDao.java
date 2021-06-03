package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.StorageexpenditureVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StorageexpenditureDao {

    int addStorageexpenditure(StorageexpenditureVo record);

    StorageexpenditureVo selectByStorageexpenditureKey(Integer storageexpenditureId);

    StorageexpenditureVo selectByStorageexpenditureApproval(Integer approval);

    int updateByStorageexpenditureKeySelective(StorageexpenditureVo record);

    int updateByStorageexpenditureKey(StorageexpenditureVo record);
}
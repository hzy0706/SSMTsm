package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.StorageexpenditureVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StorageexpenditureDao {

    void addStorageexpenditure(StorageexpenditureVo record);

    StorageexpenditureVo selectByStorageexpenditureKey(Integer storageexpenditureId);

    List<StorageexpenditureVo> selectByStorageexpenditureApproval(Integer approval);

    void updateByStorageexpenditureKeySelective(StorageexpenditureVo record);

    void updateByStorageexpenditureKey(StorageexpenditureVo record);

    void updateByStorageexpenditureAppKey(StorageexpenditureVo record);
}
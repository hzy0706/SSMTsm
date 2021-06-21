package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Back;

public interface BackDao {
    int deleteByPrimaryKey(Integer backId);

    int insert(Back record);

    int insertSelective(Back record);

    Back selectByPrimaryKey(Integer backId);

    int updateByPrimaryKeySelective(Back record);

    int updateByPrimaryKey(Back record);
}
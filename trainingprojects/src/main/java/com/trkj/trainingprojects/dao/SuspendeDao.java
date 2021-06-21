package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Suspende;

public interface SuspendeDao {
    int deleteByPrimaryKey(Integer suspendeId);

    int insert(Suspende record);

    int insertSelective(Suspende record);

    Suspende selectByPrimaryKey(Integer suspendeId);

    int updateByPrimaryKeySelective(Suspende record);

    int updateByPrimaryKey(Suspende record);
}
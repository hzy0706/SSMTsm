package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Enterprise;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnterpriseDao {

    Enterprise selectByEnterpriseKey();

    int updateByEnterpriseKeySelective(Enterprise enterprise);
}
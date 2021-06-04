package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Suggest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SuggestDao {
    int deleteByPrimaryKey(Integer suggestId);

    int insert(Suggest record);

    int insertSelective(Suggest record);

    Suggest selectByPrimaryKey(Integer suggestId);

    int updateByPrimaryKeySelective(Suggest record);

    int updateByPrimaryKey(Suggest record);
}
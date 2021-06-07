package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.SuggestVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 意见箱表(Suggest)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-04 17:11:12
 */
@Mapper
public interface SuggestDao {

    int deleteByPrimaryKey(Integer suggestId);

    int insert(SuggestVo record);

    int insertSelective(SuggestVo record);

    SuggestVo selectByPrimaryKey(Integer suggestId);

    int updateByPrimaryKeySelective(SuggestVo record);

    int updateByPrimaryKey(SuggestVo record);
}
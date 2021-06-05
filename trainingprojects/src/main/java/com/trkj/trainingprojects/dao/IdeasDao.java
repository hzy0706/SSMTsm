package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.IdeasVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IdeasDao {

    int addIdeas(IdeasVo record);

    IdeasVo selectByIdeasKey(Integer ideasId);

    int updateByIdeasKeySelective(IdeasVo record);

    int updateByIdeasKey(IdeasVo record);


}
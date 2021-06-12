package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.vo.IdeasVo;

import java.util.List;

public interface IdeasService {

    int addIdeas(IdeasVo record);

    IdeasVo selectByIdeasKey(Integer ideasId);

    int updateByIdeasKeySelective(IdeasVo record);

    int deleteByIdeasKey(IdeasVo record);

    List<IdeasVo> selectByIdeasEmpId(Integer empId);
}

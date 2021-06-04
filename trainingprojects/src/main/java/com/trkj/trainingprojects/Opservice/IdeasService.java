package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.IdeasVo;

public interface IdeasService {

    int addIdeas(IdeasVo record);

    IdeasVo selectByIdeasKey(Integer ideasId);

    int updateByIdeasKeySelective(IdeasVo record);

    int deleteByIdeasKey(IdeasVo record);
}

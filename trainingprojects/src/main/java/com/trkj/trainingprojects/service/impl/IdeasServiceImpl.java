package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.IdeasDao;
import com.trkj.trainingprojects.service.IdeasService;
import com.trkj.trainingprojects.vo.IdeasVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IdeasServiceImpl implements IdeasService {
    @Resource
    private IdeasDao ideasDao;
    @Override
    @Transactional
    public int addIdeas(IdeasVo record) {
        return ideasDao.addIdeas(record);
    }

    @Override
    public IdeasVo selectByIdeasKey(Integer ideasId) {
        return ideasDao.selectByIdeasKey(ideasId);
    }

    @Override
    @Transactional
    public int updateByIdeasKeySelective(IdeasVo record) {
        return ideasDao.updateByIdeasKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByIdeasKey(IdeasVo record) {
        return ideasDao.updateByIdeasKey(record);
    }

    @Override
    public List<IdeasVo> selectByIdeasEmpId(Integer empId) {
        return ideasDao.selectByIdeasEmpId(empId);
    }
}

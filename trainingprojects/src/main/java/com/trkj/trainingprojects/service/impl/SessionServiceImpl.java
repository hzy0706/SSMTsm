package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.SessionDao;
import com.trkj.trainingprojects.service.SessionService;
import com.trkj.trainingprojects.vo.SessionVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {
    @Resource
    SessionDao sessionDao;
    @Override
    public SessionVo selectById(Integer sessionId) {
        return sessionDao.selectById(sessionId);
    }

    @Override
    public int addSession(SessionVo sessionVo) {
        return sessionDao.addSession(sessionVo);
    }

    @Override
    public int update(SessionVo sessionVo) {
        return sessionDao.update(sessionVo);
    }


    @Override
    public List<SessionVo> selectAll() {
        return this.sessionDao.selectAll();
    }

    @Override
    public int delSessionById(SessionVo sessionVo) {
        return sessionDao.delSessionById(sessionVo);
    }


}

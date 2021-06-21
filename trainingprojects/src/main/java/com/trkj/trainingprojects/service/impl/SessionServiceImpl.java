package com.trkj.trainingprojects.service.impl;

import com.trkj.trainingprojects.dao.SessionDao;
import com.trkj.trainingprojects.service.SessionService;
import com.trkj.trainingprojects.vo.SessionVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public void addSession(SessionVo session) {
         sessionDao.addSession(session);
    }


    @Override
    @Transactional
    public int update(SessionVo sessionVo) {
        return sessionDao.update(sessionVo);
    }


    @Override
    @Transactional
    public List<SessionVo> selectAllSession() {
        return this.sessionDao.selectAllSession();
    }

    @Override
    @Transactional
    public int delSessionById(SessionVo sessionVo) {
        return sessionDao.delSessionById(sessionVo);
    }


}

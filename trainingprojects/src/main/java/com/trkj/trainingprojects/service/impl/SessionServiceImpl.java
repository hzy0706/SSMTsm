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
        return null;
    }

    @Override
    public SessionVo addSession(SessionVo session) {
        return null;
    }
    @Override
    public SessionVo update(SessionVo session) {
        return null;
    }

    @Override
    public List<SessionVo> selectAll() {
        return this.sessionDao.selectAll();
    }


}

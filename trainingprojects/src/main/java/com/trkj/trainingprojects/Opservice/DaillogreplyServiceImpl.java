package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.DaillogreplyDao;
import com.trkj.trainingprojects.vo.DaillogreplyVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DaillogreplyServiceImpl implements DaillogreplyService {
    @Resource
    private DaillogreplyDao daillogreplyDao;

    @Override
    @Transactional
    public int addDaillogreply(DaillogreplyVo record) {
        return daillogreplyDao.addDaillogreply(record);
    }

    @Override
    public DaillogreplyVo selectByDaillogreplyKey(Integer daillogreplyId) {
        return daillogreplyDao.selectByDaillogreplyKey(daillogreplyId);
    }

    @Override
    public List<DaillogreplyVo> selectByDaillogreplyDaillogId(Integer daillogId) {
        return daillogreplyDao.selectByDaillogreplyDaillogId(daillogId);
    }
}

package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.LoginjournalDao;
import com.trkj.trainingprojects.vo.LoginjournalVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LoginjournalServiceImpl implements LoginjournalService {
    @Resource
    private LoginjournalDao loginjournalDao;
    @Override
    @Transactional
    public int addLoginjournal(LoginjournalVo record) {
        return loginjournalDao.addLoginjournal(record);
    }

    @Override
    @Transactional
    public int deleteAllLoginjournal() {
        return loginjournalDao.deleteAllLoginjournal();
    }

    @Override
    @Transactional
    public int deleteLoginjournalByTime(String time) {
        return loginjournalDao.deleteLoginjournalByTime(time);
    }

    @Override
    public List<LoginjournalVo> selectAllLoginjournals(String value) {
        return loginjournalDao.selectAllLoginjournals(value);
    }
}

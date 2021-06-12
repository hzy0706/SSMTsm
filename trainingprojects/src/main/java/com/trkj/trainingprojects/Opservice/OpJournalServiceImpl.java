package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.OpjournalDao;
import com.trkj.trainingprojects.entity.Opjournal;
import com.trkj.trainingprojects.vo.OpjournalVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class OpJournalServiceImpl implements OpJournalService {
    @Resource
    private OpjournalDao opjournalDao;
    @Override
    @Transactional
    public void addOpJournal(Opjournal opjournal) {
        opjournalDao.insert(opjournal);
    }

    @Override
    public List<OpjournalVo> selectAllOpjournal() {
        return opjournalDao.selectAllOpjournal();
    }

    @Override
    public List<OpjournalVo> selectAllOpjournalByType(String choice) {
        return opjournalDao.selectAllOpjournalByType(choice);
    }

    @Override
    public List<OpjournalVo> selectAllOpjournalByType2(String value, String type) {
        return opjournalDao.selectAllOpjournalByType2(value,type);
    }
}

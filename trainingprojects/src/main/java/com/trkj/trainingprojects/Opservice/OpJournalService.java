package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.entity.Opjournal;
import com.trkj.trainingprojects.vo.OpjournalVo;

import java.util.List;

public interface OpJournalService {
    public void addOpJournal(Opjournal opjournal);
    public List<OpjournalVo> selectAllOpjournal();
    public List<OpjournalVo> selectAllOpjournalByType(String choice);
    List<OpjournalVo> selectAllOpjournalByType2(String choice,String type);
    int deleteAllOpjournal();
    int deleteOpjournalByTime(String time);
}

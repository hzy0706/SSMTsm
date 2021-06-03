package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.entity.Opjournal;
import com.trkj.trainingprojects.vo.OpjournalVo;

import java.util.List;

public interface OpJournalService {
    public void addOpJournal(Opjournal opjournal);
    public List<OpjournalVo> selectAllOpjournal();
}

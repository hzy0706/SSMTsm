package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.vo.LoginjournalVo;

import java.util.List;

public interface LoginjournalService {
    int addLoginjournal(LoginjournalVo record);

    List<LoginjournalVo> selectAllLoginjournals(String value);
}

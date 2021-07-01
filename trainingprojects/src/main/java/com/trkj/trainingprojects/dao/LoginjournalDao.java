package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.LoginjournalVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface LoginjournalDao {
    int addLoginjournal(LoginjournalVo record);
    int deleteAllLoginjournal();
    int deleteLoginjournalByTime(String time);
    List<LoginjournalVo> selectAllLoginjournals(String value);
}
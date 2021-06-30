package com.trkj.trainingprojects.dao;


import com.trkj.trainingprojects.vo.LoginjournalVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface LoginjournalDao {
    int addLoginjournal(LoginjournalVo record);

    List<LoginjournalVo> selectAllLoginjournals(String value);
}
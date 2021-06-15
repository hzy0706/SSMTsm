package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Opjournal;
import com.trkj.trainingprojects.vo.OpjournalVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OpjournalDao {
    int deleteByPrimaryKey(Integer opjournalId);

    int insert(Opjournal record);

    int insertSelective(Opjournal record);

    List<OpjournalVo> selectAllOpjournal();

    List<OpjournalVo> selectAllOpjournalByType(String choice);

    List<OpjournalVo> selectAllOpjournalByType2(String value,String type);

    int updateByPrimaryKeySelective(Opjournal record);

    int updateByPrimaryKey(Opjournal record);
}
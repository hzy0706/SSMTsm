package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Entryfees;
import com.trkj.trainingprojects.vo.EntryfeesVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 报班缴费表(Entryfees)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-18 21:53:30
 */
@Mapper
public interface EntryfeesDao {

    Entryfees queryById(Integer feesId);

    List<Entryfees> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Entryfees> queryAll(Entryfees entryfees);

    int insert(Entryfees entryfees);

    int insertBatch(@Param("entities") List<Entryfees> entities);

    int insertOrUpdateBatch(@Param("entities") List<Entryfees> entities);

    int update(Entryfees entryfees);

    int deleteById(Integer feesId);

    List<EntryfeesVo> selectAllEntryFees();

}


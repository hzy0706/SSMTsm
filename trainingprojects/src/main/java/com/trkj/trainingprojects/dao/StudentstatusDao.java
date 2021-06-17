package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Studentstatus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学员分班表(Studentstatus)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-17 16:44:44
 */
@Mapper
public interface StudentstatusDao {

    Studentstatus queryById(Integer studentstatusId);

    List<Studentstatus> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Studentstatus> queryAll(Studentstatus studentstatus);

    int insert(Studentstatus studentstatus);

    int insertBatch(@Param("entities") List<Studentstatus> entities);

    int insertOrUpdateBatch(@Param("entities") List<Studentstatus> entities);

    int update(Studentstatus studentstatus);

    int deleteById(Integer studentstatusId);

}


package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.entity.Awards;
import com.trkj.trainingprojects.vo.AwardsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 奖项表(Awards)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-04 10:50:38
 */
@Mapper
public interface AwardsDao {

    Awards queryById(Integer awardsId);

    List<Awards> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Awards> queryAll(Awards awards);

    int insert(AwardsVo awardsVo);

    int insertBatch(@Param("entities") List<Awards> entities);

    int insertOrUpdateBatch(@Param("entities") List<Awards> entities);

    int updateByAwardsKey(AwardsVo awardsVo);

    int deleteById(Integer awardsId);

    int deleteByAwards(AwardsVo awardsVo);
    List<AwardsVo> selectAllAwards();
}


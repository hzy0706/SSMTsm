package com.trkj.trainingprojects.service;

import com.trkj.trainingprojects.entity.Awards;
import com.trkj.trainingprojects.vo.AwardsVo;

import java.util.List;

/**
 * 奖项表(Awards)表服务接口
 *
 * @author makejava
 * @since 2021-06-04 10:50:38
 */
public interface AwardsService {

    Awards queryById(Integer awardsId);

    List<Awards> queryAllByLimit(int offset, int limit);

    Awards insert(Awards awards);

    Awards update(Awards awards);

    boolean deleteById(Integer awardsId);

    public List<AwardsVo> selectAllAwards();

    public void addAwards(AwardsVo awardsVo);

    public int updateByAwardsKey(AwardsVo awardsVo);

    public int deleteByAwards(AwardsVo awardsVo);
}

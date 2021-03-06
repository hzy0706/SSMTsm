package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.AdvancearrangeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdvancearrangeDao {
    int addAdvancearrange(AdvancearrangeVo record);
    List<AdvancearrangeVo> selectAllAdvancearrange();
    int updateByAdvancearrangeKey(AdvancearrangeVo record);
    int clearArrange();
}
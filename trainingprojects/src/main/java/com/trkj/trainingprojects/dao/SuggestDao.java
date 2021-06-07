package com.trkj.trainingprojects.dao;

import com.trkj.trainingprojects.vo.SuggestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 意见箱表(Suggest)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-04 17:11:12
 */
@Mapper
public interface SuggestDao {


    /**
     * 通过ID查询单条数据
     *
     * @param suggestId 主键
     * @return 实例对象
     */
    SuggestVo queryById(Integer suggestId);

    /**
     * 新增数据
     *
     * @param suggest 实例对象
     * @return 影响行数
     */
    int addSuggest(SuggestVo suggest);

    /**
     * 修改数据
     *
     * @param suggest 实例对象
     * @return 影响行数
     */
    int update(SuggestVo suggest);

    /**
     * 查询所有
     */
    List<SuggestVo> selectAll();
}


